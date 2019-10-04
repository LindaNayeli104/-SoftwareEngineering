//---------------------------------------------------------------------------------------------------------VENTANA
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class Triangle_GUI extends JFrame {
	
	public Triangle_GUI(){
		super("Getting triangle area");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ConfiguracionPanel pe = new ConfiguracionPanel();
		this.add(pe);
		this.pack();
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}
	public static void main(String[] args) { 
		 Triangle_GUI ep = new Triangle_GUI();
	 }
	
	
	

//-------------------------------------------------------------------------------------------------------CONTROLES
//Clase Configuracion
class ConfiguracionPanel extends JPanel implements ActionListener{
	
	private Image img;
	private JLabel x1_label,
				   x2_label,
				   x3_label,
				   y1_label,
				   y2_label,
				   y3_label,
				   area_label;
	

	private JTextField x1_tf,
					   x2_tf,
					   x3_tf,
					   y1_tf,
					   y2_tf,
					   y3_tf;

	private JButton btnCalcula;
	
	public ConfiguracionPanel(){
		super();
		this.setPreferredSize(new Dimension(500,500));
		this.img = new ImageIcon("triangulos.jpg").getImage();
		
		//New
		this.x1_label = new JLabel("x1");
		this.x2_label= new JLabel("x2");
		this.x3_label = new JLabel("x3");
		this.y1_label = new JLabel("y1");
		this.y2_label= new JLabel("y2");
		this.y3_label = new JLabel("y3");
		this.area_label = new JLabel(" ");
		
		this.x1_tf = new JTextField(10);
		this.x2_tf = new JTextField(10);
		this.x3_tf = new JTextField(10);
		this.y1_tf = new JTextField(10);
		this.y2_tf = new JTextField(10);
		this.y3_tf = new JTextField(10);
		
		
		
		

		this.btnCalcula=new JButton("Calcula Área");
		this.btnCalcula.addActionListener(this);
		
		//Add		
        
		this.add(x1_label);
		this.add(x1_tf);
				
		this.add(y1_label);
		this.add(y1_tf);
			
		this.add(x2_label);
		this.add(x2_tf);
		
		this.add(y2_label);
		this.add(y2_tf);

		
		this.add(x3_label);
		this.add(x3_tf);
		
		this.add(y3_label);
		this.add(y3_tf);
		
		this.add(btnCalcula);
		
		this.add(area_label);
		
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(this.img, 0, 0, this.getWidth(),  this.getHeight(),  this);
		
		g.setFont(new Font("Impact",Font.PLAIN , 45));
		g.drawString("ÁREA", 200,55);
		g.drawString("TRIÁNGULO", 155,105);
		x1_label.setLocation(175, 150);
		y1_label.setLocation(175, 175);
		x2_label.setLocation(175, 225);
		y2_label.setLocation(175, 250);
		x3_label.setLocation(175, 300);
		y3_label.setLocation(175, 325);
		
		
		x1_tf.setLocation(200, 150);
		y1_tf.setLocation(200, 175);
		x2_tf.setLocation(200, 225);
		y2_tf.setLocation(200, 250);
		x3_tf.setLocation(200, 300);
		y3_tf.setLocation(200, 325);
		
		btnCalcula.setLocation(200, 375);
		
		area_label.setFont(new Font("Impact", Font.PLAIN, 25));
		area_label.setLocation(190, 425);
		
	}

	public void actionPerformed(ActionEvent e) {
		
		
		Triangle tri = new Triangle(Double.parseDouble(x1_tf.getText()),Double.parseDouble(x2_tf.getText()), Double.parseDouble(x3_tf.getText()), Double.parseDouble(y1_tf.getText()), Double.parseDouble(y2_tf.getText()), Double.parseDouble(y3_tf.getText()));
				area_label.setText("Area: " + String.valueOf(tri.get_Area()) + " m^2");   //Concatenar area
			}
			
	}		
}




 
