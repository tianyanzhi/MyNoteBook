package notebook;
import java.awt.event.ActionEvent;    
import java.awt.event.ActionListener;
import java.awt.print.PrinterJob;



import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class writebroadMain implements ActionListener{

	 
	 
	
	public static void main(String args[]) throws InterruptedException 
	{ 
		
		writebroad my=new writebroad();
	    my.setVisible(true);
	    my.setLocationRelativeTo(null);
	    my.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	    }
	   
	   
	static void  setLookAndFeel(String skin){
	    	try {
	    	UIManager.setLookAndFeel(skin);
	    	} catch (ClassNotFoundException e) {
	    	e.printStackTrace();
	    	} catch (InstantiationException e) {
	    	e.printStackTrace();
	    	} catch (IllegalAccessException e) {
	    	e.printStackTrace();
	    	} catch (UnsupportedLookAndFeelException e) {
	    	e.printStackTrace();
	    	}
	    	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==writebroad.print)
		{   PrinterJob job = PrinterJob.getPrinterJob(); // ��ô�ӡ����
	        if (!job.printDialog()) { // �򿪴�ӡ�Ի���
	            return; // ������ӡ�Ի����ȡ����ť��رմ�ӡ�Ի�����������ִ��
	        }
	        job.setJobName("��ӡ�Ի���"); // ���ô�ӡ���������
	        String jobName = job.getJobName(); // ��� ��ӡ���������
	        JOptionPane.showMessageDialog(null,"��ӡ����������ǣ�  " + jobName);
	}
		
	
	
	}
}
