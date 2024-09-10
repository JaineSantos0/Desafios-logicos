<h1>Desafio Snail</h1>
<br>

<h2>Desafio</h2>
<p>
Dado uma matriz N x N, retorne os valores organizados dos elementos mais externos para os mais
internos, em sentido horário.
</p>

<p>Exemplo.:</p>
<br>

<p>
|  1 |  2 |  3 |
</p>
<p>
|  4 |  5 |  6 |                 => [1, 2, 3, 6, 9 , 8, 7, 4, 5]
</p>
<p>
|  7 |  8 |  9 |
</p>
<br>

<p>
|  1  |  2  |  3  |
</p>
<p>
|  4  |  10 |  12 |                 => [1, 2, 3, 12, 33 , 7, 6, 4, 10]
</p>
<p>
|  6  |  7 |  33  |
</p>

<h3>Observações</h3>
<li>A ideia é percorrer a matriz de duas dimensões em um padrão de caracol no sentido horário</li>
<li>Uma entrada com uma matriz vazia também deve ser considerada</li>
