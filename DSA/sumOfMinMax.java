class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        int min = A[0];
        int max = A[0];
        for (int i=0;i<A.length;i++){
            if(A[i]<min){
                min = A[i];
            }
            if(A[i]>max){
                max = A[i];
            }
        }
        int sum = min+max;
        return sum;
    }
}