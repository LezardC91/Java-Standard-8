package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.utils.files.FileText;
import ar.com.eduit.curso.java.utils.files.I_File;
import ar.com.eduit.curso.java.utils.swing.TxtValidator;
import javax.swing.JOptionPane;

public class Colores extends javax.swing.JFrame {
    private String file;
    private I_File fileText;
    public Colores() {
        initComponents();
        file="colores.txt";
        fileText=new FileText(file);
        cargar();
        
    }
        private void cargar(){
            //Carga los colores en jtaColores
            jtaColores.setText(fileText.getText());
            //Carga los colores en cmbColores
            cmbColores.removeAllItems();
            fileText.getTreeSet().forEach(cmbColores::addItem);
        }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        btmAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaColores = new javax.swing.JTextArea();
        txtBuscar = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblColor2 = new javax.swing.JLabel();
        cmbColores = new javax.swing.JComboBox<>();
        btmEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingresar Colores");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblColor.setText("Color");

        btmAgregar.setText("Agregar");
        btmAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmAgregarActionPerformed(evt);
            }
        });

        jtaColores.setEditable(false);
        jtaColores.setColumns(20);
        jtaColores.setRows(5);
        jScrollPane1.setViewportView(jtaColores);

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        lblBuscar.setText("Buscar: ");

        lblColor2.setText("Color");

        btmEliminar.setText("Eliminar");
        btmEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblColor)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btmAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(txtColor)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblColor2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btmEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(cmbColores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btmAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColor2)
                            .addComponent(cmbColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btmEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmAgregarActionPerformed
        //Evento Agregar Color
        //if (txtColor.getText().length()<3) return;
        if(!new TxtValidator(txtColor).length(3, 20)) return;
        fileText.addLine(txtColor.getText());
        txtColor.setText("");
        txtColor.requestFocus();
        cargar();
    }//GEN-LAST:event_btmAgregarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        //Evento buscar Color
        jtaColores.setText("");
        fileText.getLines(txtBuscar.getText())
                .forEach(item->jtaColores.append(item+"\n"));
        
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btmEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmEliminarActionPerformed
        // Eliminar color ComboBox
        if(JOptionPane
           .showConfirmDialog(
            this, "Desea borrar el color "
            +cmbColores.getSelectedItem())==0)
        fileText.removeLine(cmbColores.getItemAt(cmbColores.getSelectedIndex()));
        cargar();
    }//GEN-LAST:event_btmEliminarActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Colores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmAgregar;
    private javax.swing.JButton btmEliminar;
    private javax.swing.JComboBox<String> cmbColores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jtaColores;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblColor2;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtColor;
    // End of variables declaration//GEN-END:variables
}
