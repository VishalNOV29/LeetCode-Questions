# def checkSorted(arr):
#     newArr = sorted(arr)
#     return newArr == arr


# arrs = ['vishal','vishu']
# print(checkSorted(arrs))

# arr=['abc','def','ghi','jkl']
# l1=[list(ele) for ele in arr]
# print(l1)
# for i in range(len(l1)):
#     for j in range(i+1,len(l1[0])):
#         l1[i][j],l1[j][i]=l1[j][i],l1[i][j]
# print(l1)

import numpy as np
class Solution:
    def checkSorted(self,arr):
        newArr=sorted(arr)
        return arr==newArr

    def minDeletionSize(self, strs) -> int:
        arr=np.array([list(ele) for ele in strs])
        print(arr)
        arr=np.transpose(arr)
        print(arr)
        count=0
        for ele in strs:
            if not(self.checkSorted(ele)):
                count+=1
        return count
obj=Solution()
print(obj.minDeletionSize(["rrjk","furt","guzm"]))