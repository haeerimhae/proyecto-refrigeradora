package t3final;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AcercaDeTienda extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcercaDeTienda frame = new AcercaDeTienda();
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
	public AcercaDeTienda() {
		setBackground(new Color(153, 255, 255));
		setTitle("Acerca de tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 218, 185));
		contentPane.setForeground(new Color(204, 102, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 228, 196));
		panel.setForeground(Color.BLACK);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblTiendaDeDon = new JLabel("Tienda de Don Pepe");
		lblTiendaDeDon.setBackground(new Color(0, 0, 0));
		lblTiendaDeDon.setForeground(new Color(255, 255, 255));
		lblTiendaDeDon.setFont(new Font("Tw Cen MT", Font.BOLD, 34));
		lblTiendaDeDon.setBounds(56, 13, 338, 38);
		panel.add(lblTiendaDeDon);
		
		JLabel lblNewLabel = new JLabel("Autores");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 26));
		lblNewLabel.setBounds(161, 60, 94, 16);
		panel.add(lblNewLabel);
		
		JLabel lblYosmelCano = new JLabel("Yosmel Cano ");
		lblYosmelCano.setFont(new Font("Lucida Console", Font.PLAIN, 13));
		lblYosmelCano.setBounds(161, 89, 107, 16);
		panel.add(lblYosmelCano);
		
		JLabel lblDanteFlores = new JLabel("Dante Flores");
		lblDanteFlores.setFont(new Font("Lucida Console", Font.PLAIN, 13));
		lblDanteFlores.setBounds(161, 105, 107, 16);
		panel.add(lblDanteFlores);
		
		JLabel lblSolangelCondor = new JLabel("Solangel Condor ");
		lblSolangelCondor.setFont(new Font("Lucida Console", Font.PLAIN, 13));
		lblSolangelCondor.setBounds(148, 119, 166, 16);
		panel.add(lblSolangelCondor);
		
		JLabel lblRocio = new JLabel("Rocio Vargas");
		lblRocio.setFont(new Font("Lucida Console", Font.PLAIN, 13));
		lblRocio.setBounds(161, 134, 107, 16);
		panel.add(lblRocio);
		
		JLabel lblJeffersonFuentes = new JLabel("Jefferson Fuentes");
		lblJeffersonFuentes.setFont(new Font("Lucida Console", Font.PLAIN, 13));
		lblJeffersonFuentes.setBounds(139, 150, 145, 16);
		panel.add(lblJeffersonFuentes);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose ();
			}
		});
		btnCerrar.setFont(new Font("Gabriola", Font.PLAIN, 18));
		btnCerrar.setBackground(new Color(255, 160, 122));
		btnCerrar.setBounds(158, 180, 97, 25);
		panel.add(btnCerrar);
	}
}
