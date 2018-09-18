# Hibernate-Examples
Hibernate-4-Gradle

Project Dockerization  

docker pull mysql

for installation of mysql follow instruction from 
https://github.com/mysql/mysql-docker


docker run --name mySQL -e MYSQL_ROOT_PASSWORD=root -p 127.0.0.1:3306:3306 -p 127.0.0.1:33306:33306 mysql

docker exec -it mySQL mysql -uroot -proot

SQL commands
CREATE DATABASE hibernate;  

GRANT ALL PRIVILEGES ON hibernate.* TO 'root'@'localhost';

CREATE USER 'hibernate'@'localhost' IDENTIFIED BY 'hibernate';
GRANT ALL PRIVILEGES ON *.* TO 'hibernate'@'localhost';
FLUSH PRIVILEGES;