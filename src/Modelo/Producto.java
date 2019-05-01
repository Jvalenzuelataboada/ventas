
package Modelo;

import java.sql.Date;




public class Producto {
    
    private int codigo_producto,stock;
    private String descripcion,nombre_producto,estado,foto;
    private float precio;
    private Date fecha_vencimiento,fecha_ingreso;

    public Producto() {
    }

    public Producto(int codigo_producto, int stock, String descripcion, String nombre_producto, String estado, String foto, float precio, Date fecha_vencimiento, Date fecha_ingreso) {
        this.codigo_producto = codigo_producto;
        this.stock = stock;
        this.descripcion = descripcion;
        this.nombre_producto = nombre_producto;
        this.estado = estado;
        this.foto = foto;
        this.precio = precio;
        this.fecha_vencimiento = fecha_vencimiento;
        this.fecha_ingreso = fecha_ingreso;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
    
    
}
