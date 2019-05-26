package clase05;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Primero extends javax.swing.JFrame {
    private ButtonGroup grupoEstado;
    public Primero() {
        initComponents();
        grupoEstado=new ButtonGroup();
        grupoEstado.add(radSoltero);
        grupoEstado.add(radCasado);
        grupoEstado.add(radViudo);
        grupoEstado.add(radDivorciado);
        radSoltero.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        chkBici = new javax.swing.JCheckBox();
        chkMoto = new javax.swing.JCheckBox();
        chkAuto = new javax.swing.JCheckBox();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaTexto = new javax.swing.JTextArea();
        radSoltero = new javax.swing.JRadioButton();
        radCasado = new javax.swing.JRadioButton();
        radViudo = new javax.swing.JRadioButton();
        radDivorciado = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Primer Formulario");

        lblNombre.setText("Nombre: ");
        lblNombre.setName("lblNombre"); // NOI18N

        txtNombre.setName(""); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        chkBici.setText("Tiene Bicicleta");
        chkBici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBiciActionPerformed(evt);
            }
        });

        chkMoto.setText("Tiene Moto");
        chkMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMotoActionPerformed(evt);
            }
        });

        chkAuto.setText("Tiene Auto");
        chkAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAutoActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txaTexto.setEditable(false);
        txaTexto.setColumns(20);
        txaTexto.setRows(5);
        jScrollPane1.setViewportView(txaTexto);

        radSoltero.setText("Soltero");
        radSoltero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radSolteroActionPerformed(evt);
            }
        });

        radCasado.setText("Casado");

        radViudo.setText("Viudo");
        radViudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radViudoActionPerformed(evt);
            }
        });

        radDivorciado.setText("Divorciado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkBici)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radSoltero))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkMoto)
                            .addComponent(chkAuto))
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radCasado)
                            .addComponent(radDivorciado)
                            .addComponent(radViudo))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkBici)
                    .addComponent(radSoltero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radCasado)
                    .addComponent(chkMoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radViudo)
                    .addComponent(chkAuto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radDivorciado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
       
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        //Evento Aceptar
        
        String nombre = txtNombre.getText();
        if (nombre==null || nombre.length()<3){
         JOptionPane.showMessageDialog(this, "Ingrese un nombre valido");
            return;
        }
        JOptionPane.showMessageDialog(this, "Hola "+nombre);
                
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void chkBiciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBiciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkBiciActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Evento Agregar
        
        String nombre=txtNombre.getText();
        String texto="";
        if(nombre==null || nombre.length()<3) return;
        texto+="Nombre: "+nombre+".\n";
        if(chkBici.isSelected())        texto+="Tiene Bici.\n";
        if(chkMoto.isSelected())        texto+="Tiene Moto.\n";
        if(chkAuto.isSelected())        texto+="Tiene Auto.\n";
      
        if(radSoltero.isSelected())     texto+="Estado Civil: Es Soltero.\n";
        if(radCasado.isSelected())      texto+="Estado Civil: Es Casado.\n";
        if(radViudo.isSelected())       texto+="Estado Civil: Es Viudo.\n";
        if(radDivorciado.isSelected())  texto+="Estado Civil: Es Divorciado.\n";
    
   
        limpiar();
        
        txaTexto.setText(texto);
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void radSolteroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radSolteroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radSolteroActionPerformed

    private void radViudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radViudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radViudoActionPerformed

    private void chkMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkMotoActionPerformed

    private void chkAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAutoActionPerformed

    private void limpiar() {
        //Limpiar formulario
        txtNombre.setText(""); //Vacia el contenido de txtNombre
        txtNombre.requestFocus(); //Deja el puntero en txtNombre
        chkBici.setSelected(false); //Deselecciona todos los campos
        chkMoto.setSelected(false);
        chkAuto.setSelected(false);
        radSoltero.setSelected(true);
    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Primero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JCheckBox chkAuto;
    private javax.swing.JCheckBox chkBici;
    private javax.swing.JCheckBox chkMoto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JRadioButton radCasado;
    private javax.swing.JRadioButton radDivorciado;
    private javax.swing.JRadioButton radSoltero;
    private javax.swing.JRadioButton radViudo;
    private javax.swing.JTextArea txaTexto;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
