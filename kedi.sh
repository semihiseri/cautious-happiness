#!/bin/bash -e

KEDI=$RANDOM 
echo $KEDI
sudo docker run --name $KEDI ubuntu /bin/bash -c "apt-get update ; apt-get install -y git ; git clone http://github.com/semihiseri/cautious-happiness ; cd cautious-happiness ; chmod 777 build.sh ; ./build.sh"
sudo docker cp $KEDI:/cautious-happiness . 
sudo docker rm $KEDI
