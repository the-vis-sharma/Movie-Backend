MongoDB dockerize commands

pulls a image
`docker pull mongo `

show the images
`docker images`

provides the container for the given image in docker-compose.yml file
`docker-compose up` 

show the container
`docker ps `

runs the container
`docker exec -it movie-backend_mongo-container_1 mongo -u root -p pass --authenticationDatabase admin `

MongoDB is ready to use
