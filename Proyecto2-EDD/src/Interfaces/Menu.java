/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Chris
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setVisible(false);
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
        botonBuscarAutor = new javax.swing.JButton();
        botonAnalizar = new javax.swing.JButton();
        botonBuscarPalabraClave = new javax.swing.JButton();
        botonCargar = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Titulo2 = new javax.swing.JLabel();
        Titulo3 = new javax.swing.JLabel();
        Titulo4 = new javax.swing.JLabel();
        Titulo5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonBuscarAutor.setText("Buscar");
        botonBuscarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarAutorActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscarAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 100, 40));

        botonAnalizar.setText("Analizar");
        botonAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnalizarActionPerformed(evt);
            }
        });
        jPanel1.add(botonAnalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 100, 40));

        botonBuscarPalabraClave.setText("Buscar");
        botonBuscarPalabraClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarPalabraClaveActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscarPalabraClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 100, 40));

        botonCargar.setText("Cargar");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 100, 40));

        Titulo.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 51, 255));
        Titulo.setText("Menú");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        Titulo2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(51, 51, 255));
        Titulo2.setText("Cargar Archivo:");
        jPanel1.add(Titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        Titulo3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        Titulo3.setForeground(new java.awt.Color(51, 51, 255));
        Titulo3.setText("Buscar Autor:");
        jPanel1.add(Titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        Titulo4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        Titulo4.setForeground(new java.awt.Color(51, 51, 255));
        Titulo4.setText("Analizar:");
        jPanel1.add(Titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        Titulo5.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        Titulo5.setForeground(new java.awt.Color(51, 51, 255));
        Titulo5.setText("Buscar Palabra Clave:");
        jPanel1.add(Titulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarAutorActionPerformed
        this.setVisible(false);

        Menu menu = new Menu();

        BuscarAutor buscar = new BuscarAutor(menu);

        buscar.setVisible(true);
    }//GEN-LAST:event_botonBuscarAutorActionPerformed

    private void botonBuscarPalabraClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarPalabraClaveActionPerformed
        this.setVisible(false);

        Menu menu = new Menu();

        BuscarPalabraClave buscar = new BuscarPalabraClave(menu);

        buscar.setVisible(true);
    }//GEN-LAST:event_botonBuscarPalabraClaveActionPerformed

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
        this.setVisible(false);

        Menu menu = new Menu();

        Cargar cargar = new Cargar(menu);

        cargar.setVisible(true);
    }//GEN-LAST:event_botonCargarActionPerformed

    private void botonAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnalizarActionPerformed
        this.setVisible(false);

        Menu menu = new Menu();

        Analizar analizar = new Analizar(menu);

        analizar.setVisible(true);
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel Titulo3;
    private javax.swing.JLabel Titulo4;
    private javax.swing.JLabel Titulo5;
    private javax.swing.JButton botonAnalizar;
    private javax.swing.JButton botonBuscarAutor;
    private javax.swing.JButton botonBuscarPalabraClave;
    private javax.swing.JButton botonCargar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
