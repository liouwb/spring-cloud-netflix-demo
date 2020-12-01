#所需基础镜像
#FROM openjdk:8-jdk-alpine
FROM java:8
#作者信息
MAINTAINER liouwb
#具名挂载
VOLUME /tmp
#端口暴露8801 8801只是容器和宿主机通讯的端口，启动镜像映射端口还是使用application.yml 里面的6001
EXPOSE 8801
#将我们的jar 添加到容器中 并取名为app.jar
ADD target/*.jar /app.jar
# 执行命令
#ENTRYPOINT ["java","-jar" ,"/application.jar"]
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
