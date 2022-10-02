# You are going to be given an array of integers. Your job is to take that array and find an index N where the sum of the integers to the left of N is equal to the sum of the integers to the right of N. If there is no index that would make this happen, return -1.

# works
def find_even_index(arr):
    for i in range(len(arr)):
        leftInt = []
        rightInt = []

        for j in range(i):
            leftInt.append(arr[j])

        for k in range(len(arr)-(i+1)):
            k += i
            rightInt.append(arr[k+1])
            
        print(leftInt) # debug
        print(rightInt)
        
        if(sum(leftInt) == sum(rightInt)):
            return i

    return -1



obj = find_even_index([10,-80,10,10,15,35,20])
print(obj)