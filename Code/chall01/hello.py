from bottle import route, run

@route('/')
def hello():
    return "Hello World! This is my first bottle app!"

run(host='0.0.0.0', port=9999)
