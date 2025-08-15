Docente.java

correcciones realizadas 

1. Errores de syntax por “;” las @ no llevan punto y coma al final, aparte de que habian lineas que sí necesitaban el “;” al final.  @Entity estaba escrita como @Entit. 

2. @Table(name = "docentes") agregado, no existía

2. Anotacion @Id agregada a id 

3. Correccion en la libreria del jakarta, al final tenía un * y tenia que ir “id” para que despues @Id funcionara 

4. Se agregaron los constructores, tanto el vacío como el lleno

5. Se creó getter and setters, sin embargo, borré el set del id ya que tiene @GeneratedValue y el Id se genera automaticamente


