class Solution {
    public int search(int[] nums, int target) {

        //bruk midtpunktet for å dele opp arrayet i 2 for å få log n 
        int high = nums.length - 1; 
        int low = 0;
        // indeksen  

        while(low <= high){
            int mid = (low+high)/2; 
            if(target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                 high = mid - 1;
            }

            else if(target > nums[mid]){
                 low = mid + 1; 
            }
    }

    return -1;
        
        
    
    }
}
