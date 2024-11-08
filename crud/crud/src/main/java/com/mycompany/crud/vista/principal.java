/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.crud.vista;

import com.mycompany.crud.conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class principal extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    int id;

    DefaultTableModel modelo;

    public principal() {
        initComponents();
        listar();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        botonAGREGAR = new javax.swing.JButton();
        botonMODIFICAR = new javax.swing.JButton();
        botonELIMINAR = new javax.swing.JButton();
        botonNUEVO = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        chkEstado = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CRUD");
        jLabel1.setToolTipText("");

        jLabel2.setText("NOMBRE");

        jLabel3.setText("APELLIDO");

        jLabel4.setText("       ID");

        txtId.setEditable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        botonAGREGAR.setText("AGREGAR");
        botonAGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAGREGARActionPerformed(evt);
            }
        });

        botonMODIFICAR.setText("MODIFICAR");
        botonMODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMODIFICARActionPerformed(evt);
            }
        });

        botonELIMINAR.setText("ELIMINAR");
        botonELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonELIMINARActionPerformed(evt);
            }
        });

        botonNUEVO.setText("NUEVO");
        botonNUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNUEVOActionPerformed(evt);
            }
        });

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO", "SEXO", "Celular", "EMAIL", "ESTADO"
            }
        ));
        tablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDatos);

        jLabel5.setText("SEXO");

        jLabel6.setText("CELULAR");

        jLabel7.setText("CORREO");

        jLabel8.setText("ESTADO");

        chkEstado.setText("jCheckBox1");

        jButton1.setText("Volver ventana 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSexo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido)
                                    .addComponent(chkEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(txtId))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonAGREGAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonMODIFICAR, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(botonELIMINAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonNUEVO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkEstado))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(botonAGREGAR)
                .addGap(18, 18, 18)
                .addComponent(botonMODIFICAR)
                .addGap(18, 18, 18)
                .addComponent(botonELIMINAR)
                .addGap(18, 18, 18)
                .addComponent(botonNUEVO)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAGREGARActionPerformed
        agregar();
        listar();
        nuevo();
    }//GEN-LAST:event_botonAGREGARActionPerformed

    private void tablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosMouseClicked
        int fila = tablaDatos.getSelectedRow();
        if (fila != -1) {
            id = Integer.parseInt(tablaDatos.getValueAt(fila, 0).toString());
            String name = tablaDatos.getValueAt(fila, 1).toString();
            String lastname = tablaDatos.getValueAt(fila, 2).toString();
            String sex = tablaDatos.getValueAt(fila, 3).toString();
            String cellphone = tablaDatos.getValueAt(fila, 4).toString();
            String email = tablaDatos.getValueAt(fila, 5).toString();
            boolean status = Boolean.parseBoolean(tablaDatos.getValueAt(fila, 6).toString());
            txtId.setText(String.valueOf(id));
            txtNombre.setText(name);
            txtApellido.setText(lastname);
            txtSexo.setText(sex);
            txtCelular.setText(cellphone);
            txtEmail.setText(email);
            chkEstado.setSelected(status);
            System.out.println("id" + id);

        } else {
            JOptionPane.showMessageDialog(null, "fila no seleccionada");
        }

    }//GEN-LAST:event_tablaDatosMouseClicked

    private void botonMODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMODIFICARActionPerformed
        modificar();
        listar();
        nuevo();
    }//GEN-LAST:event_botonMODIFICARActionPerformed

    private void botonELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonELIMINARActionPerformed
        eliminar();
        listar();
        nuevo();
    }//GEN-LAST:event_botonELIMINARActionPerformed

    private void botonNUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNUEVOActionPerformed
        nuevo();
    }//GEN-LAST:event_botonNUEVOActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Ventana1 v1 = new Ventana1();
        v1.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

 public void listar() {
        String sql = "SELECT * FROM user;";

        try {
            cn = con.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            Object[] usuario = new Object[7]; 
            modelo = (DefaultTableModel) tablaDatos.getModel();
            while (rs.next()) {
                usuario[0] = rs.getInt("id");
            usuario[1] = rs.getString("name");
            usuario[2] = rs.getString("lastname");
            usuario[3] = rs.getString("sex");
            usuario[4] = rs.getString("cellphone");
            usuario[5] = rs.getString("email");
            usuario[6] = rs.getBoolean("status");
                modelo.addRow(usuario);
            }

            tablaDatos.setModel(modelo);
        } catch (Exception e) {
            System.out.println("Error en el metodo listar: " + e);
        }
    }

    public void agregar() {
    String name = txtNombre.getText();
    String lastname = txtApellido.getText();
    String sex = txtSexo.getText();
    String cellphone = txtCelular.getText();
    String email = txtEmail.getText();
    boolean status = chkEstado.isSelected();

    if (name.equals("") || lastname.equals("") || sex.equals("") || cellphone.equals("") || email.equals("")) {
        JOptionPane.showMessageDialog(null, "Faltan valores");
    } else {
        String sql = "INSERT INTO user (name, lastname, sex, cellphone, email, status) VALUES ('" 
            + name + "','" + lastname + "','" + sex + "','" + cellphone + "','" + email + "'," + status + ");";
        try {
            cn = con.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sql);
            System.out.println("Registro exitoso");
            limpiar();
        } catch (Exception e) {
            System.out.println("Error en el método agregar: " + e);
        }
    }
}


public void modificar() {
    String name = txtNombre.getText();
    String lastname = txtApellido.getText();
    String sex = txtSexo.getText();
    String cellphone = txtCelular.getText();
    String email = txtEmail.getText();
    boolean status = chkEstado.isSelected();
    System.out.println("ID obtenido: " + id);

    if (name.equals("") || lastname.equals("") || sex.equals("") || cellphone.equals("") || email.equals("")) {
        JOptionPane.showMessageDialog(null, "Faltan valores");
    } else {
        String sql = "UPDATE user SET name = '" + name + "', lastname = '" + lastname 
            + "', sex = '" + sex + "', cellphone = '" + cellphone + "', email = '" + email 
            + "', status = " + status + " WHERE id = " + id;
        try {
            cn = con.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sql);

            System.out.println("Actualización exitosa");
            JOptionPane.showMessageDialog(null, "Actualización exitosa");
            limpiar();

        } catch (Exception e) {
            System.out.println("Error en el método modificar: " + e);
        }
    }
}

public void eliminar() {
    int fila = tablaDatos.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        limpiar();
    } else {
        String sql = "DELETE FROM user WHERE id = " + id;
        try {
            cn = con.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
            limpiar();
        } catch (Exception e) {
            System.out.println("Error en el método eliminar: " + e);
        }
    }
}

public void limpiar() {
    for (int i = 0; i < tablaDatos.getRowCount(); i++) {
        modelo.removeRow(i);
        i = i - 1;
    }
}

public void nuevo() {
    txtId.setText("");
    txtNombre.setText("");
    txtApellido.setText("");
    txtSexo.setText("");
    txtCelular.setText("");
    txtEmail.setText("");
    chkEstado.setSelected(true);
    txtNombre.requestFocus();
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAGREGAR;
    private javax.swing.JButton botonELIMINAR;
    private javax.swing.JButton botonMODIFICAR;
    private javax.swing.JButton botonNUEVO;
    private javax.swing.JCheckBox chkEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}