package Alumno;

import Pojo.Alumno;
import Pojo.IncertarAlumno;
import Secretaria.Registrar;
import Usuarios.Usuarios;

import javax.swing.*;
import java.awt.*;

import java.util.ArrayList;

public class MostrarAlumno extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton buscarButton;
    private JButton regresarButton;
    private static ArrayList<Alumno> alumnos;


    public MostrarAlumno() {
        setupFrame();
        query();
        query1();
    }

    private void setupFrame() {
        setTitle("Menu");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        setSize(400, 300);
        add(panel1);
    }

    private void query1(){
        buscarButton.addActionListener(e -> {
            mostrar();
        });
    }
    public void mostrar(){
        alumnos = Registrar.getElemento();

        String usuario = textField1.getText();
        String contra = textField2.getText();

        System.out.println(""+usuario);
        System.out.println(""+contra);

        if (alumnos != null) {
        for (Alumno alumno : alumnos) {
            if (alumno.getMatricula().equals(usuario) && alumno.getCurp().equals(contra)) {
                JOptionPane.showMessageDialog(null, "El Alumno ha sido encontrado");

                String mensaje = "Carrera: " + alumno.getCarrera() + "\n" +
                        "Semestre: " + alumno.getSemestre() + "\n" +
                        "Alumno: " + alumno.getAlumno() + "\n" +
                        "Profesor: " + alumno.getProfesor() + "\n" +
                        "Materia: " + alumno.getMateria() + "\n" +
                        "Parcial 1: " + alumno.getParcial1() + "\n" +
                        "Parcial 2: " + alumno.getParcial2() + "\n" +
                        "Parcial 3: " + alumno.getParcial3() + "\n" +
                        "Ordinario: " + alumno.getOrdinario() + "\n" +
                        "Extra 1: " + alumno.getExtra1() + "\n" +
                        "Extra 2: " + alumno.getExtra2();
                JOptionPane.showMessageDialog(this, mensaje, "Información del Estudiante", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay alumnos registrados", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void query(){
        regresarButton.addActionListener(e -> {
            Usuarios usuarios = new Usuarios();
            usuarios.setVisible(true);
            this.setVisible(false);
        });
    }

}

