/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author JansMorphy
 */
public class Postal {
    private final String ruta;
    private final int X;
    private final int Y;
    private final int tipoLetra;
    private final int tamLetra;

    public Postal(String ruta, int X, int Y, int tipoLetra, int tamLetra) {
        this.ruta = ruta;
        this.X = X;
        this.Y = Y;
        this.tipoLetra = tipoLetra;
        this.tamLetra = tamLetra;
    }
    
    
}
