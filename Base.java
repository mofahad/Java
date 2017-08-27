class Base
{
void show()
{
System.out.println("base");
}
public static void main(String[] args)
{
Child ch = new Child();
ch.show();
	
}
}
class Child extends Base
{
void show()
{
System.out.println("Child");
}


}
