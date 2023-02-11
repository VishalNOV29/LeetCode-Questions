

# def findClosest(arr,target):
#     closest=abs(arr[0]+arr[1]+arr[2]-target)
#     print(closest)
#     result=[arr[0],arr[1],arr[2]]
#     for i in range(len(arr)-2):
#         for j in range(i+1,len(arr)-1):
#             for k in range(j+1,len(arr)):
#                 print(arr[i],arr[j],arr[k])
#                 tempSum=arr[i]+arr[j]+arr[k]
#                 if (abs(tempSum-target)<closest):
#                     result=[arr[i],arr[j],arr[k]]


#     print("closest =",sum(result))
#     return result


# # print("result :",findClosest([-1,2,1,4],1))
# print("result :",findClosest([0,0,0],1))


# SECOND APPRAOCH USING TWO POINTER

def findClosest(arr,target):
    arr.sort()

    closest=abs(arr[0]+arr[1]+arr[2])
    result=[arr[0],arr[1],arr[2]]

    for i in range(len(arr)-2):
        
        j=i+1
        k=len(arr)-1
        while (j<k):
            print(i,j,k)
            tempSum=arr[i]+arr[j]+arr[k]
            if (abs(tempSum-target)<closest):
                result=[arr[i],arr[j],arr[k]]
                closest=abs(tempSum)
            
            if (tempSum>closest):
                k-=1
            else:
                j+=1
    
    return result

print("result :",findClosest([0,0,0],1))