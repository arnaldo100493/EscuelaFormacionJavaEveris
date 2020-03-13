/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everis.entrenamiento.dao;

import com.everis.entrenamiento.domain.Producto;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author abarrime
 */
public interface ProductoDao extends CrudRepository<Producto, Long>{
    
}
