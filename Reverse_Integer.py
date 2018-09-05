class Solution:
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        
        reverseString = ""
        numberStack = []
        isNegative = False
        
        if (x < 0):
            isNegative = True
            x = x * -1
            num = str(x)
        else:
            num = str(x)

        
        for i in range(0, len(num)):
            numberStack.append(num[i])
        
        for i in range(0, len(num)):
            reverseString += numberStack.pop()
        
        revInt = int(reverseString)
        
        if (isNegative == True):
            revInt = revInt * -1
        
        if (revInt < -2147483648 or revInt > 2147483647):
            revInt = 0
        
        return revInt
        