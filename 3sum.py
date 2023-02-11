# arr=[-1,0,1,2,-1,-4]

# # step1 : First of all sort the array so that we can use two pointer technique.
# arr=sorted(arr)
# print(arr)

# # step2: Let's create a dictionary that will contain all the elements along with their index.
# myDict={}
# for i in range(len(arr)):
#     ele=arr[i]
#     if ele in myDict:
#         myDict[ele].add(i)
#     else:
#         myDict[ele]={i}

# print(myDict)

# i=0
# j=len(arr)-1

# res=[]
# while (i<j):
#     print("Inside the looop............................................................")
#     print("{}, {}".format(arr[i],arr[j]))
#     k=arr[i]+arr[j]
#     sum_diff=0-k
#     print("sum_diff =",sum_diff)
#     index_set={i,j}
#     if sum_diff in myDict:
#         print("found in dictionary")
#         set_diff=myDict[sum_diff].difference(index_set)
#         print("set_diff =",set_diff)
#         if set_diff:
#             tempIndex=set_diff.pop()
#             print("{}, {}, {}".format(i,j,tempIndex))
#             tempArr=[arr[i],arr[j],arr[tempIndex]]
#             res.append(tempArr)
#         else:
#             print("rejected...")
#         i+=1

#     # K is not present in the dict it means there are two possiblities that k will be either greater than 0 or less than zero.

#     elif sum_diff>arr[j]:
#         print("right side of both elements")
#         # If k is greater than 0, it means we have to shift the right pointer. Because we need 
#         i+=1
#     else:
#         print("left or middle of both elements")
#         j-=1

# print(res)


class Solution:
    def binarySearch(self,arr,left,right,target):
        while (left<=right):
            mid=(left+right)//2
            if (arr[mid]==target):
                return mid
            elif target>arr[mid]:
                left=mid+1
            else:
                right=mid-1
        return -1
    def threeSum(self, nums):
        res=[]
        nums=sorted(nums)
        i=0
        j=len(nums)-1
        while (i<j):
            num1=arr[i]
            num2=arr[j]
            diff=0-num1+num2
            ind=self.binarySearch(nums,i,j,diff)
            if ind==-1:
                pass
            else:
                temp=[num1,num2,nums[ind]]
                res.append(ind)
            

arr=[1,2,3,4,5,6,7,8]
left=0
right=len(arr)-1
target=5

obj=Solution()
print(obj.binarySearch(arr,left,right,target))