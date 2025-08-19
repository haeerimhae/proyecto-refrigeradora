package t3final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class ConsultarRefrigeradora extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConsultarRefrigeradora dialog = new ConsultarRefrigeradora();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConsultarRefrigeradora() {
		setTitle("Consultar  refrigeradora");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				System.out.print("LoadForm");
				txtPrecio.setText("" + Proyecto.precio0);
				txtFondo.setText("" + Proyecto.fondo0);
				txtAncho.setText("" + Proyecto.ancho0);
				txtAlto.setText("" + Proyecto.alto0);
			}

			public void ancestorMoved(AncestorEvent event) {
			}

			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 22, 75, 14);
		contentPanel.add(lblModelo);

		JLabel lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 62, 75, 14);
		contentPanel.add(lblPrecio);

		JLabel lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(10, 104, 75, 14);
		contentPanel.add(lblAncho);

		JLabel lblAlto = new JLabel("Alto (cm)");
		lblAlto.setBounds(10, 150, 75, 14);
		contentPanel.add(lblAlto);

		JLabel lblFondo = new JLabel("Fondo (cm)");
		lblFondo.setBounds(10, 198, 85, 14);
		contentPanel.add(lblFondo);

		JComboBox cboModelo = new JComboBox();
		cboModelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pos = cboModelo.getSelectedIndex();

				switch (pos) {
				case 0:
					txtPrecio.setText(Proyecto.precio0 + "");
					txtAncho.setText(Proyecto.ancho0 + "");
					txtAlto.setText(Proyecto.alto0 + "");
					txtFondo.setText(Proyecto.fondo0 + "");
					break;
				case 1:
					txtPrecio.setText(Proyecto.precio1 + "");
					txtAncho.setText(Proyecto.ancho1 + "");
					txtAlto.setText(Proyecto.alto1 + "");
					txtFondo.setText(Proyecto.fondo1 + "");
					break;
				case 2:
					txtPrecio.setText(Proyecto.precio2 + "");
					txtAncho.setText(Proyecto.ancho2 + "");
					txtAlto.setText(Proyecto.alto2 + "");
					txtFondo.setText(Proyecto.fondo2 + "");
					break;
				case 3:
					txtPrecio.setText(Proyecto.precio3 + "");
					txtAncho.setText(Proyecto.ancho3 + "");
					txtAlto.setText(Proyecto.alto3 + "");
					txtFondo.setText(Proyecto.fondo3 + "");
					break;
				case 4:
					txtPrecio.setText(Proyecto.precio4 + "");
					txtAncho.setText(Proyecto.ancho4 + "");
					txtAlto.setText(Proyecto.alto4 + "");
					txtFondo.setText(Proyecto.fondo4 + "");
				}

			}
		});

		cboModelo.setBounds(120, 18, 286, 22);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] { Proyecto.modelo0, Proyecto.modelo1, Proyecto.modelo2,
				Proyecto.modelo3, Proyecto.modelo4 }));

		contentPanel.add(cboModelo);

		txtPrecio = new JTextField();
		txtPrecio.setBounds(120, 59, 140, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		txtPrecio.setEditable(false);

		txtAncho = new JTextField();
		txtAncho.setBounds(120, 101, 140, 20);
		contentPanel.add(txtAncho);
		txtAncho.setColumns(10);
		txtAncho.setEditable(false);

		txtAlto = new JTextField();
		txtAlto.setBounds(120, 147, 140, 20);
		contentPanel.add(txtAlto);
		txtAlto.setColumns(10);
		txtAlto.setEditable(false);

		txtFondo = new JTextField();
		txtFondo.setBounds(120, 195, 140, 20);
		contentPanel.add(txtFondo);
		txtFondo.setColumns(10);
		txtFondo.setEditable(false);

		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(317, 58, 89, 146);
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPanel.add(btnCerrar);
	}
}
