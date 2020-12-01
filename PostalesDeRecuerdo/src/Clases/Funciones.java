/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author JansMorphy
 */
public class Funciones {
    
    public static Funciones instance = null;
    public static Funciones getInstance(){
        if(instance == null){
            instance = new Funciones();
        }
        return instance;
    }
    
    public ArrayList<Proyecto> ListaProyectos = new ArrayList();
    public int crearProyecto(String nombre, String rutaImagen, String rutaPostal, String tipoLetra, String tamanoLetra){
        if (buscarProyecto(nombre) == null) {
            Imagen imagen = new Imagen(rutaImagen);
            Postal postal = new Postal(rutaPostal, tipoLetra, tamanoLetra);
            Proyecto nuevoProyecto = new Proyecto(nombre, imagen, postal);

            ListaProyectos.add(nuevoProyecto);
            return 0;
        }
        return 1;
    }
    
    public Proyecto buscarProyecto(String nombre){
        for (Proyecto i : ListaProyectos) {
            if(i.getNombre().equals(nombre)){
                return i;
            }
        }
        return null;
    }
}
