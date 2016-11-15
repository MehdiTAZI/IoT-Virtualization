# IoT-Virtualization
## IoT Virtualization Proof Of Concept
The puprpose of this source code is to proof our proposed approach of a virtualization IoT framework which is definied in the following PhD paper.

micro-services approch

each componen have a name, version and type

## Projects

### Thermometer CT
xxxx
### WirelessDisplay CT
xxxx
### Thermometer VCT
xxxx
### WirelessDisplay VCT
xxxx
### WirelessDisplayThermometer CT
xxxx
### WirelessDisplayThermometer CVCT
xxxx

## Build the solutions
mvn clean install

## Run the solutions

### Apache Felix
#### Installation and test
1 - http://felix.apache.org/site/downloads.cgi
2 - download ipojo bundle
3 - copy to bundle directory
4 - start felix : on apache felix directory run java -jar bin/felix.jar
5 - list bundles : felix:lb
6 - copy the project bundles on the apache felix directory
7 - install bundles : felix:install [bundle_name]
8 - start bundles : felix:start [bundle_number]

### Apache Karaf
#### Installation and test
1 - https://karaf.apache.org/download.html
2 - start karaf : on apache karaf directory run ./bin/karaf
3 - install ipojo bundles : 
  - feature:repo-add http://repo1.maven.org/maven2/org/apache/felix/org.apache.felix.ipojo.features/1.12.1/org.apache.felix.ipojo.features-1.12.1.xml
4 - check repo : feature:repo-list
5 - install bundles : feature:install ipojo, feature:install ipojo-command, feature:install ipojo-all, feature:install ipojo-webconsole
6 - list bundles : bundle:list
7 - install bundles : bundle:install mvn:[group_name]/[bundle_name]/[version]
8 - start bundles : bundle:start [bundle_number]



