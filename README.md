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

