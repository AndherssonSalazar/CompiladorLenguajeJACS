package compiladorlenguajejacs.interfaces;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.table.DefaultTableModel;
import compiladorlenguajejacs.clases.AnalizadorLexico;
import compiladorlenguajejacs.clases.AnalizadorSintactico;

/**
 *
 * @author Andhersson Salazar
 */

public class jfPanelPrincipal extends javax.swing.JFrame {
    private AnalizadorLexico miLexico;
    private AnalizadorSintactico miSintactico;
    private DefaultTableModel tablaSimbolos;
    public jfPanelPrincipal() {
        miLexico=new AnalizadorLexico();
        miSintactico=new AnalizadorSintactico();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAnalisisLexico = new javax.swing.JButton();
        jspEditorCodigo = new javax.swing.JScrollPane();
        txtEditorCodigo = new javax.swing.JTextArea();
        jspTxtErrores = new javax.swing.JScrollPane();
        txtErrores = new javax.swing.JTextArea();
        btnAnalisisSintactico = new javax.swing.JButton();
        btnAnalisisSemantico = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jpPanelContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1200, 700));

        jLabel1.setText("Editor Codigo");

        btnAnalisisLexico.setText("Analisis Léxico");
        btnAnalisisLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalisisLexicoActionPerformed(evt);
            }
        });

        jspEditorCodigo.setPreferredSize(new java.awt.Dimension(400, 400));

        txtEditorCodigo.setColumns(20);
        txtEditorCodigo.setRows(5);
        jspEditorCodigo.setViewportView(txtEditorCodigo);

        txtErrores.setColumns(20);
        txtErrores.setRows(5);
        jspTxtErrores.setViewportView(txtErrores);

        btnAnalisisSintactico.setText("Analisis Sintáctico");
        btnAnalisisSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalisisSintacticoActionPerformed(evt);
            }
        });

        btnAnalisisSemantico.setText("Analisis Semántico");
        btnAnalisisSemantico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalisisSemanticoActionPerformed(evt);
            }
        });

        jLabel4.setText("Errores");

        jpPanelContenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpPanelContenedor.setPreferredSize(new java.awt.Dimension(650, 400));

        javax.swing.GroupLayout jpPanelContenedorLayout = new javax.swing.GroupLayout(jpPanelContenedor);
        jpPanelContenedor.setLayout(jpPanelContenedorLayout);
        jpPanelContenedorLayout.setHorizontalGroup(
            jpPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        jpPanelContenedorLayout.setVerticalGroup(
            jpPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAnalisisLexico, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnAnalisisSintactico)
                                .addGap(27, 27, 27)
                                .addComponent(btnAnalisisSemantico)
                                .addGap(89, 89, 89)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jspTxtErrores, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jspEditorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jpPanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(80, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpPanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jspEditorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAnalisisSemantico)
                        .addComponent(btnAnalisisSintactico)
                        .addComponent(btnAnalisisLexico))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jspTxtErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalisisLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalisisLexicoActionPerformed
        tablaSimbolos = new DefaultTableModel();
        tablaSimbolos.setColumnIdentifiers(new Object[]{"Token","Cantidad","Lexema","Tipo"});
        
        miLexico.Analizar(txtEditorCodigo.getText());
        txtErrores.setText("");
        
        /*recorrerIterador(miLexico.getPalabrasReservadas(), tablaSimbolos, "Palabra Reservada");
        recorrerIterador(miLexico.getOperadoresAritmeticos(), tablaSimbolos, "Operador Aritmetico");
        recorrerIterador(miLexico.getOperadoresRelacionales(), tablaSimbolos, "Operador Relacional");
        recorrerIterador(miLexico.getOperadoresLogicos(), tablaSimbolos, "Operador Logico");
        recorrerIterador(miLexico.getDelimitadores(), tablaSimbolos, "Delimitador");
        
        
        recorrerIteradorNoArray(miLexico.getNumerosEnteros(), tablaSimbolos, "300", "Numero Entero");
        recorrerIteradorNoArray(miLexico.getNumerosReales(), tablaSimbolos, "301", "Numero Real");
        recorrerIteradorNoArray(miLexico.getIdentificador(), tablaSimbolos, "100", "Identificador");
        recorrerIteradorNoArray(miLexico.getCadenas(), tablaSimbolos, "302", "Dato Cadena");
        recorrerIteradorNoArray(miLexico.getCaracteres(), tablaSimbolos, "303", "Dato Caracter");
        */
        Iterator<String> iterador=miLexico.ObtenerErrores().keySet().iterator();
        String token="";
        if(miLexico.TieneErrores()){
            while(iterador.hasNext()){
                token = iterador.next();
                if(miLexico.ObtenerErrores().get(token) > 0){
                    txtErrores.setText(txtErrores.getText()+"\nError: "+token+" Cantidad: "+miLexico.ObtenerErrores().get(token)+"\n");
                }
            }
        }
        
        //jtTablaAnalizaTodo.setModel(tablaSimbolos);
    }//GEN-LAST:event_btnAnalisisLexicoActionPerformed

    private void btnAnalisisSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalisisSintacticoActionPerformed
        miLexico.Analizar(txtEditorCodigo.getText());
        if(!miLexico.TieneErrores()){
            miSintactico.Analizar(miLexico.ObtenerCodigoAnalizado());
        }
    }//GEN-LAST:event_btnAnalisisSintacticoActionPerformed

    private void btnAnalisisSemanticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalisisSemanticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnalisisSemanticoActionPerformed

    /*private void recorrerIteradorNoArray(HashMap<String,Integer> palabras, DefaultTableModel tablaSimbolos,String numeroTok, String nom){
        String token="";
        Iterator<String> iterador=palabras.keySet().iterator();
        while(iterador.hasNext()){
            token = iterador.next();
            if(palabras.get(token) > 0){
                tablaSimbolos.addRow(new Object[]{numeroTok,palabras.get(token) ,token,nom});
            }
        }
    }
    private void recorrerIterador(HashMap<String,Integer[]> palabras, DefaultTableModel tablaSimbolos, String nom){
        String token="";
        Iterator<String> iterador=palabras.keySet().iterator();
        while(iterador.hasNext()){
            token = iterador.next();
            if(palabras.get(token)[0] > 0){
                tablaSimbolos.addRow(new Object[]{palabras.get(token)[1], palabras.get(token)[0],token,nom});
            }
        }
    }*/
    
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
            java.util.logging.Logger.getLogger(jfPanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfPanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfPanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfPanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfPanelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalisisLexico;
    private javax.swing.JButton btnAnalisisSemantico;
    private javax.swing.JButton btnAnalisisSintactico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jpPanelContenedor;
    private javax.swing.JScrollPane jspEditorCodigo;
    private javax.swing.JScrollPane jspTxtErrores;
    private javax.swing.JTextArea txtEditorCodigo;
    private javax.swing.JTextArea txtErrores;
    // End of variables declaration//GEN-END:variables
}
