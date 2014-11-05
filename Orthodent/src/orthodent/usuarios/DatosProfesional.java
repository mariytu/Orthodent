/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package orthodent.usuarios;

import java.awt.Cursor;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Usuario;
import orthodent.db.Autenticacion;

/**
 *
 * @author Mary
 */
public class DatosProfesional extends JPanel{

    private Usuario usuario;
    private boolean cambios;
    
    public DatosProfesional(Usuario usuario) {
        initComponents();
        
        this.usuario = usuario;
        this.cambios = false;
        
        this.addInfo();
        this.guardar.setEnabled(false);
        this.guardar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    
    public boolean getCambios(){
        return this.cambios;
    }
    
    public void setCambios(boolean cambios){
        this.cambios = cambios;
    }
    
    private void addInfo(){
        
        if(this.usuario.getEspecialidad()!=null){
            this.especialidad.setText(this.usuario.getEspecialidad());
        }
        
        this.tiempoCita.setText(this.usuario.getTiempoCita()+"");
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
        labelEspecialidad = new javax.swing.JLabel();
        labelTiempoCita = new javax.swing.JLabel();
        imagenProfesional = new javax.swing.JButton();
        tiempoCita = new javax.swing.JTextField();
        especialidad = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(850, 551));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setPreferredSize(new java.awt.Dimension(845, 545));

        panelTitulo.setBackground(new java.awt.Color(247, 243, 248));
        panelTitulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 230, 234), 1, true));

        labelTitulo.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(163, 159, 164));
        labelTitulo.setText("Datos Profesional");

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

        labelEspecialidad.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        labelEspecialidad.setText("Especialidad");

        labelTiempoCita.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        labelTiempoCita.setText("Tiempo Cita");

        imagenProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doctor.png"))); // NOI18N
        imagenProfesional.setBorder(null);
        imagenProfesional.setBorderPainted(false);
        imagenProfesional.setContentAreaFilled(false);

        tiempoCita.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        tiempoCita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tiempoCitaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tiempoCitaKeyTyped(evt);
            }
        });

        especialidad.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        especialidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                especialidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                especialidadKeyTyped(evt);
            }
        });

        guardar.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        guardar.setText("Guardar Cambios");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTiempoCita)
                    .addComponent(labelEspecialidad))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiempoCita, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(imagenProfesional)
                .addGap(239, 239, 239))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar)
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEspecialidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tiempoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTiempoCita))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(imagenProfesional)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
                .addComponent(guardar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void guardar(){
        this.guardarActionPerformed(null);
    }
    
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
        String tiempoCita = this.tiempoCita.getText();
        String especialidad = this.especialidad.getText();
        
        boolean aux = validarCamposObligatorios(especialidad, tiempoCita);
        
        if(aux){
            try {
                this.usuario.setEspecialidad(especialidad);
                this.usuario.setTiempoCita(Integer.parseInt(tiempoCita));
                boolean respuesta = Autenticacion.editarUsuario(usuario);

                if(respuesta){
                    this.cambios = false;
                    this.guardar.setEnabled(false);
                }
            } catch (Exception ex) {
            }
        }
        else{
            JOptionPane.showMessageDialog(this,
                    "Faltan campos obligatorios",
                    "Orthodent",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_guardarActionPerformed
    
    private boolean validarCamposObligatorios(String especialidad, String tiempoCita){
        
        if(especialidad.equals("")){
            return false;
        }
        
        if(tiempoCita.equals("")){
            return false;
        }
        
        return true;
    }
    
    private void habilitarBoton(){
        this.cambios = true;
        this.guardar.setEnabled(true);
    }
    
    private void tiempoCitaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tiempoCitaKeyReleased
        
    }//GEN-LAST:event_tiempoCitaKeyReleased

    private void especialidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_especialidadKeyReleased
        
    }//GEN-LAST:event_especialidadKeyReleased

    private void tiempoCitaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tiempoCitaKeyTyped
        
        char c = evt.getKeyChar();
        if (!(c>='0' && c<='9')){
            evt.consume();
        }
        else{
            this.habilitarBoton();
        }
    }//GEN-LAST:event_tiempoCitaKeyTyped

    private void especialidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_especialidadKeyTyped
        
        char c = evt.getKeyChar();
        
        if(c==KeyEvent.VK_ENTER){
            evt.consume();
        }
        else if(c==KeyEvent.VK_SPACE){
            String antes = this.especialidad.getText();
            
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
    }//GEN-LAST:event_especialidadKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField especialidad;
    private javax.swing.JButton guardar;
    private javax.swing.JButton imagenProfesional;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelEspecialidad;
    private javax.swing.JLabel labelTiempoCita;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextField tiempoCita;
    // End of variables declaration//GEN-END:variables
}
