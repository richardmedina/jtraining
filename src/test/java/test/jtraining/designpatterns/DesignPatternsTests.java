package test.jtraining.designpatterns;


import jtraining.common.designpatterns.strategy.DocumentBuilderManagerImpl;
import org.junit.Assert;
import org.junit.Test;

public class DesignPatternsTests {

    @Test
    public void Strategy_Tests (){
        var docBuilder = new DocumentBuilderManagerImpl();

        var txtSuccess = docBuilder.createFile("richard.txt");
        var docxSuccess = docBuilder.createFile("richard.docx");
        var xlsxSuccess = docBuilder.createFile("richard.xlsx");

        // Should be created
        Assert.assertEquals(true, txtSuccess);
        // Should be created
        Assert.assertEquals(true, docxSuccess);
        // Should not be created
        Assert.assertEquals(true, xlsxSuccess);
    }
}
