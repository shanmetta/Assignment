package aplikasi;

import javax.activation.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainMenu extends JFrame implements ActionListener {
	
	
	public String judul, subjudul, garis, identitas;

	private static JButton btnDokter;
	private static JButton btnFarmasi;
	
	Container konten = getContentPane();
	Color warna = Color.PINK;
	
	public MainMenu() {
		
		
		getComponents();
		JLabel lbjudul = new JLabel("Main Menu");
		JLabel lbsubjudul = new JLabel("Aplikasi Rumah Sakit Sahabat");
		JLabel lbgaris = new JLabel("=======================================================================");
		JLabel lbidentitas = new JLabel("Shan Metta Nata W - 2201809765");
		btnDokter = new JButton("Jadwal Dokter");
		btnFarmasi = new JButton("Farmasi");
		setLocationRelativeTo(null);
		
		konten.setBackground(warna);
		setLayout(null);
		Dimension sizelbjudul = lbjudul.getPreferredSize();
		Dimension sizelbsubjudul = lbsubjudul.getPreferredSize();
		Dimension sizelbgaris = lbgaris.getPreferredSize();
		Dimension sizelbidentitas = lbidentitas.getPreferredSize();
		Dimension sizebtnDokter = btnDokter.getPreferredSize();
		Dimension sizebtnFarmasi = btnFarmasi.getPreferredSize();
	
		lbjudul.setBounds(160,20,200,50);
			lbjudul.setFont(new java.awt.Font("Times New Roman", 30, 30));
		lbsubjudul.setBounds(55,65,450,50);
			lbsubjudul.setFont(new java.awt.Font("Times New Roman", 30, 30));
		lbgaris.setBounds(20,90,500,50);
			lbgaris.setFont(new java.awt.Font("Times New Roman", 10, 10));
		lbidentitas.setBounds(8,300,500,50);
			lbidentitas.setFont(new java.awt.Font("Comic sans ms", 15, 13));
		btnDokter.setBounds(100,160,120,sizebtnDokter.height);
		btnFarmasi.setBounds(270,160,120,sizebtnFarmasi.height);
	
		add(lbjudul);
		add(lbsubjudul);
		add(lbgaris);
		add(lbidentitas);
		add(btnDokter);
		add(btnFarmasi);
		
		btnDokter.setBackground(Color.WHITE);
		btnFarmasi.setBackground(Color.WHITE);
		
		btnDokter.addActionListener(this);
		btnFarmasi.addActionListener(this);
		
		setSize(500,380);
		setTitle("Aplikasi Rumah Sakit");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnDokter){
			try{
			new Dokter().setVisible(true);
			}catch(Exception f){
				f.printStackTrace();
			}
			}else if(e.getSource()==btnFarmasi){
				try{
					new Farmasi().setVisible(true);
				}catch(Exception f){
					f.printStackTrace();
				}
		}
		
	}



		
	public static void main(String[] args) throws Exception {
			LoginForm s = new LoginForm();
			s.setVisible(true);
		
			

	
	} 
}
