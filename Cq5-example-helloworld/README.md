Bundle
mvn clean install -Pbundle,cqInstallBundle,localAuthor
mvn clean install -Pbundle,cqInstallBundle,localPublish

App
mvn clean install -Papp,cqInstall,localAutor
mvn clean install -Papp,cqInstall,localPublish

Content
mvn clean install -Pcontent,cqInstall,localAuthor
mvn clean install -Pcontent,cqInstall,localPublish
