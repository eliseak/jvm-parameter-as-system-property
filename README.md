## jvm-parameter-as-system-property
Exemplo de como ler um system property enviado como parâmetro da JVM.  
Projeto desenvolvido com o Eclipse.

## Como utilizar este projeto
Compile o projeto, e execute-o com o comando abaixo:  
```
java -Darquivo.teste="config.properties" Main
```

Após executar o programa, ele deve imprimir o nome da propriedade e o valor da propriedade enviada.  
A saída deve ser:  
```
arquivo.teste: config.properties
```