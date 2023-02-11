# arr=[[7,9],[10,7],[6,9],[10,4],[7,5],[7,10]]
# arr.sort()
# pre_proecessed1=[0]*len(arr)
# pre_proecessed0=[0]*len(arr)
# maxEle=arr[len(arr)-1][1]
# for i in range(len(arr)-1,-1,-1):
#     if arr[i][1]>maxEle:
#         maxEle=arr[i][1]
#     pre_proecessed1[i]=maxEle

# max0=arr[len(arr)-1][0]
# for i in range(len(arr)-1,-1,-1):
#     if (arr[i][0]>max0):
#         max0=arr[i][0]
#     pre_proecessed0[i]=max0

# print(arr)
# print("Proprocessing 1:",pre_proecessed1)
# print("Proprocessing 0:",pre_proecessed0)

# count=0
# result=[]
# for i in range(len(arr)-1):
#     if (arr[i][1]<pre_proecessed1[i+1] and arr[i][0]<pre_proecessed0[i+1] ):
#         result.append(arr[i])
        
#         count+=1
# print("Count: ",count)
# print("Reuslt",result)


# from collections import Counter
# from xml.dom.minidom import Element
# li=[1,2,3,4,4,3,2,1]
# ctr=Counter(li)

# print(ctr)
# print(type(ctr))
# for ele in ctr:
#     print(ele,ctr[ele])


# class Solution:
#     def reverseWords(self, s: str) -> str:
#         myList=s.split()
#         result=""
#         for ele in myList:
#             print(ele)
#             result+=ele[::-1]
#         return result

# obj=Solution()
# print(obj.reverseWords("Hello world"))

print("hello world this code is wrokging.")


print(int('101',2))

print(bin(10)[2::])