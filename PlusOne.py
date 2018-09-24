class Solution:
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        
        s = ""
        digInt = 0
        lst = []
        
        for i in digits:
            s += str(i)
        
        digInt = int(s) + 1
        digInt = str(digInt)
        
        for i in range(len(digInt)):
            print(digInt[i])
            lst.append(int(digInt[i]))
            # print(str(digInt[:2]))
        
        return lst