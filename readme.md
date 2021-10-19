# TAME OF THRONES

This application will help the Shan, the gorilla king of the Space kingdom to send secret message to all Six Kingdoms in the universe of Southeros to get their support and rule over them

This is the solution of the coding challenge provided by geektrust

## COMMAND TO BUILD THE SULUTION
```
mvn clean install -DskipTests -q assembly:single

```

## HOW TO RUN THE APPLICATION

```
java -jar <path-to-this>/geektrust.jar <path-upto-this>/src/test/resources/testFile1.txt
java -jar <path-to-this>/geektrust.jar <path-upto-this>/src/test/resources/testFile2.txt
java -jar <path-to-this>/geektrust.jar <path-upto-this>/src/test/resources/testFile3.txt
java -jar <path-to-this>/geektrust.jar <path-upto-this>/src/test/resources/testFile4.txt

```

## Executing the test cases
```
mvn clean test
mvn jacoco:report 
```
