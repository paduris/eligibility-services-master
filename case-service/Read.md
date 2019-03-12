
Json Request for testing:

http://localhost:8900/rest/register/case

{
    "effectiveDate": "2018-01-01",
    "endDate": null,
    "casePers": [
        {
            "effectiveDate": "2018-01-01",
            "endDate": null,
            "personClientNumber": "030076"
        },
        {
            "effectiveDate": "2018-01-01",
            "endDate": null,
            "personClientNumber": "030055"
        }
    ]
  }
  
  docker exec -it mysql bash
  CREATE USER 'arun'@'%' IDENTIFIED BY 'password';
  
  
  GRANT ALL PRIVILEGES ON * . * TO 'arun'@'%';
  
  #docker image debugging 
  docker run <image name> ls -l
  docker run eligibility_case-service ls -l
  
  docker container stop $(docker container ls -aq)
  
  docker exec -ti mysqldb /bin/bash
  
  
  
  docker run -p 3306:3306 -d --name mysql -e MYSQL_ROOT_PASSWORD=password --default-authentication-plugin=mysql_native_password mysql/mysql-server
  docker run -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -d mysql --default-authentication-plugin=mysql_native_password mysql -uroot --protocol tcp
  

 docker run --hostname mysqldb --name mysqldb  -e MYSQL_ROOT_PASSWORD=admin -e MYSQL_DATABASE=eligibility -e MYSQL_USER=admin -e MYSQL_PASSWORD=admin -d mysql:latest
 
 docker run -p 3306:3306 -d --name mysql -e MYSQL_ROOT_PASSWORD=password --default-authentication-plugin=mysql_native_password mysql/mysql-server
 
 docker run -p 3306:3306 -d --name mysql -e MYSQL_ROOT_PASSWORD=password mysql/mysql-server
 
 ALTER USER 'yourusername'@'localhost' IDENTIFIED WITH mysql_native_password BY 'youpassword'