package t3final;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentasGenerarReportes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentasGenerarReportes frame = new VentasGenerarReportes();
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
	public VentasGenerarReportes() {
		setFont(new Font("Dialog", Font.PLAIN, 14));
		setTitle("Generar Reportes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipoDeReporte = new JLabel("Tipo de Reporte");
		lblTipoDeReporte.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoDeReporte.setBounds(10, 15, 120, 23);
		contentPane.add(lblTipoDeReporte);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCerrar.setBounds(672, 15, 89, 23);
		contentPane.add(btnCerrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 52, 751, 437);
		contentPane.add(scrollPane);
		
		JTextArea txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		JComboBox cboTipo = new JComboBox();
		cboTipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				leerTipo();
				txtS.setText("VENTAS POR MODELO"+"\n");
				txtS.append("Modelo\t: " + Proyecto.modelo0+"\n");
		
		}
		int leerTipo(){
			return cboTipo.getSelectedIndex();
		}
		
		});
		cboTipo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboTipo.setModel(new DefaultComboBoxModel(new String[] {"Ventas por modelo", "Ventas en relación a la venta óptima", "Precios en relación al precio promedio", "Promedios, menores y mayores"}));
		cboTipo.setBounds(136, 16, 499, 22);
		contentPane.add(cboTipo);
	}
}
