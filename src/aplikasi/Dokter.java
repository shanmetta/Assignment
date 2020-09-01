package aplikasi;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Dokter extends JFrame{
	
	private JTable tabel;
	private JPanel contentPane;
	private String[] kolomTabel = {"Kode Dokter", "Nama Dokter", "Jadwal Praktek"};
	
	private Object[][] dataTabel={
			{"001", "Dr. Imelda", "Selasa"}, 
			{"002", "Dr. Johan", "Kamis"},
			{"003", "Dr. Budi", "Sabtu"},
			{"004", "Drg. Tania", "Senin"},
			{"005", "Dr. Amalia Spkk", "Rabu"}
	};
	
	private DefaultTableModel tabelModel = new DefaultTableModel(dataTabel, kolomTabel);
			 
			 public Dokter(){
				 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 setBounds(100,90,685,500);
				 contentPane = new JPanel();
				 contentPane.setBorder(new EmptyBorder(2,2,2,2));
				 setContentPane(contentPane);
				 contentPane.setLayout(null);
				 contentPane.setBackground(Color.PINK);
				 
				 JLabel lblData = new JLabel("DATA DOKTER");
				 lblData.setBounds(250,50,200,20);
				 contentPane.add(lblData);
				 lblData.setFont(new java.awt.Font("Elephant", 10, 20));
				
				 
				 setTitle("RUMAH SAKIT SAHABAT");
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				 
				JLabel lblDaftar = new JLabel("JADWAL KEHADIRAN DOKTER");
				lblDaftar.setBounds(250,100,300,15);
				contentPane.add(lblDaftar);
				 
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(70,150,525,70);
				contentPane.add(scrollPane);
				
				tabel = new JTable();
				tabel.setModel(tabelModel);
				 
			scrollPane.setViewportView(tabel);
				tabel.addMouseListener(new MouseAdapter(){
				public void mouseReleased(MouseEvent e){
						int a = tabel.getSelectedRow();
					if(a<0){
							return;
						}
	
					}
			 });
			 }
		
		
	
		
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	}
