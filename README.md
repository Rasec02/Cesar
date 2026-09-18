La LinkedList usa nodos conectados entre sí, cada nodo guarda un dato y apunta al siguiente. Esto permite añadir elementos al final o en una posición específica, eliminar ajustando las referencias y recorrer la lista para obtener valores.
La ArrayList usa un arreglo dinámico que se expande cuando se llena. Permite insertar elementos en cualquier posición desplazando los demás, eliminar moviendo los que están después hacia adelante y acceder rápidamente a cualquier posición por índice.
Ambas listas implementan la misma interfaz List<E>, que define los métodos básicos: add, remove, get, size, clear y isEmpty.
En la clase principal (Main.java) se hacen pruebas simples: se añaden elementos, se muestran en consola y se prueban casos positivos (índices válidos) y negativos (índices fuera de rango).
En este proyecto se mantiene la misma estructura: una interfaz List<E> con los métodos principales (add, remove, get, size, clear, isEmpty), la clase Node para la lista enlazada, y las clases LinkedList y ArrayList que implementan la interfaz.
La diferencia con el primer trabajo es que aquí se añadieron mensajes de error simples cuando se usan índices inválidos. Por ejemplo, si intentas acceder a una posición que no existe, el programa muestra un mensaje en consola como “Error: índice fuera de rango”. Esto lo hace más claro y fácil de entender para alguien que recién empieza a programar.
En la clase principal (Main.java) se incluyen pruebas positivas y negativas:
Pruebas positivas: añadir elementos, obtenerlos correctamente y eliminarlos en posiciones válidas.
Pruebas negativas: intentar acceder o eliminar en índices que no existen, lo que genera mensajes de error.
