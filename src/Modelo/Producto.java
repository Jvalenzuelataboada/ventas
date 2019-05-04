
package Modelo;

import java.sql.Date;




public class Producto {
    
    private int codigo_producto,stock;
   private String precio,descripcion,nombre_producto,estado,foto;
//   private String  ,fecha_vencimiento,fecha_ingreso

    public Producto() {
    }

    public Producto(int codigo_producto, int stock, String precio, String descripcion, String nombre_producto, String estado, String foto) {
        this.codigo_producto = codigo_producto;
        this.stock = stock;
        this.precio = precio;
        this.descripcion = descripcion;
        this.nombre_producto = nombre_producto;
        this.estado = estado;
        this.foto = foto;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
        
  
    
}
