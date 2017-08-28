/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class dados {

    public static void main(String[] args) {
        int i = 0;
        int[] vdados = new int[11];
        final int veces = 1000000;
        int fmax, rmax;

        try {
            SecureRandom r = SecureRandom.getInstance("SHA1PRNG");
            for (i = 0; i < veces; i++) {

                ++vdados[r.nextInt(6) + r.nextInt(6)];
            }
            fmax = vdados[0];
            rmax = 2;

            System.out.printf("%s%12s%n", "dado", "frecuencia");
            for (i = 0; i < vdados.length; i++) {

                System.out.printf("%s%12s%n", i + 2, vdados[i]);
                if (vdados[i] > fmax) {
                    fmax = vdados[i];
                    rmax = i + 2;
                }

            }
System.out.printf("El numero que mas veces es:  " + rmax + " con una frecuencia: " + fmax );
        } catch (NoSuchAlgorithmException ex) {
            System.out.printf("error" + dados.class.getName() + "\n" + ex.getMessage());
        }
    }
}
