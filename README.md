Padroes de Projeto

1) Criacionais
2) Estruturais
3) Comportamentais

* Criacionais

4. Prototype

O que é:
O Prototype é um padrão de projeto criacional que permite copiar objetos existentes sem fazer seu código ficar dependente de suas classes.   Utilize o padrão Prototype quando seu código não deve depender de classes concretas de objetos que você precisa copiar.

Aplicabilidade:
Utilize o padrão Prototype quando seu código não deve depender de classes concretas de objetos que você precisa copiar.
Utilize o padrão quando você precisa reduzir o número de subclasses que somente diferem na forma que inicializam seus respectivos objetos. Alguém pode ter criado essas subclasses para ser capaz de criar objetos com uma configuração específica.

Identificação:
O prototype pode ser facilmente reconhecido pelos métodos clone ou copy, etc.

Exempos de utilizacao:
java.lang.Object#clone() (a classe deve implementar a interface java.lang.Cloneable
