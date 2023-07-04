package Alumno;

import Usuarios.Usuarios;

import javax.swing.*;
import java.awt.*;

public class MenuAlumno extends JFrame{
    private JPanel panel1;
    private JButton consultarButton;
    private JButton regresarButton;

    public MenuAlumno(){
        setupFrame();
        query();
        query2();

    }
    private void setupFrame(){
        setTitle("Menu");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(400, 300);
        add(panel1);
    }

    private void query(){
        regresarButton.addActionListener(e -> {
            Usuarios usuarios = new Usuarios();
            usuarios.setVisible(true);
            this.setVisible(false);
        });
    }
    private void query2(){
        consultarButton.addActionListener(e -> {
            MostrarAlumno mostrarAlumno = new MostrarAlumno();
            mostrarAlumno.setVisible(true);
            this.setVisible(false);
        });
    }
}

