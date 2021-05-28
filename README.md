# SwaggerDemoPaki

1. I have three endpoints getContact /get, getAllContacts/get, addContact/post using in Java Spring Boot (http://localhost:9090/)
2. Using global java data structure interface Map for storage variable
3. Using Swagger interface with read documentation and interaction with endpoints ( http://localhost:9090/swagger-ui.html)
4. Made pipeline to GitHub repository

5. Short instruction for using DockerHub: 
Clone source code from git
$  git clone https://github.com/pajic2017/SwaggerDemoPaki

Build Docker image
$ docker build -t="SwaggerDemoPaki"

Run Docker Container
$ docker run -p 8080:8080 -it --rm SwaggerDemoPaki

Test application
$ curl localhost:8080
