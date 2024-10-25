 Archivos API - Proyecto Spring Boot

Este proyecto es un ejemplo de cómo servir archivos estáticos utilizando un microservicio REST con Spring Boot. Se incluyen recursos como imágenes, archivos PDF, HTML, XML y JSON.

 Endpoints:

 Cargar una imagen png:
- Método: `GET`
- URL: `/imagen/{nombre}`
- Ejemplo: 
  - `localhost:8080/imagen/imagen3.png`
  - El archivo buscado debe estar en `resources/static/imagen/imagen3.png`.

Cargar un archivo PDF:
- Método: `GET`
- URL: `/pdf/{nombre}`
- Ejemplo: 
  - `localhost:8080/pdf/Ensayo.pdf`
  - El archivo buscado debe estar en `resources/static/pdf/Ensayo.pdf`.

 Cargar un archivo HTML:
- Método: `GET`
- URL: `/html/{nombre}`
- Ejemplo: 
  - `localhost:8080/html/boulevard.html`
  - El archivo buscado debe estar en `resources/static/html/boulevard.html`.

 Cargar un archivo XML:
- Método: `GET`
- URL: `/xml/{nombre}`
- Ejemplo: 
  - `localhost:8080/xml/sample.xml`
  - El archivo buscado debe estar en `resources/static/xml/sample.xml`.

 Cargar un archivo JSON:
- Método: `GET`
- URL: `/json/{nombre}`
- Ejemplo: 
  - `localhost:8080/json/pink.json`
  - El archivo buscado debe estar en `resources/static/json/pink.json`.

