# This is tailored to ctfd.io rules
# A check function is a Python 2.7 function taking a single argument. The argument provided will be the user's input. The function should then return a Boolean indicating whether the user was correct or not.

def check(x):
    useradd = " useradd "
    user = "user "
    lowerX = x.lower()
    if (useradd and user in lowerX) and (lowerX.find(useradd) < lowerX.find(user)):
        return True
    else: 
        return False