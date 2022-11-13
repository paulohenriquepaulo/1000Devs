# Sistema Bancario

A proposta de hoje é modelar e escrever um software, usando todos os conceitos já trabalhados de orientação a objetos (encapsulamento, herança, composição, classes abstratas e interfaces).


Modele um sistema bancário, através do qual o gerente vai ser capaz de gerenciar os seus clientes.

Nesse sistema os clientes podem ser tanto de pessoa física quanto de pessoa jurídica (PF e PJ).


Os clientes, independente do tipo, tem um número de conta, agência, telefone, saldo e limite de cheque especial.
Os clientes PJ tem no seu cadastro o cnpj, nomes dos sócios(até 3), razão social e nome fantasia.
Os clientes PF tem no seu cadastro o cpf, nome e idade.

O gerente é capaz de cadastrar novos clientes (ler todas as informações do teclado);
remover clientes de sua carteira pelo número de conta (ler o número do teclado);
consultar cliente pelo número da conta (ler o número do teclado);

aumentar e diminuir o limite do cheque especial do cliente (ler todas as informações do teclado);

fazer transferências entre seus clientes (somente se o cliente que transfere tiver saldo) (ler todas as informações do teclado);

adicionar saldo a um cliente (somente valores positivos) (ler todas as informações do teclado);

imprimir um relatório com todos os seus clientes (em tela);



Requisitos:
*Todas essas operações devem estar contidas num menu em seu programa principal e devem permitir a entrada de dados pelo teclado.
*Nao é permitido o uso de Collections (arraylist, set, map), utilize um (ou mais) vetor puro de 50 posições;
*Em caso de falha em alguma operação o sistema deverá imprimir um indicativo em tela dessa falha
*Desenvolver uma funcionalidade extra para o gerente (use sua criatividade).

*O gerente pode ser abstraído por funções no programa principal ou para uma classe, pense na abordagem mais adequada para sua solução, só deverá existir um gerente.

*Execute e grave um vídeo com a seguinte sequencia de operações para validar o sistema:

Cadastre um cliente PJ (cheque especial = 1000)
Cadastre um cliente PF (cheque especial = 0)
Adicione 400 de saldo para o cliente PF
Transfira 300 do cliente PF para o PJ
Imprima os clientes
Consulte o saldo do cliente PF
Altere o cheque especial do PF para 200
Transfira 300 do cliente PF para o PJ
Consulte o saldo do cliente PF
Consulte o saldo do cliente PJ
Transfira 100 do cliente PF para o PJ (operaçao deve falhar)
Consulte o saldo do cliente PF
Consulte o saldo do cliente PJ
Transfira 450 do cliente PJ para o cliente PF
Consulte o saldo do cliente PF
Consulte o saldo do cliente PJ
Adicione mais um cliente PJ
Remova o cliente PJ1
Adicione mais um cliente PF
Transfira 250 do cliente PF1 para o cliente PF2
Imprima os clientes
Remova o cliente PF1
Adicione um novo cliente PF3
Imprima os clientes
Demonstre a funcionalidade extra