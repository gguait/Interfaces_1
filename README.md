Escribe un programa para un biblioteca que contenga libros y revistas.

    a.- Las características comunes que se almacenan tanto para las revistas como para los libros son el
    código, el título y el año de publicación. Estas tres características se pasan por parámetro en el
    momento de crear los objetos.
    b.- Los libros tienen además un atributo prestado. Los libros cuando se crean no están prestados.
    c.- Las revistas tiene un numero. En el momento de crear las revistas se pasa el numero por
    parámetro.
    d.- Tanto las revistas como los libros deben tener (aparte de los constructores) un método toString
    () que devuelve el valor de todos los atributos en una cadena de caracteres. También tienen un
    método que devuelve el año de publicación y otro para el código.
    e.- Para prevenir posibles cambios en el programa se tiene que implementar una interfaz Prestable
    con los métodos prestar(), devolver() y prestado(). La clase Libro implementa esta interfaz.

Planteamiento:

    a.- Se implementa una superclase de Libro y Revista con sus características comunes, que se llama
    Publicación. En esta clase además de declarar los tres atributos, se implementa un constructor que
    recibe por parámetro el valor de los 3 atributos. También se implementan los métodos getAño(),
    getCodigo() y un método toString() que devuelve la información de estos tres atributos en forma de
    cadena de texto.
    b.- Se implementan las clases Libro y Revista que añaden sus nuevos atributos.
    c.- Se escriben sus constructores, que llaman al constructor de la superclase.
    d.- Se sobrescribe el método toString() que también llama al método toString() de la superclase.
    e.- La interfaz Prestable declara los métodos indicados sin implementarlos, la clase Libro
    implementa Prestable y, por tanto, todos sus métodos.

Escribe una aplicación en la que se implementen dos métodos:

    a.- cuentaPrestados(): recibe por parámetro un arrayList de objetos y devuelve cuantos de ellos
    están prestados.
    
    b.- publicacionesAnterioresA(): recibe por parámetro un arrayList de Publicaciones y un año,
    devuelve cuántas publicaciones tienen fecha anterior al año recibido por parámetro.
    
    c.- En el método main() crear un arrayList de Publicaciones con 2 libros y 2 revistas, prestar uno
    de los libros, mostrar por pantalla los datos almacenados en el arrayList y mostrar por pantalla
    cuántas publicaciones hay prestadas y cuántas hay anteriores a 2000 utilizando los métodos escritos
    anteriormente.

Planteamiento:

    a.- cuentaPrestados() :recibe un arrayList de Objetos para que se pueda utilizar tanto con
    publicaciones como con cualquier otro tipo de objetos que se puedan prestar. Para contar cuántos
    objetos están prestados, se utiliza un contador que se inicializa a 0. Se recorre el arrayList
    comprobando si cada una de las celdas es Prestable. Si lo es, se comprobará si está prestado y en
    este caso se incrementará un contador. Para comprobar si está prestado, antes hay que convertirlo a
    Prestable, ya que la clase Object no tiene el método prestado().

    b.- publicacionesAnterioresA(): utiliza también un contador inicializado a 0. Se recorre el arrayList
    obteniendo el año de cada una de las publicaciones, se comprueba si es menor que el año recibido
    por parámetro y si es así, se incrementa el contador.

    c.- El arrayList se puede crear de varias maneras, en esta ocasión se le dan los datos en el momento
    de crearlo. Para prestar uno de los libros, se accede a una de las celdas, se transforma a Libro y se
    llama al método prestar().

Para mostrar por pantalla la información se recorre el arrayList y se muestra cada uno de los
objetos utilizando su método toString(), al que no es necesario llamar explícitamente. Después se
llama a los métodos implementados anteriormente.
