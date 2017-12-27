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
- for Prometheus metrics
https://prometheus.io/docs/concepts/metric_types/
- [Dropwizard Metrics library](http://metrics.ryantenney.com)

## Grafana
### Setup
```bash
docker run -d -p 3000:3000 -e \"GF_SECURITY_ADMIN_PASSWORD=secret\" -v ~/grafana_db:/var/lib/grafana grafana/grafana
```
* -v creates a Docker volume placed at `~/grafana_db` on the host system and at `/var/lib/grafana` in the container filesystem
* [Grafana Documentation](http://docs.grafana.org/)
* [Installation](http://docs.grafana.org/installation/docker/)
### Add Prometheus as a Grafana Data Source
- Go to Grafana main view at `http://localhost:3000/`
- Do login: `admin/secret`
- Click on the Grafana icon in the top left corner to show the main menu, select Data Sources and click `Add data source`
- Insert the following values:
* Name: Prometheus
* Type: Prometheus
* URL: http://YOUR_LOCALHOST_IP(default port is 9090)
* Access: proxy
- Click on Add and Test Connection
### Create Dashboard
- Click on the Grafana icon in the top left corner to show the main menu, select Dashboards, New
- Choose type of panel (Graph for example)
- Click on panel title to edit
- Choose Data Source, Add Query and save it
