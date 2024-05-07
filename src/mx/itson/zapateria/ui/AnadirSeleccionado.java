/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mx.itson.zapateria.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import mx.itson.zapateria.persistencia.ModeloDAO;
import mx.itson.zapateria.persistencia.ProveedorDAO;
import static mx.itson.zapateria.ui.Main.pnlAnadir;
import static mx.itson.zapateria.ui.Main.pnlApartados;
import static mx.itson.zapateria.ui.Main.pnlBuscar;
import static mx.itson.zapateria.ui.Main.pnlInicio;
import static mx.itson.zapateria.ui.Main.pnlJFrames;
import static mx.itson.zapateria.ui.Main.pnlProveedor;
import static mx.itson.zapateria.ui.Main.pnlVendido;

/**
 *
 * @author Hector
 */
public class AnadirSeleccionado extends javax.swing.JPanel {

    /**
     * Creates new form AnadirSeleccionado
     */
    public AnadirSeleccionado() {
        initComponents();

        List<String> valores = ProveedorDAO.obtenerValoresColumna("nombre");

        for (String valor : valores) {
            cbxProveedor.addItem(valor);
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

        lblAnadir = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnlAnadirSeleccionado = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txfPrecio = new com.raven.zapateria.textfield.TextField();
        txfEstilo = new com.raven.zapateria.textfield.TextField();
        txfNumero = new com.raven.zapateria.textfield.TextField();
        txfColor = new com.raven.zapateria.textfield.TextField();
        cbxTipo = new com.raven.zapateria.combobox.Combobox();
        cbxSexo = new com.raven.zapateria.combobox.Combobox();
        jLabel6 = new javax.swing.JLabel();
        cbxProveedor = new com.raven.zapateria.combobox.Combobox();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1510, 770));
        setMinimumSize(new java.awt.Dimension(1510, 770));
        setPreferredSize(new java.awt.Dimension(1510, 770));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAnadir.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblAnadir.setForeground(new java.awt.Color(0, 0, 0));
        lblAnadir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnadir.setText("Añadir");
        add(lblAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Estilo");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 90, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Numero");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 120, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Color");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 100, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 30, 550));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sexo");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 150, 60, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 260, 100, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Tipo");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 390, 110, 30));

        pnlAnadirSeleccionado.setBackground(new java.awt.Color(73, 150, 50));
        pnlAnadirSeleccionado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlAnadirSeleccionado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAnadirSeleccionadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAnadirSeleccionadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAnadirSeleccionadoMouseExited(evt);
            }
        });
        pnlAnadirSeleccionado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Añadir");
        pnlAnadirSeleccionado.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 70));

        add(pnlAnadirSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 650, 220, 70));

        txfPrecio.setCaretColor(new java.awt.Color(0, 0, 0));
        txfPrecio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txfPrecio.setLabelText("");
        txfPrecio.setLineColor(new java.awt.Color(73, 150, 50));
        txfPrecio.setSelectionColor(new java.awt.Color(73, 150, 50));
        txfPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfPrecioActionPerformed(evt);
            }
        });
        add(txfPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 290, 230, -1));

        txfEstilo.setCaretColor(new java.awt.Color(0, 0, 0));
        txfEstilo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txfEstilo.setLabelText("");
        txfEstilo.setLineColor(new java.awt.Color(73, 150, 50));
        txfEstilo.setSelectionColor(new java.awt.Color(73, 150, 50));
        add(txfEstilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 230, -1));

        txfNumero.setCaretColor(new java.awt.Color(0, 0, 0));
        txfNumero.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txfNumero.setLabelText("");
        txfNumero.setLineColor(new java.awt.Color(73, 150, 50));
        txfNumero.setSelectionColor(new java.awt.Color(73, 150, 50));
        add(txfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 230, -1));

        txfColor.setCaretColor(new java.awt.Color(0, 0, 0));
        txfColor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txfColor.setLabelText("");
        txfColor.setLineColor(new java.awt.Color(73, 150, 50));
        txfColor.setSelectionColor(new java.awt.Color(73, 150, 50));
        txfColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfColorActionPerformed(evt);
            }
        });
        add(txfColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 230, -1));

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Teni", "Zapato", "Zapatilla", "Huarache", "Taquete", "Bota de trabajo", "Bota de rodeo", "Bota alta", "Botin", "Reloj" }));
        cbxTipo.setSelectedIndex(-1);
        cbxTipo.setLabeText("");
        cbxTipo.setLineColor(new java.awt.Color(73, 150, 50));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });
        add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 420, 230, 50));

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mujer", "Hombre", "Unisex" }));
        cbxSexo.setSelectedIndex(-1);
        cbxSexo.setLabeText("");
        cbxSexo.setLineColor(new java.awt.Color(73, 150, 50));
        cbxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSexoActionPerformed(evt);
            }
        });
        add(cbxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 180, 230, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Proveedor");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 250, 30));

        cbxProveedor.setSelectedIndex(-1);
        cbxProveedor.setLabeText("");
        cbxProveedor.setLineColor(new java.awt.Color(73, 150, 50));
        cbxProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProveedorActionPerformed(evt);
            }
        });
        add(cbxProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 240, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void pnlAnadirSeleccionadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAnadirSeleccionadoMouseEntered

        pnlAnadirSeleccionado.setBackground(new Color(38, 109, 43));

    }//GEN-LAST:event_pnlAnadirSeleccionadoMouseEntered

    private void pnlAnadirSeleccionadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAnadirSeleccionadoMouseExited

        pnlAnadirSeleccionado.setBackground(new Color(73, 150, 50));

    }//GEN-LAST:event_pnlAnadirSeleccionadoMouseExited

    private void pnlAnadirSeleccionadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAnadirSeleccionadoMouseClicked

        int idTemporal = ModeloDAO.crearIdTemporal();
        ModeloDAO.liberarIdProducto(idTemporal);
        String codigo = (cbxProveedor.getSelectedIndex() + 1) + txfEstilo.getText() + (idTemporal + 1);

        String proveedor = cbxProveedor.getSelectedItem().toString();
        String estilo = txfEstilo.getText().toLowerCase();
        String color = txfColor.getText().toLowerCase();
        color = Character.toUpperCase(color.charAt(0)) + color.substring(1);
        String numero = txfNumero.getText();
        int sexo = cbxSexo.getSelectedIndex() + 1;
        String precio = txfPrecio.getText();
        int tipo = cbxTipo.getSelectedIndex() + 1;

        try {
            if (codigo.equals("") || codigo.equals("Ingresa el codigo")
                    || estilo.equals("") || estilo.equals("Ingresa el estilo")
                    || numero.equals("") || numero.equals("Ingresa el numero")
                    || color.equals("") || color.equals("Ingresa el color")
                    || precio.equals("") || precio.equals("Ingresa el precio")) {
                JOptionPane.showMessageDialog(null, "Faltan ingresar datos");
            } else {

                if (ModeloDAO.guardar(Integer.parseInt(codigo), color, Double.parseDouble(numero),
                        tipo, sexo, Double.parseDouble(precio),
                        Integer.parseInt(estilo), proveedor)) {
                    JOptionPane.showMessageDialog(null, "Modelo añadido");

                    Buscar p3 = new Buscar();
                    p3.setSize(1510, 770);
                    p3.setLocation(0, 0);

                    setColor(pnlBuscar);
                    resetColor(pnlVendido);
                    resetColor(pnlAnadir);
                    resetColor(pnlInicio);
                    resetColor(pnlApartados);
                    resetColor(pnlProveedor);

                    pnlJFrames.removeAll();
                    pnlJFrames.add(p3, BorderLayout.CENTER);
                    pnlJFrames.revalidate();
                    pnlJFrames.repaint();
                }

            }
        } catch (Exception e) {
            System.out.println("No se pudo agregar la fila: " + e);
        }

    }//GEN-LAST:event_pnlAnadirSeleccionadoMouseClicked

    private void txfPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPrecioActionPerformed

    private void txfColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfColorActionPerformed

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoActionPerformed

    private void cbxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSexoActionPerformed

    private void cbxProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxProveedorActionPerformed

    public void setColor(JPanel panel) {
        panel.setBackground(new Color(73, 150, 50));
    }

    /**
     * Establece un panel del color rgb que pongamos Se ultilizará para cuando
     * se deje de seleccionar un panel del menú en el ui principal
     *
     * @param panel Nombre del panel que queramos establecerle el color
     */
    public void resetColor(JPanel panel) {
        panel.setBackground(new Color(38, 109, 43));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.zapateria.combobox.Combobox cbxProveedor;
    private com.raven.zapateria.combobox.Combobox cbxSexo;
    protected com.raven.zapateria.combobox.Combobox cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator4;
    public static javax.swing.JLabel lblAnadir;
    private javax.swing.JPanel pnlAnadirSeleccionado;
    private com.raven.zapateria.textfield.TextField txfColor;
    private com.raven.zapateria.textfield.TextField txfEstilo;
    private com.raven.zapateria.textfield.TextField txfNumero;
    private com.raven.zapateria.textfield.TextField txfPrecio;
    // End of variables declaration//GEN-END:variables
}
