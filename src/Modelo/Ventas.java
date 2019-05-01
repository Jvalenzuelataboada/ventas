
package Modelo;

import java.sql.Date;

public class Ventas {
  
    private Cliente codigo_cliente;
    private Producto codigo_producto;  
    private int codigo_venta,cantidad, estado;
    private float impuesto, subtotal,total;
    private Date fecha_venta;

    public Ventas() {
    }

    public Ventas(Cliente codigo_cliente, Producto codigo_producto, int codigo_venta, int cantidad, int estado, float impuesto, float subtotal, float total, Date fecha_venta) {
        this.codigo_cliente = codigo_cliente;
        this.codigo_producto = codigo_producto;
        this.codigo_venta = codigo_venta;
        this.cantidad = cantidad;
        this.estado = estado;
        this.impuesto = impuesto;
        this.subtotal = subtotal;
        this.total = total;
        this.fecha_venta = fecha_venta;
    }

    public Cliente getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(Cliente codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public Producto getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(Producto codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public int getCodigo_venta() {
        return codigo_venta;
    }

    public void setCodigo_venta(int codigo_venta) {
        this.codigo_venta = codigo_venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }
    


}

