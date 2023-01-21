# Spring-Boot-3-Practice
* Spring Boot 3
* Spring Framework 6
* Java 17
* Kotlin 1.7
* GraalVM 22

# SDKMAN!
* https://sdkman.io/
* install Java 17, GraalVM 22
```bash
sdk list java
sdk install java $version
```
![](./images/sdkman1.png)
![](./images/sdkman2.png)
![](./images/sdkman3.png)
* configure
```bash
export GRAALVM_HOME=<graalvm_directory>
export PATH=${GRAALVM_HOME}/bin:$PATH
```

# New Project
![](./images/newproject1.png)
![](./images/newproject2.png)

# Demo Java New Features
* records
  * https://github.com/PureFuncInc/Spring-Boot-3-Practice/blob/main/src/main/java/net/purefunc/spring/boot3/practice/java/JMemberPo.java#L12-L19
* text block
  * https://github.com/PureFuncInc/Spring-Boot-3-Practice/blob/main/src/main/java/net/purefunc/spring/boot3/practice/java/JMemberDao.java#L12-L21
* switch expression
  * https://github.com/PureFuncInc/Spring-Boot-3-Practice/blob/main/src/main/java/net/purefunc/spring/boot3/practice/java/JMemberPo.java#L25-L38 

# Build
* 1
```bash
./gradlew build
```
* 2
```bash
./gradlew nativeCompile
```
* 2
```bash
./gradlew bootBuildImage
```
