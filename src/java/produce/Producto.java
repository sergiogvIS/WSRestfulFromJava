/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produce;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author entrar
 */
@XmlRootElement
public class Producto {
    
        private int id;

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

    private String nombre;

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String categoria;

    /**
     * Get the value of categoria
     *
     * @return the value of categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Set the value of categoria
     *
     * @param categoria new value of categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    private double precio;

    /**
     * Get the value of precio
     *
     * @return the value of precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Set the value of precio
     *
     * @param precio new value of precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
