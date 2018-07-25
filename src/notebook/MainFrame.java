package notebook;





import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame {
private JPanel contentPane;
private BorderLayout borderLayout1 = new BorderLayout();
private JLabel jLabel1 = new JLabel();

//Construct the frame
public MainFrame() {
  enableEvents(AWTEvent.WINDOW_EVENT_MASK);
  try {
    jbInit();
  }
  catch(Exception e) {
    e.printStackTrace();
  }
}
//Component initialization
private void jbInit() throws Exception  {
  //setIconImage(Toolkit.getDefaultToolkit().createImage(MainFrame.class.getResource("[Your Icon]")));
  contentPane = (JPanel) this.getContentPane();
  jLabel1.setToolTipText("");
  jLabel1.setDisplayedMnemonic('0');
  jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
  jLabel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
  jLabel1.setText("<html><body><font size=10 ><a href=http://www.zqu.edu.cn>’ÿ  «Ï  —ß  ‘∫</a></font></body></html>");
  jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseReleased(MouseEvent e) {
      jLabel1_mouseReleased(e);
    }
  });
  contentPane.setLayout(borderLayout1);
  this.setSize(new Dimension(398, 158));
  this.setTitle("JLabelDemo2");
  contentPane.add(jLabel1, BorderLayout.CENTER);
}
//Overridden so we can exit when window is closed
protected void processWindowEvent(WindowEvent e) {
  super.processWindowEvent(e);
  if (e.getID() == WindowEvent.WINDOW_CLOSING) {
    System.exit(0);
  }
}

void jLabel1_mouseReleased(MouseEvent e) {
  try{
    Runtime.getRuntime().exec("cmd /c start http://www.zqu.edu.cn");
  }catch(Exception err)
  {
    err.printStackTrace();
  }

}
}