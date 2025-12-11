class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y=0;
        char[] chars = moves.toCharArray();
        for(char character: chars){
            if(character == 'U') {
                x++;
            }else if(character == 'D') {
                x--;
            }else if(character == 'L'){
                y++;
            }else if(character == 'R'){
                y--;
            }
        }
        return x==0 && y==0;
    }
}