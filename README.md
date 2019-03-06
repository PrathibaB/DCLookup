DCLookUp

Getting Started:

Install Eclipse IDE and Tomcat server to run the project on any web browser.

Pre-requsites:

1.Eclipse IDE
2.Tomcat Server
3.Browsers

Built with :
Maven - Dependency Management


About :

The project was intended to ease the things at my workplace to put all data in one place(DataBase), and make the retreival easy and fast.

Overview:

DC - Distribution Center/Data Center.

Iam working in a project SuperValu, that deals with handling all retail and non-retail stores network, managing all network devices, troubleshooting for network issues that come along. 
Distribution center is basically a warehouse that distributes all the necessary items to the retail stores and the network is managed by some 100's of network devices.
Data center is responsible for providng the network, storing all the data of all locations that fall under umbrella of SuperValu. two such Data centers are available located in Boise and Eden Priarie of USA.

Any DC issue, the team will be alerted in a tool called Spectrum and the Network Operation Center(NOC) would reach out to site to take appropriate acions to troubleshoot the issue. All the locations have 2 different Internet Service Providers to support locations and the 2 copnnections have circuit Ids to identify them uniquely. 

NOC team uses Visio files that contain all the data regarding that particular location(Address, Local contact, Circuit IDs, Business hours etc..). Noc team has to browse through 10's of files to get their hands on Valid data.

That' when the DCLoookUp idea flashed to put data of all DC's in one place and make it available at finger tips which saves lot of time as the Dc's issues are always critical and has huge impact on business.

DcLookUp is a webpage which is built using HTML5, CSS3, BootStrap3  as a front end. MySQL as RDBMS to store data in tables called Address, LCONinfo, Circuit IDs. JavaServlets and JSP using as backend technology.

User can just access the webpage using the URL, and search for desired information there by eliminating the efforts put in searching the data through Visio files.


Authors :

B Prathiba - prathibareddy.official@gmail.com



