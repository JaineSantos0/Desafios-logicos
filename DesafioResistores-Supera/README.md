<h1>Desafio Resistores – Código de Cores</h1>

<br>

<h2>Introdução</h2>
<p>Os resistores são componentes elétricos marcados com listras/faixas coloridas para indicar tanto o
valor de sua resistência em ohms, quanto a tolerância permitida.
</p>
<p>Imagine que Diogo, o dono de um "Kit Básico Raspberry Pi", esvaziou diversos sacos zip-lock de
resistores, e ao invés de ficar procurando de um por um o resistor para seu projeto, precisa que a
partir do valor necessário, tenha em mãos a sequência de cores correta.
</p>

<h2>Código de Cores dos Resistores</h2>
<p>Os códigos básicos dos resistores são:</p>
<li>0: preto</li>
<li>1: marrom</li>
<li>2: vermelho</li>
<li>3: laranja</li>
<li>4: amarelo</li>
<li>5: verde</li>
<li>6: azul</li>
<li>7: violeta</li>
<li>8: cinza</li>
<li>9: branco</li>
<br>

<p>Todos os resistores possuem pelo menos três bandas, sendo que a primeira e a segunda banda
correspondem ao primeiro e segundo dígito do valor de ohms. A terceira indica a potência de 10 que
deve ser multiplicada para obter o valor.</p>
<p>Exemplo: Um resistor de 47 ohms é igual a 47 * 10 ^ 0, teria a seguinte sequência de cores:
amarelo violeta preto</p>
<p>A maioria dos resistores também possuem uma quarta faixa que indica sua tolerância ( 5% por
exemplo ), representado por uma faixa dourada. Portanto, no exemplo acima, ficaria amarelo
violeta preto dourado</p>

<h2>Desafio</h2>
<p>Sua função deverá receber uma string contendo o valor de ohms a ser convertido, seguido de um
espaço e a palavra "ohms" (ex: 47 ohms)</p>

<p>Os valores de entrada seguem as seguintes regras:</p>
<li>Para resistores menores que 1000 ohms, o valor em ohms é formatado apenas
como um número simples. Por exemplo, com o resistor de 47 ohms acima, sua função
receberia a string "47 ohms" e retornaria a string "amarelo violeta preto dourado".
</li>
<li>Para resistores maiores ou iguais a 1000 ohms, mas menores que 1.000.000 ohms, o
valor de ohms é dividido por 1.000 e tem um "k" minúsculo depois dele. Por exemplo, se
sua função recebesse a string "4.7k ohms", ela precisaria retornar a string "amarelo violeta
vermelho dourado".
</li>
<li>Para resistores maior ou igual a 1.000.000 ohms, o valor de ohms é dividido por
1.000.000 e tem um “M” maiúsculo depois dele. Por exemplo, se sua função recebesse a
string “1M ohms”, ela precisaria retornar a string “marrom preto verde dourado”.
</li>

<br>
<p>Mais Exemplos:</p>
<li>"10 ohms" => "marrom preto preto dourado"</li>
<li>"100 ohms" => "marrom preto marrom dourado"</li>
<li>"220 ohms" => "vermelho vermelho marrom dourado"</li>
<li>"330 ohms" => "laranja laranja marrom dourado"</li>
<li>"470 ohms" => "amarelo violeta marrom dourado"</li>
<li>"680 ohms" => "azul cinza marrom dourado"</li>
<li>"1k ohms" => "marrom preto vermelho dourado"</li>
<li>"2M ohms" => "vermelho preto verde dourado"</li>

<h3>Observações</h3>
<p>Os números decimais de entrada serão sempre separados por ponto.</p>
