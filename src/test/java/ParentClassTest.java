import com.learn.mockito.ParentClass;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.ProcessingException;

public class ParentClassTest {

  @Test(expected = ProcessingException.class)
  public void invokeNonMockedService(){
    ParentClass parentClass = new ParentClass();
    String responseBody = parentClass.proxyHttpGetRequest();

    Assert.assertEquals(responseBody, "I am running in flask!");
  }


}