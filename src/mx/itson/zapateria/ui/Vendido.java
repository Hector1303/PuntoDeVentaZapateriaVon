/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mx.itson.zapateria.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import mx.itson.zapateria.entidades.Venta;
import mx.itson.zapateria.persistencia.Conexion;
import mx.itson.zapateria.persistencia.VentaDAO;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Hector
 */
public class Vendido extends javax.swing.JPanel {

    /**
     * Creates new form Vendido
     */
    public Vendido() {
        initComponents();

        llenarTabla();
        showPieChart();
        Locale local = new Locale("es", "MX");
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(local);

        totalizar();
    }

    public void showPieChart() {

        //create dataset
        try {
            String query = "SELECT estilo, COUNT(*) AS repeticiones FROM almacen.venta GROUP BY estilo";
            
            Connection conexion = Conexion.get();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(query);
            
            DefaultPieDataset barDataset = new DefaultPieDataset();
            
            while(rs.next()){
                barDataset.setValue(rs.getString("estilo"), Integer.parseInt(rs.getString("repeticiones")));
            }
            JFreeChart piechart = ChartFactory.createPieChart("Estilos mas vendidos", barDataset, true, true, false);//explain

            PiePlot piePlot = (PiePlot) piechart.getPlot();

            piePlot.setBackgroundPaint(Color.white);

            //create chartPanel to display chart(graph)
            ChartPanel barChartPanel = new ChartPanel(piechart);
            pnlGrafica.removeAll();
            pnlGrafica.add(barChartPanel, BorderLayout.CENTER);
            pnlGrafica.validate();

        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e);
        }
    }

    private void llenarTabla() {
        List<Venta> ventas = VentaDAO.obtener();
        DefaultTableModel model = (DefaultTableModel) tblVendido.getModel();
        model.setRowCount(0);

        for (Venta v : ventas) {
            model.addRow(new Object[]{
                v.getColor(),
                v.getNumero(),
                v.getTipo(),
                v.getSexo(),
                v.getPrecio(),
                v.getEstilo(),
                v.getFecha()
            });
        }
    }

    public void totalizar() {
        double total = 0;
        double precio = 0;
        Locale local = new Locale("es", "MX");
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(local);

        if (tblVendido.getRowCount() > 0) {
            for (int i = 0; i < tblVendido.getRowCount(); i++) {
                precio = Double.parseDouble(tblVendido.getValueAt(i, 5).toString());
                total += precio;
            }

            lblVentaTotal.setText(formatoMoneda.format(total));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVendido = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblVentaTotal = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlGrafica = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1510, 770));
        setMinimumSize(new java.awt.Dimension(1510, 770));
        setPreferredSize(new java.awt.Dimension(1510, 770));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ventas");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1510, 59));

        tblVendido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Color", "Numero", "Tipo de teni", "Sexo", "Precio", "Estilo", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVendido);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 710, 400));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ventas  totales:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 600, 140, 20));

        lblVentaTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblVentaTotal.setForeground(new java.awt.Color(0, 0, 0));
        add(lblVentaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 600, 100, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/zapateria/imagenes/Logo Zapateria Von 340x191.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 310, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 20, 550));

        pnlGrafica.setBackground(new java.awt.Color(204, 204, 204));
        pnlGrafica.setLayout(new java.awt.BorderLayout());
        add(pnlGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 200, 460, 400));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel lblVentaTotal;
    private javax.swing.JPanel pnlGrafica;
    public static javax.swing.JTable tblVendido;
    // End of variables declaration//GEN-END:variables
}
