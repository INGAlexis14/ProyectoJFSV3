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
@Named(value = "cuenta")
@RequestScoped
public class Cuenta {
/**
    *Variables privadas que almacenan datos 
    * que se reciben
    * nombre guarda el nombre
    * apellido guarda el apellido
    * profesion guarda la profesion
    * ubicacion guarda la ubicacion
    * genero guarda el genero
    * diasTrabajo guarda los dias trabajados
    *  idioma guarda el idioma
      */
    private String cedula;
    private String fechaNacimiento;
    private String nombre;
    private String apellido;
    private int profesion;
    private int ubicacion;
    private int genero;
    private int diasTrabajo;
    private String[] idioma;
   

    
    @Inject
    private Logica logica;
    /**
     *get variable logica
     * @return logica
     */
    public Logica getLogica() {
        return logica;
    }
    /**
     * set variable logica
     * @param logica 
     */
    public void setLogica(Logica logica) {
        this.logica = logica;
    }
      /**
       * get variable nombre
       * @return nombre
       */
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getNombre() {
        return nombre;
    }
    /**
     * set variable nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * get variable apellido
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * set variable apellido
     * @param apellido  
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * get variable profesion 
     * @return profesion
     */
    public int getProfesion() {
        return profesion;
    }
    /**
     * set variable profesion
     * @param profesion 
     */
    public void setProfesion(int profesion) {
        this.profesion = profesion;
    }
    /**
     * get variable ubicacion
     * @return ubicacion
     */
    public int getUbicacion() {
        return ubicacion;
    }
    /**
     * set variable ubiacion
     * @param ubicacion 
     */
    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }
    /**
     * get variable genero
     * @return genero
     */
    
    public String[] getIdioma() {
        return idioma;
    }
    /**
     * set variable idioma
     * @param idioma 
     */
    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }
    /**
     * metodo que genera reporte
     * @return reporte
     */
    public String generar(){
        return "reporte";
    }
    public Cuenta() {
    }
    
}
