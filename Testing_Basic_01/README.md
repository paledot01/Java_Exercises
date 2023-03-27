Creacion del Proyecto en STS, sin MAVEN:
	1. New / Java Project / name : Testing_JUnit_basic_1 - JRE : JavaSE-17 / Finish.
	2. Seleccionamos el Proyecto / Build Path / Configure Buil Path / Libraries / select "Classpath" / Add Library / JUnit / Next / JUnit 4 / Finish / Apply and Close.
	3. Creamos el Package "clases", dentro una clase normal que contendra los metodos que seran testeados.
	4. Creamos las clases para creacion del Test: select package "clases" / Other / JUnit / JUnit Test Case / name : "" / Finish.
	5. Correr Test: seleccionamos la clase Test / Run As / JUnit Test.

Nota: En la creacion de la clase Test verificar que este seleccionado el "New JUnit X" de la misma version de la libreria implementada al proyecto.