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
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class ModificarRefrigeradora extends JDialog {

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
			ModificarRefrigeradora dialog = new ModificarRefrigeradora();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ModificarRefrigeradora() {
		setTitle("Modificar refrigeradora\r\n");
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
		lblModelo.setBounds(10, 23, 105, 33);
		contentPanel.add(lblModelo);
		
		JLabel lblPrecio = new JLabel("Precio (s/)");
		lblPrecio.setBounds(10, 64, 105, 25);
		contentPanel.add(lblPrecio);
		
		JLabel lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(10, 100, 105, 25);
		contentPanel.add(lblAncho);
		
		JLabel lblAlto = new JLabel("Alto (cm)");
		lblAlto.setBounds(10, 136, 116, 33);
		contentPanel.add(lblAlto);
		
		JLabel lblFondo = new JLabel("Fondo (cm)");
		lblFondo.setBounds(10, 183, 116, 25);
		contentPanel.add(lblFondo);
		
		JComboBox cboModelo = new JComboBox();
		cboModelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pos = cboModelo.getSelectedIndex();
				
				switch (pos) {
				case 0: 
					txtPrecio.setText("" + Proyecto.precio0);
					txtFondo.setText("" + Proyecto.fondo0);
					txtAncho.setText("" + Proyecto.ancho0);
					txtAlto.setText("" + Proyecto.alto0);
					break;
				case 1: 
					txtPrecio.setText("" + Proyecto.precio1);
					txtFondo.setText("" + Proyecto.fondo1);
					txtAncho.setText("" + Proyecto.ancho1);
					txtAlto.setText("" + Proyecto.alto1);
					break;
				case 2:
					txtPrecio.setText("" + Proyecto.precio2);
					txtFondo.setText("" + Proyecto.fondo2);
					txtAncho.setText("" + Proyecto.ancho2);
					txtAlto.setText("" + Proyecto.alto2);
					break;
				case 3: 
					txtPrecio.setText("" + Proyecto.precio3);
					txtFondo.setText("" + Proyecto.fondo3);
					txtAncho.setText("" + Proyecto.ancho3);
					txtAlto.setText("" + Proyecto.alto3);
					break;
				case 4:
					txtPrecio.setText("" + Proyecto.precio4);
					txtFondo.setText("" + Proyecto.fondo4);
					txtAncho.setText("" + Proyecto.ancho4);
					txtAlto.setText("" + Proyecto.alto4);
					break;
				}
			}
		});
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"LG LTCS20020W", "Samsung RB195ACRS", "Wirlpool  WRT318FZDM", "Bosch B36BT930NS", "LG LSXS26366S"}));
		cboModelo.setBounds(139, 28, 124, 22);
		contentPanel.add(cboModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(139, 66, 124, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setBounds(139, 102, 124, 20);
		contentPanel.add(txtAncho);
		txtAncho.setColumns(10);
		
		txtAlto = new JTextField();
		txtAlto.setBounds(136, 142, 124, 20);
		contentPanel.add(txtAlto);
		txtAlto.setColumns(10);
		
		txtFondo = new JTextField();
		txtFondo.setBounds(136, 185, 124, 20);
		contentPanel.add(txtFondo);
		txtFondo.setColumns(10);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(309, 28, 89, 23);
		contentPanel.add(btnCerrar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				int modelo = cboModelo.getSelectedIndex();
				double precio = Double.parseDouble(txtPrecio.getText());
				double ancho = Double.parseDouble(txtAncho.getText());
				double alto = Double.parseDouble(txtAlto.getText());
				double fondo = Double.parseDouble(txtFondo.getText());
				
				switch (modelo) { 
				 
				case 0: 
					
					Proyecto.precio0 = precio;
					Proyecto.ancho0 = ancho;
					Proyecto.alto0 = alto;
					Proyecto.fondo0 = fondo;
					break;
					
				case 1:
					Proyecto.precio1 = precio;
					Proyecto.ancho1 = ancho;
					Proyecto.alto1 = alto;
					Proyecto.fondo1 = fondo;
					break;
				case 2:
					Proyecto.precio2 = precio;
					Proyecto.ancho2 = ancho;
					Proyecto.alto2 = alto;
					Proyecto.fondo2 = fondo;
					break;
				case 3:
					Proyecto.precio3 = precio;
					Proyecto.ancho3 = ancho;
					Proyecto.alto3 = alto;
					Proyecto.fondo3 = fondo;
					break;
				case 4:
					Proyecto.precio4 = precio;
					Proyecto.ancho4 = ancho;
					Proyecto.alto4 = alto;
					Proyecto.fondo4 = fondo;
					break;
					
				}
					
				dispose();
			}
		});
		btnGuardar.setBounds(309, 65, 89, 23);
		contentPanel.add(btnGuardar);
	

	}
}
