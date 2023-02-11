# num=input('Enter the number: ')
# i=0
# newNum=""
# while (i<len(num)):
#     if (num[i]=='6'):
#         newNum+='9'
#         break
#     newNum+=num[i]
#     i+=1

# if (i==len(num)-1):
#     print(newNum)
# else:
#     newNum+=num[i+1:]
#     print(newNum)

# name="vishal"
# print(name[6:])

# print('v'=='V')
# print('v'=='v'.lower())


# name="vishalv"
# name=name.replace(name[0],'k')
# print(name)
# name[0]=''
# print(name)


# def makeGood(string):
#     # print("Method is called.")
#     if (len(string)==0 or len(string)==1):
#         # print("Empty string")
#         return string
#     i=0
#     # print("Hello world1",i)
#     while (i<len(string)-1):
#         # print("Entering the loop")
#         if (string[i].lower()==string[i+1].lower() and string[i]!=string[i+1]):
#             # print("condition satisfied.")
#             string=string[:i]+string[i+2:]
#             return makeGood(string)
#         i+=1

#     # print("hello world2",string,'Hii')
#     if i==len(string)-1:
#         return string


# string="leEeetcode"
# print(makeGood(string))

def makeGood(s):
    stack = []
    for i in range(len(s)):
        if stack and (stack[-1].lower() == s[i].lower() and stack[-1] != s[i]):
            stack.pop()
        else:
            stack.append(s[i])
    return ''.join(stack)

s="abBAcC"
print(makeGood(s))