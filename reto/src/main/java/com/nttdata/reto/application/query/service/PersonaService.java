package com.nttdata.reto.application.query.service;

import com.nttdata.reto.domain.dto.PersonDto;
import com.nttdata.reto.infrastructure.configuration.JsonUtil;
import com.nttdata.reto.infrastructure.dataacces.Person;
import com.nttdata.reto.infrastructure.dataacces.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Service class for handling the operations related to Person
 */
@Service
public class PersonaService {
    @Value("${application.jsonfile}")
    private String JSON;

    private final WebClient webClient;

    /**
     * Constructor
     * @param webClient  webClient instance for making HTTP response
     */

    public PersonaService(WebClient webClient) {
        this.webClient = webClient;
    }

    public List<PersonDto> listPerson() throws IOException {
        Person personList = getPersonListFromApi();

        return personList.getResults()
                .stream()
                .map(this::mapToPersonDto)
                .collect(Collectors.toList());
    }
    /**
     * Method to get the list of person from the API
     * @return Person
     * @throws IOException if there is an error in the API response
     */

    private Person getPersonListFromApi() throws IOException {
        String apiResponse = webClient.get()
                .uri(JSON)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        return JsonUtil.deserializeJsonToPerson(apiResponse);
    }

    /**
     * Method to map the result to PersonDto
     * @param result object to be mapped
     * @return Mapped PersonDto object
     */

    private PersonDto mapToPersonDto(Result result) {
        String fullName = result.getName().getFirst() + " " + result.getName().getLast();
        String address = result.getLocation().getCity() + " " + result.getLocation().getState() + " " + result.getLocation().getCountry() + " " + result.getLocation().getPostcode();

        return new PersonDto(
                result.getGender(),
                fullName,
                address,
                result.getDob().getDate(),
                result.getPicture().getLarge(),
                result.getEmail()
        );
    }
}