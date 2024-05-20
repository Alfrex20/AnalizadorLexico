/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import static codigo.Tokens.Int;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;

/**
 *
 * @author Charly Ponce
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    private void analizadorLexico() throws IOException{
        int cont=1;
        
        String expr=(String) txtAbrir.getText();
        Lexer lexer=new Lexer(new StringReader(expr));
        String resultado="Linea "+cont+"\t\tSIMBOLO\n";
        while(true){
            Tokens token=lexer.yylex();
                    if(token==null){
                        txtAnalizar.setText(resultado);
                        return;
                    }
                    switch(token){
                        case Linea:
                            cont++;
                            resultado +="LINEA " +cont+ "\n";
                            break;
                        case Int:
                            resultado +=" <Reservada int>\t" +lexer.lexeme+"\n";
                            break;
                        case If:
                            resultado +=" <Reservada if>\t" +lexer.lexeme+"\n";
                            break;
                        case Else:
                            resultado +=" <Reservada else>\t" +lexer.lexeme+"\n";
                            break;
                         case While:
                            resultado +=" <Reservada while>\t" +lexer.lexeme+"\n";
                            break;
                         case Igual:
                            resultado +=" <Reservada igual>\t" +lexer.lexeme+"\n";
                            break;
                          case Suma:
                            resultado +=" <Reservada Suma>\t" +lexer.lexeme+"\n";
                            break;
                            case Resta:
                            resultado +=" <Reservada Resta>\t" +lexer.lexeme+"\n";
                            break;
                            case Multiplicacion:
                            resultado +=" <Reservada Multiplicacion>\t" +lexer.lexeme+"\n";
                            break;
                            case Division:
                            resultado +=" <Reservada Division>\t" +lexer.lexeme+"\n";
                            break;
                            case Parentesis_a:
                            resultado +=" <Parentesis Apertura>\t" +lexer.lexeme+"\n";
                            break;
                            case Parentesis_c:
                            resultado +=" <Parentesis Cierre>\t" +lexer.lexeme+"\n";
                            break;
                            case Llave_a:
                            resultado +=" <Llave Apertura>\t" +lexer.lexeme+"\n";
                            break;
                            case Llave_c:
                            resultado +=" <Llave Cierre>\t" +lexer.lexeme+"\n";
                            break;
                            case Main:
                            resultado +=" <Reservada Main>\t" +lexer.lexeme+"\n";
                            break;
                            case P_coma:
                            resultado +=" <Punto y Coma>\t" +lexer.lexeme+"\n";
                            break;
                            case Punto:
                            resultado += "<Punto>\t"+lexer.lexeme+"\n";
                            break;
                            case Identificador:
                            resultado +=" <Identificador>\t\t" +lexer.lexeme+"\n";
                            break;
                            case Numero:
                            resultado +=" <Numero>\t\t" +lexer.lexeme+"\n";
                            break;
                            case ComillaDoble:
                                resultado +="<Comilla Doble>\t"+lexer.lexeme+"\n";
                                break;
                            case ERROR:
                            resultado +=" <Símbolo no definido>\n";
                            break;
                            default:
                                resultado +=" < " +lexer.lexeme+" >\n";
                                break;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAbrir = new javax.swing.JTextArea();
        btnAbrir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnalizar = new javax.swing.JTextArea();
        btnAnalizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnLimpiar2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAceptar = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(535, 630));
        setMinimumSize(new java.awt.Dimension(535, 630));
        setPreferredSize(new java.awt.Dimension(535, 630));
        getContentPane().setLayout(null);

        txtAbrir.setBackground(new java.awt.Color(204, 204, 204));
        txtAbrir.setColumns(20);
        txtAbrir.setRows(5);
        jScrollPane1.setViewportView(txtAbrir);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(17, 82, 223, 299);

        btnAbrir.setBackground(new java.awt.Color(204, 204, 204));
        btnAbrir.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/abrir-documento.png"))); // NOI18N
        btnAbrir.setText("Abrir Archivo");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        getContentPane().add(btnAbrir);
        btnAbrir.setBounds(20, 40, 150, 31);

        txtAnalizar.setBackground(new java.awt.Color(204, 204, 204));
        txtAnalizar.setColumns(20);
        txtAnalizar.setRows(5);
        jScrollPane2.setViewportView(txtAnalizar);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(258, 82, 246, 299);

        btnAnalizar.setBackground(new java.awt.Color(204, 204, 204));
        btnAnalizar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnAnalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar (1).png"))); // NOI18N
        btnAnalizar.setText("Analizar");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnalizar);
        btnAnalizar.setBounds(260, 40, 120, 31);

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(394, 40, 111, 30);

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Analizador Sintáctico");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(151, 393, 220, 22);

        jLabel2.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Analizador Léxico");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(157, 6, 180, 22);

        btnAceptar.setBackground(new java.awt.Color(204, 204, 204));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar (1).png"))); // NOI18N
        btnAceptar.setText("Analizar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(17, 421, 120, 31);

        btnLimpiar2.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnLimpiar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpiar.png"))); // NOI18N
        btnLimpiar2.setText("Limpiar");
        btnLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar2);
        btnLimpiar2.setBounds(358, 421, 120, 31);

        txtAceptar.setBackground(new java.awt.Color(204, 204, 204));
        txtAceptar.setColumns(20);
        txtAceptar.setRows(5);
        jScrollPane3.setViewportView(txtAceptar);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(17, 466, 487, 114);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 520, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo=new File(chooser.getSelectedFile().getAbsolutePath());
        try {
            String ST=new String(Files.readAllBytes(archivo.toPath()));
            txtAbrir.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        try {
            analizadorLexico();
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnalizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       txtAnalizar.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String ST=txtAbrir.getText();
        Sintax s=new Sintax(new codigo.LexerCup(new StringReader(ST)));
        
        try {
            s.parse();
            txtAceptar.setText("Analizis realizado correctamente");
            txtAceptar.setForeground(new Color(25,111,61));
        } catch (Exception ex) {
            Symbol sym=s.getS();
            txtAceptar.setText("Error de sintaxis. Linea: "+(sym.right +1)+" Columna: "+(sym.left+1)+ ", Texto: \""+sym.value +"\"");
            txtAceptar.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar2ActionPerformed
        txtAceptar.setText("");
    }//GEN-LAST:event_btnLimpiar2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtAbrir;
    private javax.swing.JTextArea txtAceptar;
    private javax.swing.JTextArea txtAnalizar;
    // End of variables declaration//GEN-END:variables
}
