import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class ShowEvents {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowEvents window = new ShowEvents();
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
	public ShowEvents() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 556);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 584, 517);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Show Events");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel.setText("Se activa cuando haces clic al mouse");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setText("Se activa cuando pasas el mouse por el componente");

			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setText("se activa cuando se quita el mouse");
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblNewLabel.setText("Se activa mantienes presionado el mouse");
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblNewLabel.setText("se activa cuando presiono y luego suelto el componente");
			}
		});
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 17));
		lblNewLabel.setBounds(32, 11, 485, 34);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("botón");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBackground(Color.magenta);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(null);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnNewButton.setFont(new Font("Arial",Font.BOLD, 20));
				btnNewButton.setBackground(Color.GREEN);
			}
		
			@Override
			public void mouseReleased(MouseEvent e) {
				btnNewButton.setFont(new Font("Arial", Font.PLAIN, 15));
				btnNewButton.setBackground(Color.ORANGE);
			
			}
		});
		btnNewButton.setBounds(217, 96, 105, 42);
		panel.add(btnNewButton);
	}
}
