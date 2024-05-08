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
import java.util.List;
import javax.swing.JOptionPane;
import mx.itson.zapateria.entidades.Apartado;
import mx.itson.zapateria.enumerador.Sexo;
import mx.itson.zapateria.enumerador.Tipo;
import mx.itson.zapateria.ui.Apartados;

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
            ResultSet rs = statement.executeQuery("SELECT nombre, celular, codigo, color, numero, tipo, sexo, precio, restante, estilo, fechaApartado, fechaVencimiento, numeroDeApartado, proveedor from almacen.apartado");

            while (rs.next()) {

                Apartado a = new Apartado();

                a.setNombre(rs.getString(1));
                a.setCelular(rs.getString(2));
                a.setCodigo(rs.getInt(3));
                a.setColor(rs.getString(4));
                a.setNumero(rs.getDouble(5));
                a.setTipo(rs.getInt(6) == 1 ? Tipo.TENI
                        : rs.getInt(6) == 2 ? Tipo.ZAPATO
                        : rs.getInt(6) == 3 ? Tipo.ZAPATILLA
                        : rs.getInt(6) == 4 ? Tipo.HUARACHE
                        : rs.getInt(6) == 5 ? Tipo.TAQUETE
                        : rs.getInt(6) == 6 ? Tipo.BOTATRABAJO
                        : rs.getInt(6) == 7 ? Tipo.BOTARODEO
                        : rs.getInt(6) == 8 ? Tipo.BOTAALTA
                        : rs.getInt(6) == 9 ? Tipo.BOTIN
                        : Tipo.RELOJ);
                a.setSexo(rs.getInt(7) == 1 ? Sexo.MUJER
                        : rs.getInt(7) == 2 ? Sexo.HOMBRE
                        : Sexo.UNISEX);
                a.setPrecio(rs.getDouble(8));
                a.setRestante(rs.getDouble(9));
                a.setEstilo(rs.getInt(10));
                a.setFechaApartado(rs.getDate(11));
                a.setFechaVencimiento(rs.getDate(12));
                a.setNumeroApartado(rs.getInt(13));
                a.setProveedor(rs.getString(14));

                apartados.add(a);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: " + e.toString());
        }
        return apartados;
    }

    public static boolean editar(double restante, int codigo) {
        boolean resultado = false;

        try {
            Connection conexion = Conexion.get();
            String query = "UPDATE almacen.apartado SET restante = ? WHERE codigo = ? ";
            PreparedStatement statement = conexion.prepareStatement(query);

            statement.setDouble(1, restante);
            statement.setInt(2, codigo);

            statement.execute();
            resultado = statement.getUpdateCount() == 1;

        } catch (Exception e) {
            System.out.println("Ocurrio un error al guardar: " + e);
        }

        return resultado;
    }

    public static boolean guardar(String nombre, String celular, int codigo, String color, double numero, int tipo, int sexo, double precio, double restante, int estilo, int numeroApartado, String proveedor) {
        boolean resultado = false;
        try {
            Connection conexion = Conexion.get();
            String query = "INSERT INTO almacen.apartado (nombre, celular, codigo, color, numero, tipo, sexo, precio, restante, estilo, fechaApartado, fechaVencimiento, numeroDeApartado, proveedor) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, CURDATE(), DATE_ADD(CURRENT_DATE(), INTERVAL 1 MONTH), ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(query);

            statement.setString(1, nombre);
            statement.setString(2, celular);
            statement.setInt(3, codigo);
            statement.setString(4, color);
            statement.setDouble(5, numero);
            statement.setInt(6, tipo);
            statement.setInt(7, sexo);
            statement.setDouble(8, precio);
            statement.setDouble(9, restante);
            statement.setInt(10, estilo);
            statement.setInt(11, numeroApartado);
            statement.setString(12, proveedor);

            statement.execute();

            resultado = statement.getUpdateCount() == 1;
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Ocurrio un error al guardar: " + e);

        }
        return resultado;
    }

    public static boolean eliminarApartado(int codigo) {
        boolean resultado = false;
        try {
            Connection conexion = Conexion.get();
            String query = "DELETE FROM almacen.apartado WHERE codigo = ?";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setInt(1, codigo);

            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Apartado eliminado de tabla apartados");
                resultado = true;
            } else {
                System.out.println("No se encontró ningún apartado con el código proporcionado.");
            }

            statement.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Ocurrió un error al intentar eliminar el apartado: " + e);
        }
        return resultado;
    }

    public static void transferirApartadoAVendido() {
        try {

            int filaSeleccionada = Apartados.tblApartados.getSelectedRow();
            Connection conexion = Conexion.get();
            Statement statement = conexion.createStatement();

            int n = statement.executeUpdate("INSERT INTO almacen.venta(codigo, color, numero, tipo, sexo, precio, estilo, proveedor, fecha) "
                    + "SELECT codigo, color, numero, tipo, sexo, precio, estilo, proveedor, CURDATE() FROM almacen.apartado WHERE (codigo=" + Apartados.tblApartados.getValueAt(filaSeleccionada, 2) + ")");

            if (n >= 0) {
                System.out.println("Modelo transferido a venta");
            }

        } catch (Exception e) {
            System.out.println("Ocurrio un error al intentar transferir el modelo: " + e);
        }
    }

}
