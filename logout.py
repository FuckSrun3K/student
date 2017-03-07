from urllib import request
url = "http://172.16.154.130/cgi-bin/srun_portal?action=logout"
response = request.urlopen(url)
print(response.read())
