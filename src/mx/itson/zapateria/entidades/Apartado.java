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
public class Apartado extends Modelo{

    private String nombre;
    private String celular;
    private Date FechaVencimiento;
    private Date FechaApartado;
    private int numeroApartado;
    
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
     * @return the FechaVencimiento
     */
    public Date getFechaVencimiento() {
        return FechaVencimiento;
    }

    /**
     * @param FechaVencimiento the FechaVencimiento to set
     */
    public void setFechaVencimiento(Date FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }

    /**
     * @return the FechaApartado
     */
    public Date getFechaApartado() {
        return FechaApartado;
    }

    /**
     * @param FechaApartado the FechaApartado to set
     */
    public void setFechaApartado(Date FechaApartado) {
        this.FechaApartado = FechaApartado;
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
