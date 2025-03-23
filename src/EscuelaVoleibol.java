import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EscuelaVoleibol {

    private JFrame frame;
    private final JPanel panel = new JPanel();
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JTextField textField;
    private JRadioButton rdbtnNewRadioButton;
    private JRadioButton rdbtnNewRadioButton_1;
    private JRadioButton rdbtnNewRadioButton_2;
    private JRadioButton rdbtnNewRadioButton_3;
    private JButton btnNewButton;
    private JLabel lblNewLabel_5;
    private JPanel panel_2;
    private JList<String> list;
    private JButton btnNewButton_1;
    private JButton btnNewButton_2;
    private DefaultListModel<String> listModel; // Modelo para manipular el JList

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    EscuelaVoleibol window = new EscuelaVoleibol();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public EscuelaVoleibol() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 624, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        panel.setBackground(new Color(255, 228, 225));
        panel.setBounds(0, 0, 608, 511);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(60, 0, 480, 142);
        panel_1.setBackground(new Color(30, 144, 255));
        panel.add(panel_1);
        panel_1.setLayout(null);

        lblNewLabel = new JLabel("       Volleyball School");
        lblNewLabel.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblNewLabel.setText("  Formamos a los mejores");
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		lblNewLabel.setText("       Volleyball School");
        	}
        });
        lblNewLabel.setBounds(10, 47, 285, 31);
        lblNewLabel.setForeground(new Color(0, 0, 128));
        lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 23));
        panel_1.add(lblNewLabel);

        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(EscuelaVoleibol.class.getResource("/img/voleibol.png")));
        lblNewLabel_1.setBounds(291, 11, 134, 117);
        panel_1.add(lblNewLabel_1);

        lblNewLabel_2 = new JLabel("          Registro:");
        lblNewLabel_2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblNewLabel_2.setText("Empieza con nosotros");
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		lblNewLabel_2.setText("          Registro:");
        	}
        });
        lblNewLabel_2.setForeground(new Color(220, 20, 60));
        lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
        lblNewLabel_2.setBounds(37, 181, 204, 32);
        panel.add(lblNewLabel_2);

        lblNewLabel_3 = new JLabel("Nombre completo:");
        lblNewLabel_3.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblNewLabel_3.setText("Ingresa tu nombre");
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		lblNewLabel_3.setText("Nombre completo:");
        	}
        });
        lblNewLabel_3.setForeground(new Color(220, 20, 60));
        lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
        lblNewLabel_3.setBounds(22, 224, 126, 26);
        panel.add(lblNewLabel_3);

        lblNewLabel_4 = new JLabel("Elije una categoría:");
        lblNewLabel_4.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblNewLabel_4.setText("por rango de edad");
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		lblNewLabel_4.setText("Elije una categoría:");
        	}
        });
        lblNewLabel_4.setForeground(new Color(220, 20, 60));
        lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
        lblNewLabel_4.setBounds(22, 309, 126, 26);
        panel.add(lblNewLabel_4);

        textField = new JTextField();
        textField.setForeground(new Color(0, 0, 128));
        textField.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
        textField.setBounds(22, 261, 219, 26);
        panel.add(textField);
        textField.setColumns(10);

        rdbtnNewRadioButton = new JRadioButton("Pre-infantil(7-10)");
        rdbtnNewRadioButton.setForeground(new Color(0, 0, 128));
        rdbtnNewRadioButton.setBackground(new Color(30, 144, 255));
        rdbtnNewRadioButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
        rdbtnNewRadioButton.setBounds(22, 342, 137, 23);
        panel.add(rdbtnNewRadioButton);

        rdbtnNewRadioButton_1 = new JRadioButton("Infantil(10-13)");
        rdbtnNewRadioButton_1.setForeground(new Color(0, 0, 128));
        rdbtnNewRadioButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
        rdbtnNewRadioButton_1.setBackground(new Color(30, 144, 255));
        rdbtnNewRadioButton_1.setBounds(22, 368, 137, 23);
        panel.add(rdbtnNewRadioButton_1);

        rdbtnNewRadioButton_2 = new JRadioButton("Pre-Juvenil(14-17)");
        rdbtnNewRadioButton_2.setForeground(new Color(0, 0, 128));
        rdbtnNewRadioButton_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
        rdbtnNewRadioButton_2.setBackground(new Color(30, 144, 255));
        rdbtnNewRadioButton_2.setBounds(22, 394, 137, 23);
        panel.add(rdbtnNewRadioButton_2);

        rdbtnNewRadioButton_3 = new JRadioButton("Juvenil(18-25)");
        rdbtnNewRadioButton_3.setForeground(new Color(0, 0, 128));
        rdbtnNewRadioButton_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
        rdbtnNewRadioButton_3.setBackground(new Color(30, 144, 255));
        rdbtnNewRadioButton_3.setBounds(22, 420, 137, 23);
        panel.add(rdbtnNewRadioButton_3);

        // Agrupar los radio buttons para que solo uno pueda estar seleccionado
        ButtonGroup grupoCategorias = new ButtonGroup();
        grupoCategorias.add(rdbtnNewRadioButton);
        grupoCategorias.add(rdbtnNewRadioButton_1);
        grupoCategorias.add(rdbtnNewRadioButton_2);
        grupoCategorias.add(rdbtnNewRadioButton_3);

        btnNewButton = new JButton("Registrarse");
        Color colorDefault = UIManager.getColor("Button.background");
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		 btnNewButton.setBackground(new Color(30, 144, 255));
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		 btnNewButton.setBackground(colorDefault);
        	}
        });
        btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setBounds(72, 461, 110, 23);
        panel.add(btnNewButton);

        lblNewLabel_5 = new JLabel("Visualizar lista de inscritos:");
        lblNewLabel_5.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblNewLabel_5.setText("Heroes inscritos aquí");
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		lblNewLabel_5.setText("Visualizar lista de inscritos:");
        	}
        });
        lblNewLabel_5.setForeground(new Color(220, 20, 60));
        lblNewLabel_5.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
        lblNewLabel_5.setBounds(329, 187, 230, 20);
        panel.add(lblNewLabel_5);

        panel_2 = new JPanel();
        panel_2.setBounds(244, 231, 354, 219);
        panel.add(panel_2);
        panel_2.setLayout(null);

        // Inicializar el modelo para manipular el JList
        listModel = new DefaultListModel<>();

        btnNewButton_1 = new JButton("Modificar inscrito");
        Color colorDefault1 = UIManager.getColor("Button.background");
        btnNewButton_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		btnNewButton_1.setText("Redefine la categoría");
        		btnNewButton_1.setBackground(Color.yellow);
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		btnNewButton_1.setText("Modificar inscrito");
        		btnNewButton_1.setBackground(colorDefault1);
        	}
        });
        btnNewButton_1.setForeground(Color.BLACK);
        btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
        btnNewButton_1.setBounds(433, 461, 165, 23);
        panel.add(btnNewButton_1);

        btnNewButton_2 = new JButton("  Eliminar inscrito");
        Color colorDefault2 = UIManager.getColor("Button.background");
        btnNewButton_2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		 btnNewButton_2.setText("Selecciona cuál remover");
        		 btnNewButton_2.setBackground(Color.RED);
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		 btnNewButton_2.setText("  Eliminar inscrito");
        		 btnNewButton_2.setBackground(colorDefault2);
        	}
        });
        btnNewButton_2.setForeground(Color.BLACK);
        btnNewButton_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
        btnNewButton_2.setBounds(244, 461, 184, 23);
        panel.add(btnNewButton_2);
        list = new JList<>(listModel);
        list.setBounds(244, 230, 354, 219);
        panel.add(list);

        // Agregar funcionalidad al botón "Registrarse"
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = textField.getText().trim();
                String categoria = obtenerCategoriaSeleccionada();

                // Validar que el nombre y la categoría estén completos
                if (nombre.isEmpty() || categoria == null) {
                    JOptionPane.showMessageDialog(frame, "Debe ingresar su nombre y seleccionar una categoría.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                } else {
                    // Agregar el registro al JList
                    listModel.addElement(nombre + " - " + categoria);
                    textField.setText(""); // Limpiar el campo de nombre
                    limpiarSeleccionCategoria(); // Deseleccionar los radio buttons
                }
            }
        });

        // Agregar funcionalidad al botón "Eliminar inscrito"
        btnNewButton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = list.getSelectedIndex();
                if (selectedIndex != -1) { // si el usuario selecciona una de las opciones del JList
                    // Mostrar mensaje de confirmación
                    int confirmacion = JOptionPane.showConfirmDialog(frame, "¿Está seguro de eliminar este registro?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
                    if (confirmacion == JOptionPane.YES_OPTION) {
                        listModel.remove(selectedIndex); // Eliminar el registro del JList (utilizando un método de listModel)
                        JOptionPane.showMessageDialog(frame, "Registro eliminado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Seleccione un registro para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // Agregar funcionalidad al botón "Modificar inscrito"
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = list.getSelectedIndex();
                if (selectedIndex != -1) {
                    String registroActual = listModel.getElementAt(selectedIndex);
                    String nuevoRegistro = JOptionPane.showInputDialog(frame, "Editar registro:", registroActual);

                    if (nuevoRegistro != null && !nuevoRegistro.trim().isEmpty()) {
                        listModel.set(selectedIndex, nuevoRegistro); // Actualizar el registro
                        JOptionPane.showMessageDialog(frame, "Registro modificado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Seleccione un registro para modificar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    // Método para obtener la categoría seleccionada
    private String obtenerCategoriaSeleccionada() {
        if (rdbtnNewRadioButton.isSelected()) {
            return "Pre-infantil(7-10)";
        } else if (rdbtnNewRadioButton_1.isSelected()) {
            return "Infantil(10-13)";
        } else if (rdbtnNewRadioButton_2.isSelected()) {
            return "Pre-Juvenil(14-17)";
        } else if (rdbtnNewRadioButton_3.isSelected()) {
            return "Juvenil(18-25)";
        } else {
            return null; // No se ha seleccionado ninguna categoría
        }
    }

    // Método para limpiar la selección de categoría
    private void limpiarSeleccionCategoria() {
        rdbtnNewRadioButton.setSelected(false);
        rdbtnNewRadioButton_1.setSelected(false);
        rdbtnNewRadioButton_2.setSelected(false);
        rdbtnNewRadioButton_3.setSelected(false);
    }
}
