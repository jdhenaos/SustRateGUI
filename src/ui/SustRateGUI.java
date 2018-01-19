package ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class SustRateGUI extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private Border border;
	private JButton bOpen, bSave, bCalculate;
	private DefaultTableModel dtShow;
	private JTable table;
	private File infile;
	private JFileChooser jChooser;
	
	public SustRateGUI(){
		
		super("SustRate");
		
		Container main = getContentPane();
		main.setLayout(new BorderLayout());
		
		border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		
		JPanel middle = Center();
		JPanel east = Right();
		
		main.add(middle,BorderLayout.CENTER);
		main.add(east,BorderLayout.SOUTH);
		
		bOpen.addActionListener(new Opener());
		
		setSize(900,500);
		setVisible(true);
		
		this.addWindowListener(new Close());
		
	}
	
	public JPanel Center(){
		
		JPanel center = new JPanel(new BorderLayout());
		
		TitledBorder title = BorderFactory.createTitledBorder(border,"Result");
		center.setBorder(title);
		
		table = new JTable();
		dtShow = (DefaultTableModel) table.getModel();
		
		JScrollPane scroll = new JScrollPane(table);
		
		dtShow.addColumn("First_ID");
		dtShow.addColumn("Second_ID");
		dtShow.addColumn("P1ij");
		dtShow.addColumn("P2ij");
		dtShow.addColumn("Qij");
		dtShow.addColumn("GAPij");
		dtShow.addColumn("K1");
		dtShow.addColumn("K2");
		dtShow.addColumn("Bij");
		dtShow.addColumn("K3");
		
		center.add(scroll,BorderLayout.CENTER);
		
		return center;
	}
	
	public JPanel Right(){
		
		JPanel right = new JPanel(new FlowLayout(FlowLayout.CENTER));

		
		TitledBorder title = BorderFactory.createTitledBorder(border,"Options");
		right.setBorder(title);
		
		bOpen = new JButton("Open");
		bSave = new JButton("Save");
		bCalculate = new JButton("Calculate");
		
		right.add(bOpen);
		right.add(bCalculate);
		right.add(bSave);
		
		return right;
	}
	
	class Opener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			jChooser = new JFileChooser();
			jChooser.showOpenDialog(bOpen);
			
			infile = jChooser.getSelectedFile();
			
		}
		
	}
	
	class Close implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			setVisible(false);
			dispose();
			System.exit(0);
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SustRateGUI();

	}

}
