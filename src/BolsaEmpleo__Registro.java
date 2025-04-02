import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BolsaEmpleo__Registro {

    private JFrame frame;
    private JTextField textFieldNombre;
    private JTextField textFieldProfesion;
    private JComboBox<String> comboBoxExperiencia;
    private DefaultListModel<String> listaCandidatosModel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BolsaEmpleo__Registro window = new BolsaEmpleo__Registro();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public BolsaEmpleo__Registro() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 623, 523);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 607, 484);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JPanel panelTitulo = new JPanel();
        panelTitulo.setBackground(new Color(0, 255, 0));
        panelTitulo.setBounds(0, 0, 617, 139);
        panel.add(panelTitulo);
        panelTitulo.setLayout(null);

        JLabel lblTitulo = new JLabel("Bolsa de empleo");
        lblTitulo.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblTitulo.setText("Tu mejor opción");
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		lblTitulo.setText("Bolsa de empleo");
        	}
        });
        lblTitulo.setForeground(new Color(255, 255, 255));
        lblTitulo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 38));
        lblTitulo.setBounds(190, 41, 321, 49);
        panelTitulo.add(lblTitulo);

        JLabel lblIcono = new JLabel("");
        lblIcono.setIcon(new ImageIcon(BolsaEmpleo__Registro.class.getResource("/img/bolsa-de-dinero.png")));
        lblIcono.setBounds(45, 10, 128, 121);
        panelTitulo.add(lblIcono);

        JPanel panelRegistro = new JPanel();
        panelRegistro.setBackground(new Color(255, 255, 255));
        panelRegistro.setBounds(0, 138, 607, 346);
        panel.add(panelRegistro);
        panelRegistro.setLayout(null);

        JLabel lblRegistro = new JLabel("                     Registro");
        lblRegistro.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblRegistro.setText("Empieza a trabajar con nosotros");
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		lblRegistro.setText("                     Registro");
        	}
        });
        lblRegistro.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
        lblRegistro.setBounds(78, 11, 453, 55);
        panelRegistro.add(lblRegistro);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
        lblNombre.setBounds(78, 89, 96, 27);
        panelRegistro.add(lblNombre);

        textFieldNombre = new JTextField();
        textFieldNombre.setToolTipText("Por favor ingresa tu nombre completo");
        textFieldNombre.setBounds(309, 89, 222, 28);
        panelRegistro.add(textFieldNombre);
        textFieldNombre.setColumns(10);

        JLabel lblProfesion = new JLabel("Profesión:");
        lblProfesion.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
        lblProfesion.setBounds(78, 136, 96, 27);
        panelRegistro.add(lblProfesion);

        textFieldProfesion = new JTextField();
        textFieldProfesion.setToolTipText("Por favor ingresa el nombre de tu profesión");
        textFieldProfesion.setBounds(309, 135, 222, 28);
        panelRegistro.add(textFieldProfesion);
        textFieldProfesion.setColumns(10);

        JLabel lblExperiencia = new JLabel("Nivel de experiencia:");
        lblExperiencia.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
        lblExperiencia.setBounds(78, 187, 201, 27);
        panelRegistro.add(lblExperiencia);

        comboBoxExperiencia = new JComboBox<>();
        comboBoxExperiencia.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
        comboBoxExperiencia.setModel(new DefaultComboBoxModel<>(new String[]{"Por favor seleccione...", "Menor a un año", "1 a 3 años", "4 o más", "Sin experiencia previa"}));
        comboBoxExperiencia.setBounds(309, 186, 222, 29);
        panelRegistro.add(comboBoxExperiencia);

        JButton btnEnviar = new JButton("Enviar");
        Color colorDefault = UIManager.getColor("Button.background");
        btnEnviar.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		btnEnviar.setBackground(new Color(0, 255, 0));
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		btnEnviar.setBackground(colorDefault);
        	}
        });
        btnEnviar.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
        btnEnviar.setBounds(123, 258, 134, 45);
        panelRegistro.add(btnEnviar);

        JButton btnLista = new JButton("Ver Lista");
        Color colorDefault1 = UIManager.getColor("Button.background");
        btnLista.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		btnLista.setBackground(new Color(30, 144, 255));
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		btnLista.setBackground(colorDefault1);
        	}
        });
        btnLista.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
        btnLista.setBounds(300, 258, 134, 45);
        panelRegistro.add(btnLista);
        
        // Acciones y funcionalidad de los botones
        listaCandidatosModel = new DefaultListModel<>();
        btnEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = textFieldNombre.getText().trim();
                String profesion = textFieldProfesion.getText().trim();
                String experiencia = (String) comboBoxExperiencia.getSelectedItem();

                // Validar campos
                if (nombre.isEmpty() || profesion.isEmpty() || "Por favor seleccione...".equals(experiencia)) {
                    JOptionPane.showMessageDialog(frame, "Todos los campos deben ser completados.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Agregar candidato a la lista
                    String candidato = nombre + " - " + profesion + " - " + experiencia;
                    listaCandidatosModel.addElement(candidato);
                    textFieldNombre.setText("");
                    textFieldProfesion.setText("");
                    comboBoxExperiencia.setSelectedIndex(0);
                    JOptionPane.showMessageDialog(frame, "Registro completado con éxito!");
                }
            }
        });

        btnLista.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mostrar la ventana de lista de candidatos
                new ListaCandidatos(listaCandidatosModel).mostrar();
            }
        });
    }
}