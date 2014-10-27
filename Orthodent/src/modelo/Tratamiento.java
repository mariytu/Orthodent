/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author msanhuezal
 */
public class Tratamiento {
    
    private int idTratamiento;
    private String nombre;
    private int valorColegio;
    private int valorClinica;    
    
    public Tratamiento(int idTratamiento, String nombre, int valorColegio, int valorClinica) {
        this.idTratamiento = idTratamiento;
        this.nombre = nombre;
        this.valorColegio = valorColegio;
        this.valorClinica = valorClinica;
    }    

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getValorColegio() {
        return valorColegio;
    }

    public void setValorColegio(int valorColegio) {
        this.valorColegio = valorColegio;
    }

    public int getValorClinica() {
        return valorClinica;
    }

    public void setValorClinica(int valorClinica) {
        this.valorClinica = valorClinica;
    }

    
}
