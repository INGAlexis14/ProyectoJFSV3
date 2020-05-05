/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.logica;

import edu.unicundi.proyectojsfv2.Cuenta;
import edu.unicundi.proyectojsfv2.Reporte;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

/**
 *
 * @author Alexis González
 */
@Named(value = "logica")
@Dependent
public class Logica {

    
    @Inject
    private Reporte reporte;
    
    @Inject
    private Cuenta cuenta;
    /**
     * Constructor de la clase cuenta
     */
    public Logica() {
    }
    /**
     * variable get reporte
     * @return reporte
     */
    public Reporte getReporte() {
        return reporte;
    }
    /**
     * variable set reporte
     * @param reporte 
     */
    public void setReporte(Reporte reporte) {
        this.reporte = reporte;
    }
   /**
    * variable get cuenta
    * @return cuenta
    */
    public Cuenta getCuenta() {
        return cuenta;
    }
    /**
     * variable set cuenta
     * @param cuenta 
     */
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * variables que se envian 
     * por parametro
     * @param reporte
     * @param cuenta 
     */
    public Logica(Reporte reporte, Cuenta cuenta){       
        this.cuenta = cuenta;
        this.reporte = reporte;       
    }
      
    /**
     * Metodo que devuelve un String segun el tipo de profesion
     * del empleado
     * @return prof
     */
    
    public String devolverProfesion(){
        int idprof=cuenta.getProfesion();
        String prof="prof"; 
        if(idprof==1){
            prof="Primaria";       
        }else if(idprof==2){
            prof="Secundaria";
        }else if(idprof==3){
            prof="Tecnico";
        } else if (idprof==4){
            prof="Tecnologo";
        }
         else if (idprof==5){
            prof="Profesional";
        }
        else  {
             prof="Maestria";
        }
        return prof;
    }
      
      
     /**
     * Metodo que devuelve un String segun el tipo de profesion
     * del empleado
     * @return profesioncobro
     */
    public int cobroProfesion(){
        int total;
        if(cuenta.getProfesion()==3){
            total = 5000;
        }else if(cuenta.getProfesion()==4){
            total=15000;
        }else if(cuenta.getProfesion()==5){
            total=30000;
        }else if(cuenta.getProfesion()==5){
            total=40000;
        }else{
            total=0;
        }
        return total;
    }
    

    /**
     * Metodo que devuelve un String segun el tipo de Idioma
     * del empleado
     * @return idiomacobro
     */
    public int cobroIdioma(){
        int idiomacobro;
        if(cuenta.getIdioma().length==1){
            idiomacobro=10000;
        }else if(cuenta.getIdioma().length==2){
            idiomacobro=20000;
        }else if(cuenta.getIdioma().length==3){
             idiomacobro=30000;
        }else{
            idiomacobro=0;
        }
        return idiomacobro;
    }
     /**
     * Metodo que devuelve un String segun el tipo de Ubicacion
     * del empleado
     * @return ubicacioncobro
     */
    
    public int cobroFinal(){
        int cobrofinal;
        cobrofinal=20*(cobroProfesion()+cobroIdioma()+30000);
        return cobrofinal;
    }
    
}
