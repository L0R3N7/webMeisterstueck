

bold=$(tput bold)
normal=$(tput sgr0)

docker image tag l0r3n7/webmeisterstueck-server:1.0.0-SNAPSHOT ghcr.io/l0r3n7/webmeisterstueck-server:latest
docker push ghcr.io/l0r3n7/webmeisterstueck-server:latest
kubectl delete -f appsrv.yaml
kubectl delete -f busybox-job.yaml
kubectl apply -f namespace.yaml
kubectl apply -f ingress.yaml
#kubectl apply -f postgres.yaml
kubectl apply -f appsrv.yaml
kubectl apply -f nginx.yaml
kubectl apply -f busybox-job.yaml


echo "----------"
echo "DO NOT FORGET: make the ${bold}docker image public${normal} on ghcr.io"
echo "----------"
