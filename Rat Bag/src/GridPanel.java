import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridPanel extends JPanel {
	
	public GridPanel() {
	setLayout(new GridBagLayout());
	
	GridBagConstraints gbc = new GridBagConstraints();
		
	JLabel lbl = new JLabel("Coolometer High, bro");
	
	gbc.gridx = 7;
	gbc.gridy = 0;
	
	add(lbl, gbc);
	//the gbc's values are extracted and put on lbl
	
	
	JTextField enter = new JTextField("");
	gbc.gridx += 1;
	enter.setPreferredSize(new Dimension(200,30));
	
	add(enter, gbc);
	
	
	JButton button = new JButton("Bro");
	gbc.gridx = 7;
	gbc.gridy = 1;
	gbc.gridwidth = 2;
	
	add(button, gbc);
	}

}
