package ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
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
	

	public SustRateGUI(){
		
		super("SustRate");
		
		Container main = getContentPane();
		main.setLayout(new BorderLayout());
		
		border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		
		JPanel middle = Center();
		
		main.add(middle,BorderLayout.CENTER);
		
		setSize(500,500);
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
		
		dtShow.addColumn("First ID");
		dtShow.addColumn("Second ID");
		
		center.add(scroll,BorderLayout.CENTER);
		
		return center;
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
