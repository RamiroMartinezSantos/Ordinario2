package Usuarios;

import Alumno.MenuAlumno;
import Secretaria.MenuSecretaria;
import Secretaria.Secretaria;

import javax.swing.*;
import java.awt.*;

public class Usuarios extends JFrame{
    private JPanel panel1;
    private JButton alumnoButton;
    private JButton secretariaButton;

    public Usuarios(){
        setupFrame();
        query1();
        query2();

    }
    private void setupFrame(){
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(400, 300);
        add(panel1);
    }
    private void query1(){
        secretariaButton.addActionListener(e -> {
            Secretaria secretaria = new Secretaria();
            secretaria.setVisible(true);
            this.setVisible(false);
        });
    }
    private void query2(){
        alumnoButton.addActionListener(e -> {
            MenuAlumno menuAlumno = new MenuAlumno();
            menuAlumno.setVisible(true);
            this.setVisible(false);
        });
    }
}

