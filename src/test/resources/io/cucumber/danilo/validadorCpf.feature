# language: pt
Funcionalidade: Validação de CPF
  Fizemos um sistema que faz a validacao de um CPF
  com isso estamos criando um teste para automatizar
  o processo de validacao

  Cenario: Testando CPF Valido
    Quando eu acesso o sistema de validacao de CPF
    E digito no campo nome "Jane Doe"
    E digito no campo cpf "571.663.770-11"
    E clico no botao Enviar
    Entao eu devo ver a mensagem "CPF Validado com sucesso"

  Cenario: Testando CPF Invalido
    Quando eu acesso o sistema de validacao de CPF
    E digito no campo nome "Jane Doe"
    E digito no campo cpf "571.663.770-00"
    E clico no botao Enviar
	  Então eu devo ver a mensagem "CPF não validado"
