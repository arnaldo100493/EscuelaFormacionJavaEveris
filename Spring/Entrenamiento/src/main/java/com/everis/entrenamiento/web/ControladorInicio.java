/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everis.entrenamiento.web;

import com.everis.entrenamiento.domain.Persona;
import com.everis.entrenamiento.domain.Producto;
import com.everis.entrenamiento.service.PersonaService;
import com.everis.entrenamiento.service.ProductoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author abarrime
 */
@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private PersonaService personaService;

    @Autowired
    private ProductoService productoService;

    @GetMapping("/")
    public String inicio(Model model) {
        var personas = personaService.listarPersonas();
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("personas", personas);
        return "index";
    }
    
    @GetMapping("/listproducto")
    public String iniciop(Model model) {
        var productos = productoService.listarProductos();
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("productos", productos);
        return "indexp";
    }

    @GetMapping("/agregar")
    public String agregar(Persona persona) {
        return "modificar";
    }

    @GetMapping("/agregarp")
    public String agregarp(Producto producto) {
        return "modificarp";
    }

    @PostMapping("/guardar")
    public String guardar(Persona persona) {
        personaService.guardar(persona);
        return "redirect:/";
    }

    @PostMapping("/guardarp")
    public String guardarp(Producto producto) {
        productoService.guardar(producto);
        return "redirect:/";
    }

    @GetMapping("/editar/{idPersona}")
    public String editar(Persona persona, Model model) {
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("persona", persona);
        return "modificar";

    }

    @GetMapping("/editarp{idProducto}")
    public String editarp(Producto producto, Model model) {
        producto = productoService.encontrarProducto(producto);
        model.addAttribute("persona", producto);
        return "modificarp";
    }

    @GetMapping("/eliminar")
    public String eliminar(Persona persona) {
        personaService.eliminar(persona);
        return "redirect:/";
    }

    @GetMapping("/eliminarp")
    public String eliminarp(Producto producto) {
        productoService.eliminar(producto);
        return "redirect:/";
    }

}
