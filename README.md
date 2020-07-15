## Pista CMS

#### How to setup the project
- Download Keycloak from (https://www.keycloak.org/downloads.html)
- Setup Anar Framework
```xml
git clone https://github.com/Anar-Framework/anar-parent.git
cd anar-parent/script/setup/
bash setup.sh
cd ../..
```
- Clone pista repository

```xml
git clone https://github.com/nsia-infosys/pista.git
```
- Open the pista with `intellij` IDE
- Add imported libraries in `pom.xml` from `File>New>Module from Existing Sources...`

- Setup pista-web
```xml
git clone https://github.com/nsia-infosys/pista-web
cd pista-web
npm install 
npm start
```

#### How to build the source code
- Run the Keycloak `cd keycloak_path/bin` and `bash standalone.sh`
- Run `main` method from `af.gov.anar.pista.Application`

#### How to setup development enviroment
```
$ cd pista
$ bash setup.sh
$ mvn clean install -DskipTests
$ cd pista-core
$ mvn spring-boot:run
```

Client Sid UI: https://github.com/nsia-infosys/pista-web

#### Documentation

Refer to this repository **Wiki** section.
https://github.com/nsia-infosys/pista/wiki
