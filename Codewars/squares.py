# works
def is_square(n): 
    if n >= 0:
        if n**(1/2)%1 == 0:
            return True
    return False

obj = is_square(36)
print(obj)