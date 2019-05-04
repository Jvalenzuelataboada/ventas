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
import java.sql.Statement;

/**
 *
 * @author JC
 */
public class pProducto {
    
    public Connection cnn;  //VARIABLE CONECCION PARA LA BD
    public ResultSet rs; // CLASE QUE MANIPULA LOS DATOS
    PreparedStatement pre;
 
    public boolean AgregarProducto(Producto pro) {
        PreparedStatement ps = null;
        boolean resp = true;
        try {
            cnn = Conexion.getConnection();
            String sql = "insert into Producto (Descripcion,Nombre_Producto,Stock,Precio,Fecha_Vencimiento,Fecha_ingreso,Estado,Foto) values(?,?,?,?,?,?,?,?)";
            ps = cnn.prepareStatement(sql);
            
            ps.setString(1, pro.getDescripcion());
            ps.setString(2, pro.getNombre_producto());
            ps.setInt(3, pro.getStock());
            ps.setString(4, pro.getPrecio());
            ps.setString(5, pro.getFecha_vencimiento());
            ps.setString(6, pro.getFecha_ingreso());
            ps.setString(7, pro.getEstado());
            ps.setString(8, pro.getFoto());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("El error fue :" + e);
            resp = false;
            Conexion.closeConnection();
        }
        return resp;
    }
}
