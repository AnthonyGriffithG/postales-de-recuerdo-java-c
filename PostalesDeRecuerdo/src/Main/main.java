/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Interfaz.Inicio;
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
        Inicio Frame = new Inicio();
        Frame.setVisible(true);
        Frame.setLocationRelativeTo(null);
    }
    
}
