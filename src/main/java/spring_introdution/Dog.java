package spring_introdution;

public class Dog implements Pet{
    //private String name;

    /*public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }*/

    public Dog() {
        System.out.println("Gog bean is created");
    }
    @Override

    public void say(){
        System.out.println("Wow-Wow");
    }
    public void init(){
        System.out.println("Method init");
    }

    public void destroy() {
        System.out.println("Method destroyed");
    }

}
