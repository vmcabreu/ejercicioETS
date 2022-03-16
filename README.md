# ejercicioETS
Se solicita la creación de un proyecto que realice las siguientes tareas:

    Creación de un proyecto que denominado ejercicioEts en Github.
    Creación de un issu descriptivo con la subida inicial del proyecto.
        Este proyecto contendrá el fichero principal pom.xml que carece de código fuente. Dentro de este, las características son:
            groupId (es.iespuerto.alumno), donde alumno es el nombre del alumno que realiza el ejercicio.
            artifacId(ejercicioEts).
            version (1.0.0).
        Creación de un módulo denominado area. Con las siguientes características.
            ArtifacId (area)
            Creación de un paquete: es.iespuerto.area.
            Creación de la clase Alumno (donde Alumno es el nombre del alumno que realiza el ejercicio).
            La clase creada debe de contener las siguientes propiedades:
                String tipo. Qué será el tipo de area que va a almacenar (ej: triángulo, cuadrado, etc).
                Integer valor1. Valor del primer parámetro para el cálculo del área.
                Integer valor2. Valor del segundo parámetro para el cálculo del área.
                Constructores:
                    Constructor por defecto, sin parámetros.
                    Constructor con un parámetro.
                    Constructor con dos parámetros.
                Métodos:
                    CalculoArea. Método que recibe como parámetros valor1, y valor2.
            Realiza la documentación del proyecto a través de JAVADOC.
            Incluye el fichero .gitignore evitando la subida de las clases que no son necesarias.
    Gestión en Github. Se debe de crear un feature_1 vinculado al issu creado, con el fin de relacionar los cambios, subiendo todo el contenido a esta rama, y mezclarlo finalmente con la rama main. Recuerda utilizar commits descriptivos de la que se esta realizando.
    Genera un pequeño informe con capturas de código, la creación de ramas, generación de javadoc, y que incluya la url del repositorio donde se encuentra el código fuente en github. 

Rúbrica:

    El proyecto debe de compilar correctamente para ser evaluado.
    Se debe generar javadoc.
    Se deben de crear al menos dos ramas (main/feature_1).
    Debe de existir la clase (Alumno, donde alumno será sustituido por el nombre del alumno que realiza el ejercicio.
