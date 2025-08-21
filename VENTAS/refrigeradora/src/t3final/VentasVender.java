package t3final;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentasVender extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidad;
	private JTextField txtPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentasVender frame = new VentasVender();
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
	public VentasVender() {
		setTitle("Vender");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 11, 46, 14);
		contentPane.add(lblModelo);
		
		JLabel lblPrecios = new JLabel("Precio(S/)");
		lblPrecios.setBounds(10, 36, 63, 14);
		contentPane.add(lblPrecios);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 61, 85, 14);
		contentPane.add(lblCantidad);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(105, 33, 132, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JComboBox cboModelo = new JComboBox();
		cboModelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int modelo;
				double prec;
				modelo=cboModelo.getSelectedIndex();
				switch(modelo){
				case 0:prec= Proyecto.precio0;break;
				case 1:prec= Proyecto.precio1;break;
				case 2:prec= Proyecto.precio2;break;
				case 3:prec= Proyecto.precio3;break;
				default: prec= Proyecto.precio4;
			
				
				}
				txtPrecio.setText("S/. " + prec);
				
			}
		});
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"LG LTCS20020W", "Samsung RB195ACRS", "Whirpool WRT318FZDM", "Bosch B36BT930NS", "LG LSXS263665"}));
		cboModelo.setBounds(105, 8, 132, 20);
		contentPane.add(cboModelo);
		txtCantidad = new JTextField();
		txtCantidad.setBounds(105, 58, 132, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 100, 414, 139);
		contentPane.add(scrollPane);
		
		JTextArea txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		JButton btnVender = new JButton("Vender");
		btnVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int cant, modelo;
				double icom, ides, ipag, precio, porcdiar;
				String obs, mod;
				modelo= leerModelo();
				cant= leerCantidad();
				icom= calcularImporteCompra(cant, modelo);
				ides= calcularImporteDescuento(cant, icom);
				ipag= calcularImportePagar(icom, ides);
				precio=obtenerPrecio(modelo);
				obtenerModelo(modelo);
				obs = calcularObsequios(cant);
				mod= obtenerModelo(modelo);
				mostrarResultados(icom, ides, ipag, precio, mod, obs, cant);
				totalCantidadVentas(modelo, ipag);
				porcdiar= (contadorIPag+=ipag)/(Proyecto.cuotaDiaria)*100;
				
				contadorVTa++;
				contadorIPag+=ipag;
				if(contadorVTa%5==0)
					JOptionPane.showMessageDialog(VentasVender.this,
							"Venta Nro."+contadorVTa + "\n" + 
					"Importe total general acumulado: S/. " + String.format("%.2f",contadorIPag)
					+"\n"+ "Porcentaje de la cuota diaria: " + String.format("%.2f",porcdiar) + "%",
					"Avance de Ventas",JOptionPane.INFORMATION_MESSAGE);
				
				
				
			}
			int canven0, canven1, canven2, canven3, canven4;
			double imptot0, imptot1, imptot2, imptot3, imptot4;
			int contadorVTa;
			double contadorIPag;
			int leerModelo(){
				return cboModelo.getSelectedIndex();
				
			}
			int leerCantidad(){
				return Integer.parseInt(txtCantidad.getText());
				
			}
			String obtenerModelo(int modelo){
				switch(modelo){
				case 0: return Proyecto.modelo0;
				case 1: return Proyecto.modelo1;
				case 2: return Proyecto.modelo2;
				case 3: return Proyecto.modelo3;
				default: return Proyecto.modelo4;
				}
				
			}
			double obtenerPrecio(int modelo){
				if(modelo==0)
					return Proyecto.precio0;
				else if(modelo==1)
					return Proyecto.precio1;
				else if(modelo==2)
					return Proyecto.precio2;
				else if(modelo==3)
					return Proyecto.precio3;
				else
					return Proyecto.precio4;
				
			}
			double calcularImporteCompra(int cant, int modelo){
				switch(modelo){
				case 0: return Proyecto.precio0*cant;
				case 1: return Proyecto.precio1*cant;
				case 2: return Proyecto.precio2*cant;
				case 3: return Proyecto.precio3*cant;
				default: return Proyecto.precio4*cant;
				}
			}
			double calcularImporteDescuento(int cant, double icom){
				if(cant<=5)
					return Proyecto.porcentaje1 *icom;
				else if(cant<=10)
					return Proyecto.porcentaje2*icom;
				else if(cant<=15)
					return Proyecto.porcentaje3 * icom;
				else
					return Proyecto.porcentaje4*icom;
				}
			String calcularObsequios(int cant){
				if(cant<=1)
					return Proyecto.obsequio1;
				else if(cant<=5)
					return Proyecto.obsequio2;
				else
					return Proyecto.obsequio3;
			}
			double calcularImportePagar(double icom, double ides){
				return icom-ides;
			}
			void totalCantidadVentas(int modelo, double ipag){
				switch(modelo){
				case 0: canven0++; imptot0+=ipag;break;
				case 1: canven1++; imptot1+=ipag;break;
				case 2: canven2++; imptot2+=ipag;break;
				case 3: canven3++; imptot3+=ipag;break;
				default: canven4++; imptot4+=ipag;
				
				}
			
				
				
			}
			void mostrarResultados(double icom, double ides, double ipag, double precio, String mod, String obs, int cant){
				txtS.setText("BOLETA DE VENTA" +"\n");
				txtS.append("Modelo            : "+mod + "\n");
				txtS.append("Precio            : S/ "+ String.format("%.2f", precio) + "\n");
				txtS.append("Cantidad          : "+ cant + "\n");
				txtS.append("Importe compra    : S/ "+String.format("%.2f", icom) +"\n");
				txtS.append("Importe descuento : S/ "+ String.format("%.2f", ides) + "\n");
				txtS.append("Importe a Pagar   : S/ " + String.format("%.2f", ipag) + "\n");
				txtS.append("Obsequio          : " + obs);
			}
			
		});
		btnVender.setBounds(335, 7, 89, 23);
		contentPane.add(btnVender);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCerrar.setBounds(335, 36, 89, 23);
		contentPane.add(btnCerrar);
	}
}
