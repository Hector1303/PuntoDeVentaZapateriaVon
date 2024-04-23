/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mx.itson.zapateria.ui;

import java.awt.BorderLayout;
import static mx.itson.zapateria.ui.Main.pnlJFrames;

/**
 *
 * @author Hector
 */
public class Anadir extends javax.swing.JPanel {

    /**
     * Creates new form Anadir
     */
    public Anadir() {
        initComponents();
        AnadirSeleccionado anadirSeleccion = new AnadirSeleccionado();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlTeni = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnlZapato = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnlZapatilla = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pnlHuarache = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pnlAtras = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/zapateria/imagenes/Logo zapateria von azul.png"))); // NOI18N

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1510, 770));
        setMinimumSize(new java.awt.Dimension(1510, 770));
        setPreferredSize(new java.awt.Dimension(1510, 770));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Añadir Modelo");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 170, 20));

        pnlTeni.setBackground(new java.awt.Color(255, 255, 255));
        pnlTeni.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        pnlTeni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlTeni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTeniMouseClicked(evt);
            }
        });
        pnlTeni.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/zapateria/imagenes/zapatillas-de-deporte (1).png"))); // NOI18N
        pnlTeni.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 140));

        add(pnlTeni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, 140));

        pnlZapato.setBackground(new java.awt.Color(255, 255, 255));
        pnlZapato.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        pnlZapato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlZapato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlZapatoMouseClicked(evt);
            }
        });
        pnlZapato.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/zapateria/imagenes/zapato.png"))); // NOI18N
        pnlZapato.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 140, 140));

        add(pnlZapato, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 140, 140));

        pnlZapatilla.setBackground(new java.awt.Color(255, 255, 255));
        pnlZapatilla.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        pnlZapatilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlZapatilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlZapatillaMouseClicked(evt);
            }
        });
        pnlZapatilla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/zapateria/imagenes/tacones-altos.png"))); // NOI18N
        pnlZapatilla.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 140));

        add(pnlZapatilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 140, 140));

        pnlHuarache.setBackground(new java.awt.Color(255, 255, 255));
        pnlHuarache.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        pnlHuarache.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlHuarache.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlHuaracheMouseClicked(evt);
            }
        });
        pnlHuarache.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/zapateria/imagenes/sandalias.png"))); // NOI18N
        pnlHuarache.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 140, 150));

        add(pnlHuarache, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 140, 140));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tenis");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 60, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Zapatos");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 110, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Zapatillas");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 110, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Huaraches");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 120, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/zapateria/imagenes/Logo zapateria von azul.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 155, 36));

        pnlAtras.setBackground(new java.awt.Color(255, 255, 255));
        pnlAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAtrasMouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/zapateria/imagenes/atras (1).png"))); // NOI18N
        pnlAtras.add(jLabel12);

        add(pnlAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void pnlTeniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTeniMouseClicked
            
        AnadirSeleccionado p5 = new AnadirSeleccionado();
        p5.setSize(1510, 770);
        p5.setLocation(0,0);
        
        pnlJFrames.removeAll();
        pnlJFrames.add(p5, BorderLayout.CENTER);
        pnlJFrames.revalidate();
        pnlJFrames.repaint();
        
        p5.lblAnadir.setText("Añadir Teni");
        p5.cbxTipo.setSelectedItem("Teni");
        
    }//GEN-LAST:event_pnlTeniMouseClicked

    private void pnlZapatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlZapatoMouseClicked

        
        AnadirSeleccionado p5 = new AnadirSeleccionado();
        p5.setSize(1510, 770);
        p5.setLocation(0,0);
        
        pnlJFrames.removeAll();
        pnlJFrames.add(p5, BorderLayout.CENTER);
        pnlJFrames.revalidate();
        pnlJFrames.repaint();
        
        p5.lblAnadir.setText("Añadir Zapato");
        p5.cbxTipo.setSelectedItem("Zapato");
        
    }//GEN-LAST:event_pnlZapatoMouseClicked

    private void pnlZapatillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlZapatillaMouseClicked
    
        
        AnadirSeleccionado p5 = new AnadirSeleccionado();
        p5.setSize(1510, 770);
        p5.setLocation(0,0);
        
        pnlJFrames.removeAll();
        pnlJFrames.add(p5, BorderLayout.CENTER);
        pnlJFrames.revalidate();
        pnlJFrames.repaint();
        
        p5.lblAnadir.setText("Añadir Zapatilla");
        p5.cbxTipo.setSelectedItem("Zapatilla");
        
    }//GEN-LAST:event_pnlZapatillaMouseClicked

    private void pnlHuaracheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHuaracheMouseClicked
        
        
        AnadirSeleccionado p5 = new AnadirSeleccionado();
        p5.setSize(1510, 770);
        p5.setLocation(0,0);
        
        pnlJFrames.removeAll();
        pnlJFrames.add(p5, BorderLayout.CENTER);
        pnlJFrames.revalidate();
        pnlJFrames.repaint();
        
        p5.lblAnadir.setText("Añadir Huarache");
        p5.cbxTipo.setSelectedItem("Huarache");
        
    }//GEN-LAST:event_pnlHuaracheMouseClicked

    private void pnlAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAtrasMouseClicked

        Inicio p1 = new Inicio();
        p1.setSize(1510, 770);
        p1.setLocation(0,0);

        pnlJFrames.removeAll();
        pnlJFrames.add(p1, BorderLayout.CENTER);
        pnlJFrames.revalidate();
        pnlJFrames.repaint();

    }//GEN-LAST:event_pnlAtrasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnlAtras;
    private javax.swing.JPanel pnlHuarache;
    private javax.swing.JPanel pnlTeni;
    private javax.swing.JPanel pnlZapatilla;
    private javax.swing.JPanel pnlZapato;
    // End of variables declaration//GEN-END:variables
}