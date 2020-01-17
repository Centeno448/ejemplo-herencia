# Ejemplo CRUD con herencia en BDD


## Instrucciones

1. Hacer Data Import del archivo dump pruebaDump.sql en MySQL Workbench.
2. Configurar la resourse jdbc/herenciaDb en servidor glassfish para que se conecte con la base restaurada.
3. Ejecutar aplicacion


## Cambios Para el proyecto final

Al autogenerar las entidades, debemos colocar cascade = CascadeType.ALL al campo que contiene el padre
dentro de la clase hija. Ejemplo: dentro de este repositorio -> src/main -> java -> com/herencia -> models -> ServidorDeAplicaciones
-> atributo Plataforma.
