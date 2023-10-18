
# Diagrama-de-Classes-do-iPhone
![terraform](https://img.shields.io/badge/-UML-white?style=for-the-badge&logo=UML&color=FABD14&logoColor=white)
![Java](https://img.shields.io/badge/Java-000?style=for-the-badge&logo=java)

## 📋 Descrição
Conceitos da programação orientada a objetos e modelagem UML. elaborando uma ferramenta UML e classes e interfaces com a proposta de representar os papéis do iPhone.

Neste repositório, você encontrará uma implementação do diagrama UML que representa a estrutura de classes e interfaces para um sistema que inclui a modelagem do iPhone, um dispositivo que incorpora funcionalidades de um reprodutor de música, um telefone e um navegador de internet.

## 📊 Diagrama UML

![Alt text](<Iphone UML - Página 1.png>)

## Descrição das Interfaces e Classes
### `iPhone`

A classe `iPhone` é a classe principal que representa o dispositivo como um todo. Ela implementa as interfaces `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`. Isso permite que o iPhone desempenhe os papéis de reprodutor musical, aparelho telefônico e navegador na Internet. 

### `Reprodutor Musical` (ReprodutorMusical)

A interface `Reprodutor Musical` é responsável por implementar a funcionalidade de reprodução de arquivos de áudio. Ela possui métodos como `tocar()`, `pausar()`, e `selecionarMusica()`. A classe `Musica` armazena informações sobre as músicas.

### `AparelhoTelefonico` (AparelhoTelefonico)

A interface `AparelhoTelefonico` define os métodos para realizar chamadas telefônicas e enviar mensagens, incluindo `ligar()`, `atender()` e `iniciarCorreioVoz()`. As classes que implementam essa interface podem funcionar como dispositivos telefônicos.

### Navegador de Internet (NavegadorInternet)

A interface `Navegador de Internet` é responsável por implementar a funcionalidade de um navegador web. Ela possui métodos como `exibirPagina()`, `adicionarNovaAba()`, e `atualizarPagina()`.


