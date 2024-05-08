/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.zapateria.entidades;

import java.util.Date;

/**
 *
 * @author chiqu
 */
public class Apartado extends Modelo {
    
    private String nombre;
    private String celular;
    private Date fechaVencimiento;
    private Date fechaApartado;
    private int numeroApartado;
    private double restante;
    
    /**
     * @return the fechaVencimiento
     */
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * @param fechaVencimiento the fechaVencimiento to set
     */
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * @return the fechaApartado
     */
    public Date getFechaApartado() {
        return fechaApartado;
    }

    /**
     * @param fechaApartado the fechaApartado to set
     */
    public void setFechaApartado(Date fechaApartado) {
        this.fechaApartado = fechaApartado;
    }

    /**
     * @return the restante
     */
    public double getRestante() {
        return restante;
    }

    /**
     * @param restante the restante to set
     */
    public void setRestante(double restante) {
        this.restante = restante;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the numeroApartado
     */
    public int getNumeroApartado() {
        return numeroApartado;
    }

    /**
     * @param numeroApartado the numeroApartado to set
     */
    public void setNumeroApartado(int numeroApartado) {
        this.numeroApartado = numeroApartado;
    }

}
