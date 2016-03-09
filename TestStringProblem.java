import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;


public class TestStringProblem {
   
	String positiveteststr = "Thes code for the sring problem";
	String casesensitiveteststr = "TheS code for the Sring problem";
	String emptystr = " ";
	String numbertest = "123";
	String symboltest = "/.,<>^%";
	
	String expected1 = "The code for the ring problem";
	String expected2 = "The  code for the  ring problem";
	
	StringProblem testStrProb = new StringProblem();
	
		
   //Test methods for replaceString1 function
	
   @Test
   public void testreplaceString1a() {	   
      String str = testStrProb.replaceString1(positiveteststr); 
      Assert.assertEquals(str, expected1);
   }    
   
   
   @Test
   public void testreplaceString1b() {	   
      String str1 = testStrProb.replaceString1(casesensitiveteststr); 
      Assert.assertEquals(str1, expected1);
   }
   
   
   @Test
   public void testreplaceString1c() {	   
      String str2 = testStrProb.replaceString1(numbertest);
      Assert.assertEquals(str2, expected1);
   }
          
   
   @Test
   public void testreplaceString1d() {
      String str3 = testStrProb.replaceString1(emptystr);  
      Assert.assertEquals(str3, expected1);
   }
      
   
   @Test
   public void testreplaceString1e() {
      String str4 = testStrProb.replaceString1(symboltest); 
      Assert.assertEquals(str4, expected1);
   }
   
   
   
   //Test methods for replaceString2 function
   
   @Test
   public void testreplaceString2a() {
	  String str = testStrProb.replaceString2(positiveteststr); 
      Assert.assertEquals(str, expected2);
   }    
   
   @Test
   public void testreplaceString2b() {
      String str1 = testStrProb.replaceString2(casesensitiveteststr); 
      Assert.assertEquals(str1, expected2);
   }
   
   @Test   
   public void testreplaceString2c() {
      String str2 = testStrProb.replaceString2(numbertest);
      Assert.assertEquals(str2, expected2);
   }
      
   @Test  
   public void testreplaceString2d() {
      String str3 = testStrProb.replaceString2(emptystr);  
      Assert.assertEquals(str3, expected2);
   }  
   
   @Test  
   public void testreplaceString2e() {
      String str4 = testStrProb.replaceString2(symboltest); 
      Assert.assertEquals(str4, expected2);       
   }
   
     
}