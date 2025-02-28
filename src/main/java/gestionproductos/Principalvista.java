package gestionproductos;

import ec.edu.espoch.finciclocorreccion.controlador.Controlador;


public class Principalvista extends javax.swing.JFrame {
    private Controlador controlador;
    private Listar listar;

    /**
     * Creates new form Principal
     */
    public Principalvista() {
        initComponents();
        this.listar = new Listar();
        this.controlador = new Controlador(this, listar);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Groupo1 = new javax.swing.ButtonGroup();
        textTituloTarea = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbdEstadoTarea = new javax.swing.JLabel();
        rbtPendiente = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDescripcion = new javax.swing.JTextArea();
        rbtCompleta1 = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lbdTitulo = new javax.swing.JLabel();
        lbdError = new javax.swing.JLabel();
        lbdTituloTarea = new javax.swing.JLabel();
        jmenuSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmenuTarea = new javax.swing.JMenu();
        menuItemListar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        textTituloTarea.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        textTituloTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTituloTareaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Descripción");

        lbdEstadoTarea.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbdEstadoTarea.setText("Estado de Productos");

        Groupo1.add(rbtPendiente);
        rbtPendiente.setFont(new java.awt.Font("Algerian", 3, 12)); // NOI18N
        rbtPendiente.setText("No Disponible");
        rbtPendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtPendienteActionPerformed(evt);
            }
        });

        textAreaDescripcion.setColumns(20);
        textAreaDescripcion.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        textAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(textAreaDescripcion);

        Groupo1.add(rbtCompleta1);
        rbtCompleta1.setFont(new java.awt.Font("Algerian", 3, 12)); // NOI18N
        rbtCompleta1.setText("Disponible");

        btnGuardar.setFont(new java.awt.Font("Wide Latin", 3, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Wide Latin", 3, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lbdTitulo.setFont(new java.awt.Font("Curlz MT", 3, 24)); // NOI18N
        lbdTitulo.setForeground(new java.awt.Color(255, 51, 51));
        lbdTitulo.setText("Gestión de Productos");

        lbdError.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbdError.setText("----------------------");

        lbdTituloTarea.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lbdTituloTarea.setForeground(new java.awt.Color(0, 51, 255));
        lbdTituloTarea.setText("Agregar un nuevo Producto");

        jmenuSalir.setFont(new java.awt.Font("Wide Latin", 3, 12)); // NOI18N
        jmenuSalir.setForeground(new java.awt.Color(204, 0, 51));
        jmenuSalir.setText("Salir");
        jmenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuSalirActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(51, 102, 255));

        jmenuTarea.setText("Productos");
        jmenuTarea.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        menuItemListar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        menuItemListar.setText("Lista de Productos");
        menuItemListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarActionPerformed(evt);
            }
        });
        jmenuTarea.add(menuItemListar);

        jMenuBar1.add(jmenuTarea);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(91, 91, 91)
                        .addComponent(btnLimpiar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(lbdEstadoTarea)
                                .addGap(154, 154, 154)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtPendiente)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtCompleta1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                        .addComponent(jmenuSalir))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textTituloTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbdTituloTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(265, 265, 265)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(lbdError)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbdTitulo)
                .addGap(243, 243, 243))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbdTitulo)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbdTituloTarea)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textTituloTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbdEstadoTarea)
                            .addComponent(rbtCompleta1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jmenuSalir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar)
                    .addComponent(rbtPendiente))
                .addGap(26, 26, 26)
                .addComponent(lbdError)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textTituloTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTituloTareaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textTituloTareaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        this.controlador.agregarTarea();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void menuItemListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarActionPerformed
        // TODO add your handling code here:
        listar.setVisible(true);
        controlador.listarTarea();    
    }//GEN-LAST:event_menuItemListarActionPerformed

    private void jmenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_jmenuSalirActionPerformed

    private void rbtPendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtPendienteActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rbtPendienteActionPerformed
    public String getTitulo(){
        return textTituloTarea.getText();
    }
    
    public String getDescripcion(){
        return textAreaDescripcion.getText();
    }
    
    public boolean getEstado(){
        return rbtCompleta1.isSelected();        
    }
    
    public void error(String text){
        lbdError.setText(text);
    }
    
    public void limpiar(){
    
    textTituloTarea.setText("");
    textAreaDescripcion.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Groupo1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jmenuSalir;
    private javax.swing.JMenu jmenuTarea;
    private javax.swing.JLabel lbdError;
    private javax.swing.JLabel lbdEstadoTarea;
    private javax.swing.JLabel lbdTitulo;
    private javax.swing.JLabel lbdTituloTarea;
    private javax.swing.JMenuItem menuItemListar;
    private javax.swing.JRadioButton rbtCompleta1;
    private javax.swing.JRadioButton rbtPendiente;
    private javax.swing.JTextArea textAreaDescripcion;
    private javax.swing.JTextField textTituloTarea;
    // End of variables declaration//GEN-END:variables

}
