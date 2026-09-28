# Práctica de Laboratorio 05: Generics en Java

**Universidad Católica de Santa María**  
**Escuela Profesional de Ingeniería de Sistemas**  
**Curso:** Lenguajes de Programación III

---

## Descripción General

Este repositorio contiene el desarrollo y las soluciones de la **Guía Práctica N° 05: Generics en Java**. El objetivo principal es aplicar los conceptos de programación genérica en Java, tales como métodos genéricos, clases genéricas, delimitación de tipos, sobrecarga, manejo de colecciones dinámicas y sobreescritura de métodos para comparación y búsqueda sin modificar el estado de las estructuras.

---

## Estructura del Repositorio

El repositorio se encuentra organizado de manera modular en 4 actividades y 4 ejercicios propuestos:

```text
LP3_Guia05_Generics/
├── actividad_1/      # Método genérico imprimirArreglo con sobrecarga de subíndices
│   └── src/
├── actividad_2/      # Clase genérica Pila<E> con método contains(E elemento)
│   └── src/
├── actividad_3/      # Clase IgualGenerico con método genérico esIgualA
│   └── src/
├── actividad_4/      # Comparación de pilas con el método esIgual(Pila<E> otraPila)
│   └── src/
├── ejercicio_1/      # Clase genérica Par<F, S> con getters, setters y toString
│   └── src/
├── ejercicio_2/      # Método esIgual(Par<F, S> otroPar) en la clase Par
│   └── src/
├── ejercicio_3/      # Método genérico estático imprimirPar con tipos personalizados
│   └── src/
├── ejercicio_4/      # Clase Contenedor<F, S> con ArrayList<Par<F, S>>
│   └── src/
├── .gitignore        # Exclusión de binarios (.class), temporales e IDEs
└── README.md         # Documentación del proyecto
```

---

## Resumen de Actividades y Ejercicios

### Actividades

- **Actividad 1:** Implementación y sobrecarga del método genérico `imprimirArreglo`. Permite imprimir elementos dentro de un rango (`subIndice`, `superIndice`), validando los límites y lanzando la excepción personalizada `InvalidSubscriptException`.
- **Actividad 2:** Implementación de la estructura de datos genérica `Pila<E>` con control de excepciones (`ExeptionPilaLlena`, `ExeptionPilaVacia`) y el método `contains(E elemento)` que busca desde el tope hacia el fondo sin alterar la pila.
- **Actividad 3:** Clase `IgualGenerico` con el método `esIgualA(T val1, T val2)`, evaluando la igualdad semántica (`equals`) y el manejo de referencias `null`, tipos integrados y envolventes.
- **Actividad 4:** Extensión de la clase `Pila<E>` con el método `esIgual(Pila<E> otraPila)`, el cual compara dos pilas en tamaño, elementos y orden sin modificar el estado de las mismas.

### Ejercicios Propuestos

- **Ejercicio 1:** Creación de la clase genérica `Par<F, S>` con atributos parametrizados, métodos de acceso (`getPrimero`, `getSegundo`, `setPrimero`, `setSegundo`) y representación en texto formateado con `toString()`.
- **Ejercicio 2:** Incorporación del método `esIgual(Par<F, S> otroPar)` en la clase `Par` para comparar dos pares valor a valor.
- **Ejercicio 3:** Implementación del método genérico estático `imprimirPar(Par<F, S> par)` en `Main`, comprobando su funcionamiento con tipos estándar (`String, Integer`, `Double, Boolean`) y tipos personalizados (`Persona, Integer`).
- **Ejercicio 4:** Implementación de la clase genérica `Contenedor<F, S>` que encapsula un `ArrayList<Par<F, S>>` y proporciona métodos para agregar pares, obtener pares por índice, listar todos los pares y mostrarlos en consola.

---

## Compilación y Ejecución

Para compilar y ejecutar cualquiera de los módulos desde la terminal, ubícate en la carpeta correspondiente:

### Actividad 1

```bash
cd actividad_1
javac src/Main.java src/ArregloGenerico.java src/excepciones/*.java
java -cp src Main
```

### Actividad 2

```bash
cd actividad_2
javac src/Main.java src/Pila.java src/exception/*.java
java -cp src Main
```

### Actividad 3

```bash
cd actividad_3
javac src/Main.java src/IgualGenerico.java
java -cp src Main
```

### Actividad 4

```bash
cd actividad_4
javac src/Main.java src/Pila.java src/exception/*.java
java -cp src Main
```

### Ejercicio 1

```bash
cd ejercicio_1
javac src/*.java
java -cp src Main
```

### Ejercicio 2

```bash
cd ejercicio_2
javac src/*.java
java -cp src Main
```

### Ejercicio 3

```bash
cd ejercicio_3
javac src/*.java
java -cp src Main
```

### Ejercicio 4

```bash
cd ejercicio_4
javac src/*.java
java -cp src Main
```

---

## Pasos para Subir a GitHub

Si deseas subir esta carpeta a un nuevo repositorio en GitHub:

1. **Inicializar y preparar los archivos:**

    ```bash
    cd LP3_Guia05_Generics
    git init -b main
    git add .
    git commit -m "feat: solución completa de Guía 05 - Generics (4 actividades y 4 ejercicios)"
    ```

2. **Vincular el repositorio remoto y hacer push:**
    ```bash
    git remote add origin https://github.com/<TU_USUARIO>/LP3_Guia05_Generics.git
    git push -u origin main
    ```
