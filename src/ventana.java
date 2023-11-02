import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JButton;
 
public class ventana extends JFrame  implements ActionListener{

	private JPanel contentPane;
	JLabel etiNombre;
	JLabel etiCiudad;
	JButton btnOcultarNombre;
	JButton btnOcultarCiudad;
	JButton btnVisualizarNombe;
	JButton btnVisualizarCiudad;
	
	public ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiNombre = new JLabel("Espitia");
		etiNombre.setBounds(67, 48, 46, 14);
		contentPane.add(etiNombre);
		
		etiCiudad = new JLabel("Calarca");
		etiCiudad.setBounds(311, 48, 46, 14);
		contentPane.add(etiCiudad);
		
		btnOcultarNombre = new JButton("Ocultar Nombre");
		btnOcultarNombre.setBounds(46, 124, 132, 23);
		btnOcultarNombre.addActionListener(this);
		contentPane.add(btnOcultarNombre);
		
		
		btnOcultarCiudad = new JButton("Ocultar Ciudad");
		btnOcultarCiudad.setBounds(276, 124, 120, 23);
		btnOcultarCiudad.addActionListener(this);
		contentPane.add(btnOcultarCiudad);
		
		btnVisualizarNombe = new JButton("Visualizar nombe");
		btnVisualizarNombe.setBounds(67, 184, 132, 23);
		btnVisualizarNombe.addActionListener(this);
		contentPane.add(btnVisualizarNombe);
		
		btnVisualizarCiudad = new JButton("Visualizar Ciudad");
		btnVisualizarCiudad.setBounds(236, 184, 132, 23);
		btnVisualizarCiudad.addActionListener(this);
		contentPane.add(btnVisualizarCiudad);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (btnOcultarNombre == e.getSource()) {
			etiNombre.setVisible(false);
		}else if (btnVisualizarNombe == e.getSource()) {
			etiNombre.setVisible(true);
		}else if (btnOcultarCiudad  == e.getSource()) {
			etiCiudad.setVisible(false);
		}else if (btnVisualizarCiudad == e.getSource()) {
			etiCiudad.setVisible(true);
		}
		
		
	}
}
