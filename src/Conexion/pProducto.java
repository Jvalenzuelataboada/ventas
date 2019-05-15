/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Modelo.Cliente;
import Modelo.Producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JC
 */
public class pProducto {
    
    public Connection cnn;  //VARIABLE CONECCION PARA LA BD
    public ResultSet rs; // CLASE QUE MANIPULA LOS DATOS
    PreparedStatement pre;
 
    public boolean AgregarProducto(Producto pro) {
        boolean resp = true;
        try {
            cnn = Conexion.getConnection();
            String sql = "insert into Producto (Descripcion,Nombre_Producto,Stock,Precio,Fecha_Vencimiento,Estado,Foto,Fecha_ingreso) values(?,?,?,?,?,?,?,?)";
            pre = cnn.prepareStatement(sql);            
            pre.setString(1, pro.getDescripcion());
            pre.setString(2, pro.getNombre_producto());
            pre.setInt(3, pro.getStock());
            pre.setString(4, pro.getPrecio());
            pre.setString(5, pro.getFecha_vencimiento());
            pre.setString(6, pro.getEstado());
            pre.setBytes(7, pro.getFoto());
            pre.setString(8, pro.getFecha_ingreso());            
            pre.executeUpdate();
            resp = true;
        } catch (Exception e) {
            System.out.println("El error fue :" + e.getMessage());
            resp = false;
            Conexion.closeConnection();
        }
        return resp;
    }
    
    
    
    public List<Producto> Listar_Producto() {
        cnn = Conexion.getConnection();
        List<Producto> ltp = new ArrayList();
        String sql = "select * from Producto";
        try {
            pre = cnn.prepareStatement(sql);
            rs = pre.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setCodigo_producto(rs.getInt(1));
                p.setDescripcion(rs.getString(2));
                p.setNombre_producto(rs.getString(3));
                p.setStock(rs.getInt(4));
                p.setPrecio(rs.getString(5));
                p.setFecha_vencimiento(rs.getString(6));
                p.setEstado(rs.getString(7));
                p.setFoto(rs.getBytes(8));
                p.setFecha_ingreso(rs.getString(9));
                ltp.add(p);                      
            }
            cnn.close();
        } catch (SQLException ex) {
            Logger.getLogger(pProducto.class.getName()).log(Level.SEVERE, null, ex);
            Conexion.closeConnection();
        }         
        return ltp;  
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
