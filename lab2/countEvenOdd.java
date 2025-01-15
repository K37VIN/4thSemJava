import java.util.Scanner;
public class countEvenOdd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[10];
        int countEven=0;
        int countOdd=0;
        System.out.println();
        System.out.println("Enter the 10 numbers in the array:");
        for (int i=0;i<10;i++){
            arr[i]=in.nextInt();

        }
        for(int i=0;i<10;i++){
            if (arr[i]%2==0){
                countEven+=1;
            }if (arr[i]%2!=0) {
                countOdd += 1;
            }
        }
        System.out.println(countEven);
        System.out.println(countOdd);

    }
}


