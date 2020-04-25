/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coordenadas;

import java.util.Scanner;

/**
 *
 * @author Debbie
 */
public class Coordenadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float x[] = new float[200];
        float y[] = new float[200];
        int contador = 0;
        String decision = "s"; 
        Scanner input = new Scanner(System.in);
        
        do{
            
            System.out.println("Ingresar coordenada X: ");
            x[contador] = input.nextFloat();
            System.out.println("Ingresar coordenada Y: ");
            y[contador] = input.nextFloat();
            contador++;
            
            if (contador > 1) {
                System.out.println("¿Ingresar otro valor? Si= s, No= n: ");
                decision = input.next();
                
            }
            
        } while (decision.equals("s") && contador < 200);
    }
    
}
