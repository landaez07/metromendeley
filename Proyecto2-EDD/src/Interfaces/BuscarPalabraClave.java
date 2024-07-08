/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import EDD.Lista;
import EDD.Resumenes;

/**
 * La clase {@code BuscarPalabraClave} proporciona una interfaz gráfica para
 * buscar resúmenes por palabra clave. Permite al usuario buscar y seleccionar
 * resúmenes que contengan una palabra clave específica.
 *
 * @autor Chris
 */
public class BuscarPalabraClave extends javax.swing.JFrame {

    public static Menu v1;

    /**
     * Crea una nueva instancia de la clase {@code BuscarPalabraClave}.
     *
     * @param v1 instancia del menú principal.
     */
    public BuscarPalabraClave(Menu v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buscarPalabraClave = new javax.swing.JLabel();
        botonAtras = new javax.swing.JButton();
        palabra = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        botonSeleccionar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscarPalabraClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BuscarPalabraClave.png"))); // NOI18N
        jPanel1.add(buscarPalabraClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 70, 80));

        botonAtras.setBackground(new java.awt.Color(0, 0, 0));
        botonAtras.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(255, 255, 255));
        botonAtras.setText("Atrás");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 90, 40));

        palabra.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jPanel1.add(palabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 270, 40));

        Titulo.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Buscar por palabra clave:");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Detalles:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 80, 30));

        botonBuscar.setBackground(new java.awt.Color(0, 0, 0));
        botonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        botonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 390, 370));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Introduzca una palabra clave:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 260, 30));

        botonSeleccionar.setBackground(new java.awt.Color(0, 0, 0));
        botonSeleccionar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        botonSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        botonSeleccionar.setText("Seleccionar");
        botonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(botonSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 160, 40));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Investigaciones relacionadas:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 260, 30));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 270, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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


    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    /**
     * Acción realizada al presionar el botón "Buscar".
     *
     * @param evt el evento de acción
     */
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        try {
            String palabra = this.palabra.getText().toLowerCase();
            Lista lista = this.v1.hash.comprobacion(palabra);
            String[] titulos = lista.imprimir().split("\n");
            this.jComboBox2.removeAllItems();
            for (int i = 0; i < titulos.length; i++) {
                try {
                    this.jComboBox2.addItem(titulos[i]);
                } catch (Exception e) {

                }
            }
        } catch (Exception r) {

        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    /**
     * Acción realizada al presionar el botón "Seleccionar".
     *
     * @param evt el evento de acción
     */
    private void botonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarActionPerformed
        // TODO add your handling code here:
        this.jTextArea1.setText(this.v1.hashtable.analizar(this.jComboBox2.getSelectedItem().toString()));
    }//GEN-LAST:event_botonSeleccionarActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarPalabraClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPalabraClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPalabraClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPalabraClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPalabraClave(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonSeleccionar;
    private javax.swing.JLabel buscarPalabraClave;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField palabra;
    // End of variables declaration//GEN-END:variables
}
