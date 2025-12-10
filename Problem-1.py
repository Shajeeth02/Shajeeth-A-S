a = float(input().strip())
b = float(input().strip())
op = input().strip().lower()
if op in ("add", "+"):
    print(a + b)
elif op in ("sub", "-"):
    print(a - b)
elif op in ("mul", "*"):
    print(a * b)
elif op in ("div", "/"):
    if b == 0:
        print("Error: division by zero")
    else:
        print(a / b)
else:
    print("Unknown operation")
