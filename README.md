# Sistema Funcionarios

## Descricao
Esse projeto ele funciona como um sistema de funcionarios, onde ele se destaca principalmente para adicao de funcionario, listagem, folha salarial, reajuste salarial, demissao e relatorio.

## IDE
Java 21, IDE IntelliJ atualizado.

## Ultilizacao
Apos a inicializacao, aparece um menu interativo de gestao de departamento, podendo Cadastrar funcionario, Listar Funcionario, Ver a folha salarial, clicando em menu individual apos cadastrar o usuario, voce pode escolher o usuario e tera uma vasta opcao. Sendo reajuste salarial, podendo demitir o usuario selecionado, a exibicao dos dados pessoais dele, e por ultimo a finalizacao do sistema.

# Descricao de classes
## TesteSistema(MAIN)
O arquivo TesteSistema e a main do projeto nele esta a estrutura principal de inicializacao presente no projeto. Nele temos varias chamadas de funcoes para a ciracao de funcionario. Switch com varios cases e cada um com suas funcoes para a utilizacao total do projeto.

# Pasta Controller
Na pasta controller fica as configuracoes como departamento e funcionario neles temos construtores, Getters and Setters, o coracao do projeto nele fica a estrutura onde eu puxo depois para a main.

## Funcionario
Nele fica a criacao de funcionario, com contrutor defult ou adicionado pela pessoa que esta ultilizando, por Getters and Setter, la esta salvo as informacoes dos funcionario e o gerenciamento deles.

## Departamento
Nele fica o gerenciamento dos funcionarios no departamento, podendo adicionar ver se esta lotado o departamento, adicao de usuario e ver a lista deles por Arrays, pode ver a folha salarial etc.

# Pasta Util
Na pasta util fica os menus ultilizados no projeto.

## MenuCredencial
Esse menu e para o cadastro do funcionario, onde pede NOME, CPF, CARGO e SALARIO. tendo leitores neles e um contructor para fazer o cadastro.

## MenuDepartamento
Esse menu e para o departamento, ele e apenas visual contendo Cadastro de Funcionario lista de funcionario, Folha salarial e menu unico de funcionario.

## MenuOpcao
Esse meno e o menu unico de funcionario, nele contem reajuste salarial, demitir, exibir dados e a finalizacao de todo sistema.

## Aluno
Feito por Thierry Henry, Segundo Periodo TI CEFET.
