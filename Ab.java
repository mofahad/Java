// Abstract Class and Abstarct Method

// example of abstract class

public class Ab
{
public static void main(String a[])
{
fahad obj =  new rahad();
obj.call();
obj.move();
obj.dance();
obj.cook();
}


}

abstract class fahad{
public void call()
{
System.out.println("Calling");
}
public abstract void move(); // Abstarct methods
public abstract void dance(); // Abstarct methods

public abstract void cook(); 
}
abstract class ahad extends fahad{
public void move()
{
System.out.println("Moving..");}
}
 class rahad extends ahad  //  concrete class becoz of this class we can make object so this is not the abstract class thus in the abstract class only the method is declared not define and if u not define the method in any class it automaticlly convert into abstrat class 
 {
public void dance()
{
System.out.println("Dancing..");}

}
public void cook()
{
System.out.println("Cooking..");}

}

