class Solution {
    public boolean isPalindrome(int x) {

        if(0<=x && x<10){
            return true;
        }

        String num = Integer.toString(x);
        System.out.println(num);

        int len= num.length();
        boolean flag = true;
        int i=0;
        int j=len-1;
        char[] chars= num.toCharArray();
        while(i<=j){
            if(chars[i]!=chars[j]){
                flag = false;
                break;
            }
            i++;
            j--;
        }

        return flag;
    }
}