import java.util.Scanner;
class Solution{
    public int CountArrElement(int[] arr ,int size ){
        int count =0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(max < arr[i]){
                max=arr[i];
            }
        }
        for(int i=0;i<size;i++){
            if(max == arr[i]){
                count++;
            }
        }
        return size-count;
    }
}

public class CountOFArrayElement
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int sizeOfArray = sc.nextInt();
        System.out.println();
        int[] arr = new int[sizeOfArray];
        System.out.print("Enter the Elements of the array : ");
        for(int i=0;i<sizeOfArray;i++){
            arr[i] = sc.nextInt();
        }
        Solution answer = new Solution();
        System.out.println(answer.CountArrElement(arr,sizeOfArray));
    }
}
