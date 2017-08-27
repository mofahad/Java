class Animal{
public void move(){
System.out.println("Animal can move");
}
}
class Dog extends Animal{
public void move()
{
super.move();
System.out.println("Dogs can run fast");
}
}

 class TestDog{
public static void main (String args[]){
Animal A = new Dog();
A.move();
}
}