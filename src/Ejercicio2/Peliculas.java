package Ejercicio2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Peliculas extends JFrame {

	// Nombre de las variables que le hemos asignado a los diferentes elementos del diseño
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Peliculas frame = new Peliculas();
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
	public Peliculas() {
		
		// Añadimos titulo
		setTitle("Peliculas");
		// Cuando se cierre la ventana, se acabará la aplicacion
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Coordenadas x y de la aplicacion, su altura y longitud
		setBounds(100, 100, 450, 300);
		// Creamos el panel
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		// Asignamos el panel a la ventana
		setContentPane(contentPane);
		// Indicamos su diseño
		contentPane.setLayout(null);

		// Creamos el componente
		JLabel lblNewLabel = new JLabel("Escribe el título de una película");
		// Coordenadas x y de la aplicacion, su altura y longitud
		lblNewLabel.setBounds(30, 62, 211, 31);
		// Añade la información del componente, lo que nos proporciona el usuario
		contentPane.add(lblNewLabel);

		// Campo de texto
		textField = new JTextField();
		textField.setBounds(30, 93, 211, 38);
		contentPane.add(textField);
		textField.setColumns(10);

		// Creamos el componente
		JComboBox comboBox = new JComboBox();
		// Permite seleccionar un String (nombre de la pelicula) de la lista
		comboBox.setBounds(259, 98, 152, 31);
		contentPane.add(comboBox);

		// Creamos el componente
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.setBounds(80, 133, 117, 29);
		btnNewButton.addActionListener(new ActionListener() {
			// Metodo donde llama a la acción
			public void actionPerformed(ActionEvent e) {
				// Creamos un string para que se guarde el titulo de la pelicula
				String pelicula = textField.getText();
				// Añade al titulo a el desplegable
				comboBox.addItem(pelicula);
			}
		});
		String pelicula = textField.getText();
		contentPane.add(btnNewButton);

		// Creamos el componente
		JLabel lblNewLabel_1 = new JLabel("Películas");
		lblNewLabel_1.setBounds(262, 66, 117, 22);
		contentPane.add(lblNewLabel_1);

	}
}
