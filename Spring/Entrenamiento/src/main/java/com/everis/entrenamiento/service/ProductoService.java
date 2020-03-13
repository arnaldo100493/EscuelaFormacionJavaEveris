/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everis.entrenamiento.service;

import com.everis.entrenamiento.domain.Producto;       
import java.util.List;


/**
 *
 * @author abarrime
 */
public interface ProductoService {
    
    public List<Producto> listarProductos();

    public void guardar(Producto producto);

    public void eliminar(Producto producto);

    public Producto encontrarProducto(Producto producto);  
    
}
