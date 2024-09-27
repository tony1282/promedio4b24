def sum(n):
    if n == 0:
        return 0
    else:
        return n*n + sum(n - 1)

n=6
print(f"La sumatoria de {n} es igual a {sum(n)}")

