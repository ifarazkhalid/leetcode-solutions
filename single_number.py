class Solution:
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        mydict = {}
        
        for i in nums:
            if i not in mydict:
                mydict[i] = 1
            else:
                a = mydict[i]
                a += 1
                mydict[i] = a
        
        for i in mydict:
            if mydict[i] == 1:
                return i
        
        print(mydict)
