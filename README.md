# Using docker with spring boot application (Windows 10 pro)

## Steps :

- Create executable jar file of your spring boot app. After creation you can find it in target directory. Moreover with the help of this .jar file we can run a web application as a console application. We can run .jar file from command prompt with the help of following command
```
java -jar dockerSpringBoot-0.0.1-SNAPSHOT.jar
```
- Install docker
- Create a file in project directory name Dockerfile where we basically write commands. These commands help to deploy containers
- Build docker image
- Run docker container
- After successfully finish those steps you can find out your docker image from docker desktop app. Here is mine :

<img src="https://user-images.githubusercontent.com/25477302/116754196-27528580-aa2a-11eb-8c12-9d5aa4fade1b.PNG" width="100%"></img>


## Useful commands :


```
# Check installed docker version
docker --version
```
```
# If you are new than create a simple docker image hello world to check installation work correctly or not
docker run hello-world
```
```
#Build a docker image with a name. Name should be appear in all lower case letter 
docker build -t imagename .
```
```
# Check availabe docker images
docker images OR docker image ls
```
```
# Run docker image on our desire port number 
docker run -p 8886:8886 imagename
```
```
# Container id number is need to stop a container. To get it
docker ps

Note : this command shows only running containers id. To get stopped container id, we should use following command

docker ps -a
```
```
# To stop a docker container
docker container stop dockerid
```


## Note :
1. Windows 7 or Windows 10 Home doesn’t support Docker. Check windows version :
```
 1 Click the Start button
 2. Type "winver" in the search box
 3. press Enter.
 
 ```
 2. Virtualization option must be enable. To check
 ```
 Task Manager -> Performance
 
 ```
3. Docker run command alawys create a new container. For start a container again, we should use 
```
docker container start imageid
```
## How to create a .jar file
```
Right click on project -> Run as -> maven build -> Goals : clean compile install -> Alternate JRE : select your jdk version -> apply and run
```









