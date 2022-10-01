# Array.diff
# def array_diff(a, b):
#     if len(b) != 0:
#         newList = []
#         for i in b:
#             for j in a:
#                 if i != j:
#                     newList.append(j)

#         return newList
#     return a;

# obj = array_diff([1,2,3], [1,2])
# print(obj)

# works
import copy
def array_diff(a, b):
    newList = copy.copy(a)
    for i in a:
        if i in b:
            newList.remove(i)
    return newList

obj = array_diff([1,2,3], [1,2])
print(obj)