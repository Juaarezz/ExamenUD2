package es.oretania;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre completo:");
		lblNewLabel.setBounds(40, 59, 87, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCorre = new JLabel("Correo electrónico:");
		lblCorre.setBounds(40, 98, 92, 14);
		contentPane.add(lblCorre);
		
		JLabel lblCursoAInscribirse = new JLabel("Curso a inscribirse:");
		lblCursoAInscribirse.setBounds(40, 139, 98, 14);
		contentPane.add(lblCursoAInscribirse);
		
		JLabel lblNewLabel_1 = new JLabel("Modalidad:");
		lblNewLabel_1.setBounds(40, 189, 69, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Turno de clases:");
		lblNewLabel_1_1.setBounds(40, 238, 87, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Duración (semanas):");
		lblNewLabel_1_2.setBounds(40, 281, 112, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Comentarios adicionales:");
		lblNewLabel_1_3.setBounds(40, 346, 124, 14);
		contentPane.add(lblNewLabel_1_3);
		
		textField = new JTextField();
		textField.setBounds(192, 56, 306, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(192, 95, 306, 20);
		contentPane.add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Programación en Java", "Base de Datos", "Lenguaje de Marcas"}));
		comboBox.setBounds(192, 135, 306, 22);
		contentPane.add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Online");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(192, 185, 55, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxIncluyeMaterial = new JCheckBox("Incluye material");
		chckbxIncluyeMaterial.setBounds(260, 185, 124, 23);
		contentPane.add(chckbxIncluyeMaterial);
		
		JCheckBox chckbxCertificacinAlFinal = new JCheckBox("Certificación al final");
		chckbxCertificacinAlFinal.setBounds(382, 185, 129, 23);
		contentPane.add(chckbxCertificacinAlFinal);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Mañana");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(192, 234, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnTarde = new JRadioButton("Tarde");
		rdbtnTarde.setBounds(323, 234, 109, 23);
		contentPane.add(rdbtnTarde);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(180, 318, 318, 99);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(157, 426, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(260, 426, 89, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(365, 426, 89, 23);
		contentPane.add(btnSalir);
		
		textField_2 = new JTextField();
		textField_2.setBounds(192, 278, 306, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

	}
}
