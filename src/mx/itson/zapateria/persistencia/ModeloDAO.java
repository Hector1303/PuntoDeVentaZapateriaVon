/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.zapateria.persistencia;

import java.awt.BorderLayout;
import java.sql.Connection;
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
            ResultSet rs = statement.executeQuery("SELECT codigo, color, numero, tipo, sexo, precio, estilo, proveedor, \n" +
"       (SELECT COUNT(*) FROM modelo m2 WHERE m2.codigo = m.codigo) AS cantidad\n" +
"FROM modelo m;");

            while (rs.next()) {

                Modelo m = new Modelo();

                m.setCodigo(rs.getInt(1));
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
                m.setProveedor(rs.getString(8));
                m.setCantidad(rs.getInt(9));
                

                modelos.add(m);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: " + e.toString());
        }
        return modelos;
    }
    
    /**
     * Metodo para guardar modelos dentro de la base de datos almacen.
     * @param codigo
     * @param color 
     * @param numero 
     * @param tipo 
     * @param sexo 
     * @param precio 
     * @param estilo 
     * @return Obtiene los datos y los guarda en la base datos almacen y los muestram en la tabla Modelos.
     */
    public static boolean guardar( int codigo, String color, double numero, int tipo, int sexo, Double precio, int estilo, String proveedor) {
        boolean resultado = false;
        try {
            Connection conexion = Conexion.get();
            String query = "INSERT INTO almacen.modelo (codigo, color, numero, tipo, sexo, precio, estilo, proveedor) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setInt(1,codigo);
            statement.setString(2, color);
            statement.setDouble(3, numero);
            statement.setInt(4, tipo);
            statement.setInt(5, sexo);
            statement.setDouble(6,precio);
            statement.setInt(7,estilo);
            statement.setString(8, proveedor);

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
    public static boolean eliminarModelo(int codigo){
        boolean resultado = false;
        try {
            int filaSeleccionada = Buscar.tblBuscar.getSelectedRow();
            if(filaSeleccionada != -1){
            codigo = (int) Buscar.tblBuscar.getValueAt(filaSeleccionada,0);
            String query = "DELETE FROM almacen.modelo WHERE codigo= " + codigo;
            Connection conexion = Conexion.get();
            Statement statement = conexion.createStatement();
            
            int n = statement.executeUpdate(query);
            
            if (n >= 0) {
                System.out.println("Modelo eliminado de tabla buscar");
                resultado = true;
            }
            }
            
            
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error al intentar elminiar el modelo: " + e);
            JOptionPane.showMessageDialog(null, "Selecciona un modelo");
        }
        return resultado;
    }
    
    public static List<Modelo> buscar(String buscar) {

        List<Modelo> modelos = new ArrayList<>();

        try {
            Connection conexion = Conexion.get();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM almacen.modelo WHERE codigo LIKE '%"+buscar+"%' OR color LIKE '%"+buscar+"%' OR numero LIKE '%"+buscar+"%' "
                    + "OR tipo LIKE '%"+buscar+"%' OR sexo LIKE '%"+buscar+"%' OR precio LIKE '%"+buscar+"%' OR estilo LIKE '%"+buscar+"%'");

            while (rs.next()) {

                Modelo m = new Modelo();

                m.setCodigo(rs.getInt(1));
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
    
    public static List<Modelo> buscarPorCodigo(String buscar) {
    List<Modelo> modelos = new ArrayList<>();

        try {
            Connection conexion = Conexion.get();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT codigo, color, numero, tipo, sexo, precio, estilo, proveedor FROM almacen.modelo WHERE codigo = '" + buscar + "'");

            while (rs.next()) {

                Modelo m = new Modelo();

                m.setCodigo(rs.getInt(1));
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
                m.setProveedor(rs.getString(8));

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
    public static void transferirModeloAVendido(int codigo){
        try {
            
            int filaSeleccionada = Buscar.tblBuscar.getSelectedRow();
            Connection conexion = Conexion.get();
            Statement statement = conexion.createStatement();
            
            int n = statement.executeUpdate("INSERT INTO almacen.venta(codigo, color, numero, tipo, sexo, precio, estilo, proveedor, fecha) "
                    + "SELECT codigo, color, numero, tipo, sexo, precio, estilo, proveedor, CURDATE() FROM almacen.modelo WHERE (codigo=" + codigo+")");
            
            if (n >= 0) {
                System.out.println("Modelo transferido a venta");
            }
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error al intentar transferir el modelo: " + e);
        }
    }
    
     public static int crearIdTemporal() {
        
        
        int idTemporal = 0;

        try {
            Connection conexion = Conexion.get();
            Statement statement = conexion.createStatement();
            // Agregar una fila en la tabla de productos (puedes usar cualquier tabla que tenga autoincremento)
            statement.executeUpdate("INSERT INTO almacen.modelo (codigo) VALUES (123)");

            // Obtener el ID generado
            idTemporal = obtenerUltimoIdInsertado(statement);
        } catch (SQLException e) {
            e.printStackTrace();
        } 

        return idTemporal;
    }
     
    private static int obtenerUltimoIdInsertado(Statement statement) throws SQLException {
        int ultimoId = 0;
        var rs = statement.executeQuery("SELECT LAST_INSERT_ID()");
        if (rs.next()) {
            ultimoId = rs.getInt(1);
        }
        rs.close();
        return ultimoId;
    }
     
    public static void liberarIdProducto(int idProducto) {
        

        try {
            
            Connection conexion = Conexion.get();
            Statement statement = conexion.createStatement();
            

            // Eliminar la fila insertada con el ID específico
            statement.executeUpdate("DELETE FROM almacen.modelo WHERE id = " + idProducto);
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
    
}
