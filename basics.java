package oops;

public class basics {

    static class student{
       String name;
        int age;
        void study(){
            System.out.println(name+" "+"is studying");
        }
        void  introduce(){
            System.out.println("My name is "+name);
            System.out.println("My age is "+age);
        }
    }
    public static void main(String[] args){
        student s1 = new student();
        s1.age = 20;
        s1.name="Piyush raj";
       s1.study();
       s1.introduce();
    }
}
