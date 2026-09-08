package oops;

public class overloading {
   static class calculate{
       int  sum(int a,int b){
           return a+b;
       }
       double sum(double a,double b){
           return a+b;
       }
   }
   public static void main(String[] args){
       calculate obj = new calculate();
       System.out.println("Sum of 2 integers: "+obj.sum(10,20));
       System.out.println("Sum of 2 double values: "+obj.sum(10.5,11.6));
   }
}
