/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaRecursos;

/**
 *
 * @author BOG-A308-E-007
 */
public class Vehiculos {
    private String marca;
    private String modelo;
    private String color;

    public void SetMarca(String marca){
        this.marca=marca;
    }
    
     public String GetMarca(){
         return this.marca;
     }
     
//     {
//         this.marca=marca;
//     } 
     
     public void SetModelo(String modelo){
         this.modelo=modelo;

     }
      
     public String GetModelo(){
         return this.modelo;
     }
     
     public void SetColor(String color){
         this.color=color;
     }
     
     public String GetColor(){
         return this.color;
     }
}
