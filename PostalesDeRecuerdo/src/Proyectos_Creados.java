/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Desktop;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;


/**
 *
 * @author JansMorphy
 */
public class Proyectos_Creados extends javax.swing.JFrame {
    Funciones FN = Funciones.getInstance();
    public DefaultListModel listModel = new DefaultListModel();
    /**
     * Creates new form Proyectos_Creados2
     */
    public Proyectos_Creados() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        List_ProyectosCreados = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LBL_ImagenOriginal = new javax.swing.JLabel();
        LBL_ImagenNueva = new javax.swing.JLabel();
        BTN_Volver = new javax.swing.JButton();
        BTN_VerCompleto = new javax.swing.JButton();
        BTN_VerCompleto_2 = new javax.swing.JButton();
        BTN_Propiedades2 = new javax.swing.JButton();
        BTN_Propiedades = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        CBOX_plugins = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(List_ProyectosCreados);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Proyectos creados");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Original:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Postal:");

        LBL_ImagenOriginal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LBL_ImagenNueva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BTN_Volver.setText("Volver");
        BTN_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_VolverActionPerformed(evt);
            }
        });

        BTN_VerCompleto.setText("Ver completo");
        BTN_VerCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_VerCompletoActionPerformed(evt);
            }
        });

        BTN_VerCompleto_2.setText("Ver completo");
        BTN_VerCompleto_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_VerCompleto_2ActionPerformed(evt);
            }
        });

        BTN_Propiedades2.setText("Propiedades");

        BTN_Propiedades.setText("Propiedades");
        BTN_Propiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_PropiedadesActionPerformed(evt);
            }
        });

        jButton1.setText("nuevo plugin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("usar plugin");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(BTN_VerCompleto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_VerCompleto_2)
                        .addGap(111, 111, 111))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(54, 54, 54)
                                .addComponent(BTN_Propiedades))
                            .addComponent(LBL_ImagenOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(LBL_ImagenNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(39, 39, 39)
                                .addComponent(BTN_Propiedades2)))
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CBOX_plugins, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_Volver)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(BTN_Propiedades)
                            .addComponent(BTN_Propiedades2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBL_ImagenOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBL_ImagenNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_VerCompleto)
                            .addComponent(BTN_VerCompleto_2))
                        .addGap(61, 61, 61)
                        .addComponent(CBOX_plugins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(19, 19, 19)
                .addComponent(BTN_Volver)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    
    
    private void BTN_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_VolverActionPerformed
        Inicio Frame = new Inicio();
        Frame.setVisible(true);
        Frame.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BTN_VolverActionPerformed

    private void BTN_VerCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_VerCompletoActionPerformed
        try {
            String imagen = FN.buscarProyecto(List_ProyectosCreados.getSelectedValue()).getImgOriginal().getRuta();
            File f = new File(imagen);
            Desktop d = Desktop.getDesktop();
            d.open(f);
            
        } catch (IOException ex) {
            Logger.getLogger(Proyectos_Creados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTN_VerCompletoActionPerformed

    private void BTN_VerCompleto_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_VerCompleto_2ActionPerformed
        try {
            String postal = FN.buscarProyecto(List_ProyectosCreados.getSelectedValue()).getPostal().getRuta();
            File f = new File(postal);
            Desktop d = Desktop.getDesktop();
            d.open(f);
            
        } catch (IOException ex) {
            Logger.getLogger(Proyectos_Creados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTN_VerCompleto_2ActionPerformed

    private void BTN_PropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_PropiedadesActionPerformed
        try {
                String postal = FN.buscarProyecto(List_ProyectosCreados.getSelectedValue()).getImgOriginal().getRuta();
                File f = new File(postal);
                BufferedImage bimg = ImageIO.read(f);
                int ancho = bimg.getWidth();
                int largo = bimg.getHeight();
                int transparencia = bimg.getTransparency();
                
            } catch (IOException ex) {
                Logger.getLogger(Proyectos_Creados.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_BTN_PropiedadesActionPerformed
    File archivo;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int resultado;
        EscogerImagen buscador = new EscogerImagen();
        resultado = buscador.jFileChooser1.showOpenDialog(null);
        if (EscogerImagen.jFileChooser1.APPROVE_OPTION == resultado) {
            archivo = buscador.jFileChooser1.getSelectedFile();
            String nombrePlugin = archivo.getName();
            FN.Plugins.add(nombrePlugin);
            CBOX_plugins.addItem(nombrePlugin);
            
           try {
               copiarArchivo(new File(archivo.getAbsolutePath()), new File("D:\\Escritorio\\Clases Virtuales\\4 semestre\\Lenguajes de programación\\Cuarto Proyecto\\PostalesDeRecuerdo\\src\\" + nombrePlugin));
           } catch (IOException ex) {
               Logger.getLogger(Proyectos_Creados.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nombrePlugin = CBOX_plugins.getSelectedItem().toString();
        ClassLoaderTest CL = new ClassLoaderTest();
        String ruta = FN.buscarProyecto(List_ProyectosCreados.getSelectedValue()).getPostal().getRuta();
        System.out.println(ruta);
        System.out.println(nombrePlugin);
        
        String aSplitear = archivo.getName();
        String replace = aSplitear.replace(".", ",");
        String split[] = replace.split(",");
        String sF = split[0];
        System.out.println(sF);
        
        CL.invokeClassMethod(sF, ruta);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Proyectos_Creados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proyectos_Creados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proyectos_Creados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proyectos_Creados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyectos_Creados().setVisible(true);
            }
        });
    }
    public void cargarProyectosCreados(){
        listModel.clear();
        
        for (Proyecto i : FN.ListaProyectos) {
            listModel.addElement(i.getNombre());
        }
        List_ProyectosCreados.setModel(listModel);
    }

    public void listener() {
        List_ProyectosCreados.getSelectionModel().addListSelectionListener(e -> {
            Proyecto proyecto = FN.buscarProyecto(List_ProyectosCreados.getSelectedValue());
            ImageIcon imagen = new ImageIcon(proyecto.getImgOriginal().getRuta());
            ImageIcon postal = new ImageIcon(proyecto.getPostal().getRuta());
            ImageIcon iconOri = new ImageIcon(imagen.getImage().getScaledInstance(LBL_ImagenOriginal.getWidth(), LBL_ImagenOriginal.getHeight(), Image.SCALE_DEFAULT));
            ImageIcon iconPostal = new ImageIcon(postal.getImage().getScaledInstance(LBL_ImagenNueva.getWidth(), LBL_ImagenNueva.getHeight(), Image.SCALE_DEFAULT));
            LBL_ImagenOriginal.setIcon(iconOri);
            LBL_ImagenNueva.setIcon(iconPostal);
            
        });
    }
    private static void copiarArchivo(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Propiedades;
    private javax.swing.JButton BTN_Propiedades2;
    private javax.swing.JButton BTN_VerCompleto;
    private javax.swing.JButton BTN_VerCompleto_2;
    private javax.swing.JButton BTN_Volver;
    private javax.swing.JComboBox<String> CBOX_plugins;
    private javax.swing.JLabel LBL_ImagenNueva;
    private javax.swing.JLabel LBL_ImagenOriginal;
    private javax.swing.JList<String> List_ProyectosCreados;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}