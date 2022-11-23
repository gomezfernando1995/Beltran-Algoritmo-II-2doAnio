
import font.Fuentes;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author Fernando
 */
public class Main extends javax.swing.JFrame {

    Fuentes tipoFuente;
    public Main() {
        initComponents();
       
        tipoFuente = new Fuentes();
        lblCodProducto.setFont(tipoFuente.fuente(tipoFuente.FLAME_regular_otf,2, 20));
        txtCodProducto.setFont(tipoFuente.fuente(tipoFuente.FLAME_cursiva_otf,0, 17));
        tblEleccion.setFont(tipoFuente.fuente(tipoFuente.FLAME_cursiva_otf,0, 14));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodProducto = new javax.swing.JLabel();
        lblCheck = new javax.swing.JLabel();
        hamburguesa = new javax.swing.JLabel();
        pnl = new javax.swing.JScrollPane();
        tblEleccion = new javax.swing.JTable();
        txtCodProducto = new javax.swing.JTextField();
        img_patron = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 75));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodProducto.setBackground(new java.awt.Color(255, 51, 51));
        lblCodProducto.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblCodProducto.setForeground(new java.awt.Color(84, 37, 6));
        lblCodProducto.setText("Codigo Producto:");
        getContentPane().add(lblCodProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 40));

        lblCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-casilla-de-verificación-marcada-40.png"))); // NOI18N
        lblCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCheckMouseEntered(evt);
            }
        });
        getContentPane().add(lblCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, 30));

        hamburguesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/burger.png"))); // NOI18N
        getContentPane().add(hamburguesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, 330));

        tblEleccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "TIPO", "DESCRIPCION", "PRECIO"
            }
        ));
        tblEleccion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tblEleccion.setSelectionBackground(new java.awt.Color(255, 230, 204));
        tblEleccion.setSelectionForeground(new java.awt.Color(204, 204, 204));
        pnl.setViewportView(tblEleccion);

        getContentPane().add(pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 560, 230));

        txtCodProducto.setForeground(new java.awt.Color(65, 34, 0));
        txtCodProducto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCodProducto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 200, 149), 2, true));
        txtCodProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCodProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 390, 30));

        img_patron.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gradient.jpeg"))); // NOI18N
        img_patron.setText("jLabel1");
        img_patron.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(img_patron, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 900, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProductoActionPerformed

    private void lblCheckMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCheckMouseEntered
        ImageIcon icono = new ImageIcon("src/img/on.pgn");
        Icon ico =new ImageIcon(icono.getImage());
        lblCheck.setIcon(ico);
    }//GEN-LAST:event_lblCheckMouseEntered

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hamburguesa;
    private javax.swing.JLabel img_patron;
    private javax.swing.JLabel lblCheck;
    private javax.swing.JLabel lblCodProducto;
    private javax.swing.JScrollPane pnl;
    private javax.swing.JTable tblEleccion;
    private javax.swing.JTextField txtCodProducto;
    // End of variables declaration//GEN-END:variables
}
