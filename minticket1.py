n = int(input())
m = int(input())
a = int(input())
b = int(input())

if m * a < b:
    # Case where single tickets are cheaper
    print(n * a)
else:
    # Calculate using m-ride tickets and potentially some single tickets for the remainder
    total_cost = (n // m) * b + min((n % m) * a, b)
    print(total_cost)
