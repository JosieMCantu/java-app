Java Agent Example
=====================

### Setup
You will need JDK8 or newer installed locally to run this.

It also assumes you want to verify on Staging.  If that is not true, check
`build.gradle` for instructions on how to point at production.

Please specify the following variables in your .zshrc or .bashrc or manually in terminal:

```
export NEW_RELIC_LICENSE_KEY=[YOUR_LICENSE_KEY]
export NEW_RELIC_JAR='/Users/me/newrelic-java-agent/newrelic-agent/build/newrelicJar/newrelic.jar'
export NEW_RELIC_API='/Users/me/newrelic-java-agent/newrelic-api/build/libs/newrelic-api-#.##.#-SNAPSHOT.jar'
```

### Run

Then run the Spring Boot app:

`./gradlew bootRun`
