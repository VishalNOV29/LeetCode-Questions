# class StockSpanner:
    
#     def __init__(self):
        

#     def next(self, price: int) -> int:
        


# # Your StockSpanner object will be instantiated and called as such:
# # obj = StockSpanner()
# # param_1 = obj.next(price)

# class Student:
#     # arr=[]
#     college="NIET"
#     def __init__(self,name,id):
#         self.arr=[]
#         self.name=name
#         self.id=id
    
#     def getName(self):
#         return self.name
    
#     def getId(self):
#         return self.id
    
#     @classmethod
#     def getCollege(cls):
#         return cls.college

#     @classmethod
#     def addStudent(cls,student):
#         cls.arr.append(student)

# obj=Student("vishal Kumar singh",123)
# print(obj.college)

# obj2=Student("abhi",1234)
# obj2.college="IIMT"
# print(obj2.college)

# print(obj.college)
# Student.arr.append(obj)
# Student.arr.append(obj2)

# print(Student.arr)
# print(Student.college)
# Student.college="IIMT"
# print(obj.college)
# print(obj2.college)


# class StockSpanner:
       
#     def __init__(self):
#         self.arr=[]
        
        

#     def next(self, price: int) -> int:
#         self.arr.append(price)
#         k,count=len(self.arr)-1,0
#         while (k>=0):
#             if (self.arr[k]>price):
#                 break
#             count+=1
#             k-=1
#         return count

# # Your StockSpanner object will be instantiated and called as such:
# obj = StockSpanner()
# param_1 = obj.next(100)
# print(param_1)
# print(obj.next(80))
# print(obj.next(60))
# print(obj.next(70))
# print(obj.next(60))
# print(obj.next(75))
# print(obj.next(85))
