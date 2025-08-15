Docente.java

correcciones realizadas 

1. Errores de syntax por “;” las @ no llevan punto y coma al final, aparte de que habian lineas que sí necesitaban el “;” al final.  @Entity estaba escrita como @Entit. 

2. @Table(name = "docentes") agregado, no existía

3. Anotacion @Id agregada a id 

4. Se agregaron los constructores, tanto el vacío como el lleno

5. Se creó getter and setters, sin embargo, borré el set del id ya que tiene @GeneratedValue y el Id se genera automaticamente


Correccion propia: El comentario que dejé abajo de la libreria jakarta no es valido, me acabo de dar cuenta que usar * es para usar todas las librerias, pensé que tenia que cambiarlo por Id, pero eso no es correcto



Usuario.java

1.Correcciones realizadas

2. Errores de syntax en general con las “;” corregido.

3. Correccion de anotacion, antes era Entit y ahora es Entity

4. El  GeneratedValue estaba incompleto, le faltaba el .IDENTITY

5. Las anotaciones de column estaban mal escritas, estaban como “colun”

6. Eliminé el enumerated en tipoUsuario y lo dejé como string

   

   Curso.java

Correcciones realizadas

1. Anotacion Id incompleta corregida
 
2. El GeneratedValue estaba totalmente incompleto, usé el mismo de las otras clases, el .identity
   
3. Errores de syntax sobre “;” en algunas lineas corregidas, ejemplo, ; en anotaciones, las anotaciones no llevan ;
   
4. El constructor fue corregido, le faltaba Docente
   
5. getters and setters agregados
   
6. @table (name= cursos) no estaba agregado

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# 🧾 Resumen del ejercicio: Conexión Spring Boot + MySQL (XAMPP)

## 📌 Descripción del Proyecto

Este proyecto consiste en una aplicación backend desarrollada con **Spring Boot**, utilizando **JPA** para la persistencia de datos y **MySQL** como motor de base de datos, gestionado localmente a través de **XAMPP**. El objetivo principal fue establecer una conexión funcional entre la aplicación y la base de datos, permitiendo la generación automática de tablas a partir de entidades Java.

---

## 🐞 Errores corregidos

| Error | Explicación | Solución aplicada |
|------|-------------|-------------------|
| `@Entity` sin `@Table` | Hibernate no reconocía correctamente la entidad | Se agregó `@Table(name = "nombre_tabla")` en cada clase |
| Campo con `@GeneratedValue` tenía `setId()` | No se debe modificar manualmente un campo autogenerado | Se eliminó el setter del campo `id` |
| Anotaciones mal importadas | Algunas venían de paquetes incorrectos | Se corrigieron los imports (`jakarta.persistence.*`) |
| Error Whitelabel en `/` | No había controlador mapeado para la raíz | Se creó un `@RestController` de prueba para validar el backend |
| Gradle estancado en 80% | El proceso no cerraba visualmente | Se verificó en el Administrador de tareas y se finalizó manualmente |

---

## 🛠️ Guía paso a paso: Conexión a la base de datos

1. Instalar **XAMPP** y activar el módulo MySQL.
2. Crear una base de datos en `phpMyAdmin`, por ejemplo: `develop_db`.
3. Configurar el archivo `application.properties`:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/develop_db
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect 

4. Verificar que las entidades tengan las anotaciones correctas:

   @Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // otros campos...
}

5. Ejecutar el proyecto con Gradle o desde el IDE.

6. Validar en phpMyAdmin que las tablas se hayan creado automáticamente.

7. Recomendaciones para evitar errores similares
Documentar cada cambio en README y en los commits, explicando el motivo.

Evitar setters en campos autogenerados (@GeneratedValue) para no romper la lógica de persistencia.

Revisar los imports: usar siempre jakarta.persistence en lugar de javax.persistence si estás en versiones modernas.

Esperar a que Gradle finalice antes de hacer commits o cerrar el proyecto.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



