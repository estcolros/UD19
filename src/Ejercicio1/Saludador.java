package Ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Saludador extends JFrame {

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
					Saludador frame = new Saludador();
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
	public Saludador() {
		
		// Añade un título
		setTitle("Saludador");
		// Cuando se cierre la ventana, se acabará la aplicacion
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Coordenadas x y de la aplicacion, su altura y longitud
		setBounds(100, 100, 450, 300);
		// Creamos el panel
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		// Asigno el panel a la ventana
		setContentPane(contentPane);
		// Indicamos su diseño
		contentPane.setLayout(null);

		// Creamos el componente
		JLabel lblNewLabel = new JLabel("Escribe un nombre para saludar");
		// Coordenadas x y de la aplicacion, su altura y longitud
		lblNewLabel.setBounds(50, 81, 361, 16);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		// Se añade la info al panel
		contentPane.add(lblNewLabel);

		// Creamos el componente
		JButton btnNewButton = new JButton("¡Saludar!");
		btnNewButton.addActionListener(new ActionListener() {
			// Metodo donde llama a la acción
			public void actionPerformed(ActionEvent e) {
				// Creamos un string para que se guarde el nombre
				String nombre = textField.getText();
				// Mostramos el mensaje con el nombre introducido
				JOptionPane.showMessageDialog(contentPane, "¡Hola " + nombre + "!");
			}
		});
		
		// Dimensiones boton
		btnNewButton.setBounds(174, 147, 117, 29);
		// Boton
		contentPane.add(btnNewButton);
		// Campo de texto
		textField = new JTextField();
		// Dimensiones campo de texto
		textField.setBounds(145, 109, 167, 26);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
