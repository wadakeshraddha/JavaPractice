import java.util.*;
public class Calculator {
    public static void main(String [] args){
        int a,b;
        Calculator c = new Calculator();
        //c.add(3,6);
        //c.sub(7,4);
        //c.multiply(8,8);
       // c.divide(10,2);
        //c.square(5);
        //c.cube(10);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x : ");
        int x = sc.nextInt();
        System.out.println("Enter y : ");
        int y = sc.nextInt();
        System.out.println("Enter option : ");
        String option = sc.next();
        System.out.println("Option is  : "+option);

        if(option.equals("add") ){
            c.add(x,y);
        } else if (option.equals("sub")) {
            c.sub(x,y);
        } else if (option.equals("multiply")) {
            c.multiply(x,y);
        } else if (option.equals("divide")) {
            c.divide(x,y);
        } else if (option.equals("square")) {
            c.square(x);
        } else if (option.equals("cube")) {
            c.cube(y);
        } else{
            System.out.println("Invalid user input");
        }

    }
    public void add(int p, int q) {
        int r = p+q;
        System.out.println("Addition is : "+r);
    }
    public void sub(int p,int q){
        int r = p-q;
        System.out.println("Subtraction is : "+r);
    }
    public void multiply(int p,int q){
        int r = p*q;
        System.out.println("Multiplication is : "+r);
    }
    public void divide(int p,int q){
        if(q!=0) {
            int r = p / q;
            System.out.println("Division is : "+r);
        }
        else {
            System.out.println("Invalid input for division");
        }
    }
    public void square(int p){
        int r = p*p;
        System.out.println("ISquare is "+r);
    }
    public void cube(int p){
        int r = p*p*p;
        System.out.println("ISquare is "+r);
    }
}
