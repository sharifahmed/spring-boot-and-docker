## Spring Boot with Docker

The following are some common docker commands:
~~~
docker container ls - lists all the containers
docker container ls -a - list all the containers, including the exited ones
docker container stop [id] - stops a particular container
docker container rm [id] - removes a particular container
docker container logs [id] - shows log of the application inside the container
docker container prune - removes all exited containers

docker image ls - lists all the docker images
docker images - lists all the docker images
docker image rm [id] - removes a particular image with the specified id
docker image rm [repository:tag] - removes a particular image with the specified repository and tag

docker run -p 8000:8000 sharifahmed/greetings:0.0.1 - runs the specified docker container
docker run -d -p 8000:8000 sharifahmed/greetings:0.0.1 - runs the specified docker container in detached mode(i.e background)

Creating a docker image manually:
docker run -dit openjdk:8-jdk-alpine - creates a container with java 8
docker container cp build/libs/greetings:0.0.1.jar [containerId]:/tmp - copies the jar from source destination to /tmp directory of the container
docker container commit --change='CMD ["java", "-jar", "/tmp/greetings:0.0.1.jar"]' [containerId] sharifahmed/greetings:0.0.1 - adds the entrypoint that will execute once the container is run

Creating a docker image using gradle docker plugin:
./gradlew docker build - builds the greetings app and creates a docker image
~~~