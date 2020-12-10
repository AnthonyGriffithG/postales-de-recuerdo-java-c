
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JansMorphy
 */
public class Imagen implements Serializable{
    private final String ruta; 

    private int X; 
    private int Y;

    public Imagen(String ruta) {
        this.ruta = ruta;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }
    
    public String getRuta() {
        return ruta;
    }
}
