package org.mypackage.hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class NameHandler {
    private String name;
    private int fecha;
    private int resultado1;
    private int resultado2;

    public int getResultado2() {
        resultado2=2020-fecha;
        return resultado2;
    }

    public void setResultado2(int resultado2) {
        this.resultado2 = resultado2;
    }

    public void setResultado1(int resultado1) {
        this.resultado1 = resultado1;
    }
    
    public NameHandler(){
        name= null;
        fecha=0;
        resultado1=0;
        resultado2=0;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the fecha
     */
    public int getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    
            
}
