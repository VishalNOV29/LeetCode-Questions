

# l1 = [2, 2, 3, 3, 2, 4, 4, 4, 4, 4]
# l1=[2,3,3]
l1 = [66, 66, 63, 61, 63, 63, 64, 66, 66, 65, 66, 65, 61, 67, 68, 66, 62, 67, 61, 64, 66, 60, 69, 66,
      65, 68, 63, 60, 67, 62, 68, 60, 66, 64, 60, 60, 60, 62, 66, 64, 63, 65, 60, 69, 63, 68, 68, 69, 68, 61]
myDict = {}
for ele in l1:
    if ele in myDict:
        myDict[ele] += 1
    else:
        myDict[ele] = 1

print(myDict)

totalRound = 0
for ele in myDict:
    count = myDict[ele]

    if count % 3 == 0:
        totalRound += count//3
    elif (count % 3) % 2 == 0:
        totalRound += (count//3)+(count % 3)//2
    elif count % 2 == 0:
        totalRound += count//2
    elif (count % 2) % 3 == 0:
        totalRound += (count//2)+(count % 2)//3
    else:
        print("Breaking...")
        print(ele,myDict[ele])
        print(-1)
        break
print(totalRound)
