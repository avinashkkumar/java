import java.util.*;
public class assending {
    public static void main(String args[]){
        int l = args.length;
        int arr[] = new int[l];
        for( int i = 0 ; i < l ; i++ ){
            arr[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(arr);
        System.out.println("the sorted integer list is : "
                            + Arrays.toString(arr));
    }
    
}
