FROM java:8
EXPOSE 8086
ADD plumemo-v1.2.0.jar blog.jar
RUN bash -c 'touch /blog.jar'
ENTRYPOINT ["java","-jar","/blog.jar","--spring.profiles.active=pro"]