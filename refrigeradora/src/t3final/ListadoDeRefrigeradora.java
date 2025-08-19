package t3final;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class ListadoDeRefrigeradora extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListadoDeRefrigeradora dialog = new ListadoDeRefrigeradora();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListadoDeRefrigeradora() {
		setTitle("Listado de refrigeradoras");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(101, 227, 89, 23);
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPanel.add(btnCerrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 424, 216);
		contentPanel.add(scrollPane);
		
		JTextArea txtListar = new JTextArea();
		txtListar.setEditable(false);
		scrollPane.setViewportView(txtListar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(232, 227, 89, 23);
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtListar.setText("LISTADO DE REFRIGERADORAS\n\n");
				txtListar.append("Modelo \t : " + Proyecto.modelo0 + "\n");
				txtListar.append("Precio \t: " + Proyecto.precio0 + "\n");
				txtListar.append("Profundidad \t : " + Proyecto.ancho0 + "\n");
				txtListar.append("Ancho \t: " + Proyecto.ancho0 + "\n");
				txtListar.append("Alto \t : " + Proyecto.alto0 + "\n" + "\n");
				
				
				txtListar.append("Modelo \t : " + Proyecto.modelo1 + "\n");
				txtListar.append("Precio \t : " + Proyecto.precio1 + "\n");
				txtListar.append("Profundidad \t : " + Proyecto.ancho1 + "\n");
				txtListar.append("Ancho \t : " + Proyecto.ancho1 + "\n");
				txtListar.append("Alto \t : " + Proyecto.alto1 + "\n" + "\n");
				
				txtListar.append("Modelo \t : " + Proyecto.modelo2 + "\n");
				txtListar.append("Precio \t : " + Proyecto.precio2 + "\n");
				txtListar.append("Profundidad \t : " + Proyecto.ancho2 + "\n");
				txtListar.append("Ancho \t : " + Proyecto.ancho2 + "\n");
				txtListar.append("Alto \t : " + Proyecto.alto2 + "\n" + "\n");
				
				txtListar.append("Modelo \t : " + Proyecto.modelo3 + "\n");
				txtListar.append("Precio \t : " + Proyecto.precio3 + "\n");
				txtListar.append("Profundidad \t : " + Proyecto.ancho3 + "\n");
				txtListar.append("Ancho \t : " + Proyecto.ancho3 + "\n");
				txtListar.append("Alto \t : " + Proyecto.alto3 + "\n" + "\n");
				
				txtListar.append("Modelo \t : " + Proyecto.modelo4 + "\n");
				txtListar.append("Precio \t : " + Proyecto.precio4 + "\n");
				txtListar.append("Profundidad \t : " + Proyecto.ancho4 + "\n");
				txtListar.append("Ancho \t : " + Proyecto.ancho4 + "\n");
				txtListar.append("Alto \t : " + Proyecto.alto4 + "\n");
			}
		});
		contentPanel.add(btnListar);
		
	
		
	
		
		
	}
}
