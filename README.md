karyon-gradle
=============

build

.../karyon-gradle$ cd karyon-gradle

.../karyon-gradle$ EUREKA_ELB=<Eureka ELB DNS Name>

.../karyon-gradle$ KARYON_OPTS="-Xmx2560m -Djava.awt.headless=true -Deureka.name=karyon -Deureka.region=us-west-2 -Deureka.port=80 -Deureka.us-west-2.availabilityZones=default -Dkaryon.serviceUrl.default=http://$EUREKA_ELB/v2/" ./gradlew clean buildDeb

bake

.../karyon-gradle$ sudo aminate -e ec2_aptitude_linux -b ubuntu-base-ami-ebs build/distributions/karyon-gradle_0.0.1_all.deb


launch instance, port 7001




