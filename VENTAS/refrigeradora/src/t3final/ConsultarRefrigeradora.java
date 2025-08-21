package t3final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultarRefrigeradora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarRefrigeradora frame = new ConsultarRefrigeradora();
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
	public ConsultarRefrigeradora() {
		setBackground(new Color(255, 239, 213));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 202);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setForeground(new Color(250, 235, 215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCerrar = new JButton("Regresar ");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCerrar.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		btnCerrar.setBackground(new Color(250, 235, 215));
		btnCerrar.setForeground(new Color(0, 0, 0));
		btnCerrar.setBounds(220, 29, 99, 36);
		contentPane.add(btnCerrar);
		
		JLabel cboModelo = new JLabel("Modelo");
		cboModelo.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		cboModelo.setBounds(10, 29, 46, 14);
		contentPane.add(cboModelo);
		
		JLabel cboPrecio = new JLabel("Precio");
		cboPrecio.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		cboPrecio.setBounds(10, 57, 46, 14);
		contentPane.add(cboPrecio);
		
		JLabel cboAncho = new JLabel("Ancho");
		cboAncho.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		cboAncho.setBounds(10, 82, 46, 14);
		contentPane.add(cboAncho);
		
		JLabel cboAlto = new JLabel("Alto");
		cboAlto.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		cboAlto.setBounds(10, 107, 46, 14);
		contentPane.add(cboAlto);
		
		JLabel cboFondr = new JLabel("Fondo");
		cboFondr.setFont(new Font("Bookman Old Style", Font.ITALIC, 11));
		cboFondr.setBounds(10, 132, 46, 14);
		contentPane.add(cboFondr);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		comboBox.setBackground(new Color(250, 235, 215));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"LG LTCS20020W", " Samsung RB195ACRS", " Whirlpool WRT318FZDM ", "Bosch B36BT930NS", "LG LSXS26366S"}));
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setBounds(55, 21, 106, 22);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(55, 54, 106, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(55, 82, 106, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(55, 132, 106, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(55, 107, 106, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

	}
}
