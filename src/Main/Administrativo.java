/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Objects;

public class Administrativo extends Empleado{
    
    private String departamento, telefono;

    
    
    public Administrativo() {
        super();
        
    }

    public Administrativo(String nombreEmpleado, double sueldoBase, String departamento, String telefono) {
        super(nombreEmpleado, sueldoBase);
        this.departamento = departamento;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        StringBuilder cad = new StringBuilder();
        
        cad.append(super.toString());
        cad.append(("\n Departamento: ")).append(departamento);
        cad.append("\n Telefono: ").append(telefono);
        return    cad.toString();
    }
  

    
    
    

    
    

    
    
    
    
    
    
    
}
