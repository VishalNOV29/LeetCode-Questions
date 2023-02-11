# class Solution:
#     def minimumSum(self, num: int) -> int:
#         digit_list=sorted(list(map(int,list(str(num)))))
#         new1=digit_list[0]*10+digit_list[2]
        
#         new2=digit_list[1]*10+digit_list[3]
#         print(new1,new2)
#         return new1+new2

# obj=Solution()
# print(obj.minimumSum(8912))



# nums=100
# temp_list=list(map(int,list(str(nums))))
# print(temp_list)

top,left,bottom,right=[1,2,3,4]
print(top,left,bottom,right)