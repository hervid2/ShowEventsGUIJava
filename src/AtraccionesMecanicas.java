

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.JComboBox;

public class AtraccionesMecanicas {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtraccionesMecanicas window = new AtraccionesMecanicas();
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
	public AtraccionesMecanicas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 617, 664);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 601, 625);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 601, 159);
		panel_1.setBackground(Color.BLACK);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Atracciones Mecánicas");
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(221, 24, 355, 52);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(29, 11, 151, 138);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(AtraccionesMecanicas.class.getResource("/img/carnaval.png")));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 203, 367, 435);
		panel_3.setBackground(Color.BLACK);
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(3, 2, 1, 1));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(365, 159, 236, 467);
		panel_4.setBackground(Color.DARK_GRAY);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblSeleccioneLaCantidad = new JLabel("Cantidad de boletos:");
		lblSeleccioneLaCantidad.setBounds(0, 23, 154, 52);
		lblSeleccioneLaCantidad.setForeground(Color.WHITE);
		lblSeleccioneLaCantidad.setFont(new Font("Yu Gothic Medium", Font.BOLD, 15));
		panel_4.add(lblSeleccioneLaCantidad);
		
		// Definir el máximo de boletos
		int maximoBoletos = 100;
		
		//Crear un array de boletos
		Integer[] cantidadBoletos = new Integer[maximoBoletos];
		for (int i = 0; i <= maximoBoletos; i++){
			cantidadBoletos[i] ++;
		}
		
		// ComboBox de Boletos
		JComboBox<Integer> comboBox = new JComboBox<>(cantidadBoletos);
		comboBox.setMaximumRowCount(100);
		comboBox.setBounds(164, 36, 57, 22);
		panel_4.add(comboBox);
		
		JLabel lblSeleccioneUnaAtraccin = new JLabel("Seleccione una atracción:");
		lblSeleccioneUnaAtraccin.setBounds(51, 159, 267, 52);
		lblSeleccioneUnaAtraccin.setForeground(Color.WHITE);
		lblSeleccioneUnaAtraccin.setFont(new Font("Yu Gothic Medium", Font.BOLD, 20));
		panel.add(lblSeleccioneUnaAtraccin);
	}
}
