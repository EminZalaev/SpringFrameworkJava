package spring_introdution;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
      //  Dog myDog = context.getBean("myPet", Dog. class);
       // myDog.setName("Belka");
        //Dog yourDog = context.getBean("myPet", Dog.class);
       // yourDog.setName("strelka");
       // System.out.println(myDog.getName());
       // System.out.println(yourDog.getName());


        //System.out.println("переменные ссылаются на один объект " + (myDog == yourDog));
       // System.out.println(myDog);
        //System.out.println(yourDog);
    }
}
