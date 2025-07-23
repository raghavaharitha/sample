import math

def is_strong_number(num):
    """
    Checks if a given number is a strong number.
    """
    original_num = num
    sum_of_factorials = 0
    
    
    if num == 0:
        return False 

    while num > 0:
        digit = num % 10
        sum_of_factorials += math.factorial(digit)
        num //= 10
        
    return sum_of_factorials == original_num

print("Strong numbers from 1 to 5000:")
for i in range(1, 5001):
    if is_strong_number(i):
        print(i)