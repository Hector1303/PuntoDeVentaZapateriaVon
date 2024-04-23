/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package mx.itson.zapateria.enumerador;

/**
 *
 * @author chiqu
 */
public enum Tipo {
    TENI (1),
    ZAPATO(2),
    ZAPATILLA(3),
    HUARACHE(4),
    TAQUETE(5),
    BOTATRABAJO(6),
    BOTARODEO(7),
    BOTAALTA(8),
    BOTIN(9),
    RELOJ(10);
    
    private int numero;
    Tipo(int numero ){
        this.numero = numero;
    }
}
