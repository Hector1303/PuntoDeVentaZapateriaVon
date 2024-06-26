/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mx.itson.zapateria.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import mx.itson.zapateria.entidades.Modelo;
import mx.itson.zapateria.persistencia.ModeloDAO;
import static mx.itson.zapateria.ui.Main.pnlAnadir;
import static mx.itson.zapateria.ui.Main.pnlApartados;
import static mx.itson.zapateria.ui.Main.pnlBuscar;
import static mx.itson.zapateria.ui.Main.pnlInicio;
import static mx.itson.zapateria.ui.Main.pnlJFrames;
import static mx.itson.zapateria.ui.Main.pnlProveedor;

/**
 *
 * @author Hector
 */
public class Buscar extends javax.swing.JPanel {

    /**
     * Creates new form Buscar
     */
    public Buscar() {
        initComponents();

        llenarTabla();
        
        tblBuscar.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tblBuscar.getTableHeader().setOpaque(false);
        tblBuscar.getTableHeader().setBackground(new Color(73,150,50));
        tblBuscar.getTableHeader().setForeground(new Color(0,0,0));
        tblBuscar.setRowHeight(25);

    }

    private void llenarTabla() {
        List<Modelo> modelos = ModeloDAO.obtener();
        DefaultTableModel model = (DefaultTableModel) tblBuscar.getModel();
        model.setRowCount(0);

        for (Modelo m : modelos) {
            model.addRow(new Object[]{
                m.getCodigo(),
                m.getColor(),
                m.getNumero(),
                m.getTipo(),
                m.getSexo(),
                "$" + m.getPrecio(),
                m.getEstilo(),
                m.getCantidad(),
                m.getProveedor()
            });
        }
    }

    /**
     *
     * @param buscar
     */
    public void buscar(String buscar) {

        List<Modelo> modelos = ModeloDAO.buscar(buscar);
        DefaultTableModel model = (DefaultTableModel) tblBuscar.getModel();
        model.setRowCount(0);

        for (Modelo m : modelos) {
            model.addRow(new Object[]{
                m.getCodigo(),
                m.getColor(),
                m.getNumero(),
                m.getTipo(),
                m.getSexo(),
                "$" + m.getPrecio(),
                m.getEstilo(),
                m.getCantidad()
            });
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
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuscar = new javax.swing.JTable();
        pnlVendido = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlApartar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlEliminar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txfBuscar = new com.raven.zapateria.textfield.TextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1510, 770));
        setMinimumSize(new java.awt.Dimension(1510, 770));
        setPreferredSize(new java.awt.Dimension(1510, 770));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar en inventario");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/zapateria/imagenes/buscar (1).png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 30, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/zapateria/imagenes/Logo Zapateria Von 340x191.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 310, 40));

        tblBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Color", "Numero", "Tipo", "Sexo", "Precio", "Estilo", "Cantidad", "Proveedor"
            }
        ));
        tblBuscar.setFocusable(false);
        tblBuscar.setRowHeight(25);
        tblBuscar.setSelectionBackground(new java.awt.Color(73, 150, 50));
        tblBuscar.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(tblBuscar);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 1070, 540));

        pnlVendido.setBackground(new java.awt.Color(73, 150, 50));
        pnlVendido.setForeground(new java.awt.Color(21, 101, 192));
        pnlVendido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlVendido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlVendidoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlVendidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlVendidoMouseExited(evt);
            }
        });
        pnlVendido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/zapateria/imagenes/billete-de-banco.png"))); // NOI18N
        pnlVendido.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 70));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Vender");
        pnlVendido.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 30));

        add(pnlVendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 240, 170, 90));

        pnlApartar.setBackground(new java.awt.Color(73, 150, 50));
        pnlApartar.setForeground(new java.awt.Color(21, 101, 192));
        pnlApartar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlApartar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlApartarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlApartarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlApartarMouseExited(evt);
            }
        });
        pnlApartar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/zapateria/imagenes/calendario (1).png"))); // NOI18N
        pnlApartar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 70));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Apartar");
        pnlApartar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 30));

        add(pnlApartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 350, 170, 90));

        pnlEliminar.setBackground(new java.awt.Color(192, 42, 35));
        pnlEliminar.setForeground(new java.awt.Color(21, 101, 192));
        pnlEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlEliminarMouseExited(evt);
            }
        });
        pnlEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/zapateria/imagenes/eliminar.png"))); // NOI18N
        pnlEliminar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 70));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Eliminar");
        pnlEliminar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 170, -1));

        add(pnlEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 550, 170, 90));

        txfBuscar.setLabelText("Codigo/Color/Numero/Tipo/Sexo/Precio/Estilo");
        txfBuscar.setLineColor(new java.awt.Color(73, 150, 50));
        txfBuscar.setSelectionColor(new java.awt.Color(73, 150, 50));
        txfBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txfBuscarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txfBuscarMouseReleased(evt);
            }
        });
        txfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarKeyReleased(evt);
            }
        });
        add(txfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 260, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void pnlVendidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVendidoMouseEntered
        pnlVendido.setBackground(new Color(38, 109, 43));
    }//GEN-LAST:event_pnlVendidoMouseEntered

    private void pnlVendidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVendidoMouseExited
        pnlVendido.setBackground(new Color(73, 150, 50));
    }//GEN-LAST:event_pnlVendidoMouseExited

    private void pnlVendidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVendidoMouseClicked

        try {
            int filaSeleccionada = Buscar.tblBuscar.getSelectedRow();
        String codigo = tblBuscar.getValueAt(filaSeleccionada, 0).toString();

        NuevaVenta p4 = new NuevaVenta();
        p4.setSize(1510, 770);
        p4.setLocation(0, 0);
        p4.txfCodigo.setText(codigo);
        p4.buscar(codigo);

        setColor(pnlInicio);
        resetColor(pnlVendido);
        resetColor(pnlAnadir);
        resetColor(pnlBuscar);
        resetColor(pnlApartados);
        resetColor(pnlProveedor);

        pnlJFrames.removeAll();
        pnlJFrames.add(p4, BorderLayout.CENTER);
        pnlJFrames.revalidate();
        pnlJFrames.repaint();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Selecciona un modelo");
        }
        


    }//GEN-LAST:event_pnlVendidoMouseClicked

    private void pnlApartarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlApartarMouseClicked
        
        try {
            
        int filaSeleccionada = tblBuscar.getSelectedRow();
        String codigo = tblBuscar.getValueAt(filaSeleccionada, 2).toString();
            
        String txfCodigo = tblBuscar.getValueAt(filaSeleccionada, 0).toString();
        
        String color = tblBuscar.getValueAt(filaSeleccionada, 1).toString().toLowerCase();
        color = Character.toUpperCase(color.charAt(0)) + color.substring(1);
        
        String numero = tblBuscar.getValueAt(filaSeleccionada, 2).toString();
            if (numero.endsWith(".0")) { // Si el número es un entero, terminará con ".0"
                numero = numero.substring(0, numero.length() - 2); // Eliminar ".0" al final
            }
        
        String tipo = tblBuscar.getValueAt(filaSeleccionada, 3).toString().toLowerCase(); 
        tipo = Character.toUpperCase(tipo.charAt(0)) + tipo.substring(1);
        if(tipo.equals("Botatrabajo")){
            tipo = "Bota de trabajo";
        }else if(tipo.equals("Botarodeo")){
            tipo = "Bota de rodeo";
        }else if(tipo.equals("Botaalta")){
            tipo = "Bota alta";
        }
        
        String sexo = tblBuscar.getValueAt(filaSeleccionada, 4).toString().toLowerCase();
        sexo = Character.toUpperCase(sexo.charAt(0)) + sexo.substring(1);
        
        String precio = tblBuscar.getValueAt(filaSeleccionada, 5).toString().substring(1);
        String estilo = tblBuscar.getValueAt(filaSeleccionada, 6).toString();
        
        NuevoApartado p7 = new NuevoApartado();
        p7.setSize(1510, 770);
        p7.setLocation(0, 0);
        
        p7.txfCodigo.setText(txfCodigo);
        
        p7.txfColor.setText(color);
        p7.cbxNumero.setSelectedItem(numero);
        p7.cbxTipo.setSelectedItem(tipo);
        p7.cbxSexo.setSelectedItem(sexo);
        p7.txfPrecio.setText(precio);
        p7.txfEstilo.setText(estilo);
        
        

        setColor(pnlApartados);
        resetColor(pnlVendido);
        resetColor(pnlAnadir);
        resetColor(pnlBuscar);
        resetColor(pnlInicio);
        resetColor(pnlProveedor);

        pnlJFrames.removeAll();
        pnlJFrames.add(p7, BorderLayout.CENTER);
        pnlJFrames.revalidate();
        pnlJFrames.repaint();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Selecciona un modelo");
        }
        
    }//GEN-LAST:event_pnlApartarMouseClicked

    private void pnlApartarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlApartarMouseEntered
        pnlApartar.setBackground(new Color(38, 109, 43));
    }//GEN-LAST:event_pnlApartarMouseEntered

    private void pnlApartarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlApartarMouseExited
        pnlApartar.setBackground(new Color(73, 150, 50));
    }//GEN-LAST:event_pnlApartarMouseExited

    private void pnlEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEliminarMouseClicked
        int filaSeleccionada = tblBuscar.getSelectedRow();
        if(filaSeleccionada != -1){
            if(JOptionPane.showConfirmDialog(this, "¿Estas seguro de eliminar el modelo?") == JOptionPane.YES_OPTION){
            
            
            if(ModeloDAO.eliminarModelo((int) tblBuscar.getValueAt(filaSeleccionada, 0))){
                JOptionPane.showMessageDialog(this, "Se ha eliminado el modelo del inventario");
            }
            llenarTabla();
        }
        }else{
            JOptionPane.showMessageDialog(this, "Selecciona un modelo");
        }
        
        
        
    }//GEN-LAST:event_pnlEliminarMouseClicked

    private void pnlEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEliminarMouseEntered
        pnlEliminar.setBackground(new Color(119, 42, 35));
    }//GEN-LAST:event_pnlEliminarMouseEntered

    private void pnlEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEliminarMouseExited
        pnlEliminar.setBackground(new Color(192, 42, 35));
    }//GEN-LAST:event_pnlEliminarMouseExited

    private void txfBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfBuscarMousePressed
        if (txfBuscar.getText().equals("Codigo/Color/Numero/Tipo/Sexo/Precio/Estilo")) {
            txfBuscar.setText("");
            txfBuscar.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txfBuscarMousePressed

    private void txfBuscarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfBuscarMouseReleased

    }//GEN-LAST:event_txfBuscarMouseReleased

    private void txfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyReleased
        buscar(txfBuscar.getText());
    }//GEN-LAST:event_txfBuscarKeyReleased

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlApartar;
    private javax.swing.JPanel pnlEliminar;
    private javax.swing.JPanel pnlVendido;
    public static javax.swing.JTable tblBuscar;
    private com.raven.zapateria.textfield.TextField txfBuscar;
    // End of variables declaration//GEN-END:variables
}
