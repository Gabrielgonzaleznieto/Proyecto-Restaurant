/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_restaurante.base_de_datos;

import java.text.ParseException;

/**
 *
 * @author gabriel gonzalez
 */
public class AccesoBaseDeDatos {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        Conexion conexion;
 
        try {
            conexion = new Conexion("jdbc:mysql://localhost/prueba", "root", "");
            ProductosData productosData = new ProductosData(conexion);
            
            
//            Alumno alumno1 = new Alumno("Ramon", LocalDate.of(2003, 2, 15));
//            alumnoData.guardarAlumno(alumno1);
//            System.out.println("El id del alumno es: " + alumno1.getId());

            productosData.obtenerProductos().forEach(productos -> {
                System.out.println("Nombre: " + productos.getNombre() );
            });
            
            
        } catch (Exception e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }
   
        
    }
    
}
