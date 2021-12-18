import java.awt.*;
import java.awt.event.*;
public class Assignment2 extends Frame implements ActionListener
{
Button b1,b2;
Assignment2()
{
b1=new Button("Red");
b2=new Button("Blue");
b1.addActionListener(this);
b2.addActionListener(this);
add(b1); add(b2);
setSize(200,200);
setVisible(true);
setLayout(new FlowLayout());
}
public void actionPerformed(ActionEvent e)
{
Color color=null;
if(e.getSource() == b1)
{
color = Color.red;
}
else if(e.getSource() == b2)
{
color = Color.blue;
}
setBackground(color);
}
public static void main(String arg[])
{
Assignment2 ob = new Assignment2();
}
}