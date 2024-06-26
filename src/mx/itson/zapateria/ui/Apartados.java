/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mx.itson.zapateria.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.itson.zapateria.entidades.Apartado;
import mx.itson.zapateria.persistencia.ApartadoDAO;
import static mx.itson.zapateria.ui.Main.pnlJFrames;

/**
 *
 * @author chiqu
 */
public class Apartados extends javax.swing.JPanel {

    /**
     * Creates new form Apartado
     */
    public Apartados() {
        initComponents();
        llenarTabla();
        
        tblApartados.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tblApartados.getTableHeader().setOpaque(false);
        tblApartados.getTableHeader().setBackground(new Color(73,150,50));
        tblApartados.getTableHeader().setForeground(new Color(0,0,0));
        tblApartados.setRowHeight(25);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblApartados = new javax.swing.JTable();
        pnlAbonar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlNuevoApartado = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlLiquidar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1510, 770));
        setMinimumSize(new java.awt.Dimension(1510, 770));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1510, 770));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblApartados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Celular", "Codigo", "Color", "Numero", "Tipo", "Sexo", "Precio", "Restante", "Estilo", "Fecha de apartado", "Fecha de vencimiento", "Numero de apartado", "Proveedor"
            }
        ));
        tblApartados.setFocusable(false);
        tblApartados.setRowHeight(25);
        tblApartados.setSelectionBackground(new java.awt.Color(73, 150, 50));
        tblApartados.setShowHorizontalLines(true);
        tblApartados.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblApartados);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 1380, 500));

        pnlAbonar.setBackground(new java.awt.Color(73, 150, 50));
        pnlAbonar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlAbonar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAbonarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAbonarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAbonarMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Abonar");

        javax.swing.GroupLayout pnlAbonarLayout = new javax.swing.GroupLayout(pnlAbonar);
        pnlAbonar.setLayout(pnlAbonarLayout);
        pnlAbonarLayout.setHorizontalGroup(
            pnlAbonarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAbonarLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlAbonarLayout.setVerticalGroup(
            pnlAbonarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAbonarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(pnlAbonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 660, 220, 70));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/zapateria/imagenes/Logo Zapateria Von 340x191.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 310, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Apartados");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 59));

        pnlNuevoApartado.setBackground(new java.awt.Color(73, 150, 50));
        pnlNuevoApartado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlNuevoApartado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlNuevoApartadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlNuevoApartadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlNuevoApartadoMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nuevo apartado");

        javax.swing.GroupLayout pnlNuevoApartadoLayout = new javax.swing.GroupLayout(pnlNuevoApartado);
        pnlNuevoApartado.setLayout(pnlNuevoApartadoLayout);
        pnlNuevoApartadoLayout.setHorizontalGroup(
            pnlNuevoApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        pnlNuevoApartadoLayout.setVerticalGroup(
            pnlNuevoApartadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        add(pnlNuevoApartado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 660, 220, 70));

        pnlLiquidar.setBackground(new java.awt.Color(73, 150, 50));
        pnlLiquidar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlLiquidar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlLiquidarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlLiquidarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlLiquidarMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Liquidar");

        javax.swing.GroupLayout pnlLiquidarLayout = new javax.swing.GroupLayout(pnlLiquidar);
        pnlLiquidar.setLayout(pnlLiquidarLayout);
        pnlLiquidarLayout.setHorizontalGroup(
            pnlLiquidarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLiquidarLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlLiquidarLayout.setVerticalGroup(
            pnlLiquidarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLiquidarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(pnlLiquidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 660, 220, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void llenarTabla() {
        List<Apartado> apartados = ApartadoDAO.obtener();
        DefaultTableModel model = (DefaultTableModel) tblApartados.getModel();
        model.setRowCount(0);
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        for (Apartado a : apartados) {
            model.addRow(new Object[]{
                a.getNombre(),
                a.getCelular(),
                a.getCodigo(),
                a.getColor(),
                a.getNumero(),
                a.getTipo(),
                a.getSexo(),
                "$" + a.getPrecio(),
                "$" + a.getRestante(),
                a.getEstilo(),
                formato.format(a.getFechaApartado()),
                formato.format(a.getFechaVencimiento()),
                "#" + a.getNumeroApartado(),
                a.getProveedor()
            });
        }
    }

    private void pnlAbonarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAbonarMouseEntered
        pnlAbonar.setBackground(new Color(38, 109, 43));
    }//GEN-LAST:event_pnlAbonarMouseEntered

    private void pnlAbonarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAbonarMouseExited
        pnlAbonar.setBackground(new Color(73, 150, 50));
    }//GEN-LAST:event_pnlAbonarMouseExited

    private void pnlNuevoApartadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNuevoApartadoMouseEntered
        pnlNuevoApartado.setBackground(new Color(38, 109, 43));
    }//GEN-LAST:event_pnlNuevoApartadoMouseEntered

    private void pnlNuevoApartadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNuevoApartadoMouseExited
        pnlNuevoApartado.setBackground(new Color(73, 150, 50));
    }//GEN-LAST:event_pnlNuevoApartadoMouseExited

    private void pnlNuevoApartadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNuevoApartadoMouseClicked

        NuevoApartado p7 = new NuevoApartado();
        p7.setSize(1510, 770);
        p7.setLocation(0, 0);

        pnlJFrames.removeAll();
        pnlJFrames.add(p7, BorderLayout.CENTER);
        pnlJFrames.revalidate();
        pnlJFrames.repaint();

    }//GEN-LAST:event_pnlNuevoApartadoMouseClicked

    private void pnlLiquidarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLiquidarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlLiquidarMouseEntered

    private void pnlLiquidarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLiquidarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlLiquidarMouseExited

    private void pnlAbonarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAbonarMouseClicked

        int filaSeleccionada = tblApartados.getSelectedRow();

        if (filaSeleccionada != -1) {
            AbonarApartado p7 = new AbonarApartado();
            p7.setSize(1510, 770);
            p7.setLocation(0, 0);

            pnlJFrames.removeAll();
            pnlJFrames.add(p7, BorderLayout.CENTER);
            pnlJFrames.revalidate();
            pnlJFrames.repaint();
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un apartado");
        }


    }//GEN-LAST:event_pnlAbonarMouseClicked

    private void pnlLiquidarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLiquidarMouseClicked
        int filaSeleccionada = Apartados.tblApartados.getSelectedRow();

        if (filaSeleccionada != -1) {
            int codigo = Integer.parseInt(Apartados.tblApartados.getValueAt(filaSeleccionada, 2).toString());
            String numeroApartado = Apartados.tblApartados.getValueAt(filaSeleccionada, 12).toString().substring(1);
            if (JOptionPane.showConfirmDialog(this, "¿Estas seguro de liquidar el apartado #" +numeroApartado+"? \n                        Restan "+ Apartados.tblApartados.getValueAt(filaSeleccionada, 8).toString()) == JOptionPane.YES_OPTION) {
                ApartadoDAO.transferirApartadoAVendido();
                if (ApartadoDAO.eliminarApartado(codigo)) {
                    JOptionPane.showMessageDialog(this, "Se ha liquidado el apartado");
                }

                Apartados p7 = new Apartados();
                p7.setSize(1510, 770);
                p7.setLocation(0, 0);

                pnlJFrames.removeAll();
                pnlJFrames.add(p7, BorderLayout.CENTER);
                pnlJFrames.revalidate();
                pnlJFrames.repaint();

                llenarTabla();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un apartado para liquidar");
        }


    }//GEN-LAST:event_pnlLiquidarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlAbonar;
    private javax.swing.JPanel pnlLiquidar;
    private javax.swing.JPanel pnlNuevoApartado;
    public static javax.swing.JTable tblApartados;
    // End of variables declaration//GEN-END:variables
}
