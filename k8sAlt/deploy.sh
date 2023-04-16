docker image tag l0r3n7/webMeisterstueck_server:1.0-SNAPSHOT ghcr.io/l0r3n7/webMeisterstueck-server:latest
docker push ghcr.io/l0r3n7/webMeisterstueck-server:latest

kubectl delete -f appsrv.yaml
kubectl delete -f busybox-job.yaml

kubectl apply -f namespace.yaml
kubectl apply -f ingress.yaml
kubectl apply -f appsrv.yaml
kubectl apply -f nginx.yaml
kubectl apply -f busybox-job.yaml


