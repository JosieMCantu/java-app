Java Agent Example
=====================

### Setup
This is a Spring Boot Java application. You will need JDK8 and Gradle 8 or newer installed locally to run this. 

It also assumes you want to verify on Staging.  If that is not true, check
`build.gradle` for instructions on how to point at production.

Please specify the following variables in your .zshrc or .bashrc or manually in terminal:

```
You may need to specify where the correct version of Java is located on your system:

export JAVA_HOME=`/YOUR/PATH/TO/JAVA_HOME` 
export NEW_RELIC_LICENSE_KEY=YOUR_LICENSE_KEY
export NEW_RELIC_JAR='/Users/YOUR_DIRECTORY/newrelic-java-agent/newrelic-agent/build/newrelicJar/newrelic.jar'
export NEW_RELIC_API='/Users/YOUR_DIRECTORY/newrelic-java-agent/newrelic-api/build/libs/newrelic-api-#.##.#-SNAPSHOT.jar'

```

### Run the App

Then run the Spring Boot app:

`./gradlew bootRun`

Now when you go to http://localhost:8080/welcome you can enter information and check it on staging.
