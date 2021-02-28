package jtraining.common.designpatterns.strategy.strategies;

import jtraining.common.designpatterns.strategy.DocumentBuilder;

public class WordDocumentBuilder implements DocumentBuilder {
    @Override
    public void Create(String input) {
        System.out.println("Creating Word Document. Done");
    }
}
