package com.nttdata.reto.infrastructure.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nttdata.reto.infrastructure.dataacces.Person;

import java.io.IOException;

/**
 * Utility class for handling JSON
 */
public class JsonUtil {
    /**
     * ObjectMapper instance for handling JSON
     */
    private static final ObjectMapper objectMapper = new ObjectMapper();
    /**
     * Method to deserialize JSON to Person
     * @param json JSON to be deserialized
     * @return Person
     * @throws IOException if there is an error in the JSON
     */

    public static Person deserializeJsonToPerson(String json) throws IOException {
        return objectMapper.readValue(json, Person.class);
    }
}