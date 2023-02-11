# s = "cbaebabacd"
# p = "abc"
# s ="baa"
# p ="aa"
# s = "abab"
# p = "ab"
# p=list(p)
# fixed_window=p
# window_length=len(p)
# i=0
# j=i+window_length
# res=[]

# while (j<len(s)+1):
#     # print(i,j)
#     current_window=s[i:j]
#     if current_window==fixed_window:
#         res.append(i)
#     print(current_window)
#     j+=1
#     i+=1

# print(res)





# s = "cbaebabacd"
# p = "abc"
# s ="baa"
# p ="aa"
# s = "abab"
# p = "ab"

# s="abc"
# p="abc"

# myDict={}
# for ele in p:
#     myDict[ele]=myDict.get(ele,0)+1
# print(myDict)

# i=0
# j=i+len(p)

# res=[]

# while (j<len(s)+1):
#     tempDict=myDict.copy()
#     current_window=s[i:j]
#     print(current_window)
#     for ele in current_window:
#         if ele in tempDict:
#             print("ele found...",ele)
#             tempDict[ele]-=1
#             if tempDict[ele]==0:
#                 del tempDict[ele]
#         else:
#             break
#     else:
#         res.append(i)
#     i+=1
#     j+=1
# print(res)
    

        
# s="abcd"
# p="abc"

class Solution:
    def findAnagrams(self, s: str, p: str):
        print("This method is called.")
        s_map={}
        p_map={}
        for ele in p:
            p_map[ele]=p_map.get(ele,0)+1
        
        i=0
        res=[]
        
        while (i<len(p)):
            s_map[s[i]]=s_map.get(s[i],0)+1
            i+=1
        
        while (i<len(s)):
            print("####################################################",i-len(p))
            if (s_map==p_map):
                
                print(p_map)
                print(s_map)
                res.append(i-len(p))
            nextChar=s[i]
            prevChar=s[i-len(p)+1]
            s_map[nextChar]=s_map.get(nextChar,0)+1
            s_map[prevChar]-=1
            if s_map[prevChar]==0:
                del s_map[prevChar]
            i+=1
        return res
            

        

        # print(s_map)
        # print(p_map)
        
obj=Solution()

s = "cbaebabacd"
p = "abc"

res=obj.findAnagrams(s,p)
print(res)