/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everis.entity;

/**
 *
 * @author abarrime
 */
public class Automovil {

    private String marca;
    private Integer cilindraje;
    private String numeroPuertas;

    public Automovil() {
        this.marca = "";
        this.cilindraje = 0;
        this.numeroPuertas = "";
    }

    public Automovil(String marca, Integer cilindraje, String numeroPuertas) {
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.numeroPuertas = numeroPuertas;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the cilindraje
     */
    public Integer getCilindraje() {
        return cilindraje;
    }

    /**
     * @param cilindraje the cilindraje to set
     */
    public void setCilindraje(Integer cilindraje) {
        this.cilindraje = cilindraje;
    }

    /**
     * @return the numeroPuertas
     */
    public String getNumeroPuertas() {
        return numeroPuertas;
    }

    /**
     * @param numeroPuertas the numeroPuertas to set
     */
    public void setNumeroPuertas(String numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", cilindraje=" + cilindraje + ", numeroPuertas=" + numeroPuertas + '}';
    }

}
