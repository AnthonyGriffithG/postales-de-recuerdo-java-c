/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    public ArrayList<String> Plugins = new ArrayList();
    
    public int crearProyecto(String nombre, String rutaImagen, String rutaPostal, String tipoLetra, String tamanoLetra) throws IOException{
        if (buscarProyecto(nombre) == null) {
            Imagen imagen = new Imagen(rutaImagen);
            Postal postal = new Postal(rutaPostal, tipoLetra, tamanoLetra);
            Proyecto nuevoProyecto = new Proyecto(nombre, imagen, postal);

            ListaProyectos.add(nuevoProyecto);
            guardarProyectos();
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
    
    public void guardarProyectos() throws IOException{
        try{
            try (ObjectOutputStream escribiendo = new ObjectOutputStream(new FileOutputStream("proyectos.txt"))) {
                escribiendo.writeObject(ListaProyectos);
            }
        } catch (FileNotFoundException ex) {
            
        }
        ListaProyectos.forEach((i) -> {
            System.out.println(i.getNombre());
        });
    }

    public void cargarProyectos() throws IOException, ClassNotFoundException {
        try (ObjectInputStream leyendo = new ObjectInputStream(new FileInputStream("proyectos.txt"))) {
            ListaProyectos = (ArrayList<Proyecto>) leyendo.readObject();
        }
    }
   

}





