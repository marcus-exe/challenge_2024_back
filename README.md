# FIAP Challenge Back-end

### 1- Esse projeto usa Java + SpringBoot + H2 (db)
### 2- Para rodar o projeto, basta rodar o main em ChallengeApplication.java
### 3- Em caso de erros, checar se o maven importou as bibliotecas corretamente
- no caso do IntelliJ, basta clicar no ícone "M" na lateral direita do projeto e procurar por "reload all maven projects"
- no caso de teste aqui, houve um erro que foi resolvido rodando o projeto 2 vezes e o erro não se repetiu mais (remover isso caso não persista em testes futuros)
### 4- Caso queira testar o código, foi fornecido um arquivo.json no qual foram feitos os testes no Postman (basta importar o arquivo)
### 5- Futuro do projeto (em caso de aprovação para NEXT)
- pretendemos rodar uma lib do GEMINI em python dentro do Java, mas para garantir que rode em todas as máquinas, provavelmente teria que transferir isso para um container
- caso essa idéia não seja prática conforme o projeto vá avançando, eu posso fazer um back-end simples em python rodando em outra porta para lidar com a parte Generativa
- o objetivo da Softtek que queremos incluir é a parte de ler arquivos e integração com algum ITSM
    - quanto ao ITSM, estamos pensando em usar o Service Now, visto que eles fornecem amostra do serviços deles