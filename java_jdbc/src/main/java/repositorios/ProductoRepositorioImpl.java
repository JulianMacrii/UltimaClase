package repositorios;

import models.Productos;
import util.ConexionBaseDeDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorioImpl implements Repositorio<Productos>{

    private Connection getConnection() throws SQLException{
        return ConexionBaseDeDatos.getConecction();
    }
    @Override
    public List<Productos> lister() {
        List<Productos> productosList = new ArrayList();
        try(Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery("Select * FROM productos")){
            while(rs.next()) {
                Productos producto = new Productos();
                producto = getProductoFromBD(rs, producto);
                productosList.add(producto);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return productosList;
    }



    @Override
    public Productos obtenerPorId(Integer id) {
        Productos producto = new Productos();
        try(PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM productos WHERE id = ?")){
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                producto = getProductoFromBD(rs, producto);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return producto;
    }

    @Override
    public void guardar(Productos productos) {
        String sql = "";
        if(productos.getId() != null && productos.getId() > 0){
             sql = "UPDATE INTO productos SET nombre = ?,precio = ? WHERE id = ?";

        }else{
             sql = "INSERT INTO productos(nombre,precio,FechaAlta) VALUES (?,?,?)";
        }
        try(PreparedStatement stmt = getConnection().prepareStatement(sql)){
            stmt.setString(1, productos.getNombre());
            stmt.setDouble(2, productos.getPrecio());
            if(productos.getId() != null && productos.getId() > 0){
                stmt.setInt(3, productos.getId());
            }else{
                stmt.setDate(3, new Date(productos.getFechaAlta().getTime()));
            }

            stmt.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(Integer id) {
        String sql = "DELETE FROM productos WHERE id = ?";
        try(PreparedStatement stmt = getConnection().prepareStatement(sql)){
            stmt.setInt(1,id);
            stmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }

        /**
         *1. obtener la getconnection. generar el preparedstatement
         * 2. armar el string sql delete from productos...
         * stmt executarla la query executeUpDATE
         */
    }
    private Productos getProductoFromBD (ResultSet rs, Productos producto) throws SQLException {
        producto.setId(rs.getInt("id"));
        producto.setNombre(rs.getString("nombre"));
        producto.setPrecio(rs.getDouble("precio"));
        producto.setFechaAlta(rs.getDate("FechaAlta"));
        return producto;
    }
}
