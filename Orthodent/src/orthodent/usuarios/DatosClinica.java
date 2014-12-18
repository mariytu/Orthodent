/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orthodent.usuarios;

import modelo.ClinicaInterna;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Usuario;
import orthodent.db.Autenticacion;
import orthodent.db.ClinicaInternaDB;

/**
 *
 * @author Lucy
 */
public class DatosClinica extends javax.swing.JPanel {

    /**
     * Creates new form DatosClinica
     */
    private ClinicaInterna clinica;
    private boolean cambios;
    private Usuario usuarioActual;
    
    public DatosClinica(ClinicaInterna clinica, Usuario usuarioActual) {
        this.clinica = clinica;
        this.cambios=false;
        this.usuarioActual = usuarioActual;
        initComponents();
        this.nombres.setText(clinica.getNombre());
        if(usuarioActual.getId_rol() != 1){ //si no es administrador
            habilitar.setVisible(false);
        }
        else{
            if(clinica.isActivo()){
                eliminar.setVisible(true);
                habilitar.setVisible(false);
            }
            else{
                eliminar.setVisible(false);
                habilitar.setVisible(true);
            }
        }        
        nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                habilitarBoton();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelNombres = new javax.swing.JLabel();
        imagenProfesional = new javax.swing.JButton();
        nombres = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        habilitar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setPreferredSize(new java.awt.Dimension(845, 545));

        panelTitulo.setBackground(new java.awt.Color(247, 243, 248));
        panelTitulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 230, 234), 1, true));

        labelTitulo.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(163, 159, 164));
        labelTitulo.setText("Datos Clinica");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelNombres.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        labelNombres.setText("Nombre (*)");

        imagenProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit2.png"))); // NOI18N
        imagenProfesional.setBorder(null);
        imagenProfesional.setBorderPainted(false);
        imagenProfesional.setContentAreaFilled(false);

        nombres.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombresKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombresKeyTyped(evt);
            }
        });

        guardar.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        guardar.setText("Guardar Cambios");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        eliminar.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        habilitar.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        habilitar.setText("Habilitar");
        habilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habilitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(habilitar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guardar)
                .addGap(83, 83, 83))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(labelNombres)
                .addGap(58, 58, 58)
                .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(imagenProfesional)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(eliminar)
                    .addComponent(habilitar))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imagenProfesional)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNombres))))
                .addGap(0, 207, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        Object[] options = {"Sí","No"};

        int n = JOptionPane.showOptionDialog(this,
            "¿Esta seguro que desea eliminar la clínica?",
            "Orthodent",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[1]);

        ArrayList<Usuario> usuarios = Autenticacion.listarUsuarios(this.clinica.getId());
        if(usuarios!=null && usuarios.size()>0){
            JOptionPane.showMessageDialog(this, "No se puede eliminar esta clínica porque está asociada a usuarios", "Orthodent", JOptionPane.ERROR_MESSAGE);
        }
        else if(n==0){
            boolean resul = ClinicaInternaDB.eliminarClinica(this.clinica);

            if(resul){
                try {
                    Usuarios contenedor = (Usuarios)this.getParent();
                    contenedor.actualizarClinicas();
                    contenedor.VolverUsuariosDesdeClinica();
                } catch (Exception ex) {
                }
            }
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

       
        String nombreNuevo = this.nombres.getText();
        String nombreAntiguo = this.clinica.getNombre();
        
        this.clinica.setNombre(nombreNuevo);
        
        if(!ClinicaInternaDB.actualizarClinica(this.clinica)){
            this.clinica.setNombre(nombreAntiguo);
            JOptionPane.showMessageDialog(this,
                    "No se pudo guardar el cambio",
                    "Orthodent",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        Usuarios contenedor = (Usuarios)this.getParent();
        contenedor.actualizarClinicas();        
        this.guardar.setEnabled(false);
        
    }//GEN-LAST:event_guardarActionPerformed

    private void nombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombresKeyTyped
        char c = evt.getKeyChar();

        if(c==KeyEvent.VK_ENTER){
            evt.consume();
        }
        else if(c==KeyEvent.VK_SPACE){
            String antes = this.nombres.getText();

            if(antes.equals("")){
                evt.consume();
            }
            else{
                this.habilitarBoton();
            }
        }
        else if(!((c>='a' && c<='z') || (c>='A' && c<='Z'))){
            evt.consume();
        }
        else{
            this.habilitarBoton();
        }
    }//GEN-LAST:event_nombresKeyTyped

    private void nombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombresKeyReleased

    }//GEN-LAST:event_nombresKeyReleased

    private void habilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habilitarActionPerformed
                Object[] options = {"Sí","No"};
        
        int n = JOptionPane.showOptionDialog(this,
                    "¿Esta seguro que desea habilitar nuevamente la Clínica?",
                    "Orthodent",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[1]);
        
        if(n==0){
            boolean resul = ClinicaInternaDB.habilitarClinica(this.clinica);
            
            if(resul){
                try {
                    habilitar.setVisible(false);
                    eliminar.setVisible(true);
                    JPanel contenedor = (JPanel)this.getParent();
                    
                    //((MostrarInfoTratamiento)contenedor.getParent()).volver();
                } catch (Exception ex) {
                }
            }
        }
    }//GEN-LAST:event_habilitarActionPerformed

     private void habilitarBoton(){
        this.cambios = true;
        this.guardar.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JButton habilitar;
    private javax.swing.JButton imagenProfesional;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelNombres;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField nombres;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables
}
