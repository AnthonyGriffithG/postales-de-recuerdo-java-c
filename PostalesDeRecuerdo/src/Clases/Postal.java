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
    private final String tipoLetra;
    private final String tamLetra;

    public Postal(String ruta, String tipoLetra, String tamLetra) {
        this.ruta = ruta;
        this.tipoLetra = tipoLetra;
        this.tamLetra = tamLetra;
    }

    public String getRuta() {
        return ruta;
    }

    public String getTipoLetra() {
        return tipoLetra;
    }

    public String getTamLetra() {
        return tamLetra;
    }
    
    
}
