import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class mouseevent extends JFrame implements MouseListener
{
    JLabel l1;
    mouseevent()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        l1=new JLabel();
        Font f=new Font("Verdana",Font.BOLD,20);
        l1.setFont(f);
        l1.setForeground(Color.RED);
        add(l1);
        addMouseListener(this);
        setVisible(true);


        
    }
    public void mouseExited(MouseEvent me)
    {
        l1.setText("Mouse exit");
    }
    public void mouseEntered(MouseEvent me)
    {
        l1.setText("Mouse Entered");
    }
    public void mouseReleased(MouseEvent me)
    {
        l1.setText("Mouse Released");
    }
    public void mousePressed(MouseEvent me)
    {
        l1.setText("Mouse Pressed");
    }
    public void mouseClicked(MouseEvent me)
    {
        l1.setText("Mouse clicked");
    }
    
    public static void main(String[] args) {
       mouseevent mep=new mouseevent();
    }
}

