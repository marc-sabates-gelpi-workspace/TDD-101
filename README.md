# java command line test & mutation tests

##Command line compilation
```
javac -cp /home/user/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/user/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:. Clazz.java
javac -cp /home/user/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/user/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:. Tests.java
javac -cp /home/user/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/user/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:. TestRunner.java
```
##Command line run
```
java -cp /home/user/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/user/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:. TestRunner
```
##Command line mutation tests
```
java -cp /home/user/labs/TDD/101/pitest-command-line-1.1.10.jar:/home/user/labs/TDD/101/pitest-1.1.10.jar:/home/user/.m2/repository/junit/junit/4.12/junit-4.12.jar:/home/user/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:. org.pitest.mutationtest.commandline.MutationCoverageReport --reportDir . --targetClasses Clazz --targetTests Tests --sourceDirs .
```