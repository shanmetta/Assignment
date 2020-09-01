package aplikasi;


import java.awt.Color; 

//import java.awt.Component;
import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginForm extends JFrame implements ActionListener{

	Container konten = getContentPane();
	
	private JLabel lblUser = new JLabel("Username: ");
	private JTextField txtUser = new JTextField();

	private JLabel lblPw = new JLabel("Password: ");
	private JPasswordField pwPassword = new JPasswordField();
	
	private JButton btnLogin = new JButton("Login");
	private JButton btnCancel = new JButton("Cancel");
	
	Color warna = Color.PINK;
	
	public LoginForm() {
		setVisible(true); 
		setSize(350, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		konten.setLayout(null);
		konten.setBackground(warna);
		
		lblUser.setBounds(130,10,100,25);
		txtUser.setBounds(70,50,200,25);
		konten.add(lblUser);
		konten.add(txtUser);
		txtUser.setToolTipText("Masukkan username anda");
		lblUser.setForeground(Color.WHITE);
		
		lblPw.setBounds(130,95,100,25);
		pwPassword.setBounds(70,135,200,25);
		konten.add(lblPw);
		konten.add(pwPassword);
		pwPassword.setToolTipText("Masukkan Password Anda");
		lblPw.setForeground(Color.WHITE);
		
		btnLogin.setBounds(60, 200, 100, 25);
		konten.add(btnLogin);
		btnCancel.setBounds(190, 200, 100, 25);
		konten.add(btnCancel);
		
		btnLogin.addActionListener(this);
		btnCancel.addActionListener(this);
		
		
	}

	public static void main(String[] args) {
		new LoginForm();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==btnLogin){
			String userapp = txtUser.getText();
			String passwordapp = pwPassword.getText();
			if(userapp.equalsIgnoreCase("admin")&&passwordapp.equalsIgnoreCase("admin")){
				JOptionPane.showMessageDialog(null, "Welcome");
					LoginForm.this.setVisible(false);
					
					new MainMenu().setVisible(true);		
			}else{
				JOptionPane.showMessageDialog(null, "You're LogOut");
					LoginForm.this.setVisible(false);
			}
		}else if(obj==btnCancel){
			JOptionPane.showMessageDialog(null, "You're LogOut");
				System.exit(0);
		}
		
		txtUser.setText(" ");
		pwPassword.setText(" ");
		txtUser.setRequestFocusEnabled(true);
	}
	private String pwPassword(){
		return null;

}
}