package oops;


   class animal{
        void sound(){
            System.out.println("Animals make sound");
        }
    }
    class dog extends animal{
        void barks(){
            System.out.println("Dog barks");
        }
    }
    public class inheritance {

        public static void main(String[] args){
        dog p = new dog();
        p.barks();
        p.sound();

    }
}
