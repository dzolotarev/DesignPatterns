package com.example.patterns.behavioral.visitor.visitor;

import com.example.patterns.behavioral.visitor.animals.Cat;
import com.example.patterns.behavioral.visitor.animals.Cow;
import com.example.patterns.behavioral.visitor.animals.Dog;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonExportVisitor implements Visitor {
    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String visitCat(Cat cat) {
        String result = "";
        try {
            result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(cat);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
//        return "{\n" +
//                "  \"name\" : \"" + cat.getName() + "\",\n" +
//                "  \"mice\" : \"" + cat.miceCaught() + "\",\n" +
//                "  \"kilogramsOfFur\" : \"" + cat.furEaten() + "\"\n" +
//                "}";
    }

    @Override
    public String visitCow(Cow cow) {
        String result = "";
        try {
            result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(cow);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
//        return "{\n" +
//                "  \"name\" : \"" + cow.getName() + "\",\n" +
//                "  \"litersOfMilk\" : \"" + cow.milkedLiters() + "\",\n" +
//                "  \"stars\" : \"" + cow.getStars() + "\"\n" +
//                "}";
    }

    @Override
    public String visitDog(Dog dog) {
        return "{\n" +
                "  \"name\" : \"" + dog.getName() + "\",\n" +
                "  \"bones\" : \"" + dog.bonesGnawed() + "\"\n" +
                "}";
    }
}
