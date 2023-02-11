# # # Reversing vowel of a string.
# # # Approach

# # myStr="leetcode"
# # myStr=list(myStr)
# # i=0
# # vowels={'a','e','i','o','u','A','E','I','O','U'}
# # j=len(myStr)-1
# # while (i<j):
# #     print("Entering in the loop :",myStr[i],myStr[j])

# #     if (myStr[i] in vowels and myStr[j] not in vowels):
# #         print("First condition.")
# #         j-=1
# #     elif (myStr[i] not in vowels and myStr[j] in vowels):
# #         print("Second condition.")
# #         i+=1
# #     elif (myStr[i] in vowels and myStr[j] in vowels):
# #         print("Third condition. Swapping the vowels.")
# #         myStr[i],myStr[j]=myStr[j],myStr[i]
# #         i+=1
# #         j-=1
# #     else:
# #         i+=1
# #         j-=1
# # myStr=''.join(myStr)
# # print(myStr)

# # # myStr="Hello Python!"
# # # print(myStr[2:7])
# # # print(myStr[-1])


# # class Solution:
# #     def reverseVowels(self, s: str) -> str:
# #         myStr=list(s)
# #         i=0
# #         vowels={'a','e','i','o','u','A','E','I','O','U'}
# #         j=len(myStr)-1
# #         while (i<j):
# #             print("Entering in the loop :",myStr[i],myStr[j])

# #             if (myStr[i] in vowels and myStr[j] not in vowels):
# #                 print("First condition.")
# #                 j-=1
# #             elif (myStr[i] not in vowels and myStr[j] in vowels):
# #                 print("Second condition.")
# #                 i+=1
# #             elif (myStr[i] in vowels and myStr[j] in vowels):
# #                 print("Third condition. Swapping the vowels.")
# #                 myStr[i],myStr[j]=myStr[j],myStr[i]
# #                 i+=1
# #                 j-=1
# #             else:
# #                 i+=1
# #                 j-=1
# #         return ''.join(myStr)


# # obj = Solution()
# # result=obj.reverseVowels("leetcode")
# # print(result)


# # name="vishal"
# # name="noor"
# # print(name)


# # mySet=set()
# # mySet.add(10)
# # mySet.add('10')
# # print(mySet)
# # # mySet.update(1,20)
# # print(mySet)
# # mySet2={1,2,3}
# # mySet.update(mySet2)
# # print(mySet)


# # myDict={1:"vishal",2:"kumar",3:"singh",4:{1,2,3,4,5}}
# # print(myDict)


# # def removeDuplicates(s,k):
# #     list1=[]
# #     for ele in s:
# #         print(list1)
# #         if list1 and list1[-1][0]==ele:
# #             if (list1[-1][1]+1==k):
# #                 list1.pop()
# #             else:
# #                 list1[-1][1]+=1
# #         else:
# #             list1.append([ele,1])
# #     newStr=""
# #     for ele in list1:
# #         newStr+=ele[0]*ele[1]
# #     return newStr

# # print(removeDuplicates("deeedbbcccbdaa",3))

# # def hcfnaive(a, b):
# #     if(b == 0):
# #         return abs(a)
# #     else:
# #         return hcfnaive(b, a % b)

# # a = 60
# # b = 48

# # # prints 12
# # print("The gcd of 60 and 48 is : ", end="")
# # print(hcfnaive(11, 17))


# # def replaceNonCoprimes(nums):
# #     def calLcm(x,y):
# #         lcm = (x*y)//calGcd(x,y)
# #         return lcm
# #     def calGcd(a,b):
# #         if(b == 0):
# #             return abs(a)
# #         else:
# #             return calGcd(b, a % b)

# #     list1=[]
# #     for ele in nums:
# #         print("Before:",list1,ele)
# #         if (list1 and calGcd(list1[-1],ele)>1):
# #             print("gcd = ",calGcd(list1[-1],ele))
# #             lcm=calLcm(list1[-1],ele)
# #             print("lcm = ",lcm)
# #             # lcm=(list1[-1]*ele)//calGcd(list1[-1],ele)
# #             list1.pop()

# #             list1.append(lcm)
# #         else:
# #             list1.append(ele)
# #     return list1

# # print(gcd(4,5))
# # # print(replaceNonCoprimes([6,4,3,2,7,6,2]))
# # print(replaceNonCoprimes([287,41,49,287,899,23,23,20677,5,825]))
# # # exp=[2009,20677,825]


# # FILENAME = "movies.txt"


# # def write_movies(movies):
# #     with open(FILENAME, "w") as file:
# #         for movie in movies:
# #             file.write(f"{movie}\n")


# # def read_movies():
# #     movies = []
# #     with open(FILENAME) as file:
# #         for line in file:
# #             line = line.replace("\n", "")
# #             movies.append(line)
# #     return movies


# # movies = ['abc', 'def', 'ghi', 'jkl']
# # write_movies(movies)
# # print(read_movies())


# # def myFun(num):
# #     return num*2

# # # myList=[1,2,3,4,5,6]

# # # newList=list(map(myFun,myList))
# # # print(newList)

# # a_b_c=list(map(myFun,map(int,input("Enter numbers").split())))
# # print(a_b_c)


# # graduates = [(1, 'Hoshi Sato', 2012), (2, 'abc', 2010), (3, 'xyz', 2014),(4,'pqr',2016),(5,'wxy',2018)]
# # studentName = "Hoshi Sato"
# # def getNameAndYearforGraduate(studentName):
# #     for graduate in graduates:
# #         if graduate[1] == studentName:
# #             return(graduate[1], graduate[2])

# # result=getNameAndYearforGraduate("Hoshi Sato")
# # print(result)


# # def subSum(arr,k):
# #     print("method is called")
# #     myDict={0:1}
# #     tempSum=0
# #     count=0
# #     for ele in arr:

# #         tempSum+=ele
# #         diff=tempSum-k
# #         print("sum =",tempSum)
# #         print("diff =",diff)
# #         print("count =",count)
# #         if diff in myDict:
# #             print("condition1")
# #             count+=myDict[diff]
# #             myDict[diff]=myDict[diff]+1
# #         else:
# #             print("conditon2")
# #             myDict[tempSum]=1
# #         print(myDict)
# #     return count


# # # # arr=[10, 2, -2, -20, 10]
# # arr=[1,2,1,2,1]
# # k=3
# # # print(subSum(arr,k))

# # def subSum(arr,k):
# #     myDict={k:0}
# #     tempsum=0
# #     count=0
# #     for ele in arr:
# #         print("**************************************")
# #         tempsum+=ele
# #         diff=tempsum-k
# #         print("sum =",tempsum)
# #         print("diff =",diff)

# #         if diff==0:
# #             print("condition1")
# #             print("Count incresed")
# #             count+=1
# #             myDict[tempsum]+=1
# #         elif diff in myDict:
# #             print("condition2")
# #             print("count incresed")
# #             count+=myDict[diff]
# #             myDict[diff]+=1

# #         if tempsum in myDict:
# #             myDict[tempsum]+=1
# #         else:
# #             myDict[tempsum]=1
# #         print("count =",count)
# #         print(myDict)
# #     return count


# # arr=[10, 2, -2, -20, 10]
# # arr=[9, 4, 20, 3, 10, 5]
# # k=33
# # arr=[1,2,3]
# # k=3
# # print(subSum(arr,k))


# # data={1:2,2:3,3:4}
# # print(sorted(data.keys()))
# # print(sorted(data.values()))
# # # print(data)

# # s={1,2,3}
# # s.add(5)
# # s.remo
# # print(s)

# # myDict = {1: 2, 2: 3, 3: 4, 4: 5}
# # myDict[5]+=1
# # print(myDict)

# # print(sorted(myDict.items()))
# # print(sorted(myDict))
# # print(sorted(myDict.keys()))
# # print(sorted(myDict.values()))

# # myDict={('vishal','singh'):[1,2,3,4],('vaibhav','raj'):[4,5,6,7]}
# # print(sorted(myDict.items()))
# # var1=sorted(myDict.items())

# # print(var1[0][0][1])


# def subSum(arr, k):
#     currentSum = 0
#     count = 0
#     myDict = {}
#     for i in range(len(arr)):
#         print("***********************************")
#         print("i =",i)
#         currentSum += arr[i]
#         diff = currentSum-k
#         print("currentSum =",currentSum)
#         print("diff =",diff)

#         if diff == 0:
#             print("increment counter.")
#             count += 1
#         if diff in myDict:
#             print("increment counter.")
#             count += myDict[diff]

#         if currentSum in myDict:
#             myDict[currentSum] += 1
#         else:
#             myDict[currentSum] = 1
#         print(myDict)
#     return count


# # arr = [3, 4, 7, 2, -3, 1, 4, 2]
# # k = 7

# arr = [10, 2, -2, -20, 10]
# k = -10

# # arr = [9, 4, 20, 3, 10, 5]
# # k = 33

# # arr=[1,1,1]
# # k=2

# # arr=[1,2,3]
# # k=3

# # arr=[1,2,1,2,1]
# # k=3

# # arr=[1,-1,0]
# # k=0
# # print(subSum(arr, k))


# def fourSum(arr,k):
#     arr.sort()
#     l=len(arr)-1
#     myDict={arr[0]+arr[l]:[arr[0],arr[l]]} # initializing.. the array with the sum of first and last element.

#     # setting pointrs
#     i=1
#     j=l-1

#     while (i<j):
#         print("******************************************")
#         print(myDict)
#         currentSum=arr[i]+arr[j]
#         diff=k-currentSum
#         print("current element :",[arr[i],arr[j]])
#         print("sum =",currentSum)
#         print("diff =",diff)

#         res=[]

#         if diff in myDict:
#             print("found in dictionary")
#             temp=[myDict[diff][0],arr[i],arr[j],myDict[diff][1]]
#             print(temp)
#             # res.append([myDict[diff][0],myDict[diff][1],arr[i],arr[j]])
#             res.append(temp)

#         if currentSum>k:
#             j-=1
#         else:
#             i+=1

#         myDict[diff]=[arr[i],arr[j]]

#     return res

# arr=[1,0,-1,0,-2,2]
# print(sorted(arr))
# target=0
# print(fourSum(arr,target))


def getNumber(num, n):
    number = list(num)

    i, j = -1, -1

    for i in range(n - 1, 0, -1):
        if number[i] < number[i - 1]:
            break
    
   

    # If no such digit is found then all digits are in ascending order means there cannot be a smallest number with same set of digits
    if i == 1:
        return num

    x, greatest = number[i - 1], i

    #Find the greatest digit on right side of(i-1)'th digit that is smaller than number[i-1]
    for j in range(i, n):
        if (number[j] < x and
                number[j] > number[greatest]):
            greatest = j

    # Swap the above found smallest digit  with number[i-1]
    (number[greatest],
     number[i - 1]) = (number[i - 1],
                       number[greatest])

    l = number[i:]
    del number[i:]

    # Sort the digits after(i-1)  in descending order
    l.sort(reverse=True)

    number += l

    number = '' . join(number)

    return int(number)


digits='527'
print("num =",getNumber(digits, len(digits)))

digits = '18256'
print("num =",getNumber(digits,len(digits)))

digits='12345'
print("num =",getNumber(digits,len(digits)))