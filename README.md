📹 Vídeo demostrativo :Explorador de Series de Carlos

Este proyecto en **Java** implementa un sistema de gestión de series utilizando una estructura de datos basada en **Hashing** mediante la clase **`HashMap`**.  
Permite registrar, buscar, listar y eliminar series, mostrando además la estructura interna del mapa hash.

---

## 🚀 Descripción del Proyecto

El programa permite al usuario interactuar mediante un **menú en consola** para realizar las siguientes acciones:

- 📥 **Registrar** una nueva serie con sus datos (nombre, género, plataforma, región).  
- 🔍 **Buscar** una serie por su nombre.  
- 📋 **Listar** todas las series registradas.  
- ❌ **Eliminar** una serie.  
- 🧩 **Visualizar** la estructura interna del HashMap (clave → valor).

---

## 🧠 Estructura del Proyecto

El proyecto está compuesto por tres clases principales dentro del paquete `com.carlos`:

### 1. `Serie.java`
Representa una serie con sus atributos básicos:
- `nombre`
- `genero`
- `plataforma`
- `region`

Incluye métodos *getter* y una sobrescritura del método `toString()` para mostrar la información de forma legible.

---

### 2. `HashSeries.java`
Gestiona las series usando un **HashMap<String, Serie>**, donde la clave es el nombre de la serie en minúsculas.  
Proporciona los siguientes métodos:

- `insertar(Serie serie)` → Registra una nueva serie.  
- `buscar(String nombre)` → Devuelve la serie si existe.  
- `eliminar(String nombre)` → Borra una serie por su nombre.  
- `listarSeries()` → Muestra todas las series almacenadas.  
- `mostrarEstructura()` → Imprime la estructura interna del HashMap.

---

### 3. `ExploradorSeries.java`
Contiene el **método `main`** y el **menú interactivo por consola**.  
El usuario puede ingresar opciones numéricas para ejecutar las diferentes operaciones sobre las series.

---

## 🧩 Hashing en el Proyecto

Este programa aplica el concepto de **Hashing**, una técnica usada para **almacenar y acceder a datos rápidamente** mediante una **función hash**.

En este caso, el **HashMap** se encarga internamente de:

1. Tomar la **clave** (el nombre de la serie).  
2. Calcular su **hash** (un número entero único basado en la clave).  
3. Determinar en qué posición de la tabla hash se guardará el objeto `Serie`.

Por ejemplo:

```java
tabla.put("breaking bad", new Serie("Breaking Bad", "Drama", "Netflix", "USA"));
