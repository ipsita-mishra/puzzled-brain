from bottle import route, run, view, get, request

@get('/')
@view('index')
def index():
    pass

@get('/robots.txt')
@view('robots')
def res():
    pass

@get('/admin')
def adm():
    return "You are not allowed to access this page. Have a nice day!"

run(host='0.0.0.0', port=9999)
