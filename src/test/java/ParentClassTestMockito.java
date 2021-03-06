import com.learn.mockito.HttpRequestClient;
import com.learn.mockito.ParentClass;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class ParentClassTestMockito {

  @Before
  public void init(){
    MockitoAnnotations.initMocks(this);
  }

  @Mock
  HttpRequestClient serviceToBeMocked;

  @InjectMocks
  ParentClass parentClass = new ParentClass();

  @Test
  public void mockedHttpRequestResponse(){
    when(this.parentClass.proxyHttpGetRequest()).thenReturn("Im running mockito.");

    assertEquals(this.parentClass.proxyHttpGetRequest(), "Im running mockito.");
  }
}
