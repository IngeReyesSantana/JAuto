/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.DBAutos;
import CapaRecursos.Vehiculos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/**
 *
 * @author BOG-A308-E-007
 */
public class negocioautos {
    
    public void Registrar(Vehiculos vehiculo, JTable Jtable1){
        try
        {
            Jtable1.setModel(DBAutos.Registrar(vehiculo, Jtable1));
        }
        catch(Exception ex){
            
        }
    }
    
    public List<Vehiculos> Leer(JTable tabla){
        List<Vehiculos> listaAutos=new ArrayList<>();
        try
        {
            listaAutos=DBAutos.LeerTodo(tabla);
        }
        catch(Exception ex)
        {
            
        }
        finally
        {
            return listaAutos;
        }
    }
}
