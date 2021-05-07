package com.cibertec.windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.UIManager;
import javax.swing.JMenuItem;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnuFile;
	private JMenu mnuMaintenance;
	private JMenu mnuSales;
	private JMenu mnuConfiguration;
	private JMenu mnuHelp;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mnuConsultWash;
	private JMenuItem mnuModifyWash;
	private JMenuItem mnuListWash;
	private JMenuItem mnuSell;
	private JMenuItem mnuGenContributions;
	private JMenuItem mnuConfigDiscount;
	private JMenuItem mnuConfigGifts;
	private JMenuItem mnuConfigOptimum;
	private JMenuItem mnuConfigDailyQuota;
	private JMenuItem mnuAbout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("WMStore 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 465);
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnuFile = new JMenu("Archivo");
		menuBar.add(mnuFile);
		
		mntmNewMenuItem = new JMenuItem("Salir");
		mnuFile.add(mntmNewMenuItem);
		
		mnuMaintenance = new JMenu("Mantenimiento");
		menuBar.add(mnuMaintenance);
		
		mnuConsultWash = new JMenuItem("Consultar lavadoras");
		mnuMaintenance.add(mnuConsultWash);
		
		mnuModifyWash = new JMenuItem("Modificar lavadora");
		mnuMaintenance.add(mnuModifyWash);
		
		mnuListWash = new JMenuItem("Listar lavadoras");
		mnuMaintenance.add(mnuListWash);
		
		mnuSales = new JMenu("Ventas");
		menuBar.add(mnuSales);
		
		mnuSell = new JMenuItem("Vender");
		mnuSales.add(mnuSell);
		
		mnuGenContributions = new JMenuItem("Generar aportes");
		mnuSales.add(mnuGenContributions);
		
		mnuConfiguration = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnuConfiguration);
		
		mnuConfigDiscount = new JMenuItem("Configurar descuentos");
		mnuConfiguration.add(mnuConfigDiscount);
		
		mnuConfigGifts = new JMenuItem("Configurar obsequios");
		mnuConfiguration.add(mnuConfigGifts);
		
		mnuConfigOptimum = new JMenuItem("Configurar cantidad \u00F3ptima");
		mnuConfiguration.add(mnuConfigOptimum);
		
		mnuConfigDailyQuota = new JMenuItem("Configurar cuota diaria");
		mnuConfiguration.add(mnuConfigDailyQuota);
		
		mnuHelp = new JMenu("Ayuda");
		menuBar.add(mnuHelp);
		
		mnuAbout = new JMenuItem("Acerca de Tienda");
		mnuHelp.add(mnuAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
