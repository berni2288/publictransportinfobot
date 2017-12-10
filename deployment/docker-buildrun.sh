#!/bin/bash
set -e

repository_path="$4"
gradle_docker_tag="4.3-jdk9"
name="publictransportinfobot"

if [[ ! -d "$repository_path" ]]; then
        echo "Error: Repository path must be passed as argument."
        exit 1
fi

cd "$repository_path"

git fetch origin
git reset --hard origin/master

# Build
docker run --rm -v ${PWD}:/home/gradle/project -w /home/gradle/project gradle:$gradle_docker_tag gradle build

# Run
docker-compose down
docker-compose up -d
