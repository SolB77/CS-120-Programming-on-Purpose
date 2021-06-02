import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.Insets;

public class BoardGUI extends JFrame implements ActionListener {
private int n;	
private JButton button;

	public BoardGUI(int size) {
		int i;
		int j;
		n = size;
		JButton button = null;
		this.setLayout(new GridBagLayout());
		Container gameBoard = this.getContentPane();
		gameBoard.setLayout(new GridLayout(n, n));
		
		
		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				String label = String.valueOf(j + (i * 3));
				button = new JButton(label);
				gameBoard.add(button);
				button.addActionListener(this);
			}
		}
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		
	}
	
	public static void main(String[] args) {
		BoardGUI frame = new BoardGUI(3);
		frame.setTitle("Find or Die");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setVisible(true);
		}

	}

