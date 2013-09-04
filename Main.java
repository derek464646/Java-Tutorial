package YoutubeTutorial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main extends JFrame{
	
	public JButton jb = new JButton("CLICK HERE");
	public JTextField jt = new JTextField(20);
	
	public JPanel jp = new JPanel();
	
	public Main()
	{
		super("Youtube Tutorial");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setResizable(false);
		setVisible(true);
		jb.addActionListener(new ActionListener(){

		
			public void actionPerformed(ActionEvent e) {
				jt.setText("You are all awesome YouTubers!!");
				
			}
			
		});
		jp.add(jt);
		jp.add(jb);
		add(jp);
		
	}
	
	public static void main(String args[]){
		new Main();
	}
}
