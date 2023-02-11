# import numpy as np
# class Solution:
#     def rangeAddQueries(self, n, queries):
#         mat=[[0 for j in range(n)] for i in range(n)]
#         for i in range(len(queries)):
#             print(queries[i])
#             top,left,bottom,right=queries[i]
#             for j in range(top,bottom+1):
#                 for k in range(left,right+1):
#                     mat[j][k]+=1
#         return mat

# obj=Solution()

# n = 3
# queries =[[1,1,2,2],[0,0,1,1]]
# res=obj.rangeAddQueries(n,queries)
# res=np.array(res)
# print(res)

list1=[4,3,2,1]
new_list=sorted(list(enumerate(list1)),key=lambda x:x[1],reverse=True)
# print(list(enumerate(list1)))
print(new_list)

