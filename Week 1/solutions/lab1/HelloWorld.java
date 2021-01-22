import java.util.Scanner;
import java.util.Random;


/**
 * Write a description of class HelloWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HelloWorld
{
    public static void main(String[] args) {        
        System.out.println("Hello World");
        
        // 1. 
        System.out.println("My name is Englebert");
        
        // 2.
        String lastname;
        lastname = "Humperdinck";
        System.out.println("My name is Englebert "+lastname);
        
        // 3.
        lastname = "Matt";
        String fname;
        fname = "Cortana";
        System.out.println("My name is "+fname+" "+lastname);
        
        
        // 4.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hi, what's your name?");
        fname = keyboard.nextLine();
        System.out.println("Nice to meet you " + fname + "!");
        
        // Part 3. 1)
        exercise1();
        
        // Part 3. 2)
        exercise2();
        
        // Part 3. 3)
        exercise3();
        
        // Part 3. 4)
        exercise4();
    }
    
    
    public static void exercise1(){
        // Code here
        System.out.println("Exercise 1");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the side of the square?");
        
        int side = keyboard.nextInt();
        int area = side * side;
        
        System.out.println("A square with side " + side + " has an area of "+area);
    }
    
    public static void exercise2(){
        //Code here
        System.out.println("Exercise 2");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a positive integer N");
        int n = keyboard.nextInt();
        int count = 1;
        while(count <= n){
            if(count % 2 == 0){
                System.out.print(count + " ");
            }
            count++;
        }
    }
    
    public static void exercise3(){
        System.out.println("Exercise 3");
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hi");
        String response = keyboard.nextLine();
        String[] triggerWords = {"Hey", "Howdy", "I agree"};
        Random r = new Random();
        
        while(!response.equals("exit")){
            System.out.println(triggerWords[r.nextInt(3)]);            
            response = keyboard.nextLine();
        }   
    }
    
    public static void exercise4() {
        System.out.println("Exercise 4");
        Random r = new Random();
        int num1 = r.nextInt(1000);
        int num2 = r.nextInt(1000);
        int ans = num1 + num2;
        System.out.println("What is " + num1 + " + " + num2 + "?, answer=" + ans);
        
    }
}
