import java.lang.reflect.Method;

/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7};
        int target = 6;
        int ans = FindIndexOFTarget(a, target);
        System.out.println(ans);
    }

    private static int FindIndexOFTarget(int[] a, int target){
        int i = 0 , j = a.length - 1;
        while(i < j){
            int k = i + (j - i) / 2;
            if(a[k] < target){
                i = k + 1;
            }else if(a[k] > target){
                j = k - 1;
            }else{
                return k + 1;
            }
        }
        return -1;
    }
}