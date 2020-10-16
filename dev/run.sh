cd ..
brew services restart mongodb-community
./gradlew clean
./gradlew build -x test
./gradlw bootjar
pwd
cd build/libs
java -jar *.jar
