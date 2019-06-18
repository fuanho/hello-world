import java.util.*;
public class Binary_Search{
    public static Scanner keyin = new Scanner(System.in);
    public static void main(String[] args) {
        
        Binary_Search BS = new Binary_Search();
        int[] Arr = {5,9,13,15,17,19,25,30,45};
        System.out.println(BS.search(Arr));
    }
    public int search(int[] Arr){
        System.out.print("Please enter number : ");
        int input = keyin.nextInt();
        int R = Arr.length-1;
        int L = 0;
        int M = (R+L)/2;
        while(Arr[M] != input){
            if(Arr[M] > input) R = M-1;
            if(Arr[M] < input) L = M+1;
            M = (R+L)/2;
        }
        return M;
    }
}