package Pojo;

import java.util.ArrayList;

public class IncertarAlumno {

    public ArrayList<Alumno> alumnos;
    public IncertarAlumno(){alumnos = new ArrayList<>();}
    public void ingresar(ArrayList<Alumno> alumnos,String carrera,String semestre,String alumno,String profesor,String materia,Double parcial1,Double parcial2,Double parcial3,Double ordinario,Double extra1,Double extra2,String matricula,String curp){
        alumnos.add(new Alumno(carrera, semestre, alumno, profesor, materia, parcial1, parcial2, parcial3, ordinario, extra1, extra2, matricula, curp));
    }
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
}
