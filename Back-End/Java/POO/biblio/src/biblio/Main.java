/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblio;

import Entidades.Libro;
import service.Service;

/**
 *
 * @author ing_j
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Service service = new Service();
          Libro libro = service.cargarLibros();
          service.mostrarInformacion();
    }
    
}
