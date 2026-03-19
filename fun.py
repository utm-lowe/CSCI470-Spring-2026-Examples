def f():
    print("f")

def g():
    print("g")

def counterMaker(y):
    def counter(x):
        return x+y
    return counter

f()
g()

a = f
a()

add10 = counterMaker(10)
add5 = counterMaker(5)

print(add10(5))
print(add5(5))