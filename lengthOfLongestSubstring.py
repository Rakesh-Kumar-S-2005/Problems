class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l=[]
        for i in range(1,len(s)):
            for j in range(0,len(s)+1):
                if len(s[i:j])!=0:
                    (l).append(s[i:j])
        self.sub=list(set(l))
        l=[]
        for i in self.sub:
            if len(set(i[::1]))==len(i[::1]):
                l.append(len(set(i[::1])))
        self.sub=[]
        if len(l)!=0:
            return max(l)
        else:
            return 0
s=input().strip()
obj=Solution()
print(obj.lengthOfLongestSubstring(s))
