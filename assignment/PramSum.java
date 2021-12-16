import java.applet.*;
import java.awt.*;
/*
<applet code="UserInput1" width=400 height=300>
<param name="num1" value=20>
<param name="num2" value=30>
</applet>
*/
public class PramSum extends Applet
{
int a,b,c;
public void init()
{
a=Integer.parseInt(getParameter("num1"));
b=Integer.parseInt(getParameter("num2"));
c=a+b;
}
public void paint(Graphics g)
{
g.drawString("Sum = "+c,175,150);
}
}