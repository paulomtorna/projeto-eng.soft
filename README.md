#Singleton

O padrão Singleton permite criar objetos únicos para os quais há apenas uma instância. Este padrão oferece um ponto de acesso global, assim como uma variável global, porém sem as desvantagens das variáveis globais. Para entendermos e usarmos bem o padrão de Projeto Singleton é necessário apenas dominar bem as variáveis e métodos de classe estáticos além dos modificadores de acesso. 

O Padrão Singleton tem como definição garantir que uma classe tenha apenas uma instância de si mesma e que forneça um ponto global de acesso a ela. Ou seja, uma classe gerencia a própria instância dela além de evitar que qualquer outra classe crie uma instância dela. Para criar a instancia tem-se que passar pela classe obrigatoriamente, nenhuma outra classe pode instanciar ela. O Padrão Singleton também oferece um ponto global de acesso a sua instância. A própria classe sempre vai oferecer a própria instância dela e caso não tenha ainda uma instância, então ela mesma cria e retorna essa nova instância criada.
 
##Vantagens do Padrão Singleton 

O Padrão Singleton pode ser instanciada e usada apenas quando necessário, diferentemente se criássemos uma variável global em que o objeto é sempre criado quando o aplicativo é inicializado e poderá estar usando recursos que não são necessários neste momento. O padrão Singleton define um ponto único de acesso global sendo inclusive muito mais de gerenciar a criação e utilização da instância.

##Conclusão

O Padrão Singleton é utilizado quando necessita-se de um ponto único para criação de uma instância de classe e quando precisamos de apenas uma instância de uma classe. O Padrão Singleton é utilizado em diversos aplicativos e projetos de software como em Drivers que precisam de um ponto de acesso único e global para gerenciar diversos recursos. Tem-se diversas formas de implementar o padrão Singleton e deve-se optar pela implementação que melhor atende aos requisitos da aplicação
