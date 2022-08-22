 
## Instruções Para uso local

Clone o repositório:

Git:
```
$ git clone https://github.com/Mario23junior/Galaxy-API.git
```

Svn:
```
$ svn co https://github.com/Mario23junior/Galaxy-API.git
```

Ou baixe um ZIP de main [manualmente](https://github.com/Mario23junior/Galaxy-API/archive/refs/heads/main.zip) e expanda o conteúdo em algum lugar em seu sistema

## Pré-requisitos

* Tenha um JDK instalado
* Tenha o Maven instalado e disponível em seu PATH ou IDE
* Tenha o google-chorme instalado
* Tenha um iterar de APIs para testes HTTP ex: [Postman](https://www.postman.com/downloads/), [Insonia](https://insomnia.rest/download)

## Verifique a instalação

Você pode verificar as compilações do projeto corretamente no seu IDE ou por linha de comando

### CLI

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
