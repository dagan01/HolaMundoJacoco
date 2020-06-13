# HolaMundoJacoco

So this time, I'm bringing my "Hello World" with Jacoco. The mission was simple: Understand quickly how to add it and use it in a project. These were the steps:

## Add Jacoco to a Gradle project

Just apply the plugin jacoco, and that's it! Check my [build.gradle](../master/build.gradle) and you will see the following line:

```Groovy
apply plugin: 'jacoco'
```

## Configure Jacoco in Gradle (file build.gradle)

These steps are not mandatory. A tool's configuration is something that depends on one's needs so what you will read in this section is not mandatory.

### Generate report automatically after executing the task 'test'

Just add the following line:
```groovy
test.finalizedBy jacocoTestReport
```

### Enforcing code coverage metrics

Just add the following lines (in this situation, my tests' coverage should be at least 70%):
```groovy
jacocoTestCoverageVerification {
     violationRules { 
             rule { 
                  limit { 
                        minimum = 0.7 
                  } 
             } 
     } 
}
```

### Make a build fail if enforced code coverage metrics are not met

Just add the following line:
```groovy
check.dependsOn jacocoTestCoverageVerification
```

## Use Jacoco in a Gradle project

By executing unit tests, Jacoco will automatically create a binary file in the path \build\jacoco, check my [path](../master/build/jacoco) as example. Thanks to the configuration I added to my build.gradle, it also generates the html report [here](../master/build/reports/jacoco/test/html).

# References

[Article explaining code coverage with details and examples](https://www.seguetech.com/how-much-test-coverage-enough-testing-strategy/#:~:text=A%20statement%20coverage%20testing%20strategy,control%20flow%20graph%20are%20covered.)

[Introduction to Jacoco and source of the code I used](https://www.baeldung.com/jacoco)

[Info about Jacoco configuration in a build.gradle file](https://medium.com/codeops/code-coverage-with-gradle-and-jacoco-8b2e7d580d2a)

[Example project with Spring boot and Jacoco](https://github.com/samaddico/spring-boot-samples/tree/master/spring-boot-gradle-jacoco)

[A more detailed info about Jacoco configuration in a build.gradle file](https://reflectoring.io/jacoco/)
