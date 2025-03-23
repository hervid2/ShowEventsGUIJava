import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class CentroOdontológico {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CentroOdontológico window = new CentroOdontológico();
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
	public CentroOdontológico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Centro Odontológico");
		frame.setBounds(100, 100, 677, 608);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panel.setBounds(0, 0, 661, 569);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.info);
		panel_1.setBounds(0, 0, 661, 56);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido a su centro odontológico!");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setText("Su mejor opción en salud dental!");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setText("Bienvenido a su centro odontológico!");
			}
		});
		lblNewLabel.setBounds(159, 11, 343, 27);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(169, 169, 169));
		panel_2.setBounds(0, 56, 661, 513);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(323, 87, 272, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Sistema de reserva de citas");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setText("Ingrese los registros del formulario");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setText("Sistema de reserva de citas");
			}
		});
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		lblNewLabel_1.setBounds(187, 27, 309, 30);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ingrese su nombre completo:");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_2.setText("Solo se aceptan caracteres alfabéticos");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_2.setText("Ingrese su nombre completo:");
			}
		});
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblNewLabel_2.setBounds(26, 84, 272, 20);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Seleccione el tipo de cita:");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_3.setText("Escoja una opcion del desplegable:");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_3.setText("Seleccione el tipo de cita:");
			}
		});
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblNewLabel_3.setBounds(26, 146, 272, 20);
		panel_2.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {
				"Seleccione...",
				"Higiene oral", 
				"Radiografía dental",
				"Revisión Periodontal",
				"Ortodoncia",
				"Estética Dental",
				"Protesis",
				"Halitosis",
				"Sensibilidad Dental"
				}));
		comboBox.setBounds(323, 148, 272, 22);
		panel_2.add(comboBox);
		
		JButton btnNewButton = new JButton("Registrar cita");
		Color ColorInicial = UIManager.getColor("Button.background");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBackground(SystemColor.info);
				btnNewButton.setText("Agendará su cita");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(ColorInicial);
				btnNewButton.setText("Registrar cita");
			}
		});
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Validar que el campo de texto no esté vacío
                if (textField.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Por favor ingrese su nombre completo.", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Detener la ejecución si el campo está vacío
                }

                // Validar que se haya seleccionado una opción válida en el JComboBox
                if (comboBox.getSelectedIndex() == 0) { // "Seleccione..." es el índice 0
                    JOptionPane.showMessageDialog(frame, "Por favor seleccione un tipo de cita válido.", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Detener la ejecución si no se selecciona una cita válida
                }

                // Si todo está correcto, mostrar mensaje de éxito
                JOptionPane.showMessageDialog(frame, "Cita reservada con éxito!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            }
        });
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		btnNewButton.setBounds(246, 326, 163, 38);
		panel_2.add(btnNewButton);
	}
}
