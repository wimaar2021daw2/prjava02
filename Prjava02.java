/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prjava02;

import java.io.*;
import java.net.*;

/**
 *
 * @author --> Escriu el teu correu electrònic
 */
public class Prjava02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("versio 0.1 del projecte prjava02"); 	
        try {
            InetAddress adreca = InetAddress.getLocalHost();
            String hostname = adreca.getHostName();
            System.out.println("hostname="+hostname);
            System.out.println("Nom de l'usuari: " + System.getProperty("user.name"));
            System.out.println("Carpeta Personal: " + System.getProperty("user.home"));
            System.out.println("Sistema operatiu: " + System.getProperty("os.name"));
            System.out.println("Versio OS: " + System.getProperty("os.version"));
	    System.out.println("Creacio d'una branca del projecte prjava02");
	    System.out.println("Afegint mes codi des de la branca00 del projecte prjava02");
        }
        catch (IOException e) {
		System.out.println("Exception occurred");
        }  
    }
}