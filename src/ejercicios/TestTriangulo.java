package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestTriangulo {

	private JFrame frame;
	private JTextField textFieldLado1;
	private JTextField textFieldLado2;
	private JTextField textFieldLado3;
	private JTextField txtCrearTriangulo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestTriangulo window = new TestTriangulo();
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
	public TestTriangulo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblLado = new JLabel("Lado1");
		GridBagConstraints gbc_lblLado = new GridBagConstraints();
		gbc_lblLado.anchor = GridBagConstraints.EAST;
		gbc_lblLado.insets = new Insets(0, 0, 5, 5);
		gbc_lblLado.gridx = 0;
		gbc_lblLado.gridy = 0;
		frame.getContentPane().add(lblLado, gbc_lblLado);
		
		textFieldLado1 = new JTextField();
		GridBagConstraints gbc_textFieldLado1 = new GridBagConstraints();
		gbc_textFieldLado1.anchor = GridBagConstraints.WEST;
		gbc_textFieldLado1.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldLado1.gridx = 1;
		gbc_textFieldLado1.gridy = 0;
		frame.getContentPane().add(textFieldLado1, gbc_textFieldLado1);
		textFieldLado1.setColumns(10);
		
		JLabel lblLado_1 = new JLabel("Lado2");
		GridBagConstraints gbc_lblLado_1 = new GridBagConstraints();
		gbc_lblLado_1.anchor = GridBagConstraints.EAST;
		gbc_lblLado_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblLado_1.gridx = 0;
		gbc_lblLado_1.gridy = 1;
		frame.getContentPane().add(lblLado_1, gbc_lblLado_1);
		
		textFieldLado2 = new JTextField();
		GridBagConstraints gbc_textFieldLado2 = new GridBagConstraints();
		gbc_textFieldLado2.anchor = GridBagConstraints.WEST;
		gbc_textFieldLado2.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldLado2.gridx = 1;
		gbc_textFieldLado2.gridy = 1;
		frame.getContentPane().add(textFieldLado2, gbc_textFieldLado2);
		textFieldLado2.setColumns(10);
		
		JLabel lblLado_2 = new JLabel("Lado3");
		GridBagConstraints gbc_lblLado_2 = new GridBagConstraints();
		gbc_lblLado_2.anchor = GridBagConstraints.EAST;
		gbc_lblLado_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblLado_2.gridx = 0;
		gbc_lblLado_2.gridy = 2;
		frame.getContentPane().add(lblLado_2, gbc_lblLado_2);
		
		textFieldLado3 = new JTextField();
		GridBagConstraints gbc_textFieldLado3 = new GridBagConstraints();
		gbc_textFieldLado3.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldLado3.anchor = GridBagConstraints.WEST;
		gbc_textFieldLado3.gridx = 1;
		gbc_textFieldLado3.gridy = 2;
		frame.getContentPane().add(textFieldLado3, gbc_textFieldLado3);
		textFieldLado3.setColumns(10);
		
		JButton btnNewButton = new JButton("Crear Triangulo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int lado1 = Integer.parseInt(textFieldLado1.getText());
				int lado2 = Integer.parseInt(textFieldLado2.getText());
				int lado3 = Integer.parseInt(textFieldLado3.getText());
				try {
					Triangulo t = new Triangulo(lado1, lado2, lado3);
					txtCrearTriangulo.setText("Triangulo creado");
				} catch (IlegalTrianguloException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 3;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		txtCrearTriangulo = new JTextField();
		GridBagConstraints gbc_txtCrearTriangulo = new GridBagConstraints();
		gbc_txtCrearTriangulo.insets = new Insets(0, 0, 5, 0);
		gbc_txtCrearTriangulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCrearTriangulo.gridx = 1;
		gbc_txtCrearTriangulo.gridy = 3;
		frame.getContentPane().add(txtCrearTriangulo, gbc_txtCrearTriangulo);
		txtCrearTriangulo.setColumns(10);
	}

}
