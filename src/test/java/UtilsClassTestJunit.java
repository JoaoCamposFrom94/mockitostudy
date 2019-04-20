import com.learn.powermock.ServiceUsedByUtils;
import com.learn.powermock.UtilsClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(UtilsClass.class)
public class UtilsClassTestJunit {

  @Mock
  ServiceUsedByUtils serviceUsedByUtils;

  @Before
  public void before() throws Exception {
    PowerMockito.whenNew(ServiceUsedByUtils.class).withAnyArguments().thenReturn(this.serviceUsedByUtils);
  }

  @Test
  public void test(){
    when(this.serviceUsedByUtils.invokeInstanceMethod()).thenReturn("Mocked result");

    String res = UtilsClass.someStaticMethod();
    assertEquals(res, "Mocked result");
  }

}