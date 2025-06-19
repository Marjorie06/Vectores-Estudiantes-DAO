package com.mycompany.proyecto;

public class Proyecto {

    public static void main(String[] args) {
        Estudiante estudianteUno = new Estudiante("Marjorie", 21, "Barrio 20 de mayo");
        Estudiante estudianteDos = new Estudiante("Daniela", 21, "Orellana");
        Estudiante estudianteTres = new Estudiante("Julia", 24, "Orellana");

        Estudiante eModificado = new Estudiante("Julia", 25, "Orellana");

        IEstudiantes estudiantes = new Estudiantes(3);
        estudiantes.agregarEstudiantes(estudianteUno);
        estudiantes.agregarEstudiantes(estudianteDos);
        estudiantes.agregarEstudiantes(estudianteTres);
        estudiantes.imprimirDatos();
        System.out.println("---DATOS MODIFICADOS---");
        estudiantes.actualizarEstudiante(1, eModificado);
        estudiantes.imprimirDatos();
    }
}
