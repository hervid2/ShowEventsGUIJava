import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpringLayout;
import javax.swing.JButton;

public class RegistroParque extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroParque frame = new RegistroParque();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistroParque() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 422, 463);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Atracciones Mecánicas");
		lblNewLabel.setBounds(32, 11, 355, 52);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 30));
		panel.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 61, 422, 2);
		panel.add(separator);
		
		JLabel lblRegistro = new JLabel("Registro");
		lblRegistro.setBounds(139, 71, 137, 52);
		lblRegistro.setForeground(Color.WHITE);
		lblRegistro.setFont(new Font("Yu Gothic Medium", Font.BOLD, 30));
		panel.add(lblRegistro);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(130, 109, 146, 138);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(RegistroParque.class.getResource("/img/carnaval.png")));
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(47, 277, 83, 33);
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Yu Gothic Medium", Font.BOLD, 20));
		panel.add(lblNombre);
		
		JLabel lblIdentificacin = new JLabel("Identificación:");
		lblIdentificacin.setBounds(47, 321, 146, 33);
		lblIdentificacin.setForeground(Color.WHITE);
		lblIdentificacin.setFont(new Font("Yu Gothic Medium", Font.BOLD, 20));
		panel.add(lblIdentificacin);
		
		textField = new JTextField();
		textField.setBounds(221, 281, 166, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(221, 325, 166, 20);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		JLabel lblTipoDocumento = new JLabel("Tipo documento:");
		lblTipoDocumento.setBounds(47, 363, 166, 33);
		lblTipoDocumento.setForeground(Color.WHITE);
		lblTipoDocumento.setFont(new Font("Yu Gothic Medium", Font.BOLD, 20));
		panel.add(lblTipoDocumento);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		comboBox.setBounds(221, 366, 166, 22);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccione...", "Cédula de ciudadanía", "Tarjeta de identidad", "Pasaporte", "Cédula de extranjería"}));
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		btnNewButton.setBounds(139, 419, 125, 33);
		panel.add(btnNewButton);
	}
}
