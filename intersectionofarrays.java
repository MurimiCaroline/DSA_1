//the code below displays the number as many times as it occurs in the array twice instead of once
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
         Arrays.sort(nums2);
        
        int first = 0;
        int second = 0;
        
        int[] output = new int[nums1.length];
        int k=0;
        
        while(first < nums1.length && second < nums2.length){
            if(nums1[first] == nums2[second]){
                output[k] = nums1[first];
                first++;
                second++;
                k++;
            }else if (nums1[first] > nums2[second]){
             second++;   
            }else{
            first++;
            }
        }
        return Arrays.copyOfRange(output, 0, k);
    }
}

//The code below did not work
/*
 * class Solution {
   public vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        sort(nums1.begin(), nums1.end());
         sort(nums2.begin(), nums2.end());
        int n = nums1.size();
        int m = nums2.size();
        set<int>s;
        int i=0, j=0;
        while(i<n && j<m){
        if(nums1[i]>nums2[j]) j++;
        else if(nums1[i]<nums2[j]) i++;
        else{
        s.insert(nums1[i]);
        i++;
        j++;
        }
}
    vector<int>ans;
    for(auto i : s) ans.push_back(i);
    return ans;
}
};

 */


//the code below works. It displays the repeated number once


 /*
  * class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums1){
            set.add(i);
        }
        HashSet<Integer> intersection = new HashSet<Integer>();
        for(int i : nums2){
            if(set.contains(i)){
                intersection.add(i);
            }
        }
        int [] result = new int[intersection.size()];
        int index = 0;
        for(int i : intersection){
         result[index++] = i;   
        }
        return result;
    }
}
  */