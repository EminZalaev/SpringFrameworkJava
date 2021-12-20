package aop;

import org.springframework.stereotype.Component;

@Component("LibaryBean")
public class Libary {
    public void getBook(){
        System.out.println("take book");
    }
}
