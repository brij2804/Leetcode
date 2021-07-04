class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {

        int lenq=queries.length;
        int lenp=points.length;
        int[] ans=new int[lenq];
        int count;
        int x1,y1,r,x2,y2;

        for(int i=0;i<lenq;i++){

            count=0;
            x1= queries[i][0];
            y1=queries[i][1];
            r = queries[i][2];
            for(int j=0;j<lenp;j++){
                x2=points[j][0];
                y2 =points[j][1];
                int distance= (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);

                if(distance<=r*r){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}