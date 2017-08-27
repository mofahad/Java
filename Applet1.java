import java.applet.*;
import java.awt.*;
public class Applet1 extends Applet
{
  Image img1;
 static void main(String[] args){
  public void init()
 {
  img1= getImage(getDocumentBase(), "2016-09-10--06-04-35.png");
 }
 public void paint(Graphics g)
 {
  g.drawImage(img1,100,100,this);
 }
}
}