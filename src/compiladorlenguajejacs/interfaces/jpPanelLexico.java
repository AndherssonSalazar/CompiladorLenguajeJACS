package compiladorlenguajejacs.interfaces;

import compiladorlenguajejacs.clases.AnalizadorLexico;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andhersson Salazar
 */
public class jpPanelLexico extends javax.swing.JPanel {
    private AnalizadorLexico miLexico;
    private DefaultTableModel tablaSimbolos;
    public jpPanelLexico(AnalizadorLexico miLexico) {
        initComponents();
        this.miLexico=miLexico;
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
        /*if(miLexico.TieneErrores()){
            while(iterador.hasNext()){
                token = iterador.next();
                if(miLexico.ObtenerErrores().get(token) > 0){
                    txtErrores.setText(txtErrores.getText()+"\nError: "+token+" Cantidad: "+miLexico.ObtenerErrores().get(token)+"\n");
                }
            }
        }*/
        
        jtTablaAnalizaTodo.setModel(tablaSimbolos);
    }

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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jspTablaSimbolos = new javax.swing.JScrollPane();
        jtTablaSimbolos = new javax.swing.JTable();
        jspTablaAnalizaTodo = new javax.swing.JScrollPane();
        jtTablaAnalizaTodo = new javax.swing.JTable();

        jLabel2.setText("Tabla de Simbolos");

        jLabel3.setText("Tabla de Analiza Todo");

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
        jtTablaSimbolos.getAccessibleContext().setAccessibleName("jtTablaSimbolos");

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
        jtTablaAnalizaTodo.getAccessibleContext().setAccessibleName("jtTablaAnalizaTodo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel3))
                    .addComponent(jspTablaSimbolos, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jspTablaAnalizaTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel2)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jspTablaAnalizaTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(jspTablaSimbolos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jspTablaAnalizaTodo;
    private javax.swing.JScrollPane jspTablaSimbolos;
    private javax.swing.JTable jtTablaAnalizaTodo;
    private javax.swing.JTable jtTablaSimbolos;
    // End of variables declaration//GEN-END:variables
}
