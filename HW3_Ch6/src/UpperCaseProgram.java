import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class UpperCaseProgram extends JFrame{

	public UpperCaseProgram() {
		setTitle("Capitolize Your String");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		Container pane = getContentPane();
		
		JLabel inputS = new JLabel ("Enter the string to convert: ",
				SwingConstants.RIGHT);
		
		JLabel outputS = new JLabel ("Converted string: ",
				SwingConstants.RIGHT);
		
		JButton b=new JButton("Submit"); 
		
		JTextField inputTF = new JTextField(30);
		
		JTextField outputTF = new JTextField(30);
		
		pane.setLayout(new FlowLayout());
		pane.add(inputS);
		pane.add(inputTF);
		pane.add(outputS);
		pane.add(outputTF);
		pane.add(b);
		
		b.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
					String userString = inputTF.getText();
					
					//	Actually converting to upper case!!!
					userString = userString.toUpperCase();
					
					outputTF.setText(userString);				
			}          
		});
	}
	
}
