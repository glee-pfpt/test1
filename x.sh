echo JAVA_HOME=$JAVA_HOME
echo mvn=`which mvn`
#mvn archetype:generate -DgroupId=com.proofpoint.glee -DartifactId=foo -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn -s ./settings.xml -X package 
