/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.zapateria.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import mx.itson.zapateria.entidades.Apartado;
import mx.itson.zapateria.enumerador.Sexo;
import mx.itson.zapateria.enumerador.Tipo;

/**
 *
 * @author chiqu
 */
public class ApartadoDAO {
    
    public static List<Apartado> obtener() {

        List<Apartado> apartados = new ArrayList<>();

        try {
            Connection conexion = Conexion.get();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from almacen.apartado");

            while (rs.next()) {

                Apartado a = new Apartado();

                a.setNombre(rs.getString(1));
                a.setCelular(rs.getString(2));
                a.setCodigo(rs.getInt(3));
                a.setColor(rs.getString(4));
                a.setNumero(rs.getDouble(5));
                a.setTipo(rs.getInt(6) == 1 ? Tipo.TENI : 
                          rs.getInt(6) == 2 ? Tipo.ZAPATO : 
                          rs.getInt(6) == 3 ? Tipo.ZAPATILLA : 
                          rs.getInt(6) == 4 ? Tipo.HUARACHE :
                          rs.getInt(6) == 5 ? Tipo.TAQUETE :
                          rs.getInt(6) == 6 ? Tipo.BOTATRABAJO :
                          rs.getInt(6) == 7 ? Tipo.BOTARODEO :
                          rs.getInt(6) == 8 ? Tipo.BOTAALTA :
                          rs.getInt(6) == 9 ? Tipo.BOTIN :
                          Tipo.RELOJ);
                a.setSexo(rs.getInt(7) == 1 ? Sexo.MUJER : 
                          rs.getInt(7) == 2 ? Sexo.HOMBRE : 
                          Sexo.UNISEX);
                a.setPrecio(rs.getDouble(8));
                a.setEstilo(rs.getInt(9));
                a.setFechaApartado(rs.getDate(10));
                a.setFechaVencimiento(rs.getDate(11));
                a.setNumeroApartado(rs.getInt(12));
                

                apartados.add(a);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: " + e.toString());
        }
        return apartados;
    }
    
    public static boolean guardar(String nombre, String celular, int codigo, String color, double numero, int tipo, int sexo, Double precio, int estilo, Date fechaApartado, Date fechaVencimiento, int numeroApartado) {
        boolean resultado = false;
        try {
            Connection conexion = Conexion.get();
            String query = "INSERT INTO almacen.apartado (nombre, celular, codigo, color, numero, tipo, sexo, precio, estilo, fechaApartado, fechaVencimiento, numeroApartado) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(query);
            
            statement.setString(1, nombre);
            statement.setString(2, celular);
            statement.setInt(3,codigo);
            statement.setString(4, color);
            statement.setDouble(5, numero);
            statement.setInt(6, tipo);
            statement.setInt(7, sexo);
            statement.setDouble(8,precio);
            statement.setInt(9,estilo);
            statement.setDate(10, (java.sql.Date) fechaApartado);
            statement.setDate(11, (java.sql.Date) fechaVencimiento);
            statement.setInt(12, numeroApartado);

            statement.execute();

            resultado = statement.getUpdateCount() == 1;
            conexion.close();
            
        } catch (SQLException e) {
            System.out.println("Ocurrio un error al guardar: " + e);

        }
        return resultado;
    }
    
}
