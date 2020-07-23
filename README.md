## Anar with Clean Architecture

#### How to setup the project
- Download Keycloak from (https://www.keycloak.org/downloads.html)
- Setup Anar Framework
```xml
git clone https://github.com/Anar-Framework/anar-parent.git
cd anar-parent/script/setup/
bash setup.sh
cd ../..
```
- Clone anar-clean repository

```xml
git clone https://github.com/nsia-infosys/anar-clean.git
```
- Open the anar-clean with `intellij` IDE
- Add imported libraries in `pom.xml` from `File>New>Module from Existing Sources...`

- Setup anar-clean-web
```xml
git clone https://github.com/nsia-infosys/anar-clean-web
cd anar-clean-web
npm install 
npm start
```

#### How to build the source code
- Run the Keycloak `cd keycloak_path/bin` and `bash standalone.sh`
- Run `main` method from `af.gov.anar.anar-clean.Application`

#### How to setup development enviroment
```
$ cd anar-clean
$ bash setup.sh
$ mvn clean install -DskipTests
$ cd anar-clean-core
$ mvn spring-boot:run
```

Client Sid UI: https://github.com/nsia-infosys/anar-clean-web

#### Documentation

Refer to this repository **Wiki** section.
https://github.com/nsia-infosys/anar-clean/wiki
