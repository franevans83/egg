/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidades.libro;
import Servicio.libroServicio;

/**
 *
 * @author 01. Francisco
 */
public class G6E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        libroServicio ls = new libroServicio();
        libro l1 = new libro ();
        l1 = ls.CargarLibro();
        ls.MostrarDatos(l1);
             }
   
    
}
