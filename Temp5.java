class  Temp5
{
int x,y;
Temp5 (int x, int y)
{

this.x=x;
this.y=y;
}
void show ()
{
System.out.println(x);
System.out.println(y);
}


public static void main(String...  args )
{
Temp5 t1 = new Temp5(10,20);
t1.show();


}
}