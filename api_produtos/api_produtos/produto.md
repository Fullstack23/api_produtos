## THYMELEAF
-> É uma depêndencia de templates utilizada em aplicações Java Spring Boot para renderizar páginas HTML dinâmicas no lado do servidor. Ela facilita a integração entre a lógica de negócio`(JAVA)`, e a apresentação `(HTML)`, permitindo que você inseira dados do servidor diretamente nos templates HTML.

1. Adicionar a depêndencia no pom.xml.
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>

2. Adicionando os templates do thymeleaf.
-> Os templates precisam ser criados dentro da pasta resources/templates
`index.html`
`cadastro.html`

3. Principais expressões do Thymeleaf:
[A]. Exibição de dados
th:text="${variavel}" -> Substitui o conteúdo do HTML com o valor da variável.

[B]. Links dinâmicos
th:href="@{/caminho}" -> Gera URLs dinâmicas.

[C]. Condicionais
th:if="${condicao}" -> Exibe o elemento HTML apenas se a condição for verdadeira.

[D]. Iteração
th:each="item : ${lista}" => Itera sobre uma coleção de dados.
