
class Base2{
private int x=20;
void show()
{
System.out.println("Base");
}

public static void main(String... args){
Base2 b= new Child();
b.show();
System.out.println(b.x);
}
}
class Child extends Base2{
int x=50;
void show()
{
System.out.println("Child");
}
}
