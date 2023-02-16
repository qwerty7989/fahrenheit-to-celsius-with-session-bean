/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package MyBean;

import javax.ejb.Stateless;

/**
 *
 * @author koony
 */
@Stateless
public class StatelessFahToCel implements StatelessFahToCelRemote {

    @Override
    public double fahrenheitToCelsius(double fahrenheit) {
        return ((fahrenheit - 32) * 5.0) / 9.0;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
