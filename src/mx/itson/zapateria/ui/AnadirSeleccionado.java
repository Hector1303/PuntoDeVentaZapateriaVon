/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mx.itson.zapateria.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import mx.itson.zapateria.persistencia.ModeloDAO;
import static mx.itson.zapateria.ui.Main.pnlJFrames;

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
        jLabel11 = new javax.swing.JLabel();
        txfPrecio = new com.raven.zapateria.textfield.TextField();
        txfEstilo1 = new com.raven.zapateria.textfield.TextField();
        txfNumero1 = new com.raven.zapateria.textfield.TextField();
        txfColor1 = new com.raven.zapateria.textfield.TextField();
        cbxTipo = new com.raven.zapateria.combobox.Combobox();
        cbxSexo1 = new com.raven.zapateria.combobox.Combobox();

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
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 90, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Numero");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 120, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Color");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 100, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 30, 550));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sexo");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 230, 60, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 340, 100, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Tipo");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 470, 110, 30));

        pnlAnadirSeleccionado.setBackground(new java.awt.Color(21, 101, 192));
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

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Añadir");
        pnlAnadirSeleccionado.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        add(pnlAnadirSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 650, 150, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/zapateria/imagenes/Logo Zapateria Von 340x191.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 310, 40));

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
        add(txfPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, 230, -1));

        txfEstilo1.setCaretColor(new java.awt.Color(0, 0, 0));
        txfEstilo1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txfEstilo1.setLabelText("");
        txfEstilo1.setLineColor(new java.awt.Color(73, 150, 50));
        txfEstilo1.setSelectionColor(new java.awt.Color(73, 150, 50));
        add(txfEstilo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 230, -1));

        txfNumero1.setCaretColor(new java.awt.Color(0, 0, 0));
        txfNumero1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txfNumero1.setLabelText("");
        txfNumero1.setLineColor(new java.awt.Color(73, 150, 50));
        txfNumero1.setSelectionColor(new java.awt.Color(73, 150, 50));
        add(txfNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 230, -1));

        txfColor1.setCaretColor(new java.awt.Color(0, 0, 0));
        txfColor1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txfColor1.setLabelText("");
        txfColor1.setLineColor(new java.awt.Color(73, 150, 50));
        txfColor1.setSelectionColor(new java.awt.Color(73, 150, 50));
        txfColor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfColor1ActionPerformed(evt);
            }
        });
        add(txfColor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 230, -1));

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Teni", "Zapato", "Zapatilla", "Huarache", "Taquete", "Bota de trabajo", "Bota de rodeo", "Bota alta", "Botin", "Reloj" }));
        cbxTipo.setSelectedIndex(-1);
        cbxTipo.setLabeText("");
        cbxTipo.setLineColor(new java.awt.Color(73, 150, 50));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });
        add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 500, 230, 50));

        cbxSexo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Teni", "Zapato", "Zapatilla", "Huarache", "Taquete", "Bota de trabajo", "Bota de rodeo", "Bota alta", "Botin", "Reloj" }));
        cbxSexo1.setSelectedIndex(-1);
        cbxSexo1.setLabeText("");
        cbxSexo1.setLineColor(new java.awt.Color(73, 150, 50));
        cbxSexo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSexo1ActionPerformed(evt);
            }
        });
        add(cbxSexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, 230, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void pnlAnadirSeleccionadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAnadirSeleccionadoMouseEntered
        
        pnlAnadirSeleccionado.setBackground(new Color(21,101,192));
        
    }//GEN-LAST:event_pnlAnadirSeleccionadoMouseEntered

    private void pnlAnadirSeleccionadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAnadirSeleccionadoMouseExited
        
        pnlAnadirSeleccionado.setBackground(new Color(18,90,173));
        
    }//GEN-LAST:event_pnlAnadirSeleccionadoMouseExited

    private void pnlAnadirSeleccionadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAnadirSeleccionadoMouseClicked
     
        String codigo = txfPrecio.getText();
        String estilo = txfPrecio.getText().toLowerCase();
        String color = txfPrecio.getText().toUpperCase();
        String numero = txfPrecio.getText();
        String sexo = cbxTipo.getSelectedItem().toString();
        String precio = txfPrecio.getText();
        String tipo = cbxTipo.getSelectedItem().toString();
        
        try {
            if(codigo.equals("")||  codigo.equals("Ingresa el codigo") ||
                    estilo.equals("") || estilo.equals("Ingresa el estilo") || 
                    numero.equals("") || numero.equals("Ingresa el numero") || 
                    color.equals("") || color.equals("Ingresa el color") || 
                    precio.equals("") || precio.equals("Ingresa el precio")){
                JOptionPane.showMessageDialog(null,"Faltan ingresar datos");
            } else {
                
                if(ModeloDAO.guardar(Integer.parseInt(codigo), color, Double.parseDouble(numero), Integer.parseInt(tipo), Integer.parseInt(sexo), Double.parseDouble(precio), Integer.parseInt(estilo))){
                JOptionPane.showMessageDialog(null,"Modelo añadido");
                
                Buscar p3 = new Buscar();
                p3.setSize(1510, 770);
                p3.setLocation(0,0);
        
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

    private void txfColor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfColor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfColor1ActionPerformed

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoActionPerformed

    private void cbxSexo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSexo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSexo1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.zapateria.combobox.Combobox cbxSexo1;
    protected com.raven.zapateria.combobox.Combobox cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator4;
    public static javax.swing.JLabel lblAnadir;
    private javax.swing.JPanel pnlAnadirSeleccionado;
    private com.raven.zapateria.textfield.TextField txfColor1;
    private com.raven.zapateria.textfield.TextField txfEstilo1;
    private com.raven.zapateria.textfield.TextField txfNumero1;
    private com.raven.zapateria.textfield.TextField txfPrecio;
    // End of variables declaration//GEN-END:variables
}
