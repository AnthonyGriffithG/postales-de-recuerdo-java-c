/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.IOException;

/**
 *
 * @author JansMorphy
 */
public class main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Process process = new ProcessBuilder("C:\\Users\\ExtremeTech Sc\\CLionProjects\\PROYECTO\\cmake-build-debug\\PROYECTO.EXE","ruta","textoArrriba","TextoAbajo").start();
    }
    
}
