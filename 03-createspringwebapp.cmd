echo mvn archetype:generate -DarchetypeArtifactId="basic-javaee7-archetype"   -DarchetypeGroupId="uk.co.nemstix"    -DgroupId="com.msready19.raist213" -DartifactId="demowebapp" -Dversion="1.0.0"        -Dpackage="com.msready19.raist213"   -DarchetypeVersion="1.0" 

mvn archetype:generate -DarchetypeArtifactId="spring-boot-blank-archetype" -DarchetypeGroupId="am.ik.archetype" -DarchetypeVersion="1.0.6" -DgroupId="com.msready19.raist213" -DartifactId="demospringwebapp" -Dversion="1.0.0" -Dpackage="com.msready19.raist213"
echo fix HelloController
xcopy "C:\repos\msready19\complete\demospringwebapp\src\main\java\com\msready19\raist213\HelloController.java" "C:\repos\msready19\live\demospringwebapp\src\main\java\com\msready19\raist213\" /Y
