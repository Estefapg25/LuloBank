En esta automatización se hacen las interacciones POST, GET, DELETE para la api de empleados

Se utiliza maven para las librerias, serenity BDD para los reportes, Screenplay como patrón de diseño, cucumber para la definicion de los features, serenity rest para las interacciones con el Api, hamcrest para las validaciones del then.

Para la creación de un nuevo empleo se utilizó un archivo JSON donde se envia el request por medio del feature se indica el nombre del archivo y la ruta donde se encuentra ubicado.

Se utilizan hooks para la configuración inicial @Before

Se utiliza la estructura de screenplay, tasks, questions, exceptions, runner, stepdefinitions

Se utiliza un archivo de configuración para indicar la url del Api