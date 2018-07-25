package notebook;


import java.awt.BorderLayout; 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;


public class imagechooser extends JDialog {
  

	
   private JTextField tf_fileName;
    private File imgFile = null;
    private BufferedImage src;
    private String path = null;// ͼƬ��·��
    private String fileName = null;// ԭͼƬ���ļ���
    private DrawImagePanel imagePanel = null; // ����ͼ��������
    public static String temp="";
  	
			
    
    public imagechooser(Frame frame,String title, boolean b) {
        super(frame,title,b);
       
        this.setSize( 700, 600); // ���ô����С��λ��
        
        imagePanel = new DrawImagePanel(); // ����ͼ��������
       
        add(imagePanel); // �ڴ��������ͼ��������
        this.setLocationRelativeTo(null);
        
         JPanel panel = new JPanel();
         FlowLayout flowLayout = new FlowLayout();
        flowLayout.setAlignment(FlowLayout.CENTER);
        panel.setLayout(flowLayout);
        getContentPane().add(panel, BorderLayout.NORTH);
        
        JLabel label_1 = new JLabel();
        label_1.setText("ѡ��ͼƬ��");
        panel.add(label_1);
        
        tf_fileName = new JTextField();
        tf_fileName.setPreferredSize(new Dimension(200, 25));
        panel.add(tf_fileName);
        
       JButton button_2 = new JButton();
        panel.add(button_2);
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();// �����ļ�ѡ����
                FileFilter filter = new FileNameExtensionFilter(
                        "ͼ���ļ���JPG/GIF/BMP)", "JPG", "JPEG", "GIF", "BMP");// ����������
                fileChooser.setFileFilter(filter);// ���ù�����
                int i = fileChooser.showOpenDialog(null);// ��ʾ�򿪶Ի���
                if (i == JFileChooser.APPROVE_OPTION) {
                    imgFile = fileChooser.getSelectedFile(); // ��ȡѡ��ͼƬ��File����
                    path = imgFile.getParent();// ���ͼƬ��·��
                    fileName = imgFile.getName();// ���ԭͼƬ�ļ���
                    tf_fileName.setText(path + "\\" + fileName);// ���ı�������ʾͼƬ������·��
                   
                    
                   temp=path.replace("\\","/")+"/"+fileName;
                   
                 
                }
               
                if (imgFile != null) {
                    try {
                        src = ImageIO.read(imgFile);// ����BufferedImage����
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                imagePanel.repaint();// ����paint����
                
            }
        });
        button_2.setText("ѡ��ͼƬ");
        
        final JPanel panel_1 = new JPanel();
       
        
        JButton bu=new JButton("ȷ��");
        bu.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e)
			 {     
				 
		        writebroad.text.setOpaque(false);  
		        writebroad.text.updateUI();  
				 dispose();
				 
			 }
			 });
        panel_1.add(bu);
         getContentPane().add(panel_1, BorderLayout.SOUTH);
      
    }
    
    // ���������
    class DrawImagePanel extends JPanel {
        public void paint(Graphics g) {
            g.drawImage(src, 0, 0, getWidth(), getHeight(), this); // ����ָ����ͼƬ
        }
    }
}
