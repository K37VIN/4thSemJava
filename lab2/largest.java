import java.util.Scanner;
public class largest {
  
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the three number:");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if (a>b && a>c){
            System.out.println("a is the largest!");
        }if (b>a && b>c){
            System.out.println("b is the largest!");
        }if (c>a && c>b){
            System.out.println("c is the largest!");
        }
        else{
            System.out.println("All are equal!");
        }
    }
}

