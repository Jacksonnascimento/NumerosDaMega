/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numerosdamega;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Jackson
 */
public class Numeros {

    public ArrayList getNumeros() {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            Random numeroaleatorio = new Random();
            int n;
            boolean repetir;
            do {
                repetir = false;
                n = numeroaleatorio.nextInt(1, 60);
                for (Object nu : numeros) {
                    if ((int) nu == n) {
                        repetir = true;
                    }
                }
            } while (repetir);

            numeros.add(n);
        }

        return numeros;

    }
}
