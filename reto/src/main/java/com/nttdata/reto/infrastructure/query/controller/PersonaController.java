package com.nttdata.reto.infrastructure.query.controller;

import com.nttdata.reto.application.query.service.PersonaService;
import com.nttdata.reto.domain.dto.PersonDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * Controller class for handling the operations related to Person
 */
@Tag(name = "Person", description = "Operations related to Person")
@RestController
@RequestMapping("/person")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PersonaController {

    private final PersonaService personaService;
    /**
     * Constructor
     * @param personaService  personaService instance for handling the operations related to Person
     */
    PersonaController(PersonaService personaService){

        this.personaService = personaService;
    }
    /**
     * Method to get the list of person
     * @return List of PersonDto
     * @throws IOException if there is an error in the API response
     */

    @Operation(summary = "Get the list of person")
    @GetMapping("/list")
   ResponseEntity <List<PersonDto>> list() throws IOException {
        return ResponseEntity.ok(personaService.listPerson());
    }
}
