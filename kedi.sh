#!/bin/bash -e

KEDI=$RANDOM 
echo $KEDI

sudo docker run -v $(pwd):/builddir --name $KEDI ubuntu /bin/bash -c "/builddir/build.sh"
sudo docker rm $KEDI
