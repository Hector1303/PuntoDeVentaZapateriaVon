/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mx.itson.zapateria.ui;

import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import mx.itson.zapateria.entidades.Modelo;
import mx.itson.zapateria.persistencia.ModeloDAO;

/**
 *
 * @author Hector
 */
public class NuevaVenta extends javax.swing.JPanel {

    /**
     * Creates new form Inicio
     */
    public NuevaVenta() {
        initComponents();
    }

    public String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Manejar casos especiales
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    public void buscar(String buscar) {

        List<Modelo> modelos = ModeloDAO.buscarPorCodigo(buscar);

        for (Modelo m : modelos) {
            txfEstilo.setText(String.valueOf(m.getEstilo()));
            txfColor.setText(m.getColor());

            String tipo = capitalizeFirstLetter(m.getTipo().toString().toLowerCase());
            for (int i = 0; i < cbxTipo.getItemCount(); i++) {
                if (tipo.equals(cbxTipo.getItemAt(i))) {
                    cbxTipo.setSelectedIndex(i);
                    break;
                }else if(tipo.equals("Botatrabajo" )){
                    cbxTipo.setSelectedIndex(5);
                    break;
                }else if(tipo.equals("Botarodeo")){
                    cbxTipo.setSelectedIndex(6);
                    break;
                }else if(tipo.equals("Botaalta")){
                    cbxTipo.setSelectedIndex(7);
                    break;
                }
            }

            String sexo = capitalizeFirstLetter(m.getSexo().toString().toLowerCase());
            for (int i = 0; i < cbxSexo.getItemCount(); i++) {
                if (sexo.equals(cbxSexo.getItemAt(i))) {
                    cbxSexo.setSelectedIndex(i);
                    break;
                }
            }

            String numeroStr = String.valueOf(m.getNumero()); // Convertir el número a una cadena
            if (numeroStr.endsWith(".0")) { // Si el número es un entero, terminará con ".0"
                numeroStr = numeroStr.substring(0, numeroStr.length() - 2); // Eliminar ".0" al final
            }

            for (int i = 0; i < cbxNumero.getItemCount(); i++) {
                if (numeroStr.equals(cbxNumero.getItemAt(i))) {
                    cbxNumero.setSelectedIndex(i);
                    break;
                }
            }

            txfPrecio.setText("$" + String.valueOf(m.getPrecio()));

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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        cbxTipo = new com.raven.zapateria.combobox.Combobox();
        jLabel5 = new javax.swing.JLabel();
        txfEstilo = new com.raven.zapateria.textfield.TextField();
        txfColor = new com.raven.zapateria.textfield.TextField();
        cbxSexo = new com.raven.zapateria.combobox.Combobox();
        jLabel6 = new javax.swing.JLabel();
        cbxNumero = new com.raven.zapateria.combobox.Combobox();
        jLabel7 = new javax.swing.JLabel();
        txfPrecio = new com.raven.zapateria.textfield.TextField();
        jLabel8 = new javax.swing.JLabel();
        plnAnadirAlCarrito = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarrito = new javax.swing.JTable();
        txfCodigo = new com.raven.zapateria.textfield.TextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1510, 770));
        setMinimumSize(new java.awt.Dimension(1510, 770));
        setPreferredSize(new java.awt.Dimension(1510, 770));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nueva venta");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 210, 10));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/zapateria/imagenes/Logo Zapateria Von 340x191.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 310, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Estilo");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 80, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 20, 590));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipo");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 110, -1));

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Teni", "Zapato", "Zapatilla", "Huarache", "Taquete", "Bota de trabajo", "Bota de rodeo", "Bota alta", "Botin", "Reloj" }));
        cbxTipo.setSelectedIndex(-1);
        cbxTipo.setLabeText("");
        cbxTipo.setLineColor(new java.awt.Color(73, 150, 50));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });
        add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 230, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Color");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 80, -1));

        txfEstilo.setEditable(false);
        txfEstilo.setLabelText("");
        txfEstilo.setLineColor(new java.awt.Color(73, 150, 50));
        txfEstilo.setSelectionColor(new java.awt.Color(73, 150, 50));
        add(txfEstilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 230, -1));

        txfColor.setEditable(false);
        txfColor.setLabelText("");
        txfColor.setLineColor(new java.awt.Color(73, 150, 50));
        txfColor.setSelectionColor(new java.awt.Color(73, 150, 50));
        add(txfColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 230, -1));

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mujer", "Hombre", "Unisex" }));
        cbxSexo.setSelectedIndex(-1);
        cbxSexo.setLabeText("");
        cbxSexo.setLineColor(new java.awt.Color(73, 150, 50));
        cbxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSexoActionPerformed(evt);
            }
        });
        add(cbxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 230, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Sexo");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 110, -1));

        cbxNumero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "10.5", "11", "11.5", "12", "12.5", "13", "13.5", "14", "14.5", "15", "15.5", "16", "16.5", "17", "17.5", "18", "18.5", "19", "19.5", "20", "20.5", "21", "21.5", "22", "22.5", "23", "23.5", "24", "24.5", "25", "25.5", "26", "26.5", "27", "27.5", "28", "28.5", "29", "29.5", "30", "30.5" }));
        cbxNumero.setSelectedIndex(-1);
        cbxNumero.setLabeText("");
        cbxNumero.setLineColor(new java.awt.Color(73, 150, 50));
        cbxNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNumeroActionPerformed(evt);
            }
        });
        add(cbxNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 230, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Numero");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 110, -1));

        txfPrecio.setEditable(false);
        txfPrecio.setLabelText("");
        txfPrecio.setLineColor(new java.awt.Color(73, 150, 50));
        txfPrecio.setSelectionColor(new java.awt.Color(73, 150, 50));
        add(txfPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 230, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Precio");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, 80, -1));

        plnAnadirAlCarrito.setBackground(new java.awt.Color(73, 150, 50));
        plnAnadirAlCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plnAnadirAlCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plnAnadirAlCarritoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plnAnadirAlCarritoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plnAnadirAlCarritoMouseExited(evt);
            }
        });
        plnAnadirAlCarrito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Añadir al carrito");
        plnAnadirAlCarrito.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 70));

        add(plnAnadirAlCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 650, 260, 70));

        tblCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Estilo", "Color", "Tipo", "Sexo", "Numero", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tblCarrito);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, 690, 360));

        txfCodigo.setLabelText("");
        txfCodigo.setLineColor(new java.awt.Color(73, 150, 50));
        txfCodigo.setSelectionColor(new java.awt.Color(73, 150, 50));
        txfCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txfCodigoMousePressed(evt);
            }
        });
        txfCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfCodigoKeyReleased(evt);
            }
        });
        add(txfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 230, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Codigo");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 230, -1));

        jPanel1.setBackground(new java.awt.Color(73, 150, 50));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Imprimir ticket");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 70));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 640, 190, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoActionPerformed

    private void cbxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSexoActionPerformed

    private void cbxNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNumeroActionPerformed

    private void plnAnadirAlCarritoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plnAnadirAlCarritoMouseEntered
        plnAnadirAlCarrito.setBackground(new Color(38, 109, 43));
    }//GEN-LAST:event_plnAnadirAlCarritoMouseEntered

    private void plnAnadirAlCarritoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plnAnadirAlCarritoMouseExited
        plnAnadirAlCarrito.setBackground(new Color(73, 150, 50));
    }//GEN-LAST:event_plnAnadirAlCarritoMouseExited

    private void txfCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCodigoKeyReleased
        buscar(txfCodigo.getText());
        if (txfCodigo.getText().equals("")) {
            txfEstilo.setText("");
            txfColor.setText("");
            txfPrecio.setText("");
            cbxTipo.setSelectedIndex(-1);
            cbxSexo.setSelectedIndex(-1);
            cbxNumero.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_txfCodigoKeyReleased

    private void txfCodigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfCodigoMousePressed

    }//GEN-LAST:event_txfCodigoMousePressed

    private void plnAnadirAlCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plnAnadirAlCarritoMouseClicked

        DefaultTableModel model = (DefaultTableModel) tblCarrito.getModel();
        
        model.addRow(new Object[]{
            txfCodigo.getText(),
            txfEstilo.getText(),
            txfColor.getText(),
            cbxTipo.getSelectedItem(),
            cbxSexo.getSelectedItem(),
            cbxNumero.getSelectedItem(),
            txfPrecio.getText()
        });
    
        txfCodigo.setText("");
        txfEstilo.setText("");
        txfColor.setText("");
        txfPrecio.setText("");
        cbxTipo.setSelectedIndex(-1);
        cbxSexo.setSelectedIndex(-1);
        cbxNumero.setSelectedIndex(-1);

    }//GEN-LAST:event_plnAnadirAlCarritoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.zapateria.combobox.Combobox cbxNumero;
    private com.raven.zapateria.combobox.Combobox cbxSexo;
    private com.raven.zapateria.combobox.Combobox cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel plnAnadirAlCarrito;
    private javax.swing.JTable tblCarrito;
    public static com.raven.zapateria.textfield.TextField txfCodigo;
    private com.raven.zapateria.textfield.TextField txfColor;
    private com.raven.zapateria.textfield.TextField txfEstilo;
    private com.raven.zapateria.textfield.TextField txfPrecio;
    // End of variables declaration//GEN-END:variables
}
