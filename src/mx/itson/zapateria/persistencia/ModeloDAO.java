/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.zapateria.persistencia;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mx.itson.zapateria.entidades.Modelo;
import mx.itson.zapateria.enumerador.Sexo;
import mx.itson.zapateria.enumerador.Tipo;
import mx.itson.zapateria.ui.Buscar;
import static mx.itson.zapateria.ui.Main.pnlJFrames;
import mx.itson.zapateria.ui.Vendido;

/**
 *
 * @author chiqu
 */
public class ModeloDAO {
    
    /**
     * Obtiene los modelos de la tabla de Modelo en la base de datos almacen.
     * @return Datos de los modelos.
     */
    public static List<Modelo> obtener() {

        List<Modelo> modelos = new ArrayList<>();

        try {
            Connection conexion = Conexion.get();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from modelo");

            while (rs.next()) {

                Modelo m = new Modelo();

                m.setId(rs.getInt(1));
                m.setColor(rs.getString(2));
                m.setNumero(rs.getDouble(3));
                m.setTipo(rs.getInt(4) == 1 ? Tipo.TENI : 
                          rs.getInt(4) == 2 ? Tipo.ZAPATO : 
                          rs.getInt(4) == 3 ? Tipo.ZAPATILLA : 
                          rs.getInt(4) == 4 ? Tipo.HUARACHE :
                          rs.getInt(4) == 5 ? Tipo.TAQUETE :
                          rs.getInt(4) == 6 ? Tipo.BOTATRABAJO :
                          rs.getInt(4) == 7 ? Tipo.BOTARODEO :
                          rs.getInt(4) == 8 ? Tipo.BOTAALTA :
                          rs.getInt(4) == 9 ? Tipo.BOTIN :
                          Tipo.RELOJ);
                m.setSexo(rs.getInt(5) == 1 ? Sexo.MUJER : 
                          rs.getInt(5) == 2 ? Sexo.HOMBRE : 
                          Sexo.UNISEX);
                m.setPrecio(rs.getDouble(6));
                m.setEstilo(rs.getInt(7));

                modelos.add(m);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: " + e.toString());
        }
        return modelos;
    }
    
    /**
     * Metodo para guardar modelos dentro de la base de datos almacen.
     * @param color 
     * @param numero 
     * @param tipo Tipo de movimiento.
     * @param sexo 
     * @param precio 
     * @param estilo 
     * @return Obtiene los datos y los guarda en la base datos almacen y los muestram en la tabla Modelos.
     */
    public static boolean guardar( String color, double numero, int tipo, int sexo, Double precio, int estilo) {
        boolean resultado = false;
        try {
            Connection conexion = Conexion.get();
            String query = "INSERT INTO modelo (color, numero, tipo, sexo, precio, estilo) VALUES ( ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setString(1, color);
            statement.setDouble(2, numero);
            statement.setInt(3, tipo);
            statement.setInt(4, sexo);
            statement.setDouble(5,precio);
            statement.setInt(6,estilo);

            statement.execute();

            resultado = statement.getUpdateCount() == 1;
            conexion.close();
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error al agregar la fila: " + e);

        }
        return resultado;
    }
    
    /**
     * 
     */
    public static void eliminarModelo(){
        
        try {
            
            int filaSeleccionada = Buscar.tblBuscar.getSelectedRow();
            String query = "DELETE FROM almacen.modelo WHERE estilo= " + Buscar.tblBuscar.getValueAt(filaSeleccionada,5);
            Connection conexion = Conexion.get();
            Statement statement = conexion.createStatement();
            
            int n = statement.executeUpdate(query);
            
            if (n >= 0) {
                System.out.println("Modelo eliminado de tabla buscar");
            }
            
            Vendido p4 = new Vendido();
            p4.setSize(1510, 770);
            p4.setLocation(0,0);
        
            pnlJFrames.removeAll();
            pnlJFrames.add(p4, BorderLayout.CENTER);
            pnlJFrames.revalidate();
            pnlJFrames.repaint();
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error al intentar elminiar el modelo: " + e);
            JOptionPane.showMessageDialog(null, "Selecciona un modelo");
        }
        
    }
    
    public static List<Modelo> buscar(String buscar) {

        List<Modelo> modelos = new ArrayList<>();

        try {
            Connection conexion = Conexion.get();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM almacen.modelo WHERE id LIKE '%"+buscar+"%' OR color LIKE '%"+buscar+"%' OR numero LIKE '%"+buscar+"%' "
                    + "OR tipo LIKE '%"+buscar+"%' OR sexo LIKE '%"+buscar+"%' OR precio LIKE '%"+buscar+"%' OR estilo LIKE '%"+buscar+"%'");

            while (rs.next()) {

                Modelo m = new Modelo();

                m.setId(rs.getInt(1));
                m.setColor(rs.getString(2));
                m.setNumero(rs.getDouble(3));
                m.setTipo(rs.getInt(4) == 1 ? Tipo.TENI : 
                          rs.getInt(4) == 2 ? Tipo.ZAPATO : 
                          rs.getInt(4) == 3 ? Tipo.ZAPATILLA : 
                          rs.getInt(4) == 4 ? Tipo.HUARACHE :
                          rs.getInt(4) == 5 ? Tipo.TAQUETE :
                          rs.getInt(4) == 6 ? Tipo.BOTATRABAJO :
                          rs.getInt(4) == 7 ? Tipo.BOTARODEO :
                          rs.getInt(4) == 8 ? Tipo.BOTAALTA :
                          rs.getInt(4) == 9 ? Tipo.BOTIN :
                          Tipo.RELOJ);
                m.setSexo(rs.getInt(5) == 1 ? Sexo.MUJER : 
                          rs.getInt(5) == 2 ? Sexo.HOMBRE : 
                          Sexo.UNISEX);
                m.setPrecio(rs.getDouble(6));
                m.setEstilo(rs.getInt(7));

                modelos.add(m);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: " + e.toString());
        }
        return modelos;
    }
    
    /**
     * 
     */
    public static void transferirModeloAVendido(){
        try {
            
            int filaSeleccionada = Buscar.tblBuscar.getSelectedRow();
            Connection conexion = Conexion.get();
            Statement statement = conexion.createStatement();
            
            int n = statement.executeUpdate("INSERT INTO almacen.venta(color, numero, tipo, sexo, precio, estilo, fecha) "
                    + "SELECT color, numero, tipo, sexo, precio, estilo, CURDATE() FROM almacen.modelo WHERE (estilo=" + Buscar.tblBuscar.getValueAt(filaSeleccionada,5)+")");
            
            if (n >= 0) {
                System.out.println("Modelo transferido a venta");
            }
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error al intentar transferir el modelo: " + e);
        }
    }
    
}
