class Solution {
    public int reverse(int x) {
        boolean negative = false;
        long output = 0;

        if(x<0){
            negative = true;
            x = -1 * x;
        }


        while(x >0 ){
            output = output * 10 + (x % 10);
            x = x / 10;
        }
       if(output > Integer.MAX_VALUE) return 0;

       if(negative){
           return (int) output * -1;
        }
        return (int) output;
    }
}