class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        n=len(nums)
        arr=[]
        for num in nums:
            arr.append(num)
        for num in nums:
            arr.append(num)
        return arr