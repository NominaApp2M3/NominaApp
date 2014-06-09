package FORMULARIOS;


import ConeccionAleatoria.RandomConnection;
import DaoImp.Trabajador_DaoImp;
import POJO.Trabajador;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*; 
import javax.swing.ImageIcon;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lisannette Ivania Maliaño Hurtado
 */
public class trabajadores extends javax.swing.JFrame {

   
    
    

    private JCheckBoxMenuItem gr;
    
    public trabajadores() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        moneda = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        tiempo = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        n1 = new javax.swing.JTextField();
        a1 = new javax.swing.JTextField();
        ht1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        he1 = new javax.swing.JTextField();
        ced = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido a la lista de trabajadores");
        setIconImage(new ImageIcon(getClass().getResource("/icon/libre.png")).getImage());

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 70));

        jLabel5.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("*BIENVENIDO*\n");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel5)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 93));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        moneda.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        moneda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija la moneda de pago", "Cordobas", "Dolares", " " }));
        moneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monedaActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Eliminar");

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("Modificar");

        tiempo.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        tiempo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija el tiempo de pago", "Mensual", "Semanal", "Quincenal" }));
        tiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 102));
        jButton4.setText("Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(moneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton1))))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 150));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Horas trabajadas:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel4.add(jLabel4, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cedula:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel4.add(jLabel3, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellidos:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel4.add(jLabel2, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombres:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel4.add(jLabel1, gridBagConstraints);

        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });
        n1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n1KeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 190;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel4.add(n1, gridBagConstraints);

        a1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                a1KeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 190;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel4.add(a1, gridBagConstraints);

        ht1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ht1ActionPerformed(evt);
            }
        });
        ht1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ht1KeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 65;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel4.add(ht1, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Horas Extras:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 8;
        jPanel4.add(jLabel6, gridBagConstraints);

        he1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                he1KeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 65;
        jPanel4.add(he1, gridBagConstraints);

        try {
            ced.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-######-####U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ced.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(ced, gridBagConstraints);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 539, 449);
    }// </editor-fold>//GEN-END:initComponents

    private void n1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n1KeyTyped
     char car=evt.getKeyChar();
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car<' ' || car>' ')&& (car!=(char)KeyEvent.VK_BACK_SPACE)){ //La validacion del nombre donde sea solo String, espacios y ningun numero
           evt.consume(); 
         JOptionPane.showMessageDialog(this, "No se admiten este tipo de caracteres","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        if(n1.getText().length()>20){
            evt.consume();
        }
    }//GEN-LAST:event_n1KeyTyped

    private void a1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a1KeyTyped
   char car=evt.getKeyChar();
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car<' ' || car>' ')&& (car!=(char)KeyEvent.VK_BACK_SPACE)){ //Validacion del apellido, solo letras y espacio menos numeros
           evt.consume(); 
         JOptionPane.showMessageDialog(this, "No se admiten este tipo de caracteres","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        if (a1.getText().length()>20) {
            evt.consume();
        }
    }//GEN-LAST:event_a1KeyTyped

    private void ht1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ht1KeyTyped
       char car = evt.getKeyChar();
       if(ht1.getText().length()>=3) evt.consume();
    if((car<'0' || car>'9')) evt.consume();
 
    }//GEN-LAST:event_ht1KeyTyped

    private void he1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_he1KeyTyped
   char car = evt.getKeyChar();
   if(he1.getText().length()>=2) evt.consume();
    if((car<'0' || car>'9')) evt.consume();
 
    }//GEN-LAST:event_he1KeyTyped

    private void monedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monedaActionPerformed
   moneda.getSelectedItem().toString();
    }//GEN-LAST:event_monedaActionPerformed

    private void tiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoActionPerformed
   tiempo.getSelectedItem().toString();
    }//GEN-LAST:event_tiempoActionPerformed

    private void cedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cedKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            try{
      new RandomConnection(("Trabajadores.dat")).Conectar();
  }catch(FileNotFoundException e){
      JOptionPane.showMessageDialog(this,"Archivo no encontrado","Error",JOptionPane.ERROR_MESSAGE);
  }catch(IOException e){
      JOptionPane.showMessageDialog(this,"Error en coneccion","Error",JOptionPane.ERROR_MESSAGE);
  }
      Trabajador_DaoImp timp= new Trabajador_DaoImp();
      Trabajador t= new Trabajador();
      
      t.setId(timp.Raf()+1);
      t.setNombres(this.n1.getText());
      t.setApellidos(this.a1.getText());
      t.setCedula(this.ced.getText());
      
      
        } catch (IOException ex) {
            Logger.getLogger(trabajadores.class.getName()).log(Level.SEVERE, null, ex);
        }
              
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ht1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ht1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ht1ActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        // TODO add your handling code here
        
    }//GEN-LAST:event_n1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Menu mn= new Menu();
        mn.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(trabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trabajadores().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a1;
    private javax.swing.JFormattedTextField ced;
    private javax.swing.JTextField he1;
    private javax.swing.JTextField ht1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox moneda;
    private javax.swing.JTextField n1;
    private javax.swing.JComboBox tiempo;
    // End of variables declaration//GEN-END:variables
}
