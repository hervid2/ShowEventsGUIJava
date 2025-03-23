import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PedidosClientes {

    private JFrame frame;
    private JComboBox<String> comboBox;
    private JList<String> list;
    private DefaultListModel<String> listModel; // Se usa para manipular los elementos del JList

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PedidosClientes window = new PedidosClientes();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public PedidosClientes() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 624, 556);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(250, 250, 210));
        panel.setBounds(0, 0, 608, 517);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 140, 0));
        panel_1.setBounds(161, 0, 271, 158);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel = new JLabel("           Panadería");
        lblNewLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lblNewLabel.setText("   Del horno a tu mesa");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblNewLabel.setText("           Panadería");
            }
        });
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBackground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
        lblNewLabel.setBounds(20, 11, 230, 55);
        panel_1.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(PedidosClientes.class.getResource("/img/un-pan.png")));
        lblNewLabel_1.setBounds(101, 49, 81, 86);
        panel_1.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("    Seleccione su pedido:");
        lblNewLabel_2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblNewLabel_2.setText("Elija de la lista desplegable");
        	}
        	 @Override
             public void mouseExited(MouseEvent e) {
                 lblNewLabel_2.setText("    Seleccione su pedido:");
             }
        });
        lblNewLabel_2.setForeground(new Color(105, 105, 105));
        lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
        lblNewLabel_2.setBounds(57, 194, 208, 42);
        panel.add(lblNewLabel_2);

        comboBox = new JComboBox<>();
        comboBox.setModel(new DefaultComboBoxModel<>(new String[]{"Seleccione su pedido...", "Brazo de reina", "Brownie", "Empanada de Pollo", "Empanada de Carne", "Croissant", "Pan cascarita pequeño", "Pan cascarita grande", "Pan chino", "Pan integral", "Pan Francés pequeño", "Pan Francés Grande", "Pan de leche", "Pan de coco", "Pan de queso", "Pan de queso y Jamón", "Pan de frutas", "Pan siete cereales", "Tostado", "Tostadas"}));
        comboBox.setBounds(47, 236, 218, 32);
        panel.add(comboBox);
        
        // Agregar funcionalidad al JComboBox para agregar elementos al JList
        comboBox.addActionListener(e -> {
            String selectedItem = (String) comboBox.getSelectedItem();
            if (selectedItem != null && !selectedItem.equals("Seleccione su pedido...")) {
                listModel.addElement(selectedItem);
            }
        });

        JLabel lblNewLabel_3 = new JLabel("Canasta de compras");
        lblNewLabel_3.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblNewLabel_3.setText("Aquí se apila su pedido");
        	}
        	 @Override
             public void mouseExited(MouseEvent e) {
                 lblNewLabel_3.setText("Canasta de compras");
             }
        });
        lblNewLabel_3.setIcon(new ImageIcon(PedidosClientes.class.getResource("/img/cesta-de-la-compra.png")));
        lblNewLabel_3.setForeground(new Color(105, 105, 105));
        lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
        lblNewLabel_3.setBounds(331, 199, 218, 32);
        panel.add(lblNewLabel_3);

        JPanel panel_2 = new JPanel();
        panel_2.setBounds(331, 236, 218, 188);
        panel.add(panel_2);
        panel_2.setLayout(null);

        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);
        list.setBounds(331, 236, 218, 188);
        panel.add(list);

        JButton btnNewButton = new JButton("Remover artículo");
        Color colorDefecto = UIManager.getColor("Button.background");
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		btnNewButton.setBackground(Color.RED);
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		btnNewButton.setBackground(colorDefecto);
        	}
        });
        btnNewButton.setForeground(new Color(105, 105, 105));
        btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
        btnNewButton.setBounds(331, 452, 218, 32);
        panel.add(btnNewButton);
        
        // Agregar funcionalidad al botón "Remover artículo"
        btnNewButton.addActionListener(e -> {
            int selectedIndex = list.getSelectedIndex();
            if (selectedIndex != -1) {
                listModel.remove(selectedIndex);
            } else {
                JOptionPane.showMessageDialog(frame, "Seleccione un artículo para remover.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        });

        JButton btnRealizarCompra = new JButton("Realizar compra");
        Color colorDefecto1 = UIManager.getColor("Button.background");
        btnRealizarCompra.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		btnRealizarCompra.setBackground(Color.GREEN);
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		btnRealizarCompra.setBackground(colorDefecto1);
        	}
        });
        btnRealizarCompra.setForeground(new Color(105, 105, 105));
        btnRealizarCompra.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
        btnRealizarCompra.setBounds(47, 452, 218, 32);
        panel.add(btnRealizarCompra);

        // Agregar funcionalidad al botón "Realizar compra"
        btnRealizarCompra.addActionListener(e -> {
            if (listModel.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Debe agregar al menos un artículo para realizar la compra.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "Compra realizada con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                listModel.clear(); // Limpiar la lista después de la compra
            }
        });
    }
}