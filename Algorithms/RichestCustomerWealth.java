class Solution {
    public int maximumWealth(int[][] accounts) {

        int maxwealth=0;
        for(int row = 0; row < accounts.length; row++){
            int sum=0;
            for(int col = 0; col < accounts[row].length; col++){
                sum=sum+accounts[row][col];
            }
            if(maxwealth<sum){
                maxwealth=sum;
            }
        }

        return maxwealth;

    }
}