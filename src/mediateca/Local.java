/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediateca;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author gipao
 */
public class Local {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("mediateca.txt");
        f.createNewFile();
        PrintStream output = new PrintStream(f);
        output.println("Libro,Titulo,Nombre,Apellido,122345,\n" +
                        "Libro,JavaLanguage,Balagu,E,41456,");
        
TipoDeSoporte cd= new Cd("dfgfsdg", 0, "sdfgdfsh");
        System.out.println(cd.getClass());
        
        
       
        
        
                
       
        
    }
    
    
}
