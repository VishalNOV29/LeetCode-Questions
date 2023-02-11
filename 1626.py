class Solution:
    def bestTeamScore(self, scores, ages):
        print("Method is called")
        maxScore=0
        tempScore=0
        for i in range(len(scores)-1):

            print('Iteration...',i+1)

            tempScore+=scores[i]

            print("tempScore =",tempScore)
            print("maxScore =",maxScore)

            if ages[i]>ages[i+1] and scores[i]<scores[i+1]:
                print("found a conflict :")
                maxScore=max(tempScore,maxScore)
                tempScore=0
        if not(ages[-1]<ages[-2] and scores[-1]>scores[-2]):
            tempScore+=scores[-1]        
        return max(tempScore,maxScore)

obj =Solution()

# scores = [1,3,5,10,15]
# ages = [1,2,3,4,5]

scores = [1]
ages = [8]

# scores = [4,5,6,5]
# ages = [2,1,2,1]
print(scores)
print(ages)

print(obj.bestTeamScore(scores,ages))