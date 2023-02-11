print("hello world")

myDict={}
def myFun(myDict,inp):
    if inp[0] in myDict:
        myDict[inp[0]].append(inp[1::])
    else:
        myDict[inp[0]]=[inp[1::]]



myFun(myDict,['foo','bar',1])
myFun(myDict,['foo','bar',2])
print(myDict)