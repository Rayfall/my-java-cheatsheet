package BasicExamples;

import javax.swing.JOptionPane;

public class ExBasicGUI {
    public void RunExample() {
        String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+name);		

		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are "+age+" years old");		

		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (CM)"));
		JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");
    }
    
}
