package jtraining.common.designpatterns.strategy;

import jtraining.common.designpatterns.strategy.strategies.TextDocumentBuilder;
import jtraining.common.designpatterns.strategy.strategies.WordDocumentBuilder;

import java.util.HashMap;

public class DocumentBuilderManagerImpl implements DocumentBuilderManager {

    private HashMap<String, DocumentBuilder> strategies;

    public DocumentBuilderManagerImpl(){
        this.strategies = new HashMap<>();
        this.strategies.put("txt", new TextDocumentBuilder());
        this.strategies.put("docx", new WordDocumentBuilder());
    }

    private String getFileNameExtension(String fileName){
        if(fileName != null) {

            var supportedExtensions = strategies.keySet();

            for(var supportedExtension : supportedExtensions){
                if(fileName.trim().toLowerCase().endsWith(supportedExtension)) {
                    return supportedExtension;
                }
            }
        }

        return null;
    }

    @Override
    public boolean createFile(String fileName) {
        var fileExtension = getFileNameExtension(fileName);

        if(fileExtension == null) {
            System.out.println("File type is not supported");
            return false;
        }

        this.strategies.get(fileExtension).Create(fileName);
        return true;
    }
}
