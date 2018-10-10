/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_restaurante.base_de_datos;

/**
 *
 * @author gabriel gonzalez
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ProductosData {
    private Connection connection = null;

    public ProductosData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
    public void guardarProductos(Productos productos){
        try {
            
            String sql = "INSERT INTO restaurant_sant_rats (nombre, precio) VALUES ( ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, productos.getNombre());
            statement.setInt(2, productos.getPrecio());  
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                productos.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un producto");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un producto: " + ex.getMessage());
        }
    }
    
    public List<Productos> obtenerProductos(){
        List<Productos> productitos = new ArrayList<Productos>();
           

        try {
            String sql = "SELECT * FROM restaurante_sans_rats;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Productos productos;
            while(resultSet.next()){
                productos = new Productos();
                productos.setId(resultSet.getInt("id"));
                productos.setNombre(resultSet.getString("nombre"));
                productos.setPrecio(resultSet.getInt("precio"));

                productos.add(productos);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los productos: " + ex.getMessage());
        }
        
        
        return productitos;
    }
    
}
