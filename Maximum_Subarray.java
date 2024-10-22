class Solution {
    
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        for(int i:nums)
        {
            if(i>maxSum)
            {
                maxSum=i;
            }
        }
        int i=0;
        int j=nums.length-1;
            while(i<j)
            {
                int sum=0;
            for(int k=i;k<=j;k++)
            {
                sum+=nums[k];
            }
            if(sum>maxSum)
            {
                //System.out.println(sum+" "+i+" "+j);
                maxSum=sum;
            }
            j--;
            if(i==j)
            {
                i++;
                j=nums.length-1;
            }
            }
        return maxSum;

    }
}
