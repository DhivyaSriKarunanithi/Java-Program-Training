//1.Missing Number-leetcode:268
public int missingNumber(int[] nums) {
      Arrays.sort(nums);
      int a = 0;
      for(int i = 0;i<nums.length;i++){
        if(a!=nums[i]){
            return a;
        }
        a++;
      }
      return a;
    }
}

//2.Sqrt(x)-Leetcode:69
class Solution {
    public int mySqrt(int x) {
      if(x==0||x==1){
        return x;
      }
      long i = 2;
      while(i*i<=x){
        i++;
      }
      return (int)(i-1);
    }
}

//3.Happy Number
class Solution {
    public boolean isHappy(int n) {
        int a = n;
        int b = n;
        while(true){
            int x = a;
            int sum1 = 0;
            while(x>0){
                int d = x%10;
                sum1 = sum1+d*d;
                x = x/10;
            }
            a = sum1;
            for(int i = 0;i<2;i++){
                int y = b;
                int sum2 = 0;
                while(y>0){
                    int d = y%10;
                    sum2 = sum2+d*d;
                    y=y/10;
                }
                b = sum2;
            }
            if(a==1||b==1)
                return true;
            if(a==b)
                return false;
        }
    }
}