package Ejercicio3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Miniencuesta extends JFrame {

	// Nombre de las variables que le hemos asignado a los diferentes elementos del diseño
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Miniencuesta frame = new Miniencuesta();
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
	public Miniencuesta() {
		// Añadimos titulo
		setTitle("Mini Encuesta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Creamos el componente
		JLabel so = new JLabel("Elije un sistema operativo ");
		so.setBounds(33, 6, 180, 16);
		contentPane.add(so);

		// Creamos la clase encargada de implementar un radiobutton
		// En el SO solo nos permitira escoger una opcion
		JRadioButton Windows = new JRadioButton("Windows");
		buttonGroup.add(Windows);
		Windows.setBounds(33, 25, 141, 41);
		contentPane.add(Windows);

		JRadioButton Linux = new JRadioButton("Linux");
		buttonGroup.add(Linux);
		Linux.setBounds(33, 61, 141, 23);
		contentPane.add(Linux);

		JRadioButton Mac = new JRadioButton("Mac");
		buttonGroup.add(Mac);
		Mac.setBounds(33, 88, 141, 23);
		contentPane.add(Mac);

		// Creamos el componente
		JLabel Especialidad = new JLabel("Especialidad");
		Especialidad.setBounds(250, 6, 141, 16);
		contentPane.add(Especialidad);

		// Creamos unas casillas de verificacion
		// A diferencia de el boton, nos deja seleccionar mas de una opcion
		JCheckBox programacion = new JCheckBox("Programacion");
		programacion.setBounds(246, 34, 128, 23);
		contentPane.add(programacion);

		JCheckBox diseñografico = new JCheckBox("Diseño gráfico");
		diseñografico.setBounds(246, 58, 128, 29);
		contentPane.add(diseñografico);

		JCheckBox administracion = new JCheckBox("Administración");
		administracion.setBounds(246, 88, 128, 23);
		contentPane.add(administracion);

		JLabel horasdedicadas = new JLabel("Horas dedicadas en el ordenador");
		horasdedicadas.setBounds(103, 134, 221, 16);
		contentPane.add(horasdedicadas);

		JSlider slider = new JSlider();
		slider.setMaximum(10);
		slider.setBounds(113, 161, 190, 29);
		contentPane.add(slider);

		// Creamos el componente, en este caso el boton desencadenara cierta acción
		JButton Enviar = new JButton("Enviar");
		Enviar.addActionListener(new ActionListener() {
			// Metodo donde llama a la acción
			public void actionPerformed(ActionEvent e) {

				// Creamos dos Strings para poder recorrer/comparar la cadena
				// Cuando coincida nos indicara que esa opcion es la seleccionada
				String so;
				if (Windows.isSelected()) {
					so = "Windows";
				} else if (Linux.isSelected()) {
					so = "Linux";
				} else {
					so = "Mac";
				}

				String specialty = "";
				if (programacion.isSelected()) {
					specialty += "Programacion ";
				}
				if (diseñografico.isSelected()) {
					specialty += " Diseño Grafico ";
				}
				if (administracion.isSelected()) {
					specialty += " Administración";
				}

				// Mostramos el resultado de los datos introducidos por el usuario
				JOptionPane.showMessageDialog(null, "Los datos introducidos son:" + "\nSistema operativo: " + so
						+ "\nEspecialidad: " + specialty + "\nHoras en el ordenador: " + slider.getValue());

			}
		});
		Enviar.setBounds(149, 207, 117, 29);
		contentPane.add(Enviar);

	}
}
