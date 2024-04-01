import java.util.Scanner;

// takes the length and the width of a rectangle and outputs its perimeter

public class Rectangle {


public static void main(String [] args){


int length = 0;
int width = 0;
int perimeter;

Scanner keyboard = new Scanner(System.in);

System.out.println("Enter Length");
length = keyboard.nextInt();
System.out.println("Enter Width");
width = keyboard.nextInt();
perimeter = 2*length + 2*width;


System.out.println("The perimeter is :: " + perimeter);

}


}
