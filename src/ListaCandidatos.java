import javax.swing.*;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class ListaCandidatos {

    private JFrame frame;
    private DefaultListModel<String> listModel;
    private JList<String> list;

    public ListaCandidatos(DefaultListModel<String> listModel) {
        this.listModel = listModel;
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(30, 144, 255));
        frame.setBounds(100, 100, 600, 500); // Ajustar dimensiones del frame
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Título de la ventana
        JLabel lblTitulo = new JLabel("Lista de Candidatos");
        lblTitulo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 26));
        lblTitulo.setBounds(180, 20, 300, 33);
        frame.getContentPane().add(lblTitulo);

        // Lista de candidatos
        list = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setBounds(50, 70, 500, 300); // Ajustar posición y tamaño
        frame.getContentPane().add(scrollPane);

        // Botones
        JButton btnEditar = new JButton("Editar");
        Color colorDefault = UIManager.getColor("Button.background");
        btnEditar.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		btnEditar.setBackground(new Color(0, 255, 0));
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        	btnEditar.setBackground(colorDefault);
        	}});
        btnEditar.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
        btnEditar.setBounds(100, 400, 150, 40);
        frame.getContentPane().add(btnEditar);

        JButton btnEliminar = new JButton("Eliminar");
        Color colorDefault2 = UIManager.getColor("Button.background");
        btnEliminar.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		btnEliminar.setBackground(Color.red);
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		btnEliminar.setBackground(colorDefault2);
        	}});
        btnEliminar.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
        btnEliminar.setBounds(350, 400, 150, 40);
        frame.getContentPane().add(btnEliminar);

        // Acciones de los botones
        btnEditar.addActionListener(e -> {
            int selectedIndex = list.getSelectedIndex();
            if (selectedIndex != -1) {
                String nuevoNombre = JOptionPane.showInputDialog("Editar nombre:", listModel.get(selectedIndex));
                if (nuevoNombre != null && !nuevoNombre.trim().isEmpty()) {
                    listModel.set(selectedIndex, nuevoNombre);
                    JOptionPane.showMessageDialog(frame, "Registro actualizado con éxito!");
                }
            }else {
                JOptionPane.showMessageDialog(frame, "Seleccione un registro antes de presionar el botón de editar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        btnEliminar.addActionListener(e -> {
            int selectedIndex = list.getSelectedIndex();
            if (selectedIndex != -1) {
                listModel.remove(selectedIndex);
                JOptionPane.showMessageDialog(frame, "Registro eliminado con éxito!");
            }else {
                JOptionPane.showMessageDialog(frame, "Seleccione un registro antes de presionar el botón de eliminar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public void mostrar() {
        frame.setVisible(true);
    }
}