import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ejercicio3 extends JFrame implements KeyListener, ActionListener {
 

	private JPanel contentPane;
	private JTextField txtTexto;
	JLabel etiTexto;
	JButton btnTraspasa1;
	
	
	public ejercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(74, 23, 262, 44);
		txtTexto.addKeyListener(this);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		btnTraspasa1 = new JButton("vaciar");
		btnTraspasa1.setBounds(115, 173, 101, 23);
		btnTraspasa1.addActionListener(this);
		contentPane.add(btnTraspasa1);
		
		etiTexto = new JLabel("");
		etiTexto.setBounds(84, 78, 234, 35);
		contentPane.add(etiTexto);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getSource()== txtTexto) {
			etiTexto.setText(txtTexto.getText());
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnTraspasa1) {
			txtTexto.setText("");
			etiTexto.setText("");
			
		}
		
		
	}
}
