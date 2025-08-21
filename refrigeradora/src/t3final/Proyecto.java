package t3final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import t3final.ConsultarRefrigeradora;
import java.awt.Color;
import java.awt.Font;

public class Proyecto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proyecto frame = new Proyecto();
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
	public Proyecto() {
		setBackground(new Color(255, 255, 240));
		setTitle("La tienda de Don Pepe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuArchivo = new JMenu("archivo");
		menuBar.add(menuArchivo);
		
		JMenuItem miSalir = new JMenuItem("Salir");
		miSalir.setFont(new Font("Segoe UI", Font.BOLD, 12));
		miSalir.setBackground(new Color(255, 255, 240));
		menuArchivo.add(miSalir);
		miSalir.addActionListener(e-> System.exit(0));
		menuArchivo.add(miSalir);
		
		
		JMenu menuMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(menuMantenimiento);
		
		JMenuItem miConsultar = new JMenuItem("Consultar Refrigeradora");
		miConsultar.setBackground(new Color(255, 255, 240));
		miConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarRefrigeradora ventana= new ConsultarRefrigeradora();
						ventana.setVisible(true);
			}
		});
		menuMantenimiento.add(miConsultar);
		
		JMenuItem miModificar = new JMenuItem("Modificar Refrigeradora");
		miModificar.setBackground(new Color(255, 255, 240));
		menuMantenimiento.add(miModificar);
		
		JMenuItem miListar = new JMenuItem("Lista Refrigeradores");
		miListar.setBackground(new Color(255, 255, 240));
		menuMantenimiento.add(miListar);
		
		JMenu menuVentas = new JMenu("Venta");
		menuBar.add(menuVentas);
		
		JMenuItem miVender = new JMenuItem("Vender");
		miVender.setBackground(new Color(255, 255, 240));
		menuVentas.add(miVender);
		
		JMenuItem miGenerar = new JMenuItem("Generar Componentes");
		miGenerar.setBackground(new Color(255, 255, 240));
		menuVentas.add(miGenerar);
		
		JMenu menuConfiguracion = new JMenu(" ");
		menuBar.add(menuConfiguracion);
		
		JMenuItem miDescuentos = new JMenuItem("Configurar descuentos");
		menuConfiguracion.add(miDescuentos);
		
		JMenuItem miObsequios = new JMenuItem("Configurar obsequios");
		menuConfiguracion.add(miObsequios);
		
		JMenuItem miCantidadoptima = new JMenuItem("Configurar cantidad optima");
		menuConfiguracion.add(miCantidadoptima);
		
		JMenuItem miCuotadiaria = new JMenuItem("Configurar cuota diaria");
		menuConfiguracion.add(miCuotadiaria);
		
		JMenu menuAyuda = new JMenu("Ayuda");
		menuBar.add(menuAyuda);
		
		JMenuItem miAcerca = new JMenuItem("Acerca de tienda");
		miAcerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AcercaDeTienda ventana= new AcercaDeTienda();
				ventana.setVisible(true);
			}
		});
		miAcerca.setBackground(new Color(255, 255, 240));
		menuAyuda.add(miAcerca);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

	}
}
