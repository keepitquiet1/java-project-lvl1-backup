clean:
	gradlew.bat clean

build:
	gradlew.bat build

install:
	gradlew.bat clean install

run-dist:
	C:\Users\Home\app\app\build\install\app\bin\app

run:
	gradlew.bat run

build-run: build run

.PHONY: build