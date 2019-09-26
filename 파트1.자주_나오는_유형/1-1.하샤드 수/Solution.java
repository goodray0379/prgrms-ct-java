class Solution {
  public boolean solution(int x) {
      char[] nums = Integer.toString(x).toCharArray();
      int sum=0;
      for(int i=0; i<nums.length; i++)
          sum += nums[i] - '0';
      if(x%sum==0) return true;
      else return false;
  }
}
