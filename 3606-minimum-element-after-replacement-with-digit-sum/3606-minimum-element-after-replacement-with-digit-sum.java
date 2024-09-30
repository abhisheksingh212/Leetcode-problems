class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int[] arr =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sum(nums[i]);
        }
        return min(arr);
    }
    public int sum(int a)
    { int n=a,sum=0;
        while(n!=0)
        { sum+=n%10;
          n=n/10;
        }return sum;
    }
    public int min(int[] a)
    { int min=a[0];
    for(int i=0;i<a.length;i++)
    {
        if(min>a[i])
        min=a[i];
    }
    return min; 
    }
}