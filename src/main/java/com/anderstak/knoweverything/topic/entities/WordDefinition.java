package com.anderstak.knoweverything.topic.entities;

public class WordDefinition {

    private PartOfSpeech partOfSpeech;
    private String meaning;

    /* Весь код ниже я сделал с помощью Generate... */

    public WordDefinition(PartOfSpeech partOfSpeech, String meaning) {
        this.partOfSpeech = partOfSpeech;
        this.meaning = meaning;
    }

    public PartOfSpeech getPartOfSpeech() {
        return partOfSpeech;
    }

    public String getMeaning() {
        return meaning;
    }

}
