## THYMELEAF
-> É uma dependência de templates utilizada em aplicações Java Spring Boot renderizar páginas HTMl dinâmicas no lado do servidor. Ela facilita a integração entre a lógica de negócio`(JAVA)`, E A APRESENTAÇÃO `(HTML)`, permitindo que você insira dados do servidor diretamente nos templates HTML.

1. Adicionar a dependência no pom.xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

2. Adicionando os templates do thymeleaf.
-> Os templates precisam criados dentro da pasta resources/templates
`index.html`
`cadastro.html`

3. Principais expressões do Thymeleaf:
[A]. Exibir de dados
th:text="${variavel}" -> Substitui o conteúdo do HTML com o valor da variável.

[B]. Links dinâmicos
th:href="@{/caminho}" -> Gera URLs dinâmicas.

[C]. Condicionais 
th:if="${condicao}" -> Exibe o elemento HTML apenas se a condição for verdadeira.

[D]. Iteração
th:each="item : ${lista}" => Itera sobre uma coleção de dados.