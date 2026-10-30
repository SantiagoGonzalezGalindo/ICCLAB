<div align="center">

# Tarea examen 1

**Alumno:** Santiago Gonzalez Galindo<br>
**Materia:** Introducción a Ciencias de la Computación<br>
**Facultad de Ciencias, UNAM**

</div>

<br>

<div align="center">

# Historia de las ciencias de la computación y su relación con los lenguajes de programación

</div>

<div align="justify">

## Introducción

En 1952 Grace Hopper tenía un compilador funcionando, pero casi nadie quería usarlo porque le decían que las computadoras solo sabían hacer aritmética (Centre for Computing History, s.f.). Hoy nadie programa sin uno y quiero explicar qué pasó.

Elegí los lenguajes de programación porque son el puente entre lo que una persona quiere y lo que una máquina puede hacer. Mi idea es que la historia de las ciencias de la computación se puede ver como una subida de niveles de abstracción, o sea que en cada etapa alguien escondió los detalles de la anterior para que el programador pensara en el problema y no en la máquina. La abstracción, que en clase vimos como una característica de la programación orientada a objetos, también explica esta historia.

## Antecedentes históricos

Lo primero fue decidir cómo representar la información. Leibniz describió a principios del siglo XVIII una aritmética que solo usa el 0 y el 1 (O'Connor y Robertson, 1998) y se volvió la base de las computadoras debido a que un circuito distingue dos estados. Todo termina en ceros y unos y eso se nota, por ejemplo: 0.1 en binario es 0.000110011... y nunca termina, por lo que la máquina lo corta. Por eso en Java un `double` guarda 0.1 aproximado y un `int` enteros exactos. El estándar IEEE 754 de 1985 fijó cómo hacer ese corte igual en todas las máquinas (Engineering and Technology History Wiki, s.f.). Entonces el lenguaje esconde el binario, pero no lo elimina.

Lo segundo fue separar las instrucciones de la máquina que las ejecuta. En 1843 Ada Lovelace escribió los pasos para que la Máquina Analítica de Charles Babbage calculara los números de Bernoulli, que muchos consideran el primer programa (O'Connor y Robertson, 2002). Como la máquina nunca se terminó, lo que quedó fue un algoritmo: un procedimiento que existe aunque no haya dónde correrlo.

Lo tercero fue definir qué significa calcular. En 1936 Alan Turing describió una máquina imaginaria que sigue una lista de reglas y mostró que una sola máquina de ese tipo puede imitar a cualquier otra si recibe su descripción (O'Connor y Robertson, 2003). De ahí viene la idea de que una computadora hace lo que diga su programa.

## Evolución y avances

La ENIAC, de los años cuarenta, ya era una computadora electrónica real pero no tenía lenguaje: el programa se montaba a mano moviendo interruptores y conectando cables (Penn Engineering, s.f.). Después se escribieron como números en lenguaje máquina, que era más práctico, pero todavía había que pensar como el procesador.

Lo que cambió esto fue el compilador. El A-0 de Hopper traducía un código simbólico a lenguaje máquina (Centre for Computing History, s.f.) y en 1957 el equipo de John Backus en IBM presentó FORTRAN, con el que una tarea que necesitaba hasta 1000 instrucciones se resolvía con 47 y el código de su compilador era casi tan rápido como el hecho a mano (IBM, s.f.). Eso demostró que subir de nivel no costaba eficiencia.

Con programas más grandes el problema pasó a ser entenderlos. En 1968 Edsger Dijkstra argumentó que la instrucción `go to`, que permite saltar a cualquier parte del código, hacía imposible saber en qué estado iba un programa con solo leerlo, por lo que defendió usar condicionales y ciclos (Dijkstra, 1968). Es por eso que en Java el flujo de control se escribe con `if`, `for` y `while` y no con saltos.

El siguiente paso fue juntar los datos con lo que se hace con ellos. En Noruega, Kristen Nygaard y Ole-Johan Dahl crearon Simula en los años sesenta para simular sistemas y para eso inventaron las clases y la herencia (Universidad de Oslo, s.f.). En 1972 David Parnas propuso que cada parte de un programa esconda sus decisiones internas para que puedan cambiar sin afectar al resto (IT History Society, s.f.) y Alan Kay, con Smalltalk, desarrolló muchas ideas de los lenguajes orientados a objetos (Barnes, s.f.).

## Relación con los lenguajes de programación

Java, el lenguaje que usamos en el curso, junta casi todas estas etapas y conocerlas explica cosas que en clase parecían reglas sueltas. Vimos que un compilador traduce todo el programa antes de ejecutarlo y un intérprete lo va ejecutando instrucción por instrucción, como Bash en la terminal. Java usa las dos ideas: `javac` compila a archivos `.class` con bytecode, que no es el lenguaje de ningún procesador sino el de la Máquina Virtual de Java, y esta lo ejecuta en Windows, Linux o Mac (Oracle, s.f.). O sea, otra capa sobre la de Hopper: el programa ya no depende de la máquina.

Respecto a los tipos, cuando el compilador marca un error de incompatibilidad de tipos es porque el programa pasa por un traductor, entonces el error aparece en tiempo de compilación y no a la mitad de la ejecución. Y los modificadores de acceso son la idea de Parnas convertida en una palabra del lenguaje: si un atributo es `private` ninguna otra clase lo toca y si cambio cómo se guarda solo modifico su clase.

## Aplicaciones actuales y perspectivas futuras

Hoy los lenguajes de alto nivel están detrás de casi todo el software y cada uno se elige según el problema, por ejemplo: las aplicaciones de Android se escriben en Kotlin, Java o C++ (Android Developers, s.f.) y Python se usa en páginas web, cómputo científico, educación y negocios (Python Software Foundation, s.f.). Si la historia ha sido subir de nivel, entonces el siguiente paso parece ser programar en español o en inglés. En un experimento de GitHub, los programadores que usaron un asistente de inteligencia artificial terminaron una tarea 55 % más rápido (Kalliamvakou, 2022).

Pero los límites de la tecnología siguen ahí. Turing demostró que hay problemas que ninguna computadora puede resolver (O'Connor y Robertson, 2003), como decidir en general si un programa va a terminar o se va a quedar en un ciclo infinito, y eso no lo revisa ni un compilador ni una IA. Por eso creo que aunque escribir código sea cada vez más fácil, entenderlo seguirá siendo necesario, porque cada abstracción esconde detalles pero no los desaparece.

## Conclusión

Desde los ceros y unos de Leibniz hasta el bytecode de Java, la historia de los lenguajes es la historia de cómo la forma de programar se fue acercando a la forma en que pensamos un problema: primero con cables, luego con números y después con palabras, estructuras y objetos. Cada avance fue una abstracción que resolvía un problema concreto, por lo que programar no es solo aprender las reglas de un lenguaje sino entender qué problema resolvió cada una.

</div>

<br>

<div align="center">

# Segunda parte. El paradigma de programación orientado a objetos

</div>

<div align="justify">

**Concepto.** La POO es una forma de programar en la que el programa se organiza en objetos que representan las cosas del problema, cada uno con sus datos y lo que puede hacer. Su propósito es que el programa se parezca a la situación real para que sea más fácil de entender, de dividir en partes y de cambiar después.

**Características fundamentales.** Una clase es un molde de objetos que tienen atributos (datos) y métodos (acciones). Respecto a los principios: la abstracción deja solo lo importante, el encapsulamiento protege los datos, la herencia crea clases a partir de otras y el polimorfismo hace que un método cambie según el objeto.

**Aplicación práctica.** Una cuenta bancaria sencilla con un constructor:

```java
class Cuenta {
    private float saldo;

    public Cuenta(float s) {
        saldo = s;
    }

    public String depositar(float cantidad) {
        if (cantidad <= 0) {
            return "La cantidad a depositar debe ser mayor a 0";
        } else {
            saldo = saldo + cantidad;
            return "Deposito exitoso, tu saldo es " + saldo;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(1500);
        System.out.println(cuenta1.depositar(200));
        System.out.println(cuenta1.depositar(-50));
    }
}
```

`Cuenta` es la clase, `cuenta1` un objeto, `saldo` un atributo y `depositar` un método. Como `saldo` es `private` solo cambia con `depositar`, que rechaza el -50 (encapsulamiento).

**Importancia.** En el diseño ayuda porque primero se piensa qué cosas hay en el problema y cada una se vuelve una clase, por ejemplo: una cuenta bancaria se vuelve `Cuenta`. En el desarrollo cada clase se puede programar y probar por separado y con el mismo molde se crean todos los objetos que hagan falta. En la organización cada clase se encarga de lo suyo, por lo que es más fácil encontrar dónde está cada cosa. Y en el mantenimiento, si cambio cómo se guarda el saldo solo modifico `Cuenta` y el `Main` sigue igual.

</div>

<br>

<div align="center">

# Referencias

</div>

Android Developers. (s.f.). *Application fundamentals*. Recuperado el 30 de octubre de 2026, de https://developer.android.com/guide/components/fundamentals

Barnes, S. B. (s.f.). *Alan Kay*. A.M. Turing Award, Association for Computing Machinery. Recuperado el 30 de octubre de 2026, de https://amturing.acm.org/award_winners/kay_3972189.cfm

Centre for Computing History. (s.f.). *Grace Hopper completes the A-0 compiler*. Recuperado el 30 de octubre de 2026, de https://www.computinghistory.org.uk/det/5487/Grace-Hopper-completes-the-A-0-Compiler/

Dijkstra, E. W. (1968). Go to statement considered harmful. *Communications of the ACM, 11*(3), 147–148. https://www.cs.utexas.edu/~EWD/transcriptions/EWD02xx/EWD215.html

Engineering and Technology History Wiki. (s.f.). *Milestones: IEEE Standard 754 for Binary Floating-Point Arithmetic, 1985*. Recuperado el 27 de octubre de 2026, de https://ethw.org/Milestones:IEEE_Standard_754_for_Binary_Floating-Point_Arithmetic,_1985

IBM. (s.f.). *Fortran*. Recuperado el 30 de octubre de 2026, de https://www.ibm.com/history/fortran

IT History Society. (s.f.). *David Lorge Parnas*. Recuperado el 30 de octubre de 2026, de https://ithistory.org/node/30216

Kalliamvakou, E. (2022, 7 de septiembre). *Research: Quantifying GitHub Copilot's impact on developer productivity and happiness*. The GitHub Blog. https://github.blog/news-insights/research/research-quantifying-github-copilots-impact-on-developer-productivity-and-happiness/

O'Connor, J. J. y Robertson, E. F. (1998). *Gottfried Wilhelm von Leibniz (1646-1716): Biography*. MacTutor History of Mathematics. https://mathshistory.st-andrews.ac.uk/Biographies/Leibniz/

O'Connor, J. J. y Robertson, E. F. (2002). *Ada Lovelace (1815-1852): Biography*. MacTutor History of Mathematics. https://mathshistory.st-andrews.ac.uk/Biographies/Lovelace/

O'Connor, J. J. y Robertson, E. F. (2003). *Alan Turing (1912-1954): Biography*. MacTutor History of Mathematics. https://mathshistory.st-andrews.ac.uk/Biographies/Turing/

Oracle. (s.f.). *About the Java technology*. The Java Tutorials. Recuperado el 30 de octubre de 2026, de https://docs.oracle.com/javase/tutorial/getStarted/intro/definition.html

Penn Engineering. (s.f.). *Celebrating Penn Engineering history: ENIAC*. University of Pennsylvania. Recuperado el 30 de octubre de 2026, de https://www.seas.upenn.edu/about/history-heritage/eniac/

Python Software Foundation. (s.f.). *Applications for Python*. Recuperado el 30 de octubre de 2026, de https://www.python.org/about/apps/

Universidad de Oslo. (s.f.). *Dahl's activity at the Norwegian Defense Research Establishment*. Recuperado el 27 de octubre de 2026, de https://www.mn.uio.no/ifi/english/about/ole-johan-dahl/scientific-activity
