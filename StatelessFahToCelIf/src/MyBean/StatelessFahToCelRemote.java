/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionRemote.java to edit this template
 */
package MyBean;

import javax.ejb.Remote;

/**
 *
 * @author koony
 */
@Remote
public interface StatelessFahToCelRemote {

    double fahrenheitToCelsius(double fahrenheit);
    
}
