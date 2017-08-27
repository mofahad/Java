class Man
{
void walk()
{
System.out.println(" he can run fast" );
}
}


class Employee extends Man
{
 void walk()
{
System.out.println("fast then any one");
}
public static void main( String[] args ) {
Man  p1 =  new Man();
Employee p2 = new Employee();
p1.walk();
p2.walk();
}
}