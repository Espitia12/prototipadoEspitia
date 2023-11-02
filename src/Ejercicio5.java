
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Ejercicio5 extends JFrame implements MouseListener{

	private JPanel JPanel;
	private JLabel etiPal1,etiPal2,etiPal3,etiPal4,etiOcultar;

	public Ejercicio5() {
		setBackground(SystemColor.desktop);
		setTitle("VENTANA OPERACIONES");
		setForeground(new Color(147, 112, 219));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 464);
		JPanel = new JPanel();
		JPanel.setBackground(Color.WHITE);
		JPanel.setForeground(Color.WHITE);
		JPanel.setBorder(null);

		setContentPane(JPanel);
		setLocationRelativeTo(null);
		JPanel.setLayout(null);
		
		iniciar();
	}

	private void iniciar() {
		// TODO Auto-generated method stub
		
		etiPal1 = new JLabel("Sergio");
		etiPal1.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal1.setBounds(40, 46, 101, 40);
		JPanel.add(etiPal1);
		
		etiPal2 = new JLabel("Andres");
		etiPal2.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal2.setBounds(151, 46, 101, 40);
		JPanel.add(etiPal2);
		
		etiPal3 = new JLabel("Chica");
		etiPal3.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal3.setBounds(278, 46, 101, 40);
		JPanel.add(etiPal3);
		
		etiPal4 = new JLabel("Jaimes");
		etiPal4.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal4.setBounds(151, 117, 101, 40);
		JPanel.add(etiPal4);
		
		etiOcultar = new JLabel("Ocultar");
		etiOcultar.setForeground(Color.RED);
		etiOcultar.setBackground(Color.RED);
		etiOcultar.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcultar.setBounds(151, 206, 101, 40);
		etiOcultar.addMouseListener(this);
		JPanel.add(etiOcultar);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==etiOcultar) {
			etiPal1.setVisible(false);
			etiPal2.setVisible(false);
			etiPal3.setVisible(false);
			etiPal4.setVisible(false);			
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==etiOcultar) {
			etiPal1.setVisible(true);
			etiPal2.setVisible(true);
			etiPal3.setVisible(true);
			etiPal4.setVisible(true);			
		}
	}
}
