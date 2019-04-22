package jmockit;

import com.learn.mockito.HttpRequestClient;
import com.learn.mockito.ParentClass;
import mockit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ParentClassTestJmockitTestNg extends BaseTestClass {
  private static Logger logger = LoggerFactory.getLogger(ParentClassTestJmockitTestNg.class);

  @Mocked
  private HttpRequestClient httpRequestClient;

  @Tested
  private ParentClass parentClass = new ParentClass();

  public ParentClassTestJmockitTestNg() {
    System.out.println("CONSTRUCTOR");
  }

  @BeforeClass
  public void beforeClassOnChild2() {
    System.out.println("before CLASS");
  }

  @Test
  public void notJmockit() {
    System.out.println("TEST- notJmockit");
    assertNull(this.parentClass.proxyHttpGetRequest());
    assertNull(this.parentClass.invokePublicHttpMethod());
  }

  @Test
  public void mockedHttpRequestResponse() {
    System.out.println("TEST- mockedHttpRequestResponse");
    new MockUp<HttpRequestClient>() {
      @Mock
      String invokeHttpGet() {
        return "I'm running JMockit in a partially mocked class.";
      }
    };
    assertEquals("I'm running JMockit in a partially mocked class.", this.parentClass.proxyHttpGetRequest());

    new Expectations() {{
      ParentClassTestJmockitTestNg.this.httpRequestClient.publicMethodOnHttpClient();
      this.result = "Running JMockit in an expectation";
    }};

    assertEquals("Running JMockit in an expectation", this.parentClass.invokePublicHttpMethod());
    logger.info("[mockedHttpRequestResponse] Test complete successfully.");
  }
}
