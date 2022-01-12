/* алгоритм плюс-минус мой, найти нашла, как работает пока до конца не разобралась. При работе на время - пихнула бы*/
public class First {

    static int getMissingNo (int a[], int n) {
        int i, total;
        total  = (n+1)*(n+2)/2;
        for ( i = 0; i< n; i++)
            total -= a[i];
        return total;
    }

    /* program to test above function */
    public static void main(String args[]) {

        int a[] = {2,8,10,9,6,7,1,4,3};
        int miss = getMissingNo(a,9);
        System.out.println(miss);
    }
}