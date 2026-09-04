package oops;

public class usingcontructor {
    static class student{
        String name;
        String branch;
        int rollno;
        student(String name,String branch,int rollno){
            this.branch = branch;
            this.name = name;
            this.rollno = rollno;
        }
        void display(){
            System.out.print("Name : "+name+" , "+"Branch : "+branch+" , "+"Rollno : "+rollno+";");
        }

    }
    public static void main(String[] args){
        student s1 = new student("Piyush Raj","It",61);
        student s2 = new student("Prerit kumar","Cse",60);
        s1.display();
        System.out.println();
        s2.display();

    }
}
