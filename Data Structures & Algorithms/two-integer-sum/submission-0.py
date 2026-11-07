class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        prevmap={}
        for index,value in enumerate(nums):
            diff=target-value
            if diff in prevmap:
                return [prevmap[diff],index]
            else:prevmap[value]=index
