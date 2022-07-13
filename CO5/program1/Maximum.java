import java.awt.*;
import java.applet.*;   
/* 
<applet code="Maximum.class" width=300 height=300>
<param name=num1 value=1>
<param name=num2 value=2>
<param name=num3 value=3>
</applet>
*/
public class Maximum extends Applet
{
    String param;
    int l;
    public void start()
    {
        
        param=getParameter("num1");
        int n1=Integer.parseInt(param);
        param=getParameter("num2");
        int n2=Integer.parseInt(param);
        param=getParameter("num3");
        int n3=Integer.parseInt(param);
        if((n1>n2) && (n1>n2))
        {
            l=n1;
        }
        else if ((n1>n2) && (n1>n2))
        {
            l=n2;
        }
        else
        {
            l=n3;
        }
    
     

    }
    public void paint(Graphics g)
    {
        g.drawString("Largest : "+l,100,100);
    }
}
