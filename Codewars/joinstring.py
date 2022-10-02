def repeat_str(repeat, string):
    a = []
    for i in range(repeat):
        a.append(string)
        
    b = "".join(a)
    return b

obj = repeat_str(5, "hello")
print(obj)