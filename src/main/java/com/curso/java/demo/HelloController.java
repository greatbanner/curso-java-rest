package com.curso.java.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path =  "/api/hello")
public class HelloController {
    
        @GetMapping
        public ResponseEntity<String> saludar2( ) {
            
            return ResponseEntity.status(HttpStatus.OK).body(" Hola ");
        }  
    
        @GetMapping(path = "/saludar")
        public ResponseEntity<String> saludar( ) {
            return ResponseEntity.ok("hola :D");
        }

        @GetMapping(path = "/hector")
        public ResponseEntity<String> saludarHector( ) {
            return ResponseEntity.ok("hola de parte de hector");
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


