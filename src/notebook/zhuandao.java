package notebook;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

//ʵ�ֲ˵���  ת������ �Ի���
public class zhuandao extends JDialog implements ActionListener {
	
	JLabel hanghao;
	JTextField shuru;
	JButton zhuandao,quxiao;
	
	public zhuandao (JFrame own,String title,boolean bo)
	{
		
		super(own,title,bo);
	
		hanghao=new JLabel("�к�:");
		
		shuru=new JTextField();
		shuru.addKeyListener(new java.awt.event.KeyAdapter() {   
			
    	    public void keyPressed(KeyEvent eee) {
    	     
    	     if (eee.getKeyCode() == KeyEvent.VK_ENTER)  
    	     {
    	    	 

    				String s = shuru.getText();
    				try{
    					 hangshu = Integer.parseInt(s);
    					 
    					 
    					 
    					 int linenum = 0;
    		             linenum = writebroad.text.getLineOfOffset(writebroad.text.getText().length());
    		                   
    		                   
    		                
    		                
    					 if(hangshu>linenum+1)
    					{
    						 
    						 JOptionPane.showMessageDialog(null, "�����������������������ǰ�ı����ݵ�����������������");
    						
    						 return;
    				   }

    					int position=writebroad.text.getLineStartOffset(hangshu);
    				    
    					JOptionPane.showMessageDialog(null, "ϵͳ�Ѿ�Ϊ���Զ�ת���˵�"+hangshu+"��");
    				     writebroad.text.setCaretPosition(position-1);
    					setVisible(false);
    				 }
    				catch(NumberFormatException ee)
    		      	{
    					JOptionPane.showMessageDialog(null, "Υ�����ָ�ʽ!����������");
    		    		ee.printStackTrace();
    		    	}  
    				catch (BadLocationException e1)
    				{
    						// TODO Auto-generated catch block
    					    
    						dispose();
    						JOptionPane.showMessageDialog(null, "ϵͳ�Ѿ�Ϊ���Զ�ת���˵�"+hangshu+"��");
    						
    				}
    		     }
    	    }
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
		
		
		zhuandao=new JButton("ת��");
		
		zhuandao.addActionListener(this);
		quxiao=new JButton("ȡ��");
		quxiao.addActionListener(this);
		
		
		this.setSize(330,145);
		this.setLocationRelativeTo(null);
	
		
		JPanel pane=new JPanel();
		pane.setLayout(null);
		hanghao.setBounds(10, 10, 50, 30);
		shuru.setBounds(10, 40, 300, 25);
		zhuandao.setBounds(110,70,90,20);
		quxiao.setBounds(210, 70, 90,20);
		pane.add(hanghao);
		pane.add(shuru);
		pane.add(zhuandao);
		pane.add(quxiao);
		this.getContentPane().add(pane);
		
		
		
	
	}

	int hangshu ;
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if(arg0.getSource()==zhuandao)
		{   
			String s = shuru.getText();
			try{
				 hangshu = Integer.parseInt(s);
				 
				 
				 
				 int linenum = 0;
	             linenum = writebroad.text.getLineOfOffset(writebroad.text.getText().length());
	                   
	                   
	                
	                
				 if(hangshu>linenum+1)
				{
					 
					 JOptionPane.showMessageDialog(null, "�����������������������ǰ�ı����ݵ�����������������");
					
					 return;
			   }

				int position=writebroad.text.getLineStartOffset(hangshu);
			    
				JOptionPane.showMessageDialog(null, "ϵͳ�Ѿ�Ϊ���Զ�ת���˵�"+hangshu+"��");
			     writebroad.text.setCaretPosition(position-1);
				setVisible(false);
			 }
			catch(NumberFormatException ee)
	      	{
				JOptionPane.showMessageDialog(null, "Υ�����ָ�ʽ!����������");
	    		ee.printStackTrace();
	    	}  
			catch (BadLocationException e1)
			{
					// TODO Auto-generated catch block
				    
					dispose();
					JOptionPane.showMessageDialog(null, "ϵͳ�Ѿ�Ϊ���Զ�ת���˵�"+hangshu+"��");
					
			}
	    	 }
    
		else if(arg0.getSource()==quxiao)
		{
				dispose();
		}
		}
		
	
}
