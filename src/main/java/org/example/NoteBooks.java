package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NoteBooks extends Utils{

    public void noteBooksPage(String string){

        Assert.assertTrue(getCurrentUrl().contains("https://demo.nopcommerce.com/notebooks"));
    }
}
