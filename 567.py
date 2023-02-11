# from itertools import permutations
# class Solution:
#     def checkInclusion(self, s1: str, s2: str) -> bool:
#         perm=permutations(s1)
        
#         for ele in perm:
#             print(ele)
#             string=''.join(ele)
#             if string in s2:
#                 print(string)
#                 return True
#         return False


# s1 ="ab"
# # per=permutations(list(s1))
# # for ele in per:
# #     print(''.join(ele))
# s2 ="eidboaoo"
# obj=Solution()
# print(obj.checkInclusion(s1,s2))


s1 ="adc"
s2 ="dcda"
myDict={}
for ele in s1:
    myDict[ele]=myDict.get(ele,0)+1
# print(myDict)

# def myFun(myDict,s2):
#     tempDict=myDict.copy()
#     flag=False
#     for i in range(len(s2)):
#         print("Entering inside the loop....................................................")
#         print("temp_dict =",tempDict)
#         cur_ele=s2[i]
#         print("cur_ele =",cur_ele)
#         if tempDict:
#             print("tempDict exists...")
#             if cur_ele in tempDict:
#                 print("element found in the tempDict")
#                 flag=True
#                 tempDict[cur_ele]-=1
#                 if tempDict[cur_ele]==0:
#                     print("delete this element.....")
#                     del tempDict[cur_ele]
#             else:
                
#                 flag=False
#                 tempDict=myDict.copy()
#                 print("myDict =",myDict)
#                 print("element not found in tempDict now tempDict =",tempDict)


    #     else:
    #         print("empty tempDict")
    #         return True
    # if myDict:
    #     return False
    # return True

from itertools import permutations

class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        myDict = {}
        for ele in s1:
            myDict[ele] = myDict.get(ele, 0) + 1
        
        for i in range(len(s2) - len(s1) + 1):
            tempDict = myDict.copy()
            for j in range(i, i + len(s1)):
                cur_ele = s2[j]
                if cur_ele in tempDict:
                    tempDict[cur_ele] -= 1
                    if tempDict[cur_ele] == 0:
                        del tempDict[cur_ele]
                else:
                    break
            else:
                return True
        return False
s1 ="adc"
s2 ="dcda"
# print(myFun(myDict,s2))

