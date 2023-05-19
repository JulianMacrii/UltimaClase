package repositorios;

import models.clientes;
import util.ConexionBaseDeDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class clientesRepositorioImpl implements Repositorio<clientes>{
    @Override
    public List<clientes> lister() {
        List<clientes> listacliente = new ArrayList<>();
        try(Statement stmt = getConnection().createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM clientes")) {
            while (rs.next()) {
                clientes client = new clientes();
                client = getClientFromDB(rs, client);
                listacliente.add(client);
                }
            }catch (SQLException e) {
                e.printStackTrace();
                }
            return listacliente;
    }



    @Override
    public clientes obtenerPorId(Integer id) {
        clientes client = new clientes();
        try (PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM clientes WHERE idclientes = ?")) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                client = getClientFromDB(rs, client);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return client;
    }
    @Override
    public void guardar(clientes client) {
        String sql = "";
        if (client.getId() != null && client.getId() > 0) {
            sql = "UPDATE clientes SET nombre = ?, apellido = ?, dni = ?, email = ? WHERE idclientes = ?";
        } else {
            sql = "INSERT INTO clientes(nombre, apellido, dni, email) VALUES (?, ?, ?, ?)";
        }
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, client.getNombre());
            stmt.setString(2, client.getApellido());
            stmt.setInt(3, client.getDni());
            stmt.setString(4, client.getEmail());
            if (client.getId() != null && client.getId() > 0) {
                stmt.setInt(5, client.getId());
            }
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(Integer id) {
        try (PreparedStatement stmt = getConnection().prepareStatement("DELETE FROM clientes WHERE idclientes = ?")) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private clientes getClientFromDB(ResultSet rs, clientes client) throws SQLException {
        client.setId(rs.getInt("idclientes"));
        client.setNombre(rs.getString("nombre"));
        client.setApellido(rs.getString("apellido"));
        client.setDni(rs.getInt("dni"));
        client.setEmail(rs.getString("email"));
        return client;
    }

    private Connection getConnection() throws SQLException{
        return ConexionBaseDeDatos.getConecction();
    }
}
