import operator

interface Calculator {
    
}

class FourFunctionCalculator {
    # Dictionary of all possible operations
    operations = {
                    '+': operator.add, 
                    '-': operator.sub,
                    '*': operator.mul,
                    '/': operator.truediv
                }


    # A defining characteristic of dictionaries (or hashmaps in Java) are key value pairs
    # Taking in user inputs
    # TODO: Make it loop
    user_operation = input("What operation would you like?")
    user_number_1 = float(input("What is the first number?"))
    user_number_2 = float(input("What is the second number?"))

    # check to see if there's an operation converter
    try:
        function = operations[user_operation]
        answer = function(user_number_1, user_number_2)
        print(user_number_1, user_operation, user_number_2, '=', answer)
        # don't need to cast if you're using commas
    except ZeroDivisionError as zde:
        print("Why")
    except TypeError as e:
        print("What are you doing?")
    except Exception as ee:
        print("The only valid operations are " + operations.keys)

    print('')





}
