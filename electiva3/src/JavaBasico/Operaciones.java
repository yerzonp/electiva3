/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasico;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Operaciones {

  

    public static void main(String[] args) {
        int vInt;
        float Vfloat;
          String vtr;
          boolean b1,b2;
          
          Scanner vscan=new Scanner(System.in);
        vInt = 0;
        vInt = 5 + 2;
        System.out.println("suma =" + vInt);
        vInt = 5 - 2;
        System.out.println("Resta =" + vInt);
        vInt = 5 * 2;
        System.out.println("multiplicacion =" + vInt);
        vInt = 5 % 2;
        System.out.println("modulo =" + vInt);
        vInt = 5 ^ 2;
        System.out.println("EXP =" + vInt);
        
        
        
        
        Vfloat = 5 + 2;
        System.out.println("suma =" + Vfloat);
        Vfloat = 5 - 2;
        System.out.println("Resta =" + Vfloat);
        Vfloat = 5 * 2;
        System.out.println("multiplicacion =" + Vfloat);
        Vfloat = 5 % 2;
        System.out.println("modulo =" + Vfloat);
        Vfloat = 5 ^ 2;
        System.out.println("EXP =" + Vfloat);
        
        vtr="yerson ";
        vtr=vtr+"peña";
        System.out.println("El nombre es  :" + vtr);
        
        b1=true;
        b2=false;
     System.out.println("b1 and b2: " + (b1 && b2));   
     System.out.println("b1 or b2: " + (b1 || b2)); 
     System.out.println("not b1: " + (!b1));  
    System.out.println("not b2: " + (!b2));
   // System.out.println("Ingrese un texto");
    //System.out.println(vscan.nextLine());
    
    
    // CICLOS
    int i;
    for (i=0;i<5; i++){
        System.out.println(i);
    }
    i=++i +2;
    System.out.println(i);
    
    
    int[] vec={86,68,3,52,8,12};
    for(int num:vec){

    System.out.printf(" valor " +num);
    }
    
    
}
}

