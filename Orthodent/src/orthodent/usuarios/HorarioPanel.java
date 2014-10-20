/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package orthodent.usuarios;

import java.util.ArrayList;
import javax.swing.JPanel;
import modelo.Horario;
import modelo.Usuario;
import orthodent.db.HorarioDB;

/**
 *
 * @author Mary
 */
public class HorarioPanel extends JPanel{

    private Usuario usuario;
    private boolean cambios;
    
    public HorarioPanel(Usuario usuario) {
        initComponents();
        
        this.usuario = usuario;
        this.cambios = false;
        
        this.addInfo();
        this.guardar.setEnabled(false);
    }
    
    private String getHora(int min){
        
        int horaAux = min/60;
        String hora = "";
        
        if(horaAux<=9){
            hora = hora + "0";
        }
        
        hora = hora + horaAux;
        
        return hora;
    }
    
    private String getMin(int minAux){
        
        String min = "";
        
        if(minAux<9){
            min = min + "0";
        }
        
        min = min + minAux;
        
        return min;
    }
    
    private void addInfo(){
        ArrayList<Horario> horarios = HorarioDB.getHorarios(this.usuario.getId_usuario());
        
        if(horarios!=null){
            for(Horario o : horarios){
                
                String dia = o.getDia();
                
                if(dia.equals("Lunes")){
                    this.lunes.setSelected(true);
                    int inicio = o.getHora_inicio();
                    int fin = o.getHora_fin();
                    
                    String horaInicio = this.getHora(inicio);
                    inicio = inicio%60;
                    this.inicioHoraLunes.setSelectedItem(horaInicio);
                    
                    String minInicio = this.getMin(inicio);
                    this.inicioMinLunes.setSelectedItem(minInicio);
                    
                    String horaFin = this.getHora(fin);
                    fin = fin%60;
                    this.finHoraLunes.setSelectedItem(horaFin);
                    
                    String minFin = this.getMin(fin);
                    this.finMinLunes.setSelectedItem(minFin);
                }
                else if(dia.equals("Martes")){
                    this.martes.setSelected(true);
                    int inicio = o.getHora_inicio();
                    int fin = o.getHora_fin();
                    
                    String horaInicio = this.getHora(inicio);
                    inicio = inicio%60;
                    this.inicioHoraMartes.setSelectedItem(horaInicio);
                    
                    String minInicio = this.getMin(inicio);
                    this.inicioMinMartes.setSelectedItem(minInicio);
                    
                    String horaFin = this.getHora(fin);
                    fin = fin%60;
                    this.finHoraMartes.setSelectedItem(horaFin);
                    
                    String minFin = this.getMin(fin);
                    this.finMinMartes.setSelectedItem(minFin);
                }
                else if(dia.equals("Miercoles")){
                    this.miercoles.setSelected(true);
                    int inicio = o.getHora_inicio();
                    int fin = o.getHora_fin();
                    
                    String horaInicio = this.getHora(inicio);
                    inicio = inicio%60;
                    this.inicioHoraMiercoles.setSelectedItem(horaInicio);
                    
                    String minInicio = this.getMin(inicio);
                    this.inicioMinMiercoles.setSelectedItem(minInicio);
                    
                    String horaFin = this.getHora(fin);
                    fin = fin%60;
                    this.finHoraMiercoles.setSelectedItem(horaFin);
                    
                    String minFin = this.getMin(fin);
                    this.finMinMiercoles.setSelectedItem(minFin);
                }
                else if(dia.equals("Jueves")){
                    this.jueves.setSelected(true);
                    int inicio = o.getHora_inicio();
                    int fin = o.getHora_fin();
                    
                    String horaInicio = this.getHora(inicio);
                    inicio = inicio%60;
                    this.inicioHoraJueves.setSelectedItem(horaInicio);
                    
                    String minInicio = this.getMin(inicio);
                    this.inicioMinJueves.setSelectedItem(minInicio);
                    
                    String horaFin = this.getHora(fin);
                    fin = fin%60;
                    this.finHoraJueves.setSelectedItem(horaFin);
                    
                    String minFin = this.getMin(fin);
                    this.finMinJueves.setSelectedItem(minFin);
                }
                else if(dia.equals("Viernes")){
                    this.viernes.setSelected(true);
                    int inicio = o.getHora_inicio();
                    int fin = o.getHora_fin();
                    
                    String horaInicio = this.getHora(inicio);
                    inicio = inicio%60;
                    this.inicioHoraViernes.setSelectedItem(horaInicio);
                    
                    String minInicio = this.getMin(inicio);
                    this.inicioMinViernes.setSelectedItem(minInicio);
                    
                    String horaFin = this.getHora(fin);
                    fin = fin%60;
                    this.finHoraViernes.setSelectedItem(horaFin);
                    
                    String minFin = this.getMin(fin);
                    this.finMinViernes.setSelectedItem(minFin);
                }
                else{
                    this.sabado.setSelected(true);
                    int inicio = o.getHora_inicio();
                    int fin = o.getHora_fin();
                    
                    String horaInicio = this.getHora(inicio);
                    inicio = inicio%60;
                    this.inicioHoraSabado.setSelectedItem(horaInicio);
                    
                    String minInicio = this.getMin(inicio);
                    this.inicioMinSabado.setSelectedItem(minInicio);
                    
                    String horaFin = this.getHora(fin);
                    fin = fin%60;
                    this.finHoraSabado.setSelectedItem(horaFin);
                    
                    String minFin = this.getMin(fin);
                    this.finMinSabado.setSelectedItem(minFin);
                }
            }
        }
    }
    
    public boolean getCambios(){
        return this.cambios;
    }
    
    public void setCambios(boolean cambios){
        this.cambios = cambios;
    }
    
    public void guardar(){
        this.guardarActionPerformed(null);
    }
    
    private void habilitarBoton(){
        this.cambios = true;
        this.guardar.setEnabled(true);
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
        guardar = new javax.swing.JButton();
        martes = new javax.swing.JCheckBox();
        lunes = new javax.swing.JCheckBox();
        miercoles = new javax.swing.JCheckBox();
        jueves = new javax.swing.JCheckBox();
        viernes = new javax.swing.JCheckBox();
        sabado = new javax.swing.JCheckBox();
        labelInicio = new javax.swing.JLabel();
        labelFin = new javax.swing.JLabel();
        inicioHoraLunes = new javax.swing.JComboBox();
        inicioMinLunes = new javax.swing.JComboBox();
        finHoraLunes = new javax.swing.JComboBox();
        finMinLunes = new javax.swing.JComboBox();
        inicioHoraMartes = new javax.swing.JComboBox();
        inicioMinMartes = new javax.swing.JComboBox();
        finHoraMartes = new javax.swing.JComboBox();
        finMinMartes = new javax.swing.JComboBox();
        inicioHoraMiercoles = new javax.swing.JComboBox();
        inicioMinMiercoles = new javax.swing.JComboBox();
        finHoraMiercoles = new javax.swing.JComboBox();
        finMinMiercoles = new javax.swing.JComboBox();
        inicioHoraJueves = new javax.swing.JComboBox();
        inicioMinJueves = new javax.swing.JComboBox();
        finHoraJueves = new javax.swing.JComboBox();
        finMinJueves = new javax.swing.JComboBox();
        inicioHoraViernes = new javax.swing.JComboBox();
        inicioMinViernes = new javax.swing.JComboBox();
        finHoraViernes = new javax.swing.JComboBox();
        finMinViernes = new javax.swing.JComboBox();
        inicioHoraSabado = new javax.swing.JComboBox();
        inicioMinSabado = new javax.swing.JComboBox();
        finHoraSabado = new javax.swing.JComboBox();
        finMinSabado = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(850, 551));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setPreferredSize(new java.awt.Dimension(845, 545));

        panelTitulo.setBackground(new java.awt.Color(247, 243, 248));
        panelTitulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 230, 234), 1, true));

        labelTitulo.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(163, 159, 164));
        labelTitulo.setText("Horario");

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

        guardar.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        guardar.setText("Guardar Cambios");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        martes.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        martes.setText("Martes");
        martes.setBorder(null);
        martes.setContentAreaFilled(false);
        martes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                martesActionPerformed(evt);
            }
        });

        lunes.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lunes.setText("Lunes");
        lunes.setBorder(null);
        lunes.setContentAreaFilled(false);
        lunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunesActionPerformed(evt);
            }
        });

        miercoles.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        miercoles.setText("Miércoles");
        miercoles.setBorder(null);
        miercoles.setContentAreaFilled(false);
        miercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miercolesActionPerformed(evt);
            }
        });

        jueves.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jueves.setText("Jueves");
        jueves.setBorder(null);
        jueves.setContentAreaFilled(false);
        jueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juevesActionPerformed(evt);
            }
        });

        viernes.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        viernes.setText("Viernes");
        viernes.setBorder(null);
        viernes.setContentAreaFilled(false);
        viernes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viernesActionPerformed(evt);
            }
        });

        sabado.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        sabado.setText("Sábado");
        sabado.setBorder(null);
        sabado.setContentAreaFilled(false);
        sabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabadoActionPerformed(evt);
            }
        });

        labelInicio.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        labelInicio.setText("Inicio");

        labelFin.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        labelFin.setText("Fin");

        inicioHoraLunes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19" }));

        inicioMinLunes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", " " }));

        finHoraLunes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19" }));

        finMinLunes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", " " }));

        inicioHoraMartes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19" }));

        inicioMinMartes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", " " }));

        finHoraMartes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19" }));

        finMinMartes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", " " }));

        inicioHoraMiercoles.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19" }));

        inicioMinMiercoles.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", " " }));

        finHoraMiercoles.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19" }));

        finMinMiercoles.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", " " }));

        inicioHoraJueves.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19" }));

        inicioMinJueves.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", " " }));

        finHoraJueves.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19" }));

        finMinJueves.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", " " }));

        inicioHoraViernes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19" }));

        inicioMinViernes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", " " }));

        finHoraViernes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19" }));

        finMinViernes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", " " }));

        inicioHoraSabado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09", "10", "11", "12" }));

        inicioMinSabado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", " " }));

        finHoraSabado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09", "10", "11", "12" }));

        finMinSabado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", " " }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(miercoles)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lunes)
                            .addComponent(martes)
                            .addComponent(jueves)
                            .addComponent(viernes)
                            .addComponent(sabado))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inicioHoraMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inicioHoraMartes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inicioHoraLunes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inicioHoraJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inicioHoraViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inicioHoraSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(inicioMinLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inicioMinMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inicioMinMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inicioMinJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inicioMinViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inicioMinSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(finHoraSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(finMinSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(finHoraViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(finMinViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(finHoraLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(finHoraMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(finHoraMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(finMinLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(finMinMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(finMinMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(finHoraJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(finMinJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(labelInicio)
                        .addGap(109, 109, 109)
                        .addComponent(labelFin)))
                .addContainerGap(448, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar)
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelInicio)
                    .addComponent(labelFin))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finMinLunes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finHoraLunes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inicioMinLunes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inicioHoraLunes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lunes))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(finMinMartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finHoraMartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(finMinMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finHoraMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inicioMinMartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inicioHoraMartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(martes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inicioMinMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inicioHoraMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(miercoles))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicioHoraJueves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inicioMinJueves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finHoraJueves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finMinJueves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jueves))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicioHoraViernes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inicioMinViernes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finHoraViernes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finMinViernes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viernes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicioHoraSabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inicioMinSabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finHoraSabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finMinSabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sabado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
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

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        this.cambios = false;
        this.guardar.setEnabled(false);
    }//GEN-LAST:event_guardarActionPerformed

    private void lunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunesActionPerformed
        this.habilitarBoton();
    }//GEN-LAST:event_lunesActionPerformed

    private void martesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_martesActionPerformed
        this.habilitarBoton();
    }//GEN-LAST:event_martesActionPerformed

    private void miercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miercolesActionPerformed
        this.habilitarBoton();
    }//GEN-LAST:event_miercolesActionPerformed

    private void juevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juevesActionPerformed
        this.habilitarBoton();
    }//GEN-LAST:event_juevesActionPerformed

    private void viernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viernesActionPerformed
        this.habilitarBoton();
    }//GEN-LAST:event_viernesActionPerformed

    private void sabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabadoActionPerformed
        this.habilitarBoton();
    }//GEN-LAST:event_sabadoActionPerformed
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox finHoraJueves;
    private javax.swing.JComboBox finHoraLunes;
    private javax.swing.JComboBox finHoraMartes;
    private javax.swing.JComboBox finHoraMiercoles;
    private javax.swing.JComboBox finHoraSabado;
    private javax.swing.JComboBox finHoraViernes;
    private javax.swing.JComboBox finMinJueves;
    private javax.swing.JComboBox finMinLunes;
    private javax.swing.JComboBox finMinMartes;
    private javax.swing.JComboBox finMinMiercoles;
    private javax.swing.JComboBox finMinSabado;
    private javax.swing.JComboBox finMinViernes;
    private javax.swing.JButton guardar;
    private javax.swing.JComboBox inicioHoraJueves;
    private javax.swing.JComboBox inicioHoraLunes;
    private javax.swing.JComboBox inicioHoraMartes;
    private javax.swing.JComboBox inicioHoraMiercoles;
    private javax.swing.JComboBox inicioHoraSabado;
    private javax.swing.JComboBox inicioHoraViernes;
    private javax.swing.JComboBox inicioMinJueves;
    private javax.swing.JComboBox inicioMinLunes;
    private javax.swing.JComboBox inicioMinMartes;
    private javax.swing.JComboBox inicioMinMiercoles;
    private javax.swing.JComboBox inicioMinSabado;
    private javax.swing.JComboBox inicioMinViernes;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox jueves;
    private javax.swing.JLabel labelFin;
    private javax.swing.JLabel labelInicio;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JCheckBox lunes;
    private javax.swing.JCheckBox martes;
    private javax.swing.JCheckBox miercoles;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JCheckBox sabado;
    private javax.swing.JCheckBox viernes;
    // End of variables declaration//GEN-END:variables
}