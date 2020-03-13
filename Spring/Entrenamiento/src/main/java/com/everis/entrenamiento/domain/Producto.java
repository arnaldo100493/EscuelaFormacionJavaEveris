/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everis.entrenamiento.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author abarrime
 */
@Data
@Entity
@Table(name = "producto")
public class Producto implements Serializable {
    
   private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;
    private String nombre;
    private String descripcion;
    
    public Producto(){
        this.idProducto = 0L;
        this.nombre = "";
        this.descripcion = "";
    }

    public Producto(String nombre, String descripcion) {
        this.idProducto = 0L;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Producto(Long idProducto, String nombre, String descripcion) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", descripcion=" + descripcion +'}';
    }

}
