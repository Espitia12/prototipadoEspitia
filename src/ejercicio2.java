import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ejercicio2 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textTexto;
	JLabel etiTexto1;
	JLabel etiTexto2;
	JButton btnTraspasa1;
	JButton btnTraspasa2;
	
	public ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiTexto1 = new JLabel("");
		etiTexto1.setBounds(24, 147, 140, 40);
		contentPane.add(etiTexto1);
		
		etiTexto2 = new JLabel("");
		etiTexto2.setBounds(223, 147, 140, 40);
		contentPane.add(etiTexto2);
		
		textTexto = new JTextField();
		textTexto.setBounds(74, 23, 262, 44);
		contentPane.add(textTexto);
		textTexto.setColumns(10);
		
		btnTraspasa1 = new JButton("Traspasa 1");
		btnTraspasa1.setBounds(81, 100, 101, 23);
		btnTraspasa1.addActionListener(this);
		contentPane.add(btnTraspasa1);
		
		btnTraspasa2 = new JButton("Traspasa 2");
		btnTraspasa2.setBounds(226, 100, 110, 23);
		btnTraspasa2.addActionListener(this);
		contentPane.add(btnTraspasa2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnTraspasa1 == e.getSource()) {
			etiTexto1.setText(textTexto.getText());
			
		}else if (btnTraspasa2 == e.getSource()) {
			etiTexto2.setText(textTexto.getText());
			
		}
		
	}
}
