import java.util.*;
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking inputs
        System.out.println("Enter Name");
        String Name = sc.nextLine();
        System.out.println("Enter ID");
        int ID = sc.nextInt();
        System.out.println("Enter Marks of maths");
        int m1 = sc.nextInt();
        System.out.println("Enter Marks of English");
        int m2 = sc.nextInt();
        System.out.println("Enter Marks of Physics");
        int m3 = sc.nextInt();
        System.out.println("Enter Marks of Chemistry");
        int m4 = sc.nextInt();
        System.out.println("Enter Marks of Biology");
        int m5 = sc.nextInt();
        //total
        int total = m1+m2+m3+m4+m5;
        //Percentage
        double per = total/500.0*100.0;
        String g = " ";
        //Grade dividation
        if(per>=90){
            g = "A+";
        } else if(per >= 80){
            g = "A";
        } else if(per >= 70){
            g = "B+";
        } else if(per >= 60){
            g = "B";
        } else if(per >= 50){
            g = "C";
        } else if(per >= 40){
            g = "D";
        } else{
            g = "E";
        }
       //All Info of student
       System.out.println("****ALL Info *******");
        System.out.println("ID is "+ID);
        System.out.println("Name is "+Name);
        System.out.println("Total marks of all subjects "+total);
        System.out.println("Percentage is "+per);
        System.out.println("Grade is "+g);
       
    }
}