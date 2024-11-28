#/bin/bash

mvn archetype:generate \
  -DarchetypeGroupId=pl.codeleak \
  -DarchetypeArtifactId=spring-mvc-quickstart \
  -DarchetypeVersion=5.0.1 \
  -DgroupId=com.mvcxml -DartifactId=demo \
  -Dversion=version
