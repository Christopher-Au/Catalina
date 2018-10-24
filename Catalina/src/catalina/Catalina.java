/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalina;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.A;
import static javafx.scene.input.KeyCode.Z;

/**
 *
 * @author austichr
 */
public class Catalina {
        //[A-Z]
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
    Scanner scan = new Scanner(new File("pp.txt"));
    
    if(scan.hasNext()){
        String temp = scan.nextLine();
        ArrayList j = new ArrayList();
        String e = "";
        for (int x=0; x<temp.length(); x++){
            Character tempC = temp.charAt(x);
            if (Character.isUpperCase(tempC)){
                j.add(tempC);
            }
        }   
        for (int x=0; x<j.size(); x++){
            e = e + j.get(x);
            
        }
        System.out.println(e);
        }
    else System.out.println("I am Error");
        }
    }
