# This is tailored to ctfd.io rules
# A check function is a Python 2.7 function taking a single argument. The argument provided will be the user's input. The function should then return a Boolean indicating whether the user was correct or not.

def check(x):
    useradd = "RUN useradd "
    user = "USER "
    if (useradd and user in x) and (x.find(useradd) < x.find(user)):
        return True
    else: 
        return False