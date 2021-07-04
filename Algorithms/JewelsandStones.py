class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        count=0
        for element in stones:
            if element in jewels:
                count=count+1
        return count
