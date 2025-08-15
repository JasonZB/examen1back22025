Docente.java

correcciones realizadas 

1. Errores de syntax por “;” las @ no llevan punto y coma al final, aparte de que habian lineas que sí necesitaban el “;” al final.  @Entity estaba escrita como @Entit. 

2. @Table(name = "docentes") agregado, no existía

3. Anotacion @Id agregada a id 

4. Se agregaron los constructores, tanto el vacío como el lleno

5. Se creó getter and setters, sin embargo, borré el set del id ya que tiene @GeneratedValue y el Id se genera automaticamente


Correccion propia: El comentario que dejé abajo de la libreria jakarta no es valido, me acabo de dar cuenta que usar * es para usar todas las librerias, pensé que tenia que cambiarlo por Id, pero eso no es correcto
