package java8;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Test {
   public static void main(String[] args) {
      List<Person> arrayList = new ArrayList<Person>();

      Person p = new Person();
      p.setName("Adithya");
      p.setAge(20);
      arrayList.add(p);

      Person p1 = new Person();
      p1.setName("Jai");
      p1.setAge(25);
      arrayList.add(p1);
     
      Person p2 = new Person();
      p2.setName("Surya");
      p2.setAge(33);
      arrayList.add(p2);

      Person p3 = new Person();
      p3.setName("Ravi");
      p3.setAge(35);
      arrayList.add(p3);

      Stream<Person> stream = arrayList.stream();
      stream.forEach(x -> System.out.println("Name: [" + x.getName()+"] Age: ["+x.getAge()+"]"));

//      Comparator<Stream> byPersonName = (Person p4, Person p5) -> p4.getName().compareTo(p5.getName());
//      Stream<Person> sorted = arrayList.stream().sorted(byPersonName);
//      sorted.forEach(e -> System.out.println("Sorted Name: [" + e.getName()+"] Age: ["+e.getAge()+"]"));
//   }
   }
}

// Person class
class Person {
   public String name;
   public int age;
   public String getName() {
      return name;
   }
   public int getAge() {
      return age;
   }
   public void setName(String name) {
      this.name = name;
   }
   public void setAge(int age) {
      this.age = age;
   }
}