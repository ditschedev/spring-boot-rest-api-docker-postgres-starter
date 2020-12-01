# Spring Boot Starter 🚀
A simple starter project to directly get started to develop your backend services. It comes with just the needed things:
* 🌟 Lombok
* 🗄 PostgresDB (H2 for testing)
* 🐳 docker-compose ready to start
* 👀 env variables setup

### Getting started
> After cloning you should update the namespace matching your domain and project

To get started just clone this repository in a folder you like and start working:
```shell script
git clone git@github.com:ditschedev/spring-boot-rest-api-docker-postgres-starter.git <my-project-name>
```

### Configuration
The system is designed to be configured by using environment variables. Copy the `.env.sample` to `.env` and adjust the values
as you like. When booting, the `docker-compose.yml` automatically picks up the values of this file and sets the environment
accordingly.