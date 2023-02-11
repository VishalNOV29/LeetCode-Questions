# num=58
# k=9
# for i in range(20):
#     print("{} - {} = {}".format(num,k,num-k))
#     num=num-k


score = [[10,6,9,1],[7,5,11,2],[4,8,3,15]]
k = 2

result=sorted(score,key=lambda x:x[k],reverse=True)
print(result)