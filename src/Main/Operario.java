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
public class Operario extends Empleado{
    private int horasExtra;

    public Operario() {
        super();
    }

    public Operario(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public Operario(int horasExtra, String nombreEmpleado, double sueldoBase) {
        super(nombreEmpleado, sueldoBase);
        this.horasExtra = horasExtra;
    }
    
    public String toString() {
        StringBuilder cad = new StringBuilder();
        cad.append(super.toString());
        cad.append(("\n Horas extra: ")).append(horasExtra);
        return cad.toString();
    }
    
    public double calculaSalario(double prestac,double deduc, double precioHE){
        double sueldoB=getSueldoBase();
        return sueldoB + prestac*sueldoB/100 + horasExtra*precioHE - deduc*sueldoB/100 ;
    }
    
    
    
}
