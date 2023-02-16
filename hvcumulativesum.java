import java.util.Scanner;
public class hvcumulativesum {
   public static void main(String[] args) {
    Scanner scr = new Scanner(System.in);

    System.out.println("Enter length of array");
    int n=scr.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=scr.nextInt();
    }
    for(int j=0;j<n;j++){
        if(j>0){
            arr[j]=arr[j]+arr[j-1];
            System.out.print(arr[j]+" ");
        }
    }
   } 
}
