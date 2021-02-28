package jtraining.common.designpatterns.strategy.strategies;

import jtraining.common.designpatterns.strategy.DocumentBuilder;

public class TextDocumentBuilder implements DocumentBuilder {

    @Override
    public void Create(String input) {
        System.out.println("Creating Text Document. Done");
    }
}
