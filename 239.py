# def maxSliding(nums,k):
#     result=[]
#     for i in range(len(nums)-k+1):
#         print(nums[i:i+k])
#         print(i)


# maxSliding([1,2,3,4,5],3)

# def findSum(arr, k):
#     count = 0
#     for i in range(len(arr)):
#         for j in range(i, len(arr)):
#             if sum(arr[i:j+1]) == k:
#                 count += 1
#             print(i, j)
#             print(arr[i:j+1],sum(arr[i:j+1]))

#     print(count)


# findSum([1, -1, 0], 0)


string="the sky is blue hello vishal kumar" 
string=string.strip().split()

i=0
j=len(string)-1

while (i<=j):
    print(i,j)
    string[i],string[j]=string[j],string[i]
    i+=1
    j-=1
    print(string)
print(string)