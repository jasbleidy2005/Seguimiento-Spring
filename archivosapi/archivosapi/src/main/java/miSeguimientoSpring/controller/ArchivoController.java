package miSeguimientoSpring.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/apiarchivos")
public class ArchivoController {


    @GetMapping("/imagen/{nombre}")
    public ResponseEntity<Resource> obtenerImagen(@PathVariable String nombre) throws IOException {
        Resource resource = new ClassPathResource("static/imagen/" + nombre + ".png");
        if (!resource.exists()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "image/png");
        return new ResponseEntity<>(resource, headers, HttpStatus.OK);
    }

    @GetMapping("/html/{nombre}")
    public ResponseEntity<Resource> obtenerHtml(@PathVariable String nombre) throws IOException {
        Resource resource = new ClassPathResource("static/html/" + nombre + ".html");
        if (!resource.exists()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/html");
        return new ResponseEntity<>(resource, headers, HttpStatus.OK);
    }

    @GetMapping("/xml/{nombre}")
    public ResponseEntity<Resource> obtenerXml(@PathVariable String nombre) throws IOException {
        Resource resource = new ClassPathResource("static/xml/" + nombre + ".xml");
        if (!resource.exists()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/xml");
        return new ResponseEntity<>(resource, headers, HttpStatus.OK);
    }

    @GetMapping("/json/{nombre}")
    public ResponseEntity<Resource> obtenerJson(@PathVariable String nombre) throws IOException {
        Resource resource = new ClassPathResource("static/json/" + nombre + ".json");
        if (!resource.exists()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        return new ResponseEntity<>(resource, headers, HttpStatus.OK);
    }

    @GetMapping("/pdf/{nombre}")
    public ResponseEntity<Resource> obtenerPdf(@PathVariable String nombre) throws IOException {
        Resource resource = new ClassPathResource("static/pdf/" + nombre + ".pdf");
        if (!resource.exists()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/pdf");
        return new ResponseEntity<>(resource, headers, HttpStatus.OK);
    }
}