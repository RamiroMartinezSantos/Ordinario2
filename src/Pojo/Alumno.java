package Pojo;
public class Alumno {
    String carrera;
    String semestre;
    String alumno;
    String profesor;
    String materia;
    Double parcial1;
    Double parcial2;
    Double parcial3;
    Double ordinario;
    Double extra1;
    Double extra2;
    String matricula;
    String curp;

    public Alumno(String carrera,String semestre,String alumno,String profesor,String materia,Double parcial1,Double parcial2,Double parcial3,Double ordinario,Double extra1,Double extra2,String matricula,String curp){
        this.carrera = carrera;
        this.semestre = semestre;
        this.alumno = alumno;
        this.profesor = profesor;
        this.materia = materia;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.parcial3 = parcial3;
        this.ordinario = ordinario;
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.matricula = matricula;
        this.curp = curp;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public String getAlumno() {
        return alumno;
    }

    public String getProfesor() {
        return profesor;
    }

    public String getMateria() {
        return materia;
    }

    public Double getParcial1() {
        return parcial1;
    }

    public Double getParcial2() {
        return parcial2;
    }

    public Double getParcial3() {
        return parcial3;
    }

    public Double getOrdinario() {
        return ordinario;
    }

    public Double getExtra1() {
        return extra1;
    }

    public Double getExtra2() {
        return extra2;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurp() {
        return curp;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "carrera='" + carrera + '\'' +
                ", semestre='" + semestre + '\'' +
                ", alumno='" + alumno + '\'' +
                ", profesor='" + profesor + '\'' +
                ", materia='" + materia + '\'' +
                ", parcial1='" + parcial1 + '\'' +
                ", parcial2='" + parcial2 + '\'' +
                ", parcial3='" + parcial3 + '\'' +
                ", ordinario='" + ordinario + '\'' +
                ", extra1='" + extra1 + '\'' +
                ", extra2='" + extra2 + '\'' +
                ", matricula='" + matricula + '\'' +
                ", curp='" + curp + '\'' +
                '}';
    }
}