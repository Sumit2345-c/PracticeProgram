package collections;
import java.util.*;
public class ArrayListDemo{
  public static void main(String[] args) {
     LinkedList a1 = new LinkedList();
     a1.add(10);
     a1.add(20);
     a1.add("xxx");
     a1.add("yyy");
     System.out.println(a1);
     a1.add(2,"ppp");
     System.out.println(a1);
     a1.set(2,"qqq");
     System.out.println(a1);
     a1.remove(2,"qqq");
     System.out.println(a1);
     a1.remove(2);
     System.out.println(a1);
     System.out.println("Size ="+a1.size());
  }
}