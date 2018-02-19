/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.de.un.circulo;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class AreaDeUnCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radio;
        double resultado;
        double Pi=3.1415;
        Scanner obj= new Scanner(System.in);
        System.out.println("digite el radio del circulo");
        radio=obj.nextDouble();
        resultado=(radio*radio)*Pi;
        System.out.println("el area del circulo es "+resultado);
    }
    
}
