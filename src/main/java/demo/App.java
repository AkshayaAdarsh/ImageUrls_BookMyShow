/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;
import java.net.MalformedURLException;


public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException {
        //TestCases tests = new TestCases(); // Initialize your test class
        //SearchAmazon search=new  SearchAmazon();
        //BookMyShow_CountHyperlinks countHyperlinks= new BookMyShow_CountHyperlinks();
        ImageUrls_BookMyShow imageUrls=new ImageUrls_BookMyShow();
        //Post_On_Linkedin postLink= new Post_On_Linkedin();

        //TODO: call your test case functions one after other here

        //tests.testCase01();
        //search.testCase01();
       // countHyperlinks.testCase01();
        imageUrls.testCase01();
        //postLink.testCase01();
        //END Tests
        //postLink.endTest();
        imageUrls.endTest();

        //countHyperlinks.endTest();
       // search.endTest(); // End your test by clearning connections and closing browser
    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        new App().getGreeting();
    }
}
