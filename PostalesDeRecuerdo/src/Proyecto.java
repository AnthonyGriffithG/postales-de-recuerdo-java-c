/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;

/**
 *
 * @author JansMorphy
 */
public class Proyecto implements Serializable {
    private final String nombre;
    private final Imagen imgOriginal;
    private final Postal postal;

    public Proyecto(String nombre, Imagen imgOriginal, Postal postal) {
        this.nombre = nombre;
        this.imgOriginal = imgOriginal;
        this.postal = postal;
    }

    public String getNombre() {
        return nombre;
    }

    public Imagen getImgOriginal() {
        return imgOriginal;
    }


    public Postal getPostal() {
        return postal;
    }



    
    
}
