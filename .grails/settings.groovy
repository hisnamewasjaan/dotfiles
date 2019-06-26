String artifactory_username = "nin_jbe"
String artifactory_password = "R0yB@dr@n"


 
// !!! Do not edit below this line !!!
//apply credentials for ivy resolution
grails.project.ivy.authentication = {
    credentials {
        realm = "Artifactory Realm"
        host = "dev.erst.dk"
        username = artifactory_username
        password = artifactory_password
    }
}
 
//apply credentials for maven/aether resolution
grails.project.dependency.authentication = {
    credentials {
        id = "erst-repository"
        username = artifactory_username
        password = artifactory_password
    }
}
 
//Set deployment-to-artifactory options
grails.project.repos.erstcomponents.url = "https://dev.erst.dk/artifactory/erst-components-local"
grails.project.repos.erstcomponents.username = artifactory_username
grails.project.repos.erstcomponents.password = artifactory_password
  
grails.project.repos.erstsnapshots.url = "https://dev.erst.dk/artifactory/erst-snapshots-local"
grails.project.repos.erstsnapshots.username = artifactory_username
grails.project.repos.erstsnapshots.password = artifactory_password
 
grails.project.repos.default = "erstcomponents"