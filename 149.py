# points = [[1, 1], [2, 2], [3, 3]]
points=[[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
maxPoints = 0
for i in range(len(points)):
    myDict = {}
    tempPoints = 0
    for j in range(i+1, len(points)):
        yDiff = points[j][1]-points[i][1]
        xDiff = points[j][0]-points[i][0]
        m = yDiff//xDiff
        if m in myDict:
            myDict[m] += 1
        else:
            myDict[m] = 1
        tempPoints = max(tempPoints, myDict[m])
        print("tempPoints =", tempPoints)
    maxPoints = max(maxPoints, tempPoints+1)
    print("maxPoints =", maxPoints)
    print(myDict)
print(maxPoints)
