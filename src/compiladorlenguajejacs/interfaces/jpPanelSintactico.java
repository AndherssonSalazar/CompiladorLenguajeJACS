package compiladorlenguajejacs.interfaces;

import compiladorlenguajejacs.clases.AnalizadorSintactico;

/**
 *
 * @author Andhersson Salazar
 */
public class jpPanelSintactico extends javax.swing.JPanel {
    public jpPanelSintactico() {
        initComponents();
    }
    public void Rellenar(AnalizadorSintactico miSintactico){
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jspSintactico = new javax.swing.JScrollPane();
        jpSintacticoTxts = new javax.swing.JPanel();
        jspSintacticoPila = new javax.swing.JScrollPane();
        txtSintacticoPila = new javax.swing.JTextArea();
        jspSintacticoEntrada = new javax.swing.JScrollPane();
        txtSintacticoEntrada = new javax.swing.JTextArea();
        jspSintacticoProducciones = new javax.swing.JScrollPane();
        txtSintacticoProducciones = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jspSintactico.setPreferredSize(new java.awt.Dimension(650, 380));

        jpSintacticoTxts.setPreferredSize(new java.awt.Dimension(650, 360));

        jspSintacticoPila.setPreferredSize(new java.awt.Dimension(225, 380));

        txtSintacticoPila.setColumns(20);
        txtSintacticoPila.setRows(5);
        jspSintacticoPila.setViewportView(txtSintacticoPila);

        jspSintacticoEntrada.setPreferredSize(new java.awt.Dimension(225, 380));

        txtSintacticoEntrada.setColumns(20);
        txtSintacticoEntrada.setRows(5);
        jspSintacticoEntrada.setViewportView(txtSintacticoEntrada);

        jspSintacticoProducciones.setPreferredSize(new java.awt.Dimension(200, 380));

        txtSintacticoProducciones.setColumns(20);
        txtSintacticoProducciones.setRows(5);
        jspSintacticoProducciones.setViewportView(txtSintacticoProducciones);

        javax.swing.GroupLayout jpSintacticoTxtsLayout = new javax.swing.GroupLayout(jpSintacticoTxts);
        jpSintacticoTxts.setLayout(jpSintacticoTxtsLayout);
        jpSintacticoTxtsLayout.setHorizontalGroup(
            jpSintacticoTxtsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSintacticoTxtsLayout.createSequentialGroup()
                .addComponent(jspSintacticoPila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jspSintacticoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jspSintacticoProducciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpSintacticoTxtsLayout.setVerticalGroup(
            jpSintacticoTxtsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspSintacticoPila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jspSintacticoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jspSintacticoProducciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jspSintactico.setViewportView(jpSintacticoTxts);

        jLabel1.setText("Pila");

        jLabel2.setText("Entrada");

        jLabel3.setText("Producciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addGap(204, 204, 204)
                .addComponent(jLabel2)
                .addGap(183, 183, 183)
                .addComponent(jLabel3))
            .addComponent(jspSintactico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(5, 5, 5)
                .addComponent(jspSintactico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jpSintacticoTxts;
    private javax.swing.JScrollPane jspSintactico;
    private javax.swing.JScrollPane jspSintacticoEntrada;
    private javax.swing.JScrollPane jspSintacticoPila;
    private javax.swing.JScrollPane jspSintacticoProducciones;
    private javax.swing.JTextArea txtSintacticoEntrada;
    private javax.swing.JTextArea txtSintacticoPila;
    private javax.swing.JTextArea txtSintacticoProducciones;
    // End of variables declaration//GEN-END:variables
}
