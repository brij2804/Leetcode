class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        //find max in list
        int max=-1;
        for(int i=0;i<candies.length;i++){
            max = Math.max(candies[i], max);
        }

        List<Boolean> newarr= new ArrayList<>();

        for(int j=0;j<candies.length;j++){
            newarr.add(candies[j] + extraCandies >= max);
        }
        return newarr;
    }
}