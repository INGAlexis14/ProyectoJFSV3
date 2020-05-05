/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.proyectojsfv2;

import edu.unicundi.logica.Logica;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author Alexis González
 */
@Named(value = "reporte")
@RequestScoped
public class Reporte {
 @Inject
    private Logica logica;

    /**
     * este metodo envia el 
     * reporte de la logica
     * @param logica 
     */
    public Reporte(Logica logica) {
        this.logica = logica;
    }
    /**
     * variable get logica
     * @return logica
     */
    public Logica getLogica() {
        return logica;
    }
    /**
     * variable set logica
     * @param logica 
     */
    public void setLogica(Logica logica) {
        this.logica = logica;
    }
    /**
     * este metodo imprime el genero
     * segun lo elijan
     * @return genero
     */
   
    public String pintarProfesion(){
        String profesion = logica.devolverProfesion();
        return profesion;
    }
    /**
     * este metodo imprime el pago 
     * segun la ubicacion
     * @return ubicacion
     */
    
    /**
     * este metodo imprime el idioma segun el o 
     * los  idiomas
     * @return cobro
     */
    public int pintarCobroIdioma(){
        int cobro=logica.cobroIdioma();
        return cobro;
    }
    /**
     * este metodo imprime el cobro
     * segun la profesion
     * @return cobro
     */
    public int pintarCobroProfesion(){
        int cobro=logica.cobroProfesion();
        return cobro;
    }
    /**
     * Este metodo imprime el 
     * resultado de cobroubicacion
     * @return cobro
     */
   
    public int pintarCobroFinal(){
        int cobro = logica.cobroFinal();
        return cobro;
    }
    /**
     * contructor de la clase reporte
     */
    public Reporte() {
    }
    
}
