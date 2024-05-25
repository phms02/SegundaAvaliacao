# Segunda Avaliação de Testes e Qualidade de Software

> Desenvolvido por ***Pedro Henrique Mequelim da Silva***, aluno do **5º (quinto) período de Análise e Desenvolvimento de Sistemas**, da **Faculdade Senac**.

## Objetivos da avaliação

+ Montar uma **pipeline de testes** em **_Java_ com _Junit_ no _GitHub_**;
+ Montar um **_plano de testes_**.

## Conhecendo o projeto

+ Este projeto é um _exemplo simples_ de um **sistema de gerenciamento de carros**, utilizando **_Java_ com _Maven_ e _JUnit_ (para testes)**.

## Estrutra do projeto

```bash
SegundaAvaliacao
├── src
│ ├── main
│ │ └── java
│ │ │ └── com.segunda.avaliacao
│ │ │ │ └── App.java
│ │ │ │ └── Carro.java
│ ├── test
│ │ └── java
│ │ │ └── com.segunda.avaliacao
│ │ │ │ └── CarroTest.java
└── pom.xml
```

+ `src/main/java/com/example`: contém a **classe principal** `App.java` e a classe `Carro.java`, que representa um ***carro*** no sistema.
+ `src/test/java/com/example`: contém a classe de teste `CarroTest.java`, para **_testes unitários_ da classe** `Carro`.
+ `pom.xml`: **arquivo de _configuração do Maven_**, para **gerenciamento de dependências e build do projeto**.

## Teste

+ Os testes unitários são realizados usando o **JUnit 5**.
+ Para executar os testes, use o comando Maven:

    ```bash
    mvn test
    ```
  > Isso executará ***todos os testes*** na classe `CarroTest.java` e exibirá os resultados no **console**.

### Plano de Testes
#### Objetivo

+ Garantir que os métodos `getters` e `setters`, da classe `Carro`, **funcionem _corretamente_**.
+ Garantir que os métodos `getters` e `setters`, da classe `Carro`, **funcionem _corretamente_**.

#### Cenários de Teste

##### Cenário 01

+ **Verificar se os valores iniciais**, definidos pelo **construtor**, estão ***corretos***.

##### Cenário 02

+ **Verificar se os métodos** `setMarca` e `setModelo` **atualizam _corretamente_** os **valores dos atributos**.

#### Casos de Teste

##### Caso 01

+ **Criar um objeto** `Carro` com **valores "_Toyota_" e "_Corolla_"**, e verificar se `getMarca` e `getModelo` **retornam esses valores**.

##### Caso 02

+ **Modificar os valores dos atributos** `marca` e `modelo`, respectivamente, para "_Honda_" e "_Civic_", e **verificar** se `getMarca` e `getModelo` **retornam os novos valores**.

## Funcionalidades

+ O sistema possui as seguintes funcionalidades:
    1. Criar instâncias de carros com informações como marca, modelo, ano de fabricação e preço;
  2. Exibir informações detalhadas de um carro, incluindo seu status de venda.;
  3. Marcar um carro como vendido.

## Dependências

+ O projeto utiliza as seguintes dependências:
  - **JUnit 5**: **framework de testes unitários** para **Java**;
  - **Maven**: **ferramenta de gerenciamento** de projetos **Java**.

## Configuração e Execução

+ Para executar o projeto localmente, siga estas etapas:
  1. Certifique-se de ter o Java JDK e o Maven instalados em seu sistema;
  2. Clone este repositório para sua máquina local:

        ```bash
        git clone https://github.com/phms02/segunda-avaliacao-testes-e-qualidade-de-software.git
        ```
  3. Navegue até o diretório do projeto:

        ```bash
        cd SegundaAvaliacao
        ```
  4. Compile e execute o projeto usando o Maven:

        ```bash
        mvn clean package
        java -cp target/SimpleTestProject-1.0-SNAPSHOT.jar com.segunda.avaliacao.App
        ```

## Licença

+ Este projeto está licenciado sob a **MIT License**.
+ ***É expressamente proibido o uso indevido, cópia e o uso sem o consentimento do autor, sendo permito o uso apenas para fins de avaliação do autor e do professor, Maurício Antônio Ferste.***
+ **É permito o uso de terceiros _única e exclusivamente_ para _referência_**.