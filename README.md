Este projeto foi desenvolvido na linguagem de programação Java. Também foi realizado na IntelliJ

Foi utlizado o Maven para baixar algumas dependencias como (rest-assured, junit, owner)

Foi implementada algumas tecnicas no codigo como POJOs, Data Factories, e Hook no Before do Junit o codigo está bem facil de entender com metados bem simples para cada funcionalidade da API.

-----PARA EXECUTAR O PROJETO-------- VERIFIQUE SE A API ESTÁ NO AR

1 = Clone o projeto na sua máquina 2 = Basta selecionar a classe ReqresTest que todos os testes seram executador

------EXECUTAR O PROJETO E GERAR UM RELATORIO NO ALLURE----------

1 = Execute o comando mvn surefire:test dentro da pasta do projeto onde se encontra o arquivo pom.xml 2 = Depois execute o passo a passo conforme mostra na pasta Arquivos > executar relatorios 3 = Após executar o comando para gerar o relatorio vai abrir no seu navegador padrão o relatorio conforme mostra na imagem relatorio.jpg

-------Documentação----------- Dentro do projeto tem uma pasta chamada Arquivos nela tem um arquivo chamado Simulacao.feature nele contem todos os cenarios da API no formato de BDD utilizando a linguagem Gherkin.

OBSERVAÇÃO FAVOR LER O ARQUIVO TEXTO DENTRO DA PASTA ARQUIVOS NO PROJETO
