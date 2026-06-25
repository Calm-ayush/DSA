class Solution:
    def maxIceCream(self, costs: List[int], coins: int) -> int:
        costs.sort()
        x=0
        for i in costs:
            if i>coins:
                break
            x+=1
            coins-=i
        return x