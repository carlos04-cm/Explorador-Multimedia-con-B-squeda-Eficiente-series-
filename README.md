# 🎬 Explorador de Series con Búsqueda Eficiente (Hashing)

## 📌 Descripción General

Este proyecto implementa un **Explorador de Series** desarrollado en **Java**, que permite registrar, buscar, listar y eliminar series utilizando una **estructura de datos Hashing** (`HashMap`).  
El propósito es aplicar estructuras de datos avanzadas para lograr **búsquedas rápidas y eficientes**, demostrando el funcionamiento práctico de la **dispersión (hashing)**.

---

## 🎥 Video Demostrativo

🔗 **Ver demostración del proyecto en YouTube:**  
[https://youtu.be/Vx3koofCI7Q?si=ANIR6vnjSG6z8U07](https://youtu.be/Vx3koofCI7Q?si=ANIR6vnjSG6z8U07)

---

## 🎯 Objetivo del Proyecto

Aplicar los conceptos de **tablas hash (Hashing)** para organizar y acceder a datos multimedia (en este caso, series) de forma eficiente.  
El programa permite al usuario gestionar una colección de series desde un menú interactivo.

---

## 🧱 Estructura del Proyecto

El proyecto está compuesto por tres clases principales dentro del paquete `com.carlos`:

### 1. `Serie.java`
Define la estructura de un objeto **Serie**, con los siguientes atributos:
- `nombre` → Título de la serie.  
- `genero` → Género de la serie.  
- `plataforma` → Plataforma donde se transmite (Netflix, HBO, etc.).  
- `region` → Región o país de origen.

Incluye métodos *getter* y el método `toString()` para mostrar la información formateada.

---

### 2. `HashSeries.java`
Implementa la **tabla hash** utilizando un `HashMap<String, Serie>` donde la **clave** es el nombre de la serie en minúsculas.

**Funciones principales:**
- `insertar(Serie serie)` → Agrega una nueva serie.  
- `buscar(String nombre)` → Busca una serie por su nombre.  
- `eliminar(String nombre)` → Elimina una serie registrada.  
- `listarSeries()` → Muestra todas las series almacenadas.  
- `mostrarEstructura()` → Imprime la estructura interna del `HashMap`.

Esta clase representa la **gestión de datos** con hashing, logrando búsquedas y operaciones en tiempo promedio **O(1)**.

---

### 3. `ExploradorSeries.java`
Clase principal con el método `main()`.  
Contiene el **menú interactivo** que permite al usuario realizar las siguientes acciones:

| Opción | Acción |
|--------|--------|
| 1 | Registrar nueva serie |
| 2 | Buscar serie por nombre |
| 3 | Listar todas las series |
| 4 | Eliminar una serie |
| 5 | Mostrar estructura interna del hash |
| 0 | Salir del programa |

---

## ⚙️ Ejecución

### 🪄 Requisitos
- **Java JDK 8 o superior**
- Consola o IDE (Eclipse, IntelliJ, NetBeans o VS Code con extensión Java)

### ▶️ Pasos para ejecutar
1. Clonar o descargar el proyecto.
2. Compilar las clases:
   ```bash
   javac com/carlos/*.java
