package exceptions;
class Product
{
  int pid;
  String pname;
  double price;
  Product(int pid,String pname,double price)
  {
    this.pid = pid;
    this.pname = pname;
    this.price = price;
  }
  Product() {}
  public String toString()
  {
    return pid+" "+pname+" "+price;
  }
}
public class ToStringDemo{
  public static void main(String[] args){
    Product prod = new Product(111,"Monitor",500.0);
    System.out.println(prod);
  }
}