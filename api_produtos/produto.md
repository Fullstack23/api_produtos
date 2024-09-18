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


## Propriedades do fragments
1. th:fragment -> é usado para definir blocos de códigos reutilizáveis em um template. Esses fragmentos podem ser cabeçalhos, rodapés, menus de navegação ou qualquer outro conteúdo que você queira reutilizar em várias páginas. `(FICA NA TAG DA PÁGINA A SER REUTILIZADA)`

2. th:replace -> Substitui o conteúdo do elemento atual com o conteúdo do fragmento especificado. Ela é usada para herdar e incluir partes de código de outro template ou fragmento.`(FICA NA TAG DA PÁGINA DESTINO)`

3. th:insert -> Insere o conteúdo do fragmento dentro do elemento no qual é aplicada, mas não substitui o elemento raiz.`(FICA NA TAG DA PÁGINA DESTINO)`

4. th:include -> É semelhante ao th:insert, mas com uma diferença: Ela inclui o conteúdo do fragmento dentro do elemento e pode preservar o conteúdo do elemento pai.`(FICA NA TAG DA PÁGINA DESTINO)`