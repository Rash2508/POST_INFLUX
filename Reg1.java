import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;
public class Reg1 implements ActionListener {
	//JLabel L0=new JLabel("ARASP website");
	JFrame f=new JFrame("ARASP");
	JLabel L5=new JLabel("Bulk mails and message service");
	JLabel L1=new JLabel("Email:");
	JLabel L2=new JLabel("Phone: ");
	JLabel L3=new JLabel("Name : ");
	JLabel L4=new JLabel("Branch : ");
	JTextField t1=new JTextField();
	JTextField t2=new JTextField();
	JTextField t3=new JTextField();
	JTextField t4=new JTextField();
	JButton b=new JButton("Register");
	JButton b3=new JButton("<Back");
	//private final JTextField textField = new JTextField();
	private final JButton b5 = new JButton("Smsg");
	private final JButton btnNewButton_1 = new JButton("Dmsg");
	//private final JLabel lblNewLabel_1 = new JLabel("ARASP WEBSITE");
	private final JLabel lblNewLabel_2 = new JLabel("<html><u>STUDENTS' REGISTRATION FORM</u></html>");
	//lblNewLabel_1.setFont(new Font("ITALIC", Font.PLAIN, 45));
	//lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 30));
	private final JLabel lblNewLabel = new JLabel("");
	private final JLabel lblNewLabel_3 = new JLabel("New label");
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reg1 window = new Reg1();
					window.f.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Reg1() {
		initialize();
	}
	private void initialize() {
		//lblNewLabel_1.setBounds(77,145,393,131);
		//lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 40));
		//lblNewLabel_1.setForeground(Color.black);
		L5.setBounds(77,181,800,50);
		L5.setFont(new Font("Arial", Font.BOLD, 30));
		L5.setForeground(Color.white);
		L1.setBounds(569,499,200,30);
		L1.setFont(new Font("Arial", Font.BOLD, 30));
		t1.setBounds(781,353,320,30);
		t1.setBorder(new LineBorder(Color.GREEN,5));
		t1.setFont(new Font("Arial", Font.PLAIN, 15));
		L2.setBounds(569,430,200,30);
		L2.setFont(new Font("Arial", Font.BOLD, 30));
		t2.setBounds(781,430,258,30);
		t2.setBorder(new LineBorder(Color.GREEN,5));
		t2.setFont(new Font("Arial", Font.PLAIN, 15));
		L3.setBounds(569,353,200,30);
	    L3.setFont(new Font("Arial", Font.BOLD, 30));
		t3.setBounds(779,499,343,30);
		t3.setFont(new Font("Arial", Font.PLAIN, 15));
		t3.setBorder(new LineBorder(Color.GREEN,5));
		L4.setBounds(569,565,200,30);
		L4.setFont(new Font("Arial", Font.BOLD, 30));
		t4.setBounds(781,565,160,30);
		t4.setFont(new Font("Arial", Font.PLAIN, 15));
		t4.setBorder(new LineBorder(Color.GREEN,5));
		b.setFont(new Font("Arial", Font.PLAIN, 20));
		b.setBounds(699,635,130,58);
		b.addActionListener(this);
		b3.setFont(new Font("Arial", Font.PLAIN, 20));
		b3.setBounds(81,258,130,50);
		lblNewLabel_2.setFont(new Font("italic", Font.ITALIC, 30));
		b3.addActionListener(this);
		f.getContentPane().add(L1);
		f.getContentPane().add(t1);
		f.getContentPane().add(L2);
		f.getContentPane().add(t2);
		f.getContentPane().add(b);
		f.getContentPane().add(b3);
		f.getContentPane().add(L3);
		f.getContentPane().add(t3);
		f.getContentPane().add(L4);
		f.getContentPane().add(L5);
		f.getContentPane().add(t4);
		//f.getContentPane().add(lblNewLabel_1);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f.getContentPane().setBackground(Color.GRAY);
		f.setSize(2000,2000);
		f.getContentPane().setLayout(null);
		//textField.setFont(new Font("Arial", Font.PLAIN, 20));
		//textField.setBounds(800, 618, 130, 30);
		
		//f.getContentPane().add(textField);
		b5.setBounds(208, 258, 105, 50);
		b5.setFont(new Font("Arial", Font.PLAIN, 20));
		b5.addActionListener(this);
		f.getContentPane().add(b5);
		btnNewButton_1.setBounds(310, 258, 105, 50);
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(this);
		f.getContentPane().add(btnNewButton_1);
		//lblNewLabel.setIcon(new ImageIcon("E:\\3-1 project\\img6.png"));
		Image i2 = new ImageIcon(this.getClass().getResource("/img6.png")).getImage();
		//lblNewLabel_1.setBounds(80, 208, 393, 46);
		lblNewLabel_2.setFont(new Font("ITALIC", Font.PLAIN, 45));
	    lblNewLabel_2.setBackground(Color.YELLOW);
	    lblNewLabel_2.setOpaque(true);
		//f.getContentPane().add(lblNewLabel_1);
		lblNewLabel_2.setBounds(194, 33, 1050, 85);
		lblNewLabel_2.setFont(new Font("BOLD", Font.PLAIN, 60));
		f.getContentPane().add(lblNewLabel_2);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\rashm\\Downloads\\img10.jpg"));
		lblNewLabel.setBounds(77, 11, 117, 126);
		
		f.getContentPane().add(lblNewLabel);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\rashm\\Downloads\\img3.jpg"));
		lblNewLabel_3.setBounds(-194, -162, 1598, 911);
		
		f.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\rashm\\Downloads\\img10.jpg"));
		lblNewLabel_1.setBounds(81, 30, 85, 109);
		f.getContentPane().add(lblNewLabel_1);
		f.setVisible(true);
		ImageIcon i= new ImageIcon("img1.jpg");
		f.setIconImage(i.getImage());
	}
	private void setLayout(FlowLayout flowLayout) {
		
	}
	private void setContentPane(JLabel jLabel) {
		
	}

	public void actionPerformed(ActionEvent e)
	{  	
		String s1,s2,s3,s4;
		  s1 =t1.getText();
		  s2 =t2.getText();
		  s3 =t3.getText();
		  s4 =t4.getText();
		  if(e.getSource() == b)
		   {    
		      try {
		      // Class.forName("com.mysql.jdbc.Driver");
		       Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/arasp", "root", "2508");//Establishing connection
		       System.out.println("Connected With the database successfully");
		       String q = "insert into register(Name,Phone,Email,Branch)" + "values(?,?,?,?)";
		       PreparedStatement ps = connection.prepareStatement(q);
		       ps.setString(1,(String) s1);
		       ps.setString(2,(String) s2);        
		       ps.setString(3,(String) s3);     
		       ps.setString(4,(String) s4);    
		       ps.execute();
		       connection.close();
		       JOptionPane.showMessageDialog(null,"Data is successfully inserted");
		      } 
		      catch (SQLException e1) 
		      {
		       System.out.println("Error while connecting to the database"+e1);
		      }
		     t1.setText("");
		     t2.setText("");
		     t3.setText("");
		     t4.setText("");
		   }
		  /*else if(e.getActionCommand().equals("Smsg")){
			f.dispose();
			Smsg obj1 = new Smsg();
		} 
	 else if(e.getActionCommand().equals("Dmsg")) {
			f.dispose();
			Dmsg obj1 = new Dmsg();
		}*/
		  if(e.getSource()==b3){
			f.dispose();
			Entry1 obj1 = new Entry1();
		}
		  if(e.getSource()==b5){
				f.dispose();
				Smsg obj1 = new Smsg();
		  }
		  if(e.getSource()==btnNewButton_1){
				f.dispose();
				Dmsg obj1 = new Dmsg();
		  }
		}
public void actionPerformed1(ActionEvent e) {
	// TODO Auto-generated method stub	
}
	}  