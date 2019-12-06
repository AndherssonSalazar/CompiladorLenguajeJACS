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
        jLabel2 = new javax.swing.JLabel();
        jspTablaSimbolos = new javax.swing.JScrollPane();
        jtTablaSimbolos = new javax.swing.JTable();
        btnAnalisisLexico = new javax.swing.JButton();
        jspEditorCodigo = new javax.swing.JScrollPane();
        txtEditorCodigo = new javax.swing.JTextArea();
        jspTxtErrores = new javax.swing.JScrollPane();
        txtErrores = new javax.swing.JTextArea();
        jspTablaAnalizaTodo = new javax.swing.JScrollPane();
        jtTablaAnalizaTodo = new javax.swing.JTable();
        btnAnalisisSintactico = new javax.swing.JButton();
        btnAnalisisSemantico = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1200, 650));

        jLabel1.setText("Editor Codigo");

        jLabel2.setText("Tabla de Simbolos");

        jtTablaSimbolos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Token", "Cantidad", "Lexema", "Tipo"
            }
        ));
        jspTablaSimbolos.setViewportView(jtTablaSimbolos);

        btnAnalisisLexico.setText("Analisis Léxico");
        btnAnalisisLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalisisLexicoActionPerformed(evt);
            }
        });

        txtEditorCodigo.setColumns(20);
        txtEditorCodigo.setRows(5);
        jspEditorCodigo.setViewportView(txtEditorCodigo);

        txtErrores.setColumns(20);
        txtErrores.setRows(5);
        jspTxtErrores.setViewportView(txtErrores);

        jtTablaAnalizaTodo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Token", "Cantidad", "Lexema", "Tipo"
            }
        ));
        jspTablaAnalizaTodo.setViewportView(jtTablaAnalizaTodo);

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

        jLabel3.setText("Tabla de Analiza Todo");

        jLabel4.setText("Errores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jspTxtErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAnalisisLexico, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(btnAnalisisSintactico)
                                        .addGap(27, 27, 27)
                                        .addComponent(btnAnalisisSemantico))
                                    .addComponent(jspEditorCodigo))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jspTablaSimbolos, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jspTablaAnalizaTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(288, 288, 288)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(jLabel4)))))))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jspEditorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jspTablaAnalizaTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(jspTablaSimbolos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnalisisSemantico)
                            .addComponent(btnAnalisisSintactico)
                            .addComponent(btnAnalisisLexico))))
                .addGap(3, 3, 3)
                .addComponent(jspTxtErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalisisLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalisisLexicoActionPerformed
        tablaSimbolos = new DefaultTableModel();
        tablaSimbolos.setColumnIdentifiers(new Object[]{"Token","Cantidad","Lexema","Tipo"});
        
        miLexico.Analizar(txtEditorCodigo.getText());
        txtErrores.setText("");
        
        
        recorrerIterador(miLexico.getPalabrasReservadas(), tablaSimbolos, "Palabra Reservada");
        recorrerIterador(miLexico.getOperadoresAritmeticos(), tablaSimbolos, "Operador Aritmetico");
        recorrerIterador(miLexico.getOperadoresRelacionales(), tablaSimbolos, "Operador Relacional");
        recorrerIterador(miLexico.getOperadoresLogicos(), tablaSimbolos, "Operador Logico");
        recorrerIterador(miLexico.getDelimitadores(), tablaSimbolos, "Delimitador");
        
        
        recorrerIteradorNoArray(miLexico.getNumerosEnteros(), tablaSimbolos, "300", "Numero Entero");
        recorrerIteradorNoArray(miLexico.getNumerosReales(), tablaSimbolos, "301", "Numero Real");
        recorrerIteradorNoArray(miLexico.getIdentificador(), tablaSimbolos, "100", "Identificador");
        recorrerIteradorNoArray(miLexico.getCadenas(), tablaSimbolos, "302", "Dato Cadena");
        recorrerIteradorNoArray(miLexico.getCaracteres(), tablaSimbolos, "303", "Dato Caracter");
        
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
        
        jtTablaAnalizaTodo.setModel(tablaSimbolos);
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

    private void recorrerIteradorNoArray(HashMap<String,Integer> palabras, DefaultTableModel tablaSimbolos,String numeroTok, String nom){
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
    }
    
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jspEditorCodigo;
    private javax.swing.JScrollPane jspTablaAnalizaTodo;
    private javax.swing.JScrollPane jspTablaSimbolos;
    private javax.swing.JScrollPane jspTxtErrores;
    private javax.swing.JTable jtTablaAnalizaTodo;
    private javax.swing.JTable jtTablaSimbolos;
    private javax.swing.JTextArea txtEditorCodigo;
    private javax.swing.JTextArea txtErrores;
    // End of variables declaration//GEN-END:variables
}
