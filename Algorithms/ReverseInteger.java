class Solution {
    public int reverse(int x) {
        boolean flag = true;
        if(x<0){
            flag = false;
            x = -1 * x;
        }
        int reversed = 0;
        int temp = 0;
        while(x!=0){
            temp = reversed*10 + x%10;
            if(temp/10 != reversed) return 0;
            reversed = temp;
            x /= 10;
        }
        if(!flag){
            reversed = -1 * reversed;
        }
        return reversed;

    }
}