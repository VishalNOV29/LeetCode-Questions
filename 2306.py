import numpy as np
ideas = ["coffee","donuts","time","toffee"]

ideas_set=set(ideas)

char_arr=[chr(i) for i in range(97,123)]
# print(char_arr)


# arr=[[0 for i in range(26)] for i in range(26)]
# arr=arr.copy()
arr=np.zeros((26,26))
# arr=np.array((arr))
# print(arr)

for ele in ideas:
    # print("############################################")
    ch=ele[0]
    for char in char_arr:
        # print("column =",ch)
        # print("row =",char)
        new_str=char+ele[1:]
        if new_str in ideas_set:
            # print("already present in the set")
            continue
        else:
            # print(new_str)
            j=ord(ch)-97
            i=ord(char)-97
            arr[i,j]+=1
print(char_arr)
print(ideas)
print(arr)
count=0

for string in ideas:
    for ele in char_arr:
        j=ord(string[0])-97
        i=ord(ele)-97
        new_str=ele+string[1:]
        if new_str in ideas_set:
            continue
        else:
            count+=arr[i,j]
print("count =",count)


