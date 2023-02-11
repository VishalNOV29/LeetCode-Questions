# def find(c):
#     result=set()
#     i=0
#     while (i**2<c):
#         # result.append(i**2)
#         result.add(i**2)
#         i+=1
#     # print(result)

#     # ptr1=0
#     # ptr2=len(result)-1

#     # while (ptr1!=ptr2):
       
#     #     tempSum=result[ptr1]+result[ptr2]
#     #     if (tempSum==c):
#     #         print("Condition1",result[ptr1],result[ptr2])
#     #         return True
#     #     elif (tempSum<c):
#     #         print("Condition2")
#     #         ptr1+=1
#     #     else:
#     #         print("Conditon3")
#     #         ptr2-=1
#     for ele in result:
#         if abs(c-ele) in result:
#             print(abs(c-ele),ele)
#             return True
#     return False
#     # print("Returning False")
#     # return False;

# # print(find(1073741824))
# for i in range(100):
#     print(i,find(i))



def find(c):
    mySet=set()

    i=0
    while (i<<)