list1=[1,2,3]
# list2=[3,2,1]
# print(list1+list2)
# print(list2+list1)
# result=[]
# for ele in list1:
#     templist=list(map(int))

# def myFun(ele):
#     return ele*2

# def tempFun(num):
#     res=list(map(int,list(str(num))))
#     return res

# print(tempFun(100))


class Solution:
    def tempFun(self,num):
        res=list(map(int,list(str(num))))
        return res
    
    def separateDigits(self,nums):
        answer=[]
        for ele in nums:
            print(ele)
            temp=self.tempFun(ele)
            print(temp)
            answer+=temp
            print(answer)
        return answer

obj=Solution()
nums =[13,25,83,77]
print(obj.separateDigits(nums))
