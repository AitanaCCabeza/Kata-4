package kata4_version1;

import kata4_version1.model.Histogram;
import kata4_version1.model.Mail;
import kata4_version1.view.MailListReader;
import kata4_version1.view.MailHistogramBuilder;
import kata4_version1.view.HistogramDisplay;
import java.util.List;

public class Kata4_Version1 {

   public static void main(String[] args) {
        String fileName = new String ("email.txt");   
        List<Mail> mailList = MailListReader.read(fileName);
        
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM", histogram); 
        histogramDisplay.execute();
        
    }
    
}

    

