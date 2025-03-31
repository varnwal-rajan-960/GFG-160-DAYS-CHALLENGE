class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        int c=0;
        int arr2[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            arr2[c++]=arr[i];
        }
        int arr3[]=new int[c];
        for(int i=0;i<c;i++)
        {
            arr3[i]=arr2[i];
        }
        if(c==0)
        return 1;
        Arrays.sort(arr3);
        int miss=1;
        for(int i=0;i<c;i++)
        {
            if(arr3[i]==miss)
            miss++;
        }
        return miss;
    }
}