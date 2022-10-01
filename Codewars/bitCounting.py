#works
a = 57
binary = bin(a)
now = binary.replace("0b", "")
res = [int(x) for x in now]
c = sum(res)
print(c)
