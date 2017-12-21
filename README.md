# demospringboot-prometheus

## Setup Prometheus Server UI
1. Build docker image
```bash
cd demospringboot-prometheus
docker build -t my-prometheus .
```
2. Run docker image
```bash
docker run -p 9090:9090 my-prometheus
```
3. Open Prometheus UI
Go to your browser and type http://localhost:9090/targets

## Run project
Go to your IDE and run the spring boot application
To show prometheus logs without the UI go to http://localhost:8080/prometheus

### Types of metrics
https://prometheus.io/docs/concepts/metric_types/
