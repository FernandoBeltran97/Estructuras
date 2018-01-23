/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Objects;

/**
 *
 * @author Familia
 */
public class Empleado{
    
    private static int serie = 100;
    protected  int  claveEmpleado=0;
    private String nombreEmpleado;
    private double SueldoBase;

    
    
    public Empleado(){
        this.claveEmpleado=serie;
        serie++;
    }
    
    public Empleado(String nombreEmpleado, double sueldoBase) {
        this();
        this.nombreEmpleado = nombreEmpleado;
        this.SueldoBase = sueldoBase;
    }

    
    
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public double getSueldoBase() {
        return SueldoBase;
    }

    public void setSueldoBase(double SueldoBase) {
        this.SueldoBase = SueldoBase;
    }
    
    
    @Override
    public String toString() {
        return "Empleado{" + "claveEmpleado=" + claveEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", SueldoBase=" + SueldoBase + '}';
    }

      public boolean equals(Object otro) {
          boolean res=false;
          Empleado admin1 =  (Empleado)otro;
          if(this.claveEmpleado == admin1.claveEmpleado)
            res=true;
        
        return res;
                

    }
    
    
    
    public double calculaSalario(double prestac, double deduc){
        double prestaciones=prestac/100;
        double deducciones=deduc/100;
        
        return this.SueldoBase + SueldoBase*prestaciones - SueldoBase*deducciones;
        
    }
    
}
