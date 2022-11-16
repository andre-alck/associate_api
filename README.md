# Associate

API para [associate](https://github.com/andre-alck/p_associate_app).

Sistema para 'distribuição automática de tarefas'. O aplicativo deve enviar uma mensagem para o colaborador há mais tempo ocioso, dentre os 5 cadastrados.

## Funcionamento

1. No [aplicativo](https://github.com/andre-alck/p_associate_app), ao pressionar 'Send Message', API retornará último usuário.

    ```
    se(ultimoUsuario == !existe) {
        novoUsuario = sorteia()
    } senao {
        novoUsuario = ultimoUsuario + 1
    }
    ```

2. Caso não exista usuário cadastrado, API recebe POST com nome do usuário sorteado.

## Ambiente

Para executar a aplicação, deve-se:

1. Criar database no PostgreSQL 'associate-db' com user = "postgres" && password = "postgres".
2. Iniciar projeto.

## Requests

GET: retorna último usuário cadastrado.

POST: adiciona novo usuário.
