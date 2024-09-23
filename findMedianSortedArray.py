class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        for i in nums2:
            nums1.append(i)
        nums1.sort()
        mid=floor(len(nums1)/2)
        if len(nums1)%2==0:
            return float((nums1[mid]+nums1[mid-1])/2)
        else:
            return nums1[mid]
l1=list(map(int,input().split()))
l2=list(map(int,input().split()))
print(Solution().findMedianSortedArrays(l1,l2))
