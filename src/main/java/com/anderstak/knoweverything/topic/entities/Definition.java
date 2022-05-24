package com.anderstak.knoweverything.topic.entities;

import java.util.ArrayList;

public class Definition {

    private String word;
    private ArrayList<WordDefinition> definitions;

    /* весь код ниже, кроме addDefinition, сделан благодаря Generate... */
    public Definition(String word) {
        this.word = word;
        this.definitions = new ArrayList<>();
    }

    // Не пугайтесь. Здесь вместо void стоит Definition,
    // чтобы можно было добавлять значения в одну строчку:
    // (new Definition("яблоко")).addDefinition(new WordDefinition())
    public Definition addDefinition(WordDefinition wordDefinition) {
        this.definitions.add(wordDefinition);
        return this;
    }

    public String getWord() {
        return word;
    }

    public ArrayList<WordDefinition> getDefinitions() {
        return definitions;
    }

}
