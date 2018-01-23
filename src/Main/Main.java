/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Familia
 */
public class Main {

    public static void main(String[] args) {
       
        Empleado Em1 = new Empleado("Raul", 25200);
        Administrativo Admin1 = new Administrativo("Raul", 25200, "", "52551341");
       System.out.println(Admin1);
       System.out.println(Em1);
       System.out.println(Em1.equals(Em1));
       
    }
    
}
