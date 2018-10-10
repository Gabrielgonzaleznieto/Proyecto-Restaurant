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

public class Productos {
    private int id = -1;
    private String nombre;
    private int precio;
    

    public Productos(int id, String nombre, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        
    }

    public Productos(String nombre, int precio) {
        this.id = -1;
        this.nombre = nombre;
        this.precio = precio;
       
    }
    
    public Productos(){
        this.id = -1;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    void add(Productos productos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
