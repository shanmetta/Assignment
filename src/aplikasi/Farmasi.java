package aplikasi;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Farmasi extends JFrame {
	private JTable tabel;
	private JPanel contentPane;
	private String[] kolomTabel = {"Nomor urutan", "Kode Obat"};
	
	private Object[][] dataTabel={
			{"111", "A01256"}, 
			{"112", "A01258"},
			{"113", "A01259"},
			{"114", "A01260"},
			{"115", "A01261"},
			{"116", "A01262"},
			{"117", "A01263"},
	};
	 
	private DefaultTableModel tabelModel = new DefaultTableModel(dataTabel, kolomTabel);
	
	public Farmasi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setBounds(100,90,685,500);
		 contentPane = new JPanel();
		 contentPane.setBorder(new EmptyBorder(2,2,2,2));
		 setContentPane(contentPane);
		 contentPane.setLayout(null);
		 contentPane.setBackground(Color.PINK);
		 
		 JLabel lblData = new JLabel("FARMASI");
		 lblData.setBounds(250,50,200,20);
		 contentPane.add(lblData);
		 lblData.setFont(new java.awt.Font("Elephant", 10, 25));
		 
		 setTitle("RUMAH SAKIT SAHABAT");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 
		JLabel lblDaftar = new JLabel("PLEASE WAIT");
		lblDaftar.setBounds(280,100,300,15);
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

/*	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
*/


}
