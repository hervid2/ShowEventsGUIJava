import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AtraccionesMecanicas {

    private JFrame frame;
    private JTextField textField;
    private int atraccionSeleccionada = -1;
    private int precioActual = 0;
    private String[] nombresAtracciones = {
        "Montaña Rusa", "Rueda de la Fortuna", 
        "Carrusel", "Torre de Caída", 
        "Laberinto", "Casa del Terror",
        "Tren Fantasma", "Sillas Voladoras",
        "Barco Pirata", "Autos Chocones",
        "Tobogán Acuático", "Péndulo"
    };
    private int[] preciosAtracciones = {15, 10, 8, 12, 10, 12, 10, 8, 10, 8, 12, 15};

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AtraccionesMecanicas window = new AtraccionesMecanicas();
                    window.mostrar(); // Usamos el método mostrar() aquí también
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AtraccionesMecanicas() {
        initialize();
    }

    // Método nuevo para mostrar la ventana
    public void mostrar() {
        frame.setVisible(true);
    }

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
        panel_3.setBounds(0, 201, 367, 435);
        panel_3.setBackground(Color.BLACK);
        panel.add(panel_3);
        panel_3.setLayout(new GridLayout(2, 6, 5, 5));
        
        for (int i = 0; i < 12; i++) {
            JPanel panelAtraccion = new JPanel();
            panelAtraccion.setBackground(Color.BLACK);
            panelAtraccion.setLayout(new BorderLayout());
            
            JLabel lblAtraccion = new JLabel(new ImageIcon(AtraccionesMecanicas.class.getResource("/img/atraccion" + (i+1) + ".png")));
            lblAtraccion.setHorizontalAlignment(SwingConstants.CENTER);
            panelAtraccion.add(lblAtraccion, BorderLayout.CENTER);
            
            JLabel lblNombre = new JLabel(nombresAtracciones[i], SwingConstants.CENTER);
            lblNombre.setForeground(Color.WHITE);
            panelAtraccion.add(lblNombre, BorderLayout.SOUTH);
            
            final int index = i;
            panelAtraccion.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    seleccionarAtraccion(index, preciosAtracciones[index]);
                }
            });
            
            panel_3.add(panelAtraccion);
        }
        
        JPanel panel_4 = new JPanel();
        panel_4.setBounds(365, 159, 236, 467);
        panel_4.setBackground(Color.DARK_GRAY);
        panel.add(panel_4);
        panel_4.setLayout(null);
        
        JLabel lblSeleccioneLaCantidad = new JLabel("Cantidad de boletos:");
        lblSeleccioneLaCantidad.setBounds(10, 23, 165, 52);
        lblSeleccioneLaCantidad.setForeground(Color.WHITE);
        lblSeleccioneLaCantidad.setFont(new Font("Yu Gothic Medium", Font.BOLD, 15));
        panel_4.add(lblSeleccioneLaCantidad);
        
        int maximoBoletos = 100;
        Integer[] cantidadBoletos = new Integer[maximoBoletos];
        for (int i = 0; i < maximoBoletos; i++) {
            cantidadBoletos[i] = i + 1;
        }
        
        JComboBox<Integer> comboBox = new JComboBox<>(cantidadBoletos);
        comboBox.setMaximumRowCount(100);
        comboBox.setBounds(164, 36, 57, 22);
        comboBox.addActionListener(e -> {
            if (atraccionSeleccionada != -1) {
                actualizarTotal();
            }
        });
        panel_4.add(comboBox);
        
        JTextArea txtrElPrecioDe = new JTextArea();
        txtrElPrecioDe.setText("El precio de cada boleto es de\r\n$10.00 y con cada uno puedes \r\ndisfrutar de cualquier juego\r\nsolo por una vez (abajo verás\r\nel total a pagar por todos los \r\nboletos comprados).");
        txtrElPrecioDe.setFont(new Font("Yu Gothic Light", Font.BOLD, 15));
        txtrElPrecioDe.setForeground(new Color(255, 255, 255));
        txtrElPrecioDe.setBackground(Color.DARK_GRAY);
        txtrElPrecioDe.setBounds(10, 85, 216, 154);
        panel_4.add(txtrElPrecioDe);
        
        JLabel lblTotalAPagar = new JLabel("Total a pagar:");
        lblTotalAPagar.setForeground(Color.WHITE);
        lblTotalAPagar.setFont(new Font("Yu Gothic Medium", Font.BOLD, 15));
        lblTotalAPagar.setBounds(10, 262, 165, 52);
        panel_4.add(lblTotalAPagar);
        
        textField = new JTextField();
        textField.setBounds(125, 272, 96, 29);
        panel_4.add(textField);
        textField.setColumns(10);
        
        JButton btnComprar = new JButton("Comprar");
        btnComprar.addActionListener(e -> {
            if (atraccionSeleccionada == -1) {
                JOptionPane.showMessageDialog(frame, "Por favor seleccione una atracción", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            int cantidad = (int) comboBox.getSelectedItem();
            int total = cantidad * precioActual;
            
            JOptionPane.showMessageDialog(frame, 
                "Compra exitosa!\n" +
                "Atracción: " + nombresAtracciones[atraccionSeleccionada] + "\n" +
                "Cantidad: " + cantidad + " boletos\n" +
                "Total: $" + total,
                "Éxito",
                JOptionPane.INFORMATION_MESSAGE);
        });
        btnComprar.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
        btnComprar.setBounds(50, 362, 125, 33);
        panel_4.add(btnComprar);
        
        JLabel lblSeleccioneUnaAtraccin = new JLabel("Seleccione una atracción:");
        lblSeleccioneUnaAtraccin.setBounds(51, 159, 267, 52);
        lblSeleccioneUnaAtraccin.setForeground(Color.WHITE);
        lblSeleccioneUnaAtraccin.setFont(new Font("Yu Gothic Medium", Font.BOLD, 20));
        panel.add(lblSeleccioneUnaAtraccin);
    }
    
    private void seleccionarAtraccion(int index, int precio) {
        this.atraccionSeleccionada = index;
        this.precioActual = precio;
        actualizarTotal();
    }
    
    private void actualizarTotal() {
        JComboBox<Integer> comboBox = (JComboBox<Integer>) frame.getContentPane().getComponent(0)
            .getComponentAt(365, 159).getComponentAt(164, 36);
        int cantidad = (int) comboBox.getSelectedItem();
        int total = cantidad * precioActual;
        textField.setText("$" + total);
    }
}