package notebook;
import java.awt.event.*; 

import javax.swing.*;

import java.awt.*;
import java.util.Iterator;
import java.util.TreeMap;

public class tongji extends JDialog
{
	JLabel tongji;
	JTextField shuru;
	JButton tongjibu,tongjiAll,quxiao;
	JCheckBox qufen;
	JRadioButton up,down;
	
	tongji(Frame frame,String title, boolean b)
	 {
		super(frame,title,b);
		tongji=new JLabel("������Ҫͳ�Ƴ��ֵ��ı�����(T):");
		
		shuru=new JTextField();
		shuru.addKeyListener(new java.awt.event.KeyAdapter() {   
			
		    public void keyPressed(KeyEvent eee) {
		    	tongjibu.setEnabled(true);
		     if (eee.getKeyCode() == KeyEvent.VK_ENTER)  
		     {
		    	 
		    
		    	 setVisible(false);
		     }}
		   });
		shuru.addMouseMotionListener(new MouseMotionAdapter(){
	     public void mouseMoved(MouseEvent ee){
	     	
	         shuru.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
	  }

		});
		shuru.addMouseListener(new MouseAdapter()
		{
			@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
				shuru.setBorder(javax.swing.BorderFactory.createLineBorder(Color.blue));
		}
		});
		
		tongjibu=new JButton("ͳ�Ƴ��ִ���");
		tongjibu.setEnabled(false);

		tongjiAll=new JButton("ȫ������ͳ��");
		
		quxiao=new JButton("ȡ��");
		
		
		
		this.setSize(425,155);
		this.setLocationRelativeTo(null);

		
		JPanel pane=new JPanel();
		pane.setLayout(null);
	
		
		tongji.setBounds(10, 10,200, 30);
		shuru.setBounds(10, 46,255, 25);
		tongjibu.setBounds( 273,48,120, 22);
		tongjiAll.setBounds(10, 83,120,20);
	    quxiao.setBounds(273, 83, 70,20);
		
		
		
		pane.add(tongji);
		pane.add(shuru);
		pane.add(tongjibu);
		pane.add(tongjiAll);
		pane.add(quxiao);
		
		
		this.getContentPane().add(pane);
		
		
		tongjibu.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String search = shuru.getText();
				String textst=writebroad.text.getText();
				
				
				int count=0;
					//�ҳ�����"abcd"��λ�ã����Ҵ�ӡ���ִ�������ѭ��+ָ����ʼλ�ã�
					int t=0;
				for(int i=0;i<textst.length();i++)
				{			
					t=textst.indexOf(search,i);
					if(t!=-1)
					{
						count++;//��������
						i=t;//ָ����ʼλ��
					}
				}
					JOptionPane.showMessageDialog(null, "���ֵĴ���Ϊ��"+count);
					
			}});
		

		 tongjiAll.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent e)
		 {     
			    String E1 = "[\u4e00-\u9fa5]";// ����
		        String E2 = "[a-zA-Z]";// Ӣ��
		        String E3 = "[0-9]";// ����
		 
		        int chineseCount = 0;
		        int englishCount = 0;
		        int numberCount = 0;
		 
		        String temp;
		        for (int i = 0; i < writebroad.text.getText().length(); i++)
		        {
		            temp = String.valueOf(writebroad.text.getText().charAt(i));
		            if (temp.matches(E1))
		            {
		                chineseCount++;
		            }
		            if (temp.matches(E2))
		            {
		                englishCount++;
		            }
		            if (temp.matches(E3))
		            {
		                numberCount++;
		            }
		        }
		          String s1="           ������:     "+ chineseCount+"��\n";
		          String s2="           Ӣ����:     "+ englishCount+"��\n";
		          String s3="           ������:     "+numberCount+"��\n";
		          String s4="           �����ַ�:   " + (writebroad.text.getText().length() - (chineseCount + englishCount + numberCount))+"��\n";
		    
		          String count=s1+s2+s3+s4;
		          
		          JOptionPane.showMessageDialog(null,count,"��Ϣ�Ի���",JOptionPane.PLAIN_MESSAGE);
			 
		 }
		 });

		 quxiao.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent e)
		 {     
			 dispose();
		 }
		 });



	} 
} 
		
	
 
 
	
	

	


 

 

 