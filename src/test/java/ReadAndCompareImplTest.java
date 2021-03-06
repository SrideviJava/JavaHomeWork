import org.junit.Test;
import java.io.File;
import java.nio.file.*;
/**
 * Created by 1795 on 3-10-2015.
 */

public class ReadAndCompareImplTest {

    @Test
    public void compare2TextLines() {
        try {
            ReadAndCompareImpl test1 = new ReadAndCompareImpl();
            Path inputFilePath = Paths.get("D:\\java-study-notes\\input\\inpTextFile.txt");
            Path refFilePath = Paths.get("D:\\java-study-notes\\input\\refTextFile.txt");
            test1.readCompareText(inputFilePath, refFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//end of Test 1
    @Test
        public void compare2JSONFiles()
        {
        try{
        ReadAndCompareImpl test3 = new ReadAndCompareImpl();
        Path inputFilePath = Paths.get("D:\\java-study-notes\\input\\inpJSON.txt");
        Path refFilePath = Paths.get("D:\\java-study-notes\\input\\refJSON.txt");
        test3.readCompareText(inputFilePath, refFilePath);
        }catch (Exception e){e.printStackTrace();}
        }//end of Test 2

    @Test
    public void compare2XMLFiles() {
        try {
            ReadAndCompareImpl test4 = new ReadAndCompareImpl();
            Path inputFilePath = Paths.get("D:\\java-study-notes\\input\\inpBetalingen.xml");
            Path refFilePath = Paths.get("D:\\java-study-notes\\input\\refBetalingen.xml");
            test4.readCompareText(inputFilePath, refFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }     //end of Test 3

    @Test
    public void compareXMLFilesContents() {
        try {
            ReadAndCompareImpl test5 = new ReadAndCompareImpl();
            File inpFile = new File("D:\\java-study-notes\\input\\inpBetalingen.xml");
            File refFile = new File("D:\\java-study-notes\\input\\refBetalingen.xml");
            test5.readCompareWithUtils(inpFile,refFile);
            } catch (Exception e) {
            e.printStackTrace();
        }
    }     //end of Test 4
}//end of Test Class