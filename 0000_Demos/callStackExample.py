# base case
# recursive call

# Python program to display the Fibonacci sequence

def recur_fibo(n):
   if n <= 1:
       return n
   else:
       return(recur_fibo(n-5) + recur_fibo(n-2))

nterms = 10
# more code
# more code

# check if the number of terms is valid
if nterms <= 0:
   print("Plese enter a positive integer")
else:
   print("Fibonacci sequence:")
   for i in range(nterms):
       print(recur_fibo(i))  

# towers of hanoi - Google Classroom

# function that has an if statement
# there's an else after it
# the else contains the function itself
# reverses

