package sqlEjercicio;


import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class agarrarDatos extends  javax.swing.JFrame{
	JFrame f= new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("End");
	
	public agarrarDatos() {
		JTextField textField=new JTextField("HOLA");
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		JLabel label1 = new JLabel("Test");		
		JLabel label2 = new JLabel("Test2");
		JTextField textField2=new JTextField("HOLA2");
		panel.add(label1);
		panel.add(textField);
		panel.add(label2);
		panel.add(textField2);
		f.add(panel);
		f.setSize(350, 350);
		f.setVisible(true);
	}
}