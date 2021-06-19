package com.curso.java.demo;

import com.curso.java.demo.dto.Persona;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path =  "/api/hello")
public class HelloController {
    
        @GetMapping(path = "/{nombre}")
        public ResponseEntity<String> saludar2(@PathVariable String nombre ) {
            return ResponseEntity.status(HttpStatus.OK).body(" Hola " + nombre);
        }  
    
        @GetMapping(path = "/saludar")
        public ResponseEntity<String> saludar(@RequestParam String nombre) {
            return ResponseEntity.ok("hola " + nombre + " :D" );
        }

        @PostMapping(path = "/persona")
        public ResponseEntity<String> saludarHector(@RequestBody Persona persona ) {
            return ResponseEntity.ok("hola " + persona.getNombreCompleto() );
        }

        @PostMapping()
        public ResponseEntity<Persona> agregarPersona(@RequestBody Persona persona ) {
            //TODO: guardar persona en la bd.
            return ResponseEntity.ok(persona);
        }

        @GetMapping(path = "/Proto")
        public ResponseEntity<String> saludarProto( ) {
            return ResponseEntity.ok("Como estan muchachos");
        }

        @GetMapping(path = "/Pily")
        public ResponseEntity<String> saludarPily( ) {
            return ResponseEntity.ok("Hola como estan?");
        }
}


