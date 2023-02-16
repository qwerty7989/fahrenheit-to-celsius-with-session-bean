/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statelessfahtocel;

import MyBean.StatelessFahToCelRemote;
import java.util.Scanner;
import javax.ejb.EJB;

/**
 *
 * @author koony
 */
public class Main {

    @EJB
    private static StatelessFahToCelRemote statelessFahToCel;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double fahrenheitTemp, celsiusTemp;
            
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("Enter degree in Fahrenheit: ");
                fahrenheitTemp = sc.nextDouble();
                celsiusTemp = statelessFahToCel.fahrenheitToCelsius(fahrenheitTemp);
                System.out.printf("%.0f Fahrenheit = %.1f Celsius\n",fahrenheitTemp, celsiusTemp);
            } catch (Exception e) {
                System.err.println("Enter a proper floating number please.");
            }
        }
    }
    
    
}
