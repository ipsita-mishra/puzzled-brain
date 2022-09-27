from bottle import route, run, view, get, request
import subprocess

@get('/result')
@view('index')
def index():
    pass

@get('/result/<val>')
def res(val):
    expr = 'echo $(( '+val+' ))'
    result = subprocess.run(['bash', '-c', expr], stdout=subprocess.PIPE)
    return result.stdout

run(host='0.0.0.0', port=9999, reloader=True, debug=True)
