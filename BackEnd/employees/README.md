# Welcome

### Java Rest API using Spring

Hello, purpose of this little app is fetching data from [Swagger](http://masglobaltestapi.azurewebsites.net/swagger/) and make to it the necessarly changes to work properly with a custom API which is going to be consumed by a React.JS site (it's in the "FrontEnd" folder on the root)<br>.

### Creation
This app was created using  [Spring Initializr](https://start.spring.io/)
- Initilized with this packages:
	- tomcat (default)
	- mysql
	- jpa

### JDK
Version 11

### Run:
Just run the project by:  
`.\mvnw.cmd spring-boot:run`

### Enpoints testing
- http://localhost:8080/employee
- http://localhost:8080/employee/id/1

### Project Folder  
|  
|-> src/main/java/  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|-> com/masglobal/employees/  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|-> Controllers/  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|-> Models/  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|-> Repositories/  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|-> Services/  

#### Note: This Rest App was build for a MASGlobal app.
- You can check the unit tests in the test folder 
- Deprecated: Remember to establish a proper MySQL connection in your `src\main\resources\application.properties` file

I hope this will have everything you're asking for, I'll be tuned!