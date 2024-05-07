/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.zapateria.persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mx.itson.zapateria.entidades.Venta;
import mx.itson.zapateria.enumerador.Sexo;
import mx.itson.zapateria.enumerador.Tipo;

/**
 *
 * @author chiqu
 */
public class VentaDAO {
    
    /**
     * 
     * @return 
     */
    public static List<Venta> obtener() {

        List<Venta> ventas = new ArrayList<>();

        try {
            Connection conexion = Conexion.get();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from venta");

            while (rs.next()) {

                Venta v = new Venta();

                v.setCodigo(rs.getInt(1));
                v.setColor(rs.getString(2));
                v.setNumero(rs.getDouble(3));
                v.setTipo(rs.getInt(4) == 1 ? Tipo.TENI : 
                          rs.getInt(4) == 2 ? Tipo.ZAPATO : 
                          rs.getInt(4) == 3 ? Tipo.ZAPATILLA : 
                          rs.getInt(4) == 4 ? Tipo.HUARACHE :
                          rs.getInt(4) == 5 ? Tipo.TAQUETE :
                          rs.getInt(4) == 6 ? Tipo.BOTATRABAJO :
                          rs.getInt(4) == 7 ? Tipo.BOTARODEO :
                          rs.getInt(4) == 8 ? Tipo.BOTAALTA :
                          rs.getInt(4) == 9 ? Tipo.BOTIN :
                          Tipo.RELOJ);
                v.setSexo(rs.getInt(5) == 1 ? Sexo.MUJER : 
                          rs.getInt(5) == 2 ? Sexo.HOMBRE : 
                          Sexo.UNISEX);
                v.setPrecio(rs.getDouble(6));
                v.setEstilo(rs.getInt(7));
                v.setFecha(rs.getDate(8));
                v.setProveedor(rs.getString(9));

                ventas.add(v);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: " + e.toString());
        }
        return ventas;
    }
    
    
    
    
    
}
