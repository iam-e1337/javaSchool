def descending_order(num):
    numFi = [i for i in str(num)]
    numFinal = sorted(numFi)
    numFinal.reverse()
    final = "".join(numFinal)
    return int(final)

obj = descending_order(12345)
print(obj)