import java.util.*;
import java.lang.String;
public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size: ");
        int n = s.nextInt();

        boolean f = s.nextBoolean();
        char[] arr = new char[n];
        for(int i=0; i<n; i++){
            arr[i] = s.next().charAt(0);
        }
        int left = 0;
        int right = n-1;
        boolean flag = true;
        while(left <= right){
            if(arr[left] != arr[right]){
                flag = false;
                break;
            }
            else{
                left++;
                right--;
            }
        }
        if(flag == true)
            System.out.println("Palinndrome");
        if(flag == false)
            System.out.println("Not a Palinndrome");

    }


}
