Padroes de Projeto

1) Criacionais
2) Estruturais
3) Comportamentais

* Criacionais

4. Prototype
-> O Prototype é um padrão de projeto criacional que permite a clonagem de objetos, mesmo complexos, sem acoplamento à suas classes específicas.
   Utilize o padrão Prototype quando seu código não deve depender de classes concretas de objetos que você precisa copiar.
->Identificação: O prototype pode ser facilmente reconhecido pelos métodos clone ou copy, etc.


Exempos de utilizacao:

java.lang.Object#clone() (a classe deve implementar a interface java.lang.Cloneable
