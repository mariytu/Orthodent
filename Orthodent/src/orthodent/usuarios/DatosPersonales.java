/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package orthodent.usuarios;

import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Rol;
import modelo.Usuario;
import orthodent.db.Autenticacion;
import orthodent.db.RolDB;

/**
 *
 * @author Mary
 */
public class DatosPersonales extends JPanel{

    private Usuario usuario;
    private boolean cambios;
    
    public DatosPersonales(Usuario usuario) {
        initComponents();
        
        this.usuario = usuario;
        this.cambios = false;
        
        this.addInfo();
        this.guardar.setEnabled(false);
    }
    
    public boolean getCambios(){
        return this.cambios;
    }
    
    public void setCambios(boolean cambios){
        this.cambios = cambios;
    }
    
    private void addInfo(){
        
        Rol rol = RolDB.getRol(this.usuario.getId_rol());
        
        char caracter = Character.toUpperCase(rol.getNombre().charAt(0));
        String rolNombre = caracter + rol.getNombre().toLowerCase().substring(1, rol.getNombre().length());
        
        this.rol.setText(rolNombre);
        
        this.nombres.setText(this.usuario.getNombre());
        this.apellidoPat.setText(this.usuario.getApellido_pat());
        this.apellidoMat.setText(this.usuario.getApellido_mat());
        this.email.setText(this.usuario.getEmail());
        this.contraseña.setText(this.usuario.getContraseña());
        this.telefono.setText(this.usuario.getTelefono());
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
        labelRol = new javax.swing.JLabel();
        labelNombres = new javax.swing.JLabel();
        labelApellidoPat = new javax.swing.JLabel();
        labelApellidoMat = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        imagenProfesional = new javax.swing.JButton();
        rol = new javax.swing.JTextField();
        nombres = new javax.swing.JTextField();
        apellidoPat = new javax.swing.JTextField();
        apellidoMat = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        telefono = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(850, 551));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setPreferredSize(new java.awt.Dimension(845, 545));

        panelTitulo.setBackground(new java.awt.Color(247, 243, 248));
        panelTitulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 230, 234), 1, true));

        labelTitulo.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(163, 159, 164));
        labelTitulo.setText("Datos Personales");

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

        labelRol.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        labelRol.setText("Rol");

        labelNombres.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        labelNombres.setText("Nombre");

        labelApellidoPat.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        labelApellidoPat.setText("Apellido P.");

        labelApellidoMat.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        labelApellidoMat.setText("Apellido M.");

        labelEmail.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        labelEmail.setText("Email");

        labelContraseña.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        labelContraseña.setText("Contraseña");

        labelTelefono.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        labelTelefono.setText("Telefono");

        imagenProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doctor.png"))); // NOI18N
        imagenProfesional.setBorder(null);
        imagenProfesional.setBorderPainted(false);
        imagenProfesional.setContentAreaFilled(false);

        rol.setEditable(false);
        rol.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N

        nombres.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombresKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombresKeyTyped(evt);
            }
        });

        apellidoPat.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        apellidoPat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apellidoPatKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoPatKeyTyped(evt);
            }
        });

        apellidoMat.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        apellidoMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apellidoMatKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoMatKeyTyped(evt);
            }
        });

        email.setEditable(false);
        email.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N

        contraseña.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contraseñaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contraseñaKeyTyped(evt);
            }
        });

        telefono.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
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
                    .addComponent(labelTelefono)
                    .addComponent(labelContraseña)
                    .addComponent(labelEmail)
                    .addComponent(labelApellidoPat)
                    .addComponent(labelNombres)
                    .addComponent(labelRol)
                    .addComponent(labelApellidoMat))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellidoMat, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(rol)
                        .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(imagenProfesional)
                .addGap(239, 239, 239))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guardar)
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelApellidoPat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelApellidoMat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelContraseña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefono))
                .addGap(0, 227, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(imagenProfesional)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(eliminar))
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

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        Object[] options = {"Sí","No"};
        
        int n = JOptionPane.showOptionDialog(this,
                    "¿Esta seguro que desea eliminar el usuario?",
                    "Orthodent",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[1]);
        
        if(n==0){
            boolean resul = Autenticacion.eliminarUsuario(this.usuario.getId_usuario());
            
            if(resul){
                try {
                    
                    JPanel contenedor = (JPanel)this.getParent();
                    
                    ((MostrarInfoUsuario)contenedor.getParent()).volver();
                } catch (Exception ex) {
                    System.out.println("");
                }
            }
        }
    }//GEN-LAST:event_eliminarActionPerformed

    public void guardar(){
        this.guardarActionPerformed(null);
    }
    
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
        int idRol = this.usuario.getId_rol();
        String nombre = this.nombres.getText();
        String apellidoPat = this.apellidoPat.getText();
        String apellidoMat = this.apellidoMat.getText();
        String email = this.usuario.getEmail();
        String nombreUsuario = this.usuario.getNombreUsuario();
        String contraseña = this.contraseña.getText();
        String telefono = this.telefono.getText();
        
        boolean aux = validarCamposObligatorios(nombre,apellidoPat,email,contraseña);
        
        if(aux){
            try {
                this.usuario.setNombre(nombre);
                this.usuario.setApellido_pat(apellidoPat);
                this.usuario.setApellido_mat(apellidoMat);
                this.usuario.setContraseña(contraseña);
                this.usuario.setTelefono(telefono);
                boolean respuesta = Autenticacion.editarUsuario(usuario);

                if(respuesta){
                    
                    JPanel contenedor = (JPanel)this.getParent();
                    
                    ((MostrarInfoUsuario)contenedor.getParent()).updateNombre();
                    
                    this.cambios = false;
                    this.guardar.setEnabled(false);
                }
            } catch (Exception ex) {
                System.out.println("");
            }
        }
        else{
            JOptionPane.showMessageDialog(this,
                    "Faltan campos obligatorios",
                    "Orthodent",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_guardarActionPerformed
    
    private boolean validarCamposObligatorios(String nombre, String apellidoPat, String email, String contraseña1){
        
        if(nombre.equals("")){
            return false;
        }
        
        if(apellidoPat.equals("")){
            return false;
        }
        
        if(email.equals("")){
            return false;
        }
        
        if(contraseña1.equals("")){
            return false;
        }
        
        return true;
    }
    
    private void habilitarBoton(){
        this.cambios = true;
        this.guardar.setEnabled(true);
    }
    
    private void nombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombresKeyReleased
        
    }//GEN-LAST:event_nombresKeyReleased

    private void apellidoPatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoPatKeyReleased
        
    }//GEN-LAST:event_apellidoPatKeyReleased

    private void apellidoMatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoMatKeyReleased
        
    }//GEN-LAST:event_apellidoMatKeyReleased

    private void contraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaKeyReleased
        
    }//GEN-LAST:event_contraseñaKeyReleased

    private void telefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyReleased
        
    }//GEN-LAST:event_telefonoKeyReleased

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

    private void apellidoPatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoPatKeyTyped
        char c = evt.getKeyChar();
        
        if(c==KeyEvent.VK_ENTER){
            evt.consume();
        }
        else if(c==KeyEvent.VK_SPACE){
            String antes = this.apellidoPat.getText();
            
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
    }//GEN-LAST:event_apellidoPatKeyTyped

    private void apellidoMatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoMatKeyTyped
        char c = evt.getKeyChar();
        
        if(c==KeyEvent.VK_ENTER){
            evt.consume();
        }
        else if(c==KeyEvent.VK_SPACE){
            String antes = this.apellidoMat.getText();
            
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
    }//GEN-LAST:event_apellidoMatKeyTyped

    private void contraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaKeyTyped
        char c = evt.getKeyChar();
        
        if(!((c>='0' && c<='9') || (c>='a' && c<='z') || (c>='A' && c<='Z'))){
            evt.consume();
        }
        else{
            this.habilitarBoton();
        }
    }//GEN-LAST:event_contraseñaKeyTyped

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        char c = evt.getKeyChar();
        if (!(c>='0' && c<='9')){
            evt.consume();
        }
        else{
            this.habilitarBoton();
        }
    }//GEN-LAST:event_telefonoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoMat;
    private javax.swing.JTextField apellidoPat;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField email;
    private javax.swing.JButton guardar;
    private javax.swing.JButton imagenProfesional;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelApellidoMat;
    private javax.swing.JLabel labelApellidoPat;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNombres;
    private javax.swing.JLabel labelRol;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField nombres;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextField rol;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
