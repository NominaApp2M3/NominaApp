package FORMULARIOS;


import ConeccionAleatoria.RandomConnection;
import DaoImp.Usuario_DaoImp;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lisanette Ivania Maliaño Hurtado
 */
public class Usuario_login extends javax.swing.JFrame {

    /**
     * Creates new form Usuario_login
     */
    
    int cont =2;
    public Usuario_login() {
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
        aceptar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Us = new javax.swing.JTextField();
        Pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INGRESAR");
        setIconImage(new ImageIcon(getClass().getResource("/icon/seguridad.gif")).getImage());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        aceptar1.setBackground(new java.awt.Color(0, 0, 0));
        aceptar1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        aceptar1.setForeground(new java.awt.Color(255, 255, 255));
        aceptar1.setText("Aceptar");
        aceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar1ActionPerformed(evt);
            }
        });
        jPanel1.add(aceptar1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel1.setText("Usuario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel2.setText("Contraseña:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(jLabel2, gridBagConstraints);

        Us.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UsKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 1, 3, 1);
        jPanel2.add(Us, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 1, 3, 1);
        jPanel2.add(Pass, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 390, 219);
    }// </editor-fold>//GEN-END:initComponents

    private void aceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar1ActionPerformed
// if((String.valueOf(usuario.getText()).compareTo("admin")==0)&& (String.valueOf(contraseña1.getPassword()).compareTo("abc")==0)){ //Se valida la contraseña y Usuario_login por default
// Menu mn=new Menu(); //Inicializa la ventana del menu
// mn.setVisible(true); //Una vez inicializada, se manda a llamar la ventana
// this.setVisible(false);
// }
// else{
// javax.swing.JOptionPane.showMessageDialog(this,"Usuario_login o contraseña mal escrito","HUBO UN ERROR",javax.swing.JOptionPane.ERROR_MESSAGE);
// //En caso  que se ingrese mal los datos, se mandara una ventana al Usuario_login que ingrese de nuevo
// }
        
        
         try {
            try{
              
            new RandomConnection("Usuarios.dat").Conectar();
        }catch(IOException e){
            JOptionPane.showMessageDialog(this,"Archivo noo encontrado","Error interno",JOptionPane.ERROR_MESSAGE);
        }
            
            Usuario_DaoImp uimp= new Usuario_DaoImp();
            
            if (uimp.Raf()==0) {
          JOptionPane.showMessageDialog(this,"Error al conectar con los datos","Error interno",JOptionPane.ERROR_MESSAGE);
        }
            
              List<POJO.Usuario> Lista;
              Lista=uimp.EncontrarTodos();
              
            for(POJO.Usuario r:Lista){
                
                String Np=r.getNombre().trim();
                String Cp=r.getPass().trim();
                
               
                        
                if ((this.Us.getText().trim().equals(Np)) && (this.Pass.getText().trim().equals(Cp))) {
//                  JOptionPane.showMessageDialog(this, "Welcome","Good",JOptionPane.INFORMATION_MESSAGE);
//                  
//                  this.Us.setText("");
//                  this.Pass.setText("");
                  Menu m= new Menu();
                  m.setVisible(true);
                  this.setVisible(false);
                  
                }else{                     
//                    if(cont!=0){
//                    JOptionPane.showMessageDialog(this, "Usuario o Contraseña no es correcto,"
//                            + "A ud le quedan "+cont+" intentos ", "Error ", JOptionPane.ERROR_MESSAGE);  
//                    cont--;
//                    
//                   this.Us.setText("");
//                  this.Pass.setText("");
//                    
//                 }else{
//                         System.exit(0);
//                     }
//                }
//                
//                 if ((this.Us.getText().isEmpty() && this.Pass.getText().isEmpty()) || (this.Us.getText().isEmpty() || this.Pass.getText().isEmpty())) {
//            
//            JOptionPane.showMessageDialog(this,"Dos o uno de los campos se encuentran vacios","Error",JOptionPane.ERROR_MESSAGE);
//                   
//                  this.Us.setText("");
//                  this.Pass.setText("");
//        }else{
//
//                }
                }
                

            }
        } catch (IOException ex) {
            Logger.getLogger(Usuario_login.class.getName()).log(Level.SEVERE, null, ex);
        }
         
             if ((this.Us.getText().isEmpty() && this.Pass.getText().isEmpty()) || (this.Us.getText().isEmpty() || this.Pass.getText().isEmpty())) {
            
            JOptionPane.showMessageDialog(this,"Dos o uno de los campos se encuentran vacios","Error",JOptionPane.ERROR_MESSAGE);
                   
                  this.Us.setText("");
                  this.Pass.setText("");
        }
             

    }//GEN-LAST:event_aceptar1ActionPerformed

    
    
    private void UsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsKeyTyped
                     
        char car = evt.getKeyChar();
            if((car<'a' || car>'z') && (car<'A' || car>'Z')
                    &&(car!=(char)KeyEvent.VK_BACK_SPACE)){
                evt.consume();
               JOptionPane.showMessageDialog(this, "No se admiten este tipo de caracteres","Error",JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_UsKeyTyped

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
            java.util.logging.Logger.getLogger(Usuario_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario_login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField Us;
    private javax.swing.JButton aceptar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
