from urllib import parse
from urllib import request
values = {}
values['action'] = "login"
values['username'] ="yourusername"
values['password'] = "yourpassword"
values['drop'] = "0"
values['pop'] = "1"
values['type'] = "2"
values['n'] = "117"
values['mbytes'] = "0"
values['minutes'] = "0"
values['ac_id'] = "1"
values['mac'] = "28:D2:44:D1:75:37"
login_data=parse.urlencode(values)
url = "http://172.16.154.130:69/cgi-bin/srun_portal"
response = request.urlopen(url,data=login_data.encode('utf-8'))
print(response.read())
