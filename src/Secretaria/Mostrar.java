package Secretaria;
        import Pojo.Alumno;

        import javax.swing.*;
        import java.awt.*;
        import java.util.ArrayList;
public class Mostrar extends JFrame {
    private static ArrayList<Alumno> alumnos=new ArrayList<>();
    private JList<Alumno> jLista;
    private JButton btnMostrar, btnRegresar;
    private DefaultListModel<Alumno> elementosModel;
    private JPanel panelList, panelButton, panelContainer;

    public Mostrar() {
        initControl();
        setControl();
        configPanel();
        setupFrame();

        showList();
        regresar();
    }

    private void showList() {
        btnMostrar.addActionListener(e -> {
            elementosModel = new DefaultListModel<>();
            ArrayList<Alumno> estudiantes1 = Registrar.getElemento();
            if (!estudiantes1.isEmpty()) {
                for (Alumno estudiante : estudiantes1) {
                    elementosModel.addElement(estudiante);
                    System.out.println(estudiante);
                }
            }
            jLista.setModel(elementosModel);
        });
    }
    private void regresar() {
        btnRegresar.addActionListener(e -> {
            this.setVisible(false);
            new MenuSecretaria().setVisible(true);
        });
    }

    private void initControl() {
        jLista = new JList<>();
        panelButton = new JPanel();
        panelList = new JPanel();
        panelContainer = new JPanel();
        btnMostrar = new JButton();
        btnRegresar = new JButton();
    }

    private void setupFrame() {
        setTitle("Mostrar");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(1200, 460);
        add(panelContainer);

    }

    private void setControl() {
        btnMostrar.setText("Mostrar");
        btnRegresar.setText("Regresar");
    }

    private void configPanel() {
        panelList.setLayout(new GridLayout(1, 0));
        panelList.add(jLista);
        panelList.setPreferredSize(new Dimension(1100, 300));

        panelButton.setLayout(new FlowLayout());
        panelButton.setPreferredSize(new Dimension(500, 50));
        panelButton.add(btnMostrar);
        panelButton.add(btnRegresar);

        panelContainer.setLayout(new GridLayout(2, 0));
        panelContainer.add(panelList);
        panelContainer.add(panelButton);
    }
}
