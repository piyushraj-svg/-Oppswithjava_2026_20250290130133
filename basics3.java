package oops;

public class basics3 {
    static class car{
       String model;
       String color;

       void starting(){
           System.out.println("car is starting");
       }

    }
    public static void main(String[] args){
        car s1 = new car();
        s1.model = "bmw";
        s1.color = "black";
            System.out.println(s1.model);
        System.out.println(s1.color);

    }

}
