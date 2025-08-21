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
	public static String modelo0 = "LG LTCS20020W";
	public static double precio0 = 949.0;
	public static double fondo0 = 58.6;
	public static double ancho0 = 60.0;
	public static double alto0 = 91.0;
	public static String modelo1 = "Samsung RB195ACRS";
	public static double precio1 = 1089.0;
	public static double ancho1 = 80.0;
	public static double alto1 = 94.0;
	public static double fondo1 = 67.5;
	public static String modelo2 = " Whirlpool WRT318FZDM";
	public static double precio2 = 850.0;
	public static double ancho2 = 60.0;
	public static double alto2 = 90.0;
	public static double fondo2 = 50.0;
	public static String modelo3 = "Bosch B36BT930NS";
	public static double precio3 = 629.0;
	public static double ancho3 = 61.6;
	public static double alto3 = 95.0;
	public static double fondo3 = 51.5;
	public static String modelo4 = "LG LSXS26366S";
	public static double precio4 = 849.0;
	public static double ancho4 = 75.4;
	public static double alto4 = 94.5;
	public static double fondo4 = 66.0;
	public static int quemadores4 = 5;
	public static double porcentaje1 = 0.075;
	public static double porcentaje2 = 0.10;
	public static double porcentaje3 = 0.125;
	public static double porcentaje4 = 0.15;
	public static String obsequio1 = "Cafetera";
	public static String obsequio2 = "Licuadora";
	public static String obsequio3 = "Extractor";
	// Cantidad óptima de unidades vendidas
	public static int cantidadOptima = 30;
	// Cuota diaria
	public static double cuotaDiaria = 75000;
	public Proyecto() {
		setBackground(new Color(255, 255, 240));
		setTitle("Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuArchivo = new JMenu("Archivo");
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
		miVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentasVender ventasVenderFrame= new VentasVender();
				ventasVenderFrame.setVisible(true);
			}
		});
		miVender.setBackground(new Color(255, 255, 240));
		menuVentas.add(miVender);
		
		JMenuItem miGenerar = new JMenuItem("Generar Componentes");
		miGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentasGenerarReportes ventasGenerarReportesFrame= new VentasGenerarReportes();
				ventasGenerarReportesFrame.setVisible(true);
			}
		});
		miGenerar.setBackground(new Color(255, 255, 240));
		menuVentas.add(miGenerar);
		
		JMenu menuConfiguracion = new JMenu(" Configuración");
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
		miAcerca.setBackground(new Color(255, 255, 240));
		menuAyuda.add(miAcerca);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

	}
}
