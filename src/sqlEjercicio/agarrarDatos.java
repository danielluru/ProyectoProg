package sqlEjercicio;


import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class agarrarDatos extends  javax.swing.JFrame{
	JFrame f= new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("End");
	
	public agarrarDatos() {
		JTextField textField=new JTextField("HOLA");
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel.add(textField);
		f.add(panel);
		f.setSize(350, 350);
		f.setVisible(true);
	}
}
