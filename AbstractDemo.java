abstract class Vehicle
{
  abstract void drive();
  void applyBreak()
  {
    System.out.println("Applying Break");
  }
}
class Car extends Vehicle
{
  void drive()
  {
    System.out.println("Changing Gear");
  }
}
public class AbstractDemo {
  public static void main (String[] args) {
       Vehicle v = new Car();
       v.drive();
       v.applyBreak();
       Car c = new Car();
       c.changeGear();
  }
}