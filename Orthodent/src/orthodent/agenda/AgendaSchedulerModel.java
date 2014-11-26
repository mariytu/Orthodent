/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orthodent.agenda;

import com.thirdnf.ResourceScheduler.*;
import java.awt.Color;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Duration;

public class AgendaSchedulerModel extends AbstractScheduleModel
{
    private String[] days = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
    private ArrayList<AgendaResource> resources;
    public ArrayList<Cita> citas;

    @Override
    public void visitAppointments(AppointmentVisitor visitor, @NotNull LocalDate date)
    {
        for (Appointment cita : citas) {
            LocalDate appointmentDate = cita.getDateTime().toLocalDate();
            if (! appointmentDate.equals(date)) {
                continue;
            }
            visitor.visitAppointment(cita);
        }
    }

    public void visitResources(ResourceVisitor resourceVisitor, LocalDate localDate)
    {
        for(AgendaResource r : resources) {
            resourceVisitor.visitResource(r);
        }
    }

    public LocalTime getStartTime(LocalDate localDate)
    {
        return new LocalTime(9,0,0);
    }

    public LocalTime getEndTime(LocalDate localDate)
    {
        return new LocalTime(20,0,0);
    }
    
    public void agregarCita(Cita cita)
    {
        System.out.println("Cita agregada:" + ((AgendaResource)cita.getResource()).getPos());
        citas.add(cita);
        if( cita.isConfirmada())
            cita.setColor(Color.CYAN);
        else
            cita.setColor(Color.YELLOW);
        this.fireAppointmentAdded(cita);
    }
    
    public void eliminarCita(Cita cita){
        citas.remove(cita);
        this.fireAppointmentRemoved(cita);
    }
    
    public AgendaSchedulerModel() 
    {
        this.citas = new ArrayList<Cita>();
        this.resources = new ArrayList<AgendaResource>();
        int i = 0;
        for(String day : days) {
            AgendaResource r = new AgendaResource(day, i++);
            this.resources.add(r);
            
        }
    }
    
    public AgendaResource calcularResource(Date fecha){
        Calendar c = Calendar.getInstance();
        c.setTime(fecha);
        int dia = c.get(Calendar.DAY_OF_WEEK);
        return resources.get(dia-2);
    }
    
    public void agregaCitaAlArray(Cita cita){
        this.citas.add(cita);
    }
    
    public Date obtenerLunes(Date fecha){
        Date lunes;
        Calendar c = Calendar.getInstance();
        c.setTime(fecha);
        int semana = obtenerSemana(fecha);
        c.set(Calendar.WEEK_OF_YEAR, semana);
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        lunes = c.getTime();
        return lunes;
    }
    
    public int obtenerSemana(Date fecha){
        int semana=0;
        Date lunes;
        Calendar c = Calendar.getInstance();
        c.setTime(fecha);
        semana = c.get(Calendar.WEEK_OF_YEAR);
        return semana;
    }
    
}

class AgendaResource implements Resource
{
    private final String _title;
    private int pos;

    public AgendaResource(String title, int pos)
    {
        _title = title;
        this.pos = pos;
    }

    public Iterator<Availability> getAvailability(LocalDate localDate)
    {
       List<Availability> availabilities = new ArrayList<Availability>();
       availabilities.add(new Availability(new LocalTime(9,0,0), Duration.standardHours(11)));
       return availabilities.iterator();
    }

    public String getTitle()
    {
        return _title;
        
    }
    
    public int getPos()
    {
        return pos;
    }
    
    
}