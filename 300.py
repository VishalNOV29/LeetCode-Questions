nums = [10,9,2,5,3,7,101,18,19,20]

myDict={}

# All the values are with including itself.
myDict[nums[-1]]=1

for j in range(len(nums)-2,-1,-1):
    if nums[j]<nums[j+1]:
        myDict[nums[j]]=myDict.get(nums[j+1],0)+1
    else:
        myDict[nums[j]]=myDict.get(nums[j],0)+1

# print(myDict)
for ele in myDict:
    print(ele,myDict[ele])
