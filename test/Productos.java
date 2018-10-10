




/**
 *
 * @author gabriel gonzalez
 */
public class Productos {
    
    String Codigo,Nombre,Cantidad,Precio;

    public Productos(String Codigo, String Nombre, String Cantidad, String Precio) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }
    
    
}
