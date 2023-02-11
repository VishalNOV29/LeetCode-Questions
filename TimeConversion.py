# Task 1 
def collatzSequence(n):

    collatzList = [n]
    while (n != 1):

        if (n % 2 == 0):
            n = n//2  # If the number is a even number.
        else:
            n = (3*n)+1  # If the number is a odd number.

        collatzList.append(n) # Append the numebr in the list.

    return collatzList   # Returning the list.




# Task 2
def maxLengths(m):

    
    maxLen=0 # Initializing initial length to 0.
    element=-1  # Initializing element to -1.

    for i in range(1,m+1):

        collatzList=collatzSequence(i)

        # Calculating the length of list. len() is used to find the length of a list in python
        listLen=len(collatzList)

        if maxLen<listLen:
            maxLen=listLen
            element=i

    return maxLen,element




# Task 3

def maxValue(m):

    # This function take a 2D list as a argument and it will find out the smallest number having maximum value in the collatz sequence.
    def fun1(k):

        maxEle=k[-1][1]
        maxValue=k[-1][0]

        for ele in k:
            if (maxValue==ele[0] and maxEle<ele[1]):
                maxEle=ele[1]
                break

        return maxValue,maxEle

    maxElement=0
    k=[]

    for i in range(1,m+1):
        collatzList=collatzSequence(i)
        temp=max(collatzList)
        if (maxElement<temp):
            maxElement=temp
            k.append([maxElement,i])

    return fun1(k)



# main() method 
def main():
    print("Task 1 output:",collatzSequence(7))
    print("Task 2 output:",maxLengths(10))
    print("Task 3 output:",maxValue(10))

# Calling main function.
main() 