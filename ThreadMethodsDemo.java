package threads;
class Mythread extends Thread 
{
  public void run()
  {
    //System.out.println("I am Thread");
    Thread t = Thread.currentThread();
    System.out.println(t);
    t.setName("Mythread");
    System.out.println(t);
    System.out.println(t.getName());
    t.setPriority(8);
    System.out.println(t);
    System.out.println(t.getPriority());
  }
}
public class ThreadMethodsDemo{
  public static void main(String[] args){
    Mythread t = new Mythread();
    t.start();
    Mythread t1 = new Mythread();
    t1.start();
  }
}