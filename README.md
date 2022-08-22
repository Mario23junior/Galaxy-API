 
## 🔩 Instruções Para uso local

Clone o repositório:

Git:
```
$ git clone https://github.com/Mario23junior/Galaxy-API.git
```
Ou baixe um ZIP de main [manualmente](https://github.com/Mario23junior/Galaxy-API/archive/refs/heads/main.zip) e expanda o conteúdo em algum lugar em seu sistema

## 📋  Pré-requisitos

* Tenha um JDK Java instalado
* Tenha o Maven instalado e disponível em seu PATH ou IDE
* Tenha o google-chorme instalado
* Tenha um iterador de APIs para testes HTTP ex: [Postman](https://www.postman.com/downloads/), [Insonia](https://insomnia.rest/download)

## ☑️ Verifique a instalação

Você pode verificar as compilações do projeto corretamente no seu IDE ou por linha de comando

## ⚛️ CLI

Abra o terminal de comando e verifique se todos os compartimentos necessários estão em seu devido path e atualizados:

```
$ java -versão
# ^ deve ser pelo menos *8
$ mvn -v
# ^ deve ser pelo menos 3.0.0
```

Finalmente, verifique se `mvn install` foi bem sucedido.

Você deve ver uma saída como a seguinte:

```
$ cd galaxy
$ mvn install
#...

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.acme.app.HelloWorldProxyTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.357 sec
Running com.acme.app.HelloWorldTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ app ---
[INFO] Building jar: junit-mocha-example/target/app-0.0.1-SNAPSHOT.jar
[INFO]
[INFO] --- maven-install-plugin:2.4:install (default-install) @ app ---
[INFO] Installing junit-mocha-example/target/app-0.0.1-SNAPSHOT.jar to /Users/justin/.m2/repository/com/acme/app/0.0.1-SNAPSHOT/app-0.0.1-SNAPSHOT.jar
[INFO] Installing junit-mocha-example/pom.xml to /Users/justin/.m2/repository/com/acme/app/0.0.1-SNAPSHOT/app-0.0.1-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 9.159 s
[INFO] Finished at: 2015-08-26T13:49:46-04:00
[INFO] Final Memory: 20M/177M
[INFO] ------------------------------------------------------------------------
```
