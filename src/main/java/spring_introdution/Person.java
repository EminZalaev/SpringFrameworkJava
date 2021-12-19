package spring_introdution;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public String getSurname() {
        System.out.println("Zovut");
        return surname;
    }

    public int getAge() {
        System.out.println("Chel sozdan let");
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public Person() {
        System.out.println("Person bean is created");
    }

    public void setPet(Pet pet) {
        System.out.println("Setted Pet");
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("Hello pet");
        pet.say();
    }
}
