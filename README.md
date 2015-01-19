# Tomcat REST Sample

This is the readme file for the Tomcat REST Sample application.

## Technology stack

[Tomcat](http://tomcat.apache.org/).

Tomcat Maven Plugin ([which](http://tomcat.apache.org/maven-plugin.html)), last version [2.2](http://tomcat.apache.org/maven-plugin-2.2/) implies Tomcat 7.

[Tomcat 7.0.57](http://tomcat.apache.org/download-70.cgi), which [implies](http://tomcat.apache.org/whichversion.html):
- Servlet Spec 3.0
- JSP Spec 2.2
- EL Spec 2.2
- Java 6 and later

Java 1.7.0_67.

REST provider [JBoss RestEasy](http://resteasy.jboss.org/)
in its [latest stable version 3.0.10.Final](http://mvnrepository.com/artifact/org.jboss.resteasy/resteasy-jaxrs).

CDI provider [Weld](http://weld.cdi-spec.org/) in its latest current version 2.2.8.Final.
which implies:
- CDI 1.2

## Running locally

1. Install standalone Tomcat.
2. Start Tomcat <kbd>startup.sh</kbd>.
3. Execute <kbd>mvn</kbd> to build the war and deploy / re-deploy it to the running Tomcat server.
4. Access the [home page](http://localhost:8080/tomcat-rest-sample/).
