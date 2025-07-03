class Solution {
    public int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        while(n>0){
            int dig=n%10;
            product*=dig;
            sum +=dig;
            n/=10;
        }
        return product-sum;
    }
}