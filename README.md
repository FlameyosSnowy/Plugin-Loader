## Installation
[![](https://jitpack.io/v/C0-1/Plugin-Loader.svg)](https://jitpack.io/#C0-1/Plugin-Loader)
<p></p>
If you're using maven or gradle as a dependency manager then just follow the steps below.
Otherwise, just download the jar and add it as an artifact dependency.

### Adding the repository

###### Maven
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

###### Gradle
```groovy

repositories {
    mavenCentral()
    maven {
        url 'https://jitpack.io'
    }
}
```

### Implementing the dependency

###### Maven
```xml
<dependency>
    <groupId>com.github.C0-1</groupId>
    <artifactId>Plugin-Loader</artifactId>
    <version>{VERSION}</version>
</dependency>
```

###### Gradle
```groovy

dependencies {
	   implementation 'com.github.C0-1:Plugin-Loader:{VERSION}'
    //Please note that my library is dependant on Hikrai 5.0.1 or above
    //So, make sure to implement HikariCP in your project.
}
```
