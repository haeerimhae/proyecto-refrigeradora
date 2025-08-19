package t3final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class ConfigurarObsequios extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtUno;
	private JTextField txtDosaCinco;
	private JTextField txtSeisaMas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarObsequios dialog = new ConfigurarObsequios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarObsequios() {
		setTitle("Configurar obsequios");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				System.out.print("LoadForm");
				txtUno.setText("" + Proyecto.obsequio1);
				txtDosaCinco.setText("" + Proyecto.obsequio2);
				txtSeisaMas.setText("" + Proyecto.obsequio3);
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblUnidad = new JLabel("1 unidad");
		lblUnidad.setBounds(10, 39, 130, 14);
		contentPanel.add(lblUnidad);
		
		JLabel lblUnidades = new JLabel("2 a 5 unidades");
		lblUnidades.setBounds(10, 82, 130, 14);
		contentPanel.add(lblUnidades);
		
		JLabel lblNewLabel = new JLabel("6 a más unidades");
		lblNewLabel.setBounds(10, 127, 115, 14);
		contentPanel.add(lblNewLabel);
		
		txtUno = new JTextField();
		txtUno.setBounds(150, 36, 157, 20);
		contentPanel.add(txtUno);
		txtUno.setColumns(10);
		
		txtDosaCinco = new JTextField();
		txtDosaCinco.setBounds(150, 79, 157, 20);
		contentPanel.add(txtDosaCinco);
		txtDosaCinco.setColumns(10);
		
		txtSeisaMas = new JTextField();
		txtSeisaMas.setBounds(150, 124, 157, 20);
		contentPanel.add(txtSeisaMas);
		txtSeisaMas.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Proyecto.obsequio1 = txtUno.getText();
				Proyecto.obsequio2 = txtDosaCinco.getText();
				Proyecto.obsequio3 = txtSeisaMas.getText();
				dispose();
				
			}
		});
		btnAceptar.setBounds(335, 35, 89, 23);
		contentPanel.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();											
			}
		});
		btnCancelar.setBounds(335, 78, 89, 23);
		contentPanel.add(btnCancelar);
	}
}
