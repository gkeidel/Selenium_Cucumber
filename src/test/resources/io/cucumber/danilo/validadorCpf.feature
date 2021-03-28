# language: pt
Funcionalidade: Validação de CPF
  Fizemos um sistema que faz a validação de um CPF
  com isso estamos criando um teste para automatizar
  o processo de validação

  Cenário: Testando CPF Válido
    Quando eu acesso o sistema de validação de CPF
    E digito no campo nome "Jane Doe"
    E digito um CPF válido “571.663.770-11”
    Então eu devo ver a mensagem de sucesso “CPF validado com sucesso”

    Quando eu acesso o sistema de validação de CPF
    E digito um CPF inválido “571.663.770-00”
	  Então eu devo ver a mensagem de sucesso “CPF não validado”
