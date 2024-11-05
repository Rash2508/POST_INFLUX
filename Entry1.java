import java.awt.EventQueue;


import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
public class Entry1 implements ActionListener{
	JFrame f=new JFrame("ARASP");
	JLabel L1=new JLabel("ARASP website");
	JLabel L2=new JLabel("POST INFLUX");
	JButton b1=new JButton("Register");
	JButton btnNewButton=new JButton("Smsg");
	JButton btnNewButton_1=new JButton("Dmsg");
	//JButton btnNewButton_2=new JButton("<Back");
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entry1 window = new Entry1();
					window.f.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Entry1() {
		initialize();
	}
	private void initialize() {
		L1.setBounds(10,184,800,50);
		L1.setFont(new Font("Arial", Font.PLAIN, 40));
		L1.setForeground(Color.black);
		L2.setBounds(638,215,700,100);
		L2.setFont(new Font("Gabriola", Font.BOLD, 60));
		L2.setForeground(new Color(255, 0, 0));
		b1.setFont(new Font("Arial", Font.PLAIN, 20));
		b1.setBounds(10,265,130,50);
		b1.addActionListener((ActionListener) this);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(293, 319, 882, 430);
		f.getContentPane().add(lblNewLabel);
		f.getContentPane().add(L1);
		f.getContentPane().add(L2);
		f.getContentPane().add(b1);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(Color.white);//0x12345  123,50,255
		f.setSize(2000,2000);
		f.getContentPane().setLayout(null);
		JLabel L3 = new JLabel(" ");
		L3.setBounds(110, 390, 917, 494);
		f.getContentPane().add(L3);
        Image i1 = new ImageIcon(this.getClass().getResource("/img4.png")).getImage();
        lblNewLabel.setIcon(new ImageIcon(i1));
        //Image i2 = new ImageIcon(this.getClass().getResource("/img5.png")).getImage();
		
		//JButton btnNewButton = new JButton("Smsg");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 20));
		btnNewButton.setBounds(139, 265, 119, 50);
		btnNewButton.addActionListener((ActionListener)this);
		f.getContentPane().add(btnNewButton);
		//JButton btnNewButton_1 = new JButton("Dmsg");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 20));
		btnNewButton_1.setBounds(257, 265, 130, 50);
		btnNewButton_1.addActionListener((ActionListener)this);
		f.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\rashm\\Downloads\\img8.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1370, 172);
		f.getContentPane().add(lblNewLabel_1);
		//lblNewLabel_1.setIcon(new ImageIcon("E:\\3-1 project\\img6.png"));
		//lblNewLabel_1.setBounds(40, 57, 1464, 133);
		Image i2 = new ImageIcon(this.getClass().getResource("/img6.png")).getImage();
		
		
		
		
		f.setVisible(true);
		ImageIcon i= new ImageIcon("img1.jpg");
		f.setIconImage(i.getImage());
	}
	public void actionPerformed(ActionEvent e)
	{  
		//Smsg obj5=new  Smsg();
		//obj5.setVisible(true);
		//setVisible(false);
		
		if(e.getSource()==b1) {
			f.dispose();
			Reg1 obj2 = new Reg1();
		}
		else if(e.getSource()==btnNewButton) {
			f.dispose();
			Smsg obj3 = new Smsg();
		}
		else if(e.getSource()==btnNewButton_1) {
			f.dispose();
			Dmsg obj4 = new Dmsg();
		}
		
}
	private void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	public void actionPerformed1(ActionEvent e)
	{
		
	}
}
