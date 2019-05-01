/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Modelo.Cliente;
import java.util.List;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author UserR
 */
public class Ccliente {
    
    Conexion co;
    PreparedStatement pre;
     ResultSet rs;
    
        public boolean AgregarPersona(Cliente cli) {
        Connection co = null;
        CallableStatement cstm = null;
        boolean resp = true;
        try {
            co = Conexion.getConnection();
            co.setAutoCommit(false);
            cstm = co.prepareCall("{Call guardar_cliente(?,?,?,?,?,?,?,?)}");
            cstm.setString(1, cli.getNombre_cliente());
            cstm.setString(2, cli.getApellido_cliente());
            cstm.setString(3, cli.getDireccion());
            cstm.setString(4, cli.getIdentificacion());
            cstm.setString(5, cli.getCorreo());
            cstm.setString(6, cli.getTelefono());
            cstm.setString(7, cli.getFoto());
            cstm.setString(8, cli.getSexo());
            resp = cstm.execute();
            co.commit();
            co.close();

        } catch (Exception e) {
            System.out.println("El error fue :" + e);
            resp = false;
            Conexion.closeConnection();
        }
        return resp;
    }
        
        
        
    public List<Cliente> ListaCliente() {
        Connection co = null;
        CallableStatement cstm = null;
        boolean resp = true;
        List<Cliente> lista = new ArrayList<Cliente>();
        try {
            co = Conexion.getConnection();
            co.setAutoCommit(false);
            cstm = co.prepareCall("{Call listar_cliente}");
            rs = cstm.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setCodigo_cliente(rs.getInt(1));
                c.setNombre_cliente(rs.getString(2));
                c.setApellido_cliente(rs.getString(3));
                c.setDireccion(rs.getString(4));
                c.setIdentificacion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setFoto(rs.getString(8));
                c.setEstado(rs.getString(9));
                c.setSexo(rs.getString(10));
                
                
                //resp = cstm.execute();
                lista.add(c);
                co.commit();
                //co.close();
            }
        } catch (Exception e) {
            System.out.println("El error fue :" + e);
            resp = false;
            lista = null;
            Conexion.closeConnection();
        }
        return lista;
    }    
    
    public boolean ActualizarCliente(Cliente cli) {
        Connection co = null;
        CallableStatement cstm = null;
        boolean resp = true;
        try {
            co = Conexion.getConnection();
            co.setAutoCommit(false);
            cstm = co.prepareCall("{Call actualizar_cliente(?,?,?,?,?,?,?,?,?,?)}");
            cstm.setInt(1, cli.getCodigo_cliente());
            cstm.setString(2, cli.getNombre_cliente());
            cstm.setString(3, cli.getApellido_cliente());
            cstm.setString(4, cli.getDireccion());
            cstm.setString(5, cli.getIdentificacion());
            cstm.setString(6, cli.getCorreo());
            cstm.setString(7, cli.getTelefono());
            cstm.setString(8, cli.getFoto());
            cstm.setString(9, cli.getSexo());
            cstm.setString(10, cli.getEstado());
            resp = cstm.execute();
            co.commit();
            co.close();
        } catch (Exception e) {
            System.out.println("El error fue :" + e);
            resp = false;
            Conexion.closeConnection();
        }
        return resp;
    }
    
    
}
