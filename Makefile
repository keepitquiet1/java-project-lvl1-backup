clean:
	/gradlew clean

build:
	/gradlew clean build

install:
	/gradlew clean install

run-dist:
	/build/install/app/bin/app

run:
	/gradlew run

build-run: build run

.PHONY: build