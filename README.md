# 💻 Portfolio Web Full Stack
### Proyecto Integrador - #YoProgramo (AP)
------------
**NOTA**: En este repositorio se encuentra todo lo relacionado al Backend del proyecto, para dirigirse al repositorio del Frontend hacer [click aquí](https://github.com/LuMarka/Portfolio-Frontend "click aquí")

### 📝 Descripción
------------
-  Este **portfolio** fué realizado como** proyecto final integrador** a presentar en el curso **#YoProgramo** de **Argentina Programa.**

- Se trata de una **API REST** realizada utilizando [Maven](https://maven.apache.org/) v 4.0.0, que es una herramienta de software para la gestión y construcción de proyectos [Java](https://www.java.com/es/),  el Framework [Spring Boot](https://start.spring.io/) que utiliza el patrón MVC (Modelo Vista Controlador) para la lógica y [MySQL](https://dev.mysql.com/downloads/workbench/) para persistencia de datos.  
1. Maven utiliza  archivo POM.xml (Proyect Object Model) para dentro de él especificar las diferentes dependencias o librerías que serán necesarias incluir en el proyecto que se esté desarrollando. En este caso algunas de estas dependencias utilizadas son:
		Spring Boot Dev Tools
		Spring Web
		Spring Data JPA
		MySQL Driver
		Validation
		Lombok
		Json Web Token
1. Proyecto desarrollado en [Java](https://www.java.com/es/) en su versión 18.

1. Para este tipo de aplicaciones, Spring Boot posee un modelo de Arquitectura Multicapa: Controller, Repository o DAO, Model o Entity, DTO y Service.

-En el presente repositorio se incluye, como un archivo en formato .pdf, el Diagrama Entidad - Relación (DER) utilizado en la Base de Datos Relacional y que posteriormente se traduce en las Entidades del Backend. Debajo se adjunta una previsualización del mismo:
[![DER](https://i.ibb.co/0FKVyVh/DER.png "DER")](https://i.ibb.co/0FKVyVh/DER.png "DER")

### ⌨🖱 Instalación

------------
Para ejecutar la aplicación en un entorno local se deben realizar los siguientes pasos:
1. Clonar el repositorio desde GitHub mediante descarga del archivo .zip, GitHub desktop o utilizando Git.
		git clone https://github.com/LuMarka/Portfolio-Backend.git

 2.Instalar las dependencias de Maven utilizando nuestro IDE preferido o a través del comando:
		mvn install
3.Crear y configurar el archivo application.properties en src/main/resources/

		spring.jpa.hibernate.ddl-auto = update
		spring.datasource.url = jdbc: mysql://<host_DB>:<puerto_DB>/<nombre_DB>?serverTimezone=UTC&createDatabaseIfNotExist=true
		spring.datasource.username = <usuario>
		spring.datasource.password= <contraseña>
		spring.jpa.database-platform = org.hibernate.dialect.MySQL8Dialect
		portfolio.jwtSecret = <clave_alfanumérica_JWT>
		portfolio.jwtExpirationMs = <tiempo_expiración_JWT> 

 **Dato**: Reemplazar los valores borrando los <>.

### ✅ Cómo utilizar la API
------------
En este caso se utilizó  plataforma de API [Postman](https://www.postman.com/) para realizar las operaciones AMB (o CRUD) en nuestra base de datos MySQL, además de autenticar y autorizar usuarios a través de JWT (JSON Web Token), trabajando en conjunto con nuestro Frontend a través de peticiones HTTP.


### 📩Contacto
------------
🙋‍♂️ En caso de tener alguna duda y te interesa ponerte en contacto conmigo podés hacerlo a través de:  
#### [LinkedIn](https://www.linkedin.com/in/luisa-markarian-253985246/ "LinkedIn") -  [Mi app](https://portfoliolumarka.web.app/ "Mi app")
