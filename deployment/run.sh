#!/bin/bash

jars=( build/libs/*.jar )
java -jar -Xmx256m -agentlib:jdwp=transport=dt_socket,server=y,address=8000,suspend=n "${jars[-1]}"
