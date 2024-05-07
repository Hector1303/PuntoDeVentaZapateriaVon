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
import mx.itson.zapateria.entidades.Proveedor;

/**
 *
 * @author Hector
 */
public class ProveedorDAO {

    /**
     * Obtiene los modelos de la tabla de Modelo en la base de datos almacen.
     *
     * @return Datos de los modelos.
     */
    public static List<Proveedor> obtener() {

        List<Proveedor> proveedores = new ArrayList<>();

        try {
            Connection conexion = Conexion.get();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from almacen.proveedor");

            while (rs.next()) {

                Proveedor p = new Proveedor();

                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));

                proveedores.add(p);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: " + e.toString());
        }
        return proveedores;
    }

    public static List<String> obtenerValoresColumna(String nombreColumna) {

        List<String> valores = new ArrayList<>();

        try {
            Connection conexion = Conexion.get();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT " + nombreColumna + " from almacen.proveedor");

            while (rs.next()) {
                valores.add(rs.getString(nombreColumna));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: " + e.toString());
        }

        return valores;
    }

}
