/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package mx.itson.zapateria.enumerador;

/**
 *
 * @author chiqu
 */
public enum Sexo {
    
    MUJER(1),
    HOMBRE(2),
    UNISEX(3);
    
    private int numero;
    Sexo(int numero ){
        this.numero = numero;
    }
    
}
