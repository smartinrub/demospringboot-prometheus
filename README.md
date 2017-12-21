# demospringboot-prometheus

## Setup Prometheus Server UI
1. Build docker image
```bash
cd demospringboot-prometheus
docker build -t my-prometheus .
```
2. Run docker image
```bash
cd demospringboot-prometheus
docker run -p 9090:9090 my-prometheus
```
3. Open Prometheus UI
Go to your browser and type http://localhost:9090/targets

## Run project
Go to your IDE and run the spring boot application