package com.cibertec.windows;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JSeparator;

public class About extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNameProject;
	private JButton btnClose;
	private JList<Object> listMembers;
	private JLabel lblCredits;
	private JLabel lblNews;
	private JLabel lblVersionText;
	private JLabel lblVersionProject;
	private JLabel lblNewsInfo;
	private JSeparator separator1;
	private JSeparator separator2;
	private JSeparator separator3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			About dialog = new About();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public About() {
		setModal(true);
		setBounds(100, 100, 319, 465);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblNameProject = new JLabel("WMStore");
		lblNameProject.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNameProject.setBounds(99, 10, 211, 43);
		contentPanel.add(lblNameProject);
		
		btnClose = new JButton("Cerrar");
		btnClose.addActionListener(this);
		btnClose.setBounds(111, 393, 89, 23);
		contentPanel.add(btnClose);
		
		listMembers = new JList<Object>();
		listMembers.setEnabled(false);
		listMembers.setForeground(SystemColor.desktop);
		listMembers.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		listMembers.setModel(new AbstractListModel<Object>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			String[] values = new String[] {"Aaron Xande Huaman Ramirez", "Luis Adrian Checmapocco Araujo", "Jair Daniel Calderon Buitron ", "Willy Adrian Ataulluco Ortiz", "Angel Diego Escalante Navarro", "Luis Walter Gallegos Torres", "Angel Jaramillo Revatta", "Eduardo Jesus Calis Lopez", "Omar Guitierrez Tafur"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listMembers.setToolTipText("");
		listMembers.setBackground(SystemColor.control);
		listMembers.setBounds(20, 207, 234, 163);
		contentPanel.add(listMembers);
		
		lblCredits = new JLabel("Creditos");
		lblCredits.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCredits.setLabelFor(this);
		lblCredits.setToolTipText("");
		lblCredits.setBounds(20, 185, 111, 23);
		contentPanel.add(lblCredits);
		
		lblNews = new JLabel("Novedades");
		lblNews.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNews.setBounds(20, 64, 96, 18);
		contentPanel.add(lblNews);
		
		lblVersionText = new JLabel("Version");
		lblVersionText.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVersionText.setBounds(20, 128, 89, 14);
		contentPanel.add(lblVersionText);
		
		lblVersionProject = new JLabel("0.0.1");
		lblVersionProject.setEnabled(false);
		lblVersionProject.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblVersionProject.setBounds(20, 153, 117, 14);
		contentPanel.add(lblVersionProject);
		
		lblNewsInfo = new JLabel("Pronto ...");
		lblNewsInfo.setEnabled(false);
		lblNewsInfo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewsInfo.setBounds(20, 93, 180, 14);
		contentPanel.add(lblNewsInfo);
		
		separator1 = new JSeparator();
		separator1.setBounds(20, 51, 261, 56);
		contentPanel.add(separator1);
		
		separator2 = new JSeparator();
		separator2.setBounds(20, 118, 261, 36);
		contentPanel.add(separator2);
		
		separator3 = new JSeparator();
		separator3.setBounds(20, 178, 261, 30);
		contentPanel.add(separator3);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnClose) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
	}
}
