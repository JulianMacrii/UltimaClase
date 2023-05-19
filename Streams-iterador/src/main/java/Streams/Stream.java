package Streams-iterador;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
        ()->sentencia; sin parametros
        parametro -> sentencia; Un parametro
        (parAm parB) --> sentencia; mas de un parametro
        (parametros) --> { setencia1;
                            sentencia2;} mas de una sentencia
         */
        /*
        //Consumidores (Consumer<t>)
        int p = 6;
        p-> System.out.println(p);

        //BiConsumidores (Biconsumer<T,U>
        (p,q) -> System.out.println(p+q);

        //Proveedores (Suplier<T>)
        ()-> 10;

        //Funciones (Function<T,U>)
        P-> P+10;

        //bIFunciones (Function<T,U,R>)
        (P,Q)-> P+Q;

        //Predicados (predicate<T>)
        p-> p==10; //true o false

        //BiPredicados (predicate<T>)
        (p,q)-> p==q;
        */

       /* ArrayList<String> a = new ArrayList<>();
        a.forEach(System.out::println); --> Funcion consumer
        */
        //Streams flujo de elemento que ejecutan un conjunto de funciones en forma secuencial y paralela
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hola");
        arrayList.add("Palabra");
        arrayList.add("chau");
        arrayList.add("si");

        //1° Invocacion a fuente -> collection.stream()
        //2° Operacion intermedia -> filter() map() mapToInt() Muchas
        //3° Operaciones terminales -> findFirst count() min() max() forEach() Collect() solo 1.

        //List<String> b = arrayList.stream().filter(elemento-> elemento.equals("hola")) //filter solicita predicado
        //        .collect(Collectors.toList());

        arrayList.stream()
                .map(elemento -> elemento.toUpperCase())
                .forEach(System.out::println); //Solo se muestra. No se guarda. 1 operacion terminal

        List<Integer> arrayNumeros = List.of(15,5,26,8); //En vez de crear la lista y poner add
        List<String> arrayNombres = List.of("Marcos","Julieta","Nacho");
        List<String> arrayNombresNueva = List.of("Martin","Pedro","Marcos","Jose");

        //Sumamos todos los elementos de la lista de numero enteros
        int result = arrayNumeros.stream().reduce(0,(accum, num)-> accum=+num)
        System.out.println(result);
        //Calculamos el promedio de la lista de numeros enteros

        //Filtremos la lista de nombre y la guardamos en una nueva lista

        //Filtramos la lista borrando el nombre deseado y lo guardamos en una nueva lista

        //Buscamos unaconcurreciencia en una lista y solo retornamos el primero
    }
}
