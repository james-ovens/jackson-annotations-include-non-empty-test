package com.example.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import java.math.BigDecimal;

public class IncludeNonEmptyTest {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testSerialise() throws JsonProcessingException, JSONException {

        // Has non null value for one of its fields so should be serialised
        Child firstChild = new Child();
        firstChild.setChildBigDecimal(new BigDecimal("10.22"));

        // Has null fields so should not be serialised
        Child secondChild = new Child();

        Parent parent = new Parent();
        parent.setFirstChild(firstChild);
        parent.setSecondChild(secondChild);

        String parentJson = objectMapper.writeValueAsString(parent);

        String EXPECTED_JSON = "{\"firstChild\":{\"childBigDecimal\":10.22}}";
        // Actual JSON: {"firstChild":{"childBigDecimal":10.22},"secondChild":{}}
        JSONAssert.assertEquals(EXPECTED_JSON, parentJson, true);
    }

}
