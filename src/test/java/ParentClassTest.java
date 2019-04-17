import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ParentClassTest {

  @Test
  public void invokeNonMockedService(){
    ParentClass parentClass = new ParentClass();
    String responseBody = parentClass.proxyHttpGetRequest();

    Assert.assertEquals(responseBody, "I am running in flask!");
  }



}