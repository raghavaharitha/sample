import math

def is_prime(num):
    """
    Checks if a number is prime.
    A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
    """
    if num <= 1:
        return False  
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return False  
    return True  

print("Prime numbers from 1 to 100 are:")
for number in range(1, 101):
    if is_prime(number):
        print(number)