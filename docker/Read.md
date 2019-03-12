

docker-compose -f docker-compose-zipkin-mem.yml up

http://localhost:9411/zipkin/


#stop all container at once
docker container stop $(docker container ls -aq)

#remove all container at once
docker container rm $(docker container ls -aq)