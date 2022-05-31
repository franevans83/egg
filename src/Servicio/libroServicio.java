/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.libro;
import java.util.Scanner;

/**
 *
 * @author 01. Francisco
 */
public class libroServicio {

    public libro CargarLibro() {
        Scanner leer = new Scanner(System.in);
        libro l1 = new libro();
        System.out.println("Ingrese el número de ISBN del libro");
        l1.setISBN(leer.nextInt());
        System.out.println("Ingrese el nombre del Autor");
        l1.setAutor(leer.next());
        System.out.println("Ingrese el Título del libro");
        l1.setTitulo(leer.next());
        System.out.println("Ingrese el número de páginas");
        l1.setPaginas(leer.nextInt());
        ;
        return l1;
    }
    public void  MostrarDatos(libro l1){
        
        System.out.println("El núemro de ISBN es "+l1.getISBN());
        System.out.println("El Autor del libro es "+l1.getAutor());
        System.out.println("El Título del libro es "+l1.getTitulo());
        System.out.println("La cantidad de páginas que tiene es "+l1.getPaginas());
        
    }
}
