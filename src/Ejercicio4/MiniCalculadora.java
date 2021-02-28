package Ejercicio4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MiniCalculadora extends JFrame {

	// Nombre de las variables que le hemos asignado a los diferentes elementos del diseño
	private JPanel contentPane;
	private JTextField operador;
	private JTextField mostrarresultado;
	private JTextField operadordos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniCalculadora frame = new MiniCalculadora();
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
	public MiniCalculadora() {
		//Añadimos titulo
		setTitle("Mini Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		operador = new JTextField();
		operador.setBounds(16, 48, 118, 26);
		contentPane.add(operador);
		operador.setColumns(10);

		mostrarresultado = new JTextField();
		mostrarresultado.setBounds(16, 114, 259, 85);
		contentPane.add(mostrarresultado);
		mostrarresultado.setColumns(10);
		
		// Creamos los componente y guardamos informacion
		JLabel Numero1 = new JLabel("Numero 1");
		Numero1.setBounds(16, 29, 118, 16);
		contentPane.add(Numero1);

		JLabel Numero2 = new JLabel("Numero 2");
		Numero2.setBounds(157, 29, 118, 16);
		contentPane.add(Numero2);

		JLabel operaciones = new JLabel("Operaciones");
		operaciones.setBounds(320, 29, 118, 16);
		contentPane.add(operaciones);

		JLabel resultado = new JLabel("Resultado");
		resultado.setBounds(16, 86, 118, 16);
		contentPane.add(resultado);

		// Creamos los componentes, en estos casos el boton desencadenara cierta acción
		//Boton Suma
		JButton suma = new JButton("+");
		suma.addActionListener(new ActionListener() {
			// Metodo donde llama a la acción
			public void actionPerformed(ActionEvent e) {
				//Cogemos la informacion del campo correspondiente 
				//Asignamos informacion tanto al operador1/2
				Double operador1 = Double.parseDouble(operador.getText());
				Double operador2 = Double.parseDouble(operadordos.getText());
				//Definimos un String para poder realizar la operacion con su respectiva informacion
				String resultado = String.valueOf(operador1 + operador2);
				//Mostramos el resultado
				mostrarresultado.setText(resultado);
			}
		});
		suma.setBounds(320, 53, 43, 37);
		contentPane.add(suma);
		
		//Mismo procedimiento que el anterior metodo (suma) pero cambiando las operaciones
		//Boton Resta
		JButton resta = new JButton("-");
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double operador1 = Double.parseDouble(operador.getText());
				Double operador2 = Double.parseDouble(operadordos.getText());
				String resultado = String.valueOf(operador1 - operador2);
				mostrarresultado.setText(resultado);
			}
		});
		resta.setBounds(320, 102, 43, 37);
		contentPane.add(resta);

		//Boton multiplicacion
		JButton multiplicar = new JButton("*");
		multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double operador1 = Double.parseDouble(operador.getText());
				Double operador2 = Double.parseDouble(operadordos.getText());
				String resultado = String.valueOf(operador1 * operador2);
				mostrarresultado.setText(resultado);
			}
		});
		multiplicar.setBounds(375, 53, 43, 37);
		contentPane.add(multiplicar);

		//Boton division
		JButton division = new JButton("/");
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double operador1 = Double.parseDouble(operador.getText());
				Double operador2 = Double.parseDouble(operadordos.getText());
				String resultado = String.valueOf(operador1 / operador2);
				mostrarresultado.setText(resultado);
			}
		});
		division.setBounds(375, 102, 43, 37);
		contentPane.add(division);

		operadordos = new JTextField();
		operadordos.setColumns(10);
		operadordos.setBounds(157, 48, 118, 26);
		contentPane.add(operadordos);

		// Creamos el componente, en este caso el boton desencadenara la accion de salir
		JButton exit = new JButton("EXIT");
		exit.setForeground(Color.RED);
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				;
			}
		});
		exit.setBounds(320, 151, 43, 37);
		contentPane.add(exit);
	}

}
