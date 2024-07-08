/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import EDD.HashTable;
import java.awt.List;
import javax.swing.ListModel;

/**
 * La clase {@code Analizar} proporciona una interfaz gráfica para analizar
 * resúmenes almacenados en un hash table. Permite seleccionar un resumen por
 * título y mostrar su análisis.
 *
 * @autor Chris
 */
public class Analizar extends javax.swing.JFrame {

    public static Menu v1;

    /**
     * Crea una nueva instancia de la clase {@code Analizar}.
     *
     * @param v1 el objeto de la clase {@code Menu} que contiene los datos
     * necesarios para el análisis
     */
    public Analizar(Menu v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        HashTable hash = v1.hashtable;
        for (int i = 0; i < hash.tamano; i++) {
            try {
                this.jComboBox1.addItem(hash.resumenes[i].titulo);
            } catch (Exception e) {
                // Manejo de excepción si es necesario
            }
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

        jPanel2 = new javax.swing.JPanel();
        analizar = new javax.swing.JLabel();
        botonAtras = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonAnalizar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        analizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Analizar.png"))); // NOI18N
        jPanel2.add(analizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 60, 70));

        botonAtras.setBackground(new java.awt.Color(0, 0, 0));
        botonAtras.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(255, 255, 255));
        botonAtras.setText("Atrás");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        jPanel2.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 90, 40));

        Titulo.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Analizar resumen:");
        jPanel2.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 340, 280));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Análisis:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 80, 30));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Investigaciones guardadas:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 230, 30));

        botonAnalizar.setBackground(new java.awt.Color(0, 0, 0));
        botonAnalizar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        botonAnalizar.setForeground(new java.awt.Color(255, 255, 255));
        botonAnalizar.setText("Analizar");
        botonAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnalizarActionPerformed(evt);
            }
        });
        jPanel2.add(botonAnalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 100, 30));

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 230, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jPanel2.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Acción realizada al presionar el botón "Atras".
     *
     * @param evt el evento de acción
     */
    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        this.setVisible(false);

        Menu menu = new Menu();

        menu.setVisible(true);
    }//GEN-LAST:event_botonAtrasActionPerformed

    /**
     * Acción realizada al presionar el botón "Analizar".
     *
     * @param evt el evento de acción
     */
    private void botonAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnalizarActionPerformed
        // TODO add your handling code here:
        HashTable hash = v1.hashtable;
        String titulo = this.jComboBox1.getSelectedItem().toString();
        try {
            this.jTextArea1.setText(hash.analizar(titulo));
        } catch (Exception e) {

        }
    }//GEN-LAST:event_botonAnalizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Analizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Analizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Analizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Analizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Analizar(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel analizar;
    private javax.swing.JButton botonAnalizar;
    private javax.swing.JButton botonAtras;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
