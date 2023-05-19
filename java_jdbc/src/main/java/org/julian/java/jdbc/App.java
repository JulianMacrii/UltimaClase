package org.julian.java.jdbc;

import models.Productos;
import repositorios.ProductoRepositorioImpl;
import repositorios.Repositorio;
import util.ConexionBaseDeDatos;

import java.sql.*;

public class App 
{
    public static void main( String[] args )
    {
        try {
            Repositorio<Productos> repositorio = new ProductoRepositorioImpl();
            repositorio.lister().forEach(System.out::println);

            repositorio.eliminar(2);

            repositorio.lister().forEach(System.out::println);

        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
