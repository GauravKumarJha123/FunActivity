/**
 * BinarySearchUSingRecursion
 */
public class BinarySearchUSingRecursion {

    public static void main(String[] args) {
        int[] a =  new int[]{1,2,3,4,5,6,7,8};
        int ans = FindIndexUsingRecursion(0,a.length-1 ,a,6);
        System.out.println(ans);
    }

    private static int FindIndexUsingRecursion(int i,int j , int[] a, int target){
        
        if(j >= i){
            int k = i +(j - i) / 2;
            if(a[k] == target){
                return k;
            }
            if(a[k] < target){
                return FindIndexUsingRecursion(k + 1, j, a, target);
            }
            if(a[k] > target){
                return FindIndexUsingRecursion(i, k - 1, a, target);
            }
            
        }
        return -1;
    }
}