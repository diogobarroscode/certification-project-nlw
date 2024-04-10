# certification-project-nlw
Projeto Java com Spring Boot criado no evento NLW - Rocketseat. 

Consiste em uma aplicação de perguntas e respostas sobre determinada tecnologia gerando uma certificação com nota para o usuário a qual possui também um ranking das 10 melhores notas geradas na aplicação.

# Docker compose

Para utilizar o banco de dados especificado no arquivo application.properties vamos levantar um contêiner com uma imagem do postgres através das configurações de ambiente especificadas no arquivo 'docker-compose.yml'.

Com essas configurações, ao executar 'docker-compose up -d' no terminal dentro do diretório onde o arquivo 'docker-compose.yml' se encontra um contêiner PostgreSQL será iniciado.

Certifique-se de ter o Docker instalado e funcionando corretamente em seu sistema. Pode ser verificado utilizando o comando 'docker --version'.

Executando o comando 'docker ps' deverá aparecer um contêiner com o 'Name' definido no arquivo 'docker-compose.yml' na instrução (container_name).

# Seed

O arquivo 'create.sql' possui os inserts para popular as tabelas do banco de dados. Para isso é preciso executar a classe java 'CreateSeed.java' que contém as configurações do JdbcTemplate.