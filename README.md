## Run Update
* POST mapping `http://localhost:5555/actuator/bus-refresh`

### RabbitMQ
* host `localhost`
* port `5672`
* username `guest`
* password `guest`

### Update Service
* port `5555`
* GET mapping `http://localhost:5555/service` 
* poperty file `update-service.property`

### People Service
* port `7777`
* GET mapping `http://localhost:7777/service`
* poperty file `people-service.property`

### Car Service
* port `6666`
* GET mapping `http://localhost:6666/service` 
* poperty file `car-service.property`

### Config Server
* port `8888`

