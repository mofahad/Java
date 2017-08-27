class Box{
float width;
float height;
float depth;
Box(float w, float h,float d)
{
width= w;
height= h;
depth= d;
}
float vol()
{
return (w*h*d);
}
}
class Boxb{
public static void main(String[] args)
{
	Box b1 = new Box(10.1,23.1,34.2);
    Box b2 = new Box(12.00,23.2);
	
    float	vol ;
	b1.vol();
	System.out.println("the volume of the box1:"+ vol);
	b2.vol();
	System.out.println("the volume of the box2:"+vol);
	}

}