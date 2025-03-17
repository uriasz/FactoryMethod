
![511ce1c2959c73b700e198a52f2146bd-ezgif com-resize](https://github.com/user-attachments/assets/e855db06-c1c4-4ac2-842d-a59a0fafab31)

# °❀⋆.ೃ࿔ Sistema de Notificações com Factory Method ❀⋆.ೃ࿔*:･

## ⋆.𐙚 1. Visão Geral
Este projeto implementa um sistema de envio de notificações utilizando o padrão de projeto **Factory Method**. Ele permite criar diferentes tipos de notificações (**E-mail, SMS e Push**) de maneira flexível e extensível. 

Além da implementação principal, foram desenvolvidos testes unitários para garantir o funcionamento correto do sistema, sem o uso de bibliotecas externas como Mockito.

── ⋆⋅☆⋅⋆ ── ── ⋆⋅☆⋅⋆ ──────⋆⋅☆⋅⋆──── ⋆⋅☆⋅⋆ ── ── ⋆⋅☆⋅⋆ ──────⋆⋅☆⋅⋆──── ⋆⋅☆⋅⋆ ── ── ⋆⋅☆⋅⋆ ──────⋆⋅☆⋅⋆──── ⋆⋅☆⋅⋆ ── ── ⋆⋅☆⋅⋆ ──────⋆⋅☆⋅⋆──

## ✮⋆˙ 2. Arquitetura do Projeto
O sistema é composto pelos seguintes componentes:

### ✧˚ ༘ 2.1 Interface de Notificação
A interface `Notification` define um contrato comum para todas as notificações, garantindo que todas tenham um método responsável pelo envio da mensagem. Isso possibilita a criação de diferentes tipos de notificações sem alterar o código que as utiliza.

### ୨୧ ‧₊° ⋅ 2.2 Implementações de Notificações
Cada tipo de notificação implementa a interface comum e fornece sua própria lógica de envio. No projeto, há três tipos principais de notificações:

- **E-mail:** Utiliza um serviço externo para enviar mensagens de e-mail.
- **SMS:** Envia mensagens de texto para dispositivos móveis.
- **Push:** Envia notificações para aplicativos móveis ou sistemas integrados.

Cada uma dessas implementações encapsula a lógica específica de envio, garantindo que o código que usa essas notificações permaneça desacoplado dos detalhes da implementação.

### ୨୧ ‧₊° 2.3 Fábrica Abstrata
A fábrica abstrata define um método para a criação de notificações. Esse método é sobrescrito por classes concretas que especificam qual tipo de notificação deve ser instanciado. Isso permite que novas notificações sejam adicionadas sem modificar a estrutura existente do código.

### ୨୧ ‧₊° 2.4 Fábricas Concretas
Cada tipo de notificação possui uma fábrica correspondente, responsável por criar instâncias do tipo desejado. Isso segue o padrão **Factory Method**, garantindo que o código que solicita uma notificação não precise conhecer os detalhes de sua criação.

### ୨୧ ‧₊° 2.5 Serviço de Notificação
A classe responsável pelo serviço de notificação recebe uma fábrica como parâmetro e utiliza o método de criação para gerar a notificação necessária. Isso torna possível alternar entre diferentes tipos de notificações sem modificar o funcionamento do serviço.

### ୨୧ ‧₊° 2.6 Simulação dos Serviços Externos
O projeto inclui classes que simulam os serviços externos de envio de mensagens, representando uma possível integração com APIs reais.

### ୨୧ ‧₊° 2.7 Execução do Sistema
Para testar o sistema, pode-se criar uma instância do serviço de notificação e fornecer uma fábrica específica. Dessa forma, uma notificação será criada e enviada com a mensagem desejada.


── ⋆⋅☆⋅⋆ ── ── ⋆⋅☆⋅⋆ ──────⋆⋅☆⋅⋆──── ⋆⋅☆⋅⋆ ── ── ⋆⋅☆⋅⋆ ──────⋆⋅☆⋅⋆──── ⋆⋅☆⋅⋆ ── ── ⋆⋅☆⋅⋆ ──────⋆⋅☆⋅⋆──── ⋆⋅☆⋅⋆ ── ── ⋆⋅☆⋅⋆ ──────⋆⋅☆⋅⋆──


## ୨୧ ‧₊° 3. Testes
Foram desenvolvidos testes unitários para validar todas as funcionalidades do sistema.

### ୨୧ ‧₊° 3.1 Estrutura dos Testes
Os testes verificam se:
- As instâncias corretas de notificações são criadas.
- O método de envio pode ser chamado sem lançar exceções.
- O serviço de notificação funciona corretamente com cada tipo de notificação.

### ୨୧ ‧₊° 3.2 Código dos Testes
Cada notificação e sua respectiva fábrica são testadas individualmente. Além disso, o serviço de notificação é avaliado para garantir que ele consiga enviar notificações de diferentes tipos sem erros.


── ⋆⋅☆⋅⋆ ── ── ⋆⋅☆⋅⋆ ──────⋆⋅☆⋅⋆──── ⋆⋅☆⋅⋆ ── ── ⋆⋅☆⋅⋆ ──────⋆⋅☆⋅⋆──── ⋆⋅☆⋅⋆ ── ── ⋆⋅☆⋅⋆ ──────⋆⋅☆⋅⋆──── ⋆⋅☆⋅⋆ ── ── ⋆⋅☆⋅⋆ ──────⋆⋅☆⋅⋆──


## ୨୧ ‧₊° 4. Como Rodar o Projeto

### ୨୧ ‧₊° 4.1 Requisitos
Antes de executar o projeto, certifique-se de ter instalado:
- **Java 8 ou superior**
- **Um ambiente de desenvolvimento Java** (Eclipse, IntelliJ IDEA, ou outro)
- **Maven** (caso utilize gerenciamento de dependências)

### ୨୧ ‧₊° 4.2 Clonar o Repositório
Caso o projeto esteja versionado em um repositório Git, clone-o utilizando o seguinte comando:
```sh
 git clone <URL_DO_REPOSITORIO>
```

### ୨୧ ‧₊° 4.3 Compilar o Projeto
Caso esteja utilizando Maven, utilize o seguinte comando na raiz do projeto:
```sh
mvn clean install
```

Se estiver compilando manualmente, basta compilar os arquivos `.java` com o seguinte comando:
```sh
javac -d bin src/**/*.java
```

### ୨୧ ‧₊° 4.4 Executar o Projeto
Após a compilação, o projeto pode ser executado com:
```sh
java -cp bin Main
```
Se estiver utilizando Maven:
```sh
mvn exec:java -Dexec.mainClass="Main"
```

### ୨୧ ‧₊° 4.5 Executar os Testes
Para rodar os testes unitários, utilize:
```sh
mvn test
```
Ou, caso esteja utilizando um ambiente de desenvolvimento, execute a classe de testes diretamente.


── ⋆⋅☆⋅⋆ ── ── ⋆⋅☆⋅⋆ ──────⋆⋅☆⋅⋆──── ⋆⋅☆⋅⋆ ── ── ⋆⋅☆⋅⋆ ──────⋆⋅☆⋅⋆──── ⋆⋅☆⋅⋆ ── ── ⋆⋅☆⋅⋆ ──────⋆⋅☆⋅⋆──── ⋆⋅☆⋅⋆ ── ── ⋆⋅☆⋅⋆ ──────⋆⋅☆⋅⋆──


## ୨୧ ‧₊° 5. Conclusão
O projeto implementa o **Factory Method** de forma clara e eficiente, permitindo fácil extensão para novos tipos de notificações. Os testes garantem a confiabilidade do código, e a estrutura modular facilita manutenção e escalabilidade.

Caso novas notificações precisem ser adicionadas no futuro, basta criar uma nova implementação e uma respectiva fábrica, sem modificar o código existente. Dessa forma, o sistema mantém um alto nível de flexibilidade e modularidade.

