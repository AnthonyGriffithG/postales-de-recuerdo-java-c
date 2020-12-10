/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;

/**
 *
 * @author JansMorphy
 */
public class main {
    

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Inicio Frame = new Inicio();
        
        Funciones FN = Funciones.getInstance();
        FN.cargarProyectos();
        
        Frame.setVisible(true);
        Frame.setLocationRelativeTo(null);
    }
    
}
