package compiladorlenguajejacs.interfaces;

/**
 *
 * @author AndherssonSalazar
 */
public class jpPanelSintactico extends javax.swing.JPanel {
    public jpPanelSintactico() {
        initComponents();
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

        setPreferredSize(new java.awt.Dimension(650, 400));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jspSintactico.setPreferredSize(new java.awt.Dimension(650, 380));

        jpSintacticoTxts.setPreferredSize(new java.awt.Dimension(650, 380));
        jpSintacticoTxts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jspSintacticoPila.setPreferredSize(new java.awt.Dimension(225, 380));

        txtSintacticoPila.setColumns(20);
        txtSintacticoPila.setRows(5);
        jspSintacticoPila.setViewportView(txtSintacticoPila);
        txtSintacticoPila.getAccessibleContext().setAccessibleName("txtSintactico");

        jpSintacticoTxts.add(jspSintacticoPila, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jspSintacticoEntrada.setPreferredSize(new java.awt.Dimension(225, 380));

        txtSintacticoEntrada.setColumns(20);
        txtSintacticoEntrada.setRows(5);
        jspSintacticoEntrada.setViewportView(txtSintacticoEntrada);

        jpSintacticoTxts.add(jspSintacticoEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 0, -1, -1));

        jspSintacticoProducciones.setPreferredSize(new java.awt.Dimension(200, 380));

        txtSintacticoProducciones.setColumns(20);
        txtSintacticoProducciones.setRows(5);
        jspSintacticoProducciones.setViewportView(txtSintacticoProducciones);

        jpSintacticoTxts.add(jspSintacticoProducciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        jspSintactico.setViewportView(jpSintacticoTxts);

        add(jspSintactico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jLabel1.setText("Pila");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        jLabel2.setText("Entrada");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        jLabel3.setText("Producciones");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, -1));
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
