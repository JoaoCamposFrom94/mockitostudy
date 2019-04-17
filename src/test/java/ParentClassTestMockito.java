import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

public class ParentClassTestMockito {

  @BeforeTest
  public void init(){
    MockitoAnnotations.initMocks(this);
  }

  @Mock
  HttpRequestClient serviceToBeMocked;

  @InjectMocks
  ParentClass parentClass = new ParentClass();

  @Test
  public void mockedHttpRequestResponse(){
    when(parentClass.proxyHttpGetRequest()).thenReturn("Im running mockito.");

    assertEquals( parentClass.proxyHttpGetRequest(),"Im running mockito.");
  }
}
