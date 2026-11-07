class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        n=len(nums)
        for j in range(1,n):
            i=j-1
            key=nums[j]
            while i>=0 and nums[i]>key:
                nums[i+1]=nums[i]
                i=i-1
            nums[i+1]=key
        return nums