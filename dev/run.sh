./gradlew clean
./gradlew goJF
./gradlew build -x test
./gradlw bootjar
pwd
cd build/libs
java -jar *.jar
