
package com.mycompany.proyecto;

public class Estudiantes implements IEstudiantes{
        
    private Estudiante [] estudiantes; 
    private int totalEstudiantes;
   
    public Estudiantes(int dimension) {
        estudiantes = new Estudiante[dimension];
        totalEstudiantes =0;
    }
    
    
    public boolean agregarEstudiantes (Estudiante estudiante){
        if (totalEstudiantes == estudiantes.length){
            return false;
        } else {
            estudiantes [totalEstudiantes] = estudiante;
            totalEstudiantes = totalEstudiantes +1;
            return true;
        }     
    }
    
    public void imprimirDatos (){
        for (int i=0; i<totalEstudiantes; i++ ){
            System.out.println("Nombre: "+ estudiantes[i].getNombre ());
            System.out.println("Edad: "+ estudiantes[i].getEdad());
            System.out.println("Direccion: "+ estudiantes[i].getDireccion());
        }
    }
    
    public boolean actualizarEstudiante (int i, Estudiante estudiante){
        estudiantes [i] = estudiante;
        
        
        return true; 
    }
}
