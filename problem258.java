class Solution {
    public int addDigits(int num) {
       if(num==0){
        return 0;
       }
        
       return 1+(num-1)%9;
    }
}
// ---------EXPLANATION------------
// solve using maths formula of digital root: It follows a repeating 1 to 9 pattern.
        //ex: num | sum of digit | digital root
            //     1 |              |    1
            //    2  |   2          |    2
            //    9  |   9          |    9
            //    10 |   1+0=1      |    1
            //    18 |   1+8=9      |    9
            //    15 |   1+5=6      |    6
            //    20 |   2+0=2      |    2

        // return 1+(num-1)%9 
        //  ex: num=23
        //  by using formula 
        //  return 1+(23-1)%9=5
        //  check manually: 2+3=5