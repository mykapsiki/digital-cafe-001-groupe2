@echo off
call mvn clean package
call docker build -t com.group2/client_app .
call docker rm -f client_app
call docker run -d -p 9080:9080 -p 9443:9443 --name client_app com.group2/client_app