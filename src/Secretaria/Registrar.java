package Secretaria;

import Pojo.Alumno;
import Pojo.IncertarAlumno;
import Pojo.SacarPromedio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Registrar extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JButton registrarButton;
    private JButton regresarButton;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JTextField textField16;
    private JButton validarButton;
    IncertarAlumno incertarAlumno = new IncertarAlumno();

    private static final ArrayList<Alumno> lista = new ArrayList<>();

    public Registrar(){
        setupFrame();
        query2();
    }
    private void setupFrame(){
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(500, 600);
        addActionListeners();
        textField10.setEditable(false);
        textField11.setEditable(false);
        add(panel1);
    }
    private void addActionListeners(){
        registrarButton.addActionListener(new EventClick());
        validarButton.addActionListener(new EventClick());
    }

    public class EventClick implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton boton = (JButton) e.getSource();
            String opcion = boton.getText();

            if (opcion.equals("Validar")) {
                String carrera = textField1.getText();
                String semestre = textField2.getText();
                String alumno = textField3.getText();
                String profesor = textField4.getText();
                String materia = textField5.getText();

                String curp = textField15.getText();
                String matricula = textField16.getText();

                if (!carrera.matches("^[^0-9]+$")) {
                    JOptionPane.showMessageDialog(null, "El nombre de la carrera no debe contener números.");
                } else if (!semestre.matches("^[^0-9]+$")) {
                    JOptionPane.showMessageDialog(null, "El nombre del semestre no debe contener números.");
                } else if (!alumno.matches("^[^0-9]+$")) {
                    JOptionPane.showMessageDialog(null, "El nombre del alumno no debe contener números.");
                } else if (!profesor.matches("^[^0-9]+$")) {
                    JOptionPane.showMessageDialog(null, "El nombre del profesor no debe contener números.");
                } else if (!materia.matches("^[^0-9]+$")) {
                    JOptionPane.showMessageDialog(null, "El nombre de la materia no debe contener números.");
                } else if (!curp.matches("^[^0-9]+$")) {
                    JOptionPane.showMessageDialog(null, "El numero de la matricula no debe contener numeros.");
                } else if (matricula.matches("^[^0-9]+$")) {
                    JOptionPane.showMessageDialog(null, "El numero de la matricula no debe contener letras.");
                }

                Double parcial1 = 0.0;
                Double parcial2 = 0.0;
                Double parcial3 = 0.0;
                Double ordinario = 0.0;
                Double extra1 = 0.0;
                Double extra2 = 0.0;


                Double acistenciaP1 = 0.0;

                Double acistenciaP2 = 0.0;

                Double acistenciaP3 = 0.0;

                try {
                    acistenciaP1 = Double.parseDouble(textField12.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido en la asistencia del parcial 1.");
                }
                try {
                    parcial1 = Double.parseDouble(textField6.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido en el parcial 1.");
                }
                try {
                    acistenciaP2 = Double.parseDouble(textField13.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido en la asistencia del parcial 2.");
                }
                try {
                    parcial2 = Double.parseDouble(textField7.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido en el parcial 2.");
                }
                try {
                    acistenciaP3 = Double.parseDouble(textField14.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido en la asistencia del parcial 3.");
                }
                try {
                    parcial3 = Double.parseDouble(textField8.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido en el parcial 3.");
                }
                try {
                    ordinario = Double.parseDouble(textField9.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido en ordinario");
                }

                if (acistenciaP1 < 85) {
                    textField6.setEditable(false);
                    parcial1 = 0.0;
                }else{
                    textField6.setEditable(true);
                }
                if (acistenciaP2 < 85) {
                    textField7.setEditable(false);
                    parcial2 = 0.0;
                }else{
                    textField7.setEditable(true);
                }
                if (acistenciaP3 < 85) {
                    textField8.setEditable(false);
                    parcial3 = 0.0;
                }else{
                    textField8.setEditable(true);
                }

                SacarPromedio sacarPromedio = new SacarPromedio();
                Double calif = sacarPromedio.promedio(parcial1, parcial2, parcial3, ordinario);

                if (calif < 6.0) {
                    textField10.setEditable(true);
                    try {
                        extra1 = Double.parseDouble(textField10.getText());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Ingrese un número válido en el extra 1.");
                    }
                } else {
                    textField10.setEditable(false);
                }



                if (extra1 < 6.0) {
                    textField11.setEditable(true);
                    try {
                        extra2 = Double.parseDouble(textField11.getText());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Ingrese un número válido en el extra 2.");
                    }
                } else {
                    textField11.setEditable(false);
                }
            }

                if (opcion.equals("Registrar")) {

                    String carrera = textField1.getText();
                    String semestre = textField2.getText();
                    String alumno = textField3.getText();
                    String profesor = textField4.getText();
                    String materia = textField5.getText();
                    Double parcial1 = Double.parseDouble(textField6.getText());
                    Double parcial2 = Double.parseDouble(textField7.getText());
                    Double parcial3 = Double.parseDouble(textField8.getText());
                    Double ordinario = Double.parseDouble(textField9.getText());
                    Double extra1;
                    Double extra2;
                    String matricula = textField16.getText();
                    String curp = textField15.getText();


                    try {
                        extra1 = Double.parseDouble(textField10.getText());
                    } catch (NumberFormatException ex) {
                        extra1 = 0.0;
                    }

                    try {
                        extra2 = Double.parseDouble(textField11.getText());
                    } catch (NumberFormatException ex) {
                        extra2 = 0.0;
                    }

                    lista.add(new Alumno(carrera, semestre, alumno, profesor, materia, parcial1, parcial2, parcial3, ordinario, extra1, extra2, matricula, curp));

                    incertarAlumno.ingresar(incertarAlumno.getAlumnos(), carrera, semestre, alumno, profesor, materia, parcial1, parcial2, parcial3, ordinario, extra1, extra2, matricula, curp);

                    textField1.setText(" ");
                    textField2.setText(" ");
                    textField3.setText(" ");
                    textField4.setText(" ");
                    textField5.setText(" ");
                    textField6.setText(" ");
                    textField7.setText(" ");
                    textField8.setText(" ");
                    textField9.setText(" ");
                    textField10.setText(" ");
                    textField11.setText(" ");
                    textField12.setText(" ");
                    textField13.setText(" ");
                    textField14.setText(" ");
                    textField15.setText(" ");
                    textField16.setText(" ");
                }
        }
    }
    private void query2(){

        regresarButton.addActionListener(e -> {
            MenuSecretaria menuSecretaria = new MenuSecretaria();
            menuSecretaria.setVisible(true);
            this.setVisible(false);
        });
    }

    public static ArrayList<Alumno> getElemento(){
        return lista;
    }
}
