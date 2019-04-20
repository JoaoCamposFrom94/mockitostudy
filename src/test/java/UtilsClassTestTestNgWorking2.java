import com.learn.powermock.ServiceUsedByUtils;
import com.learn.powermock.UtilsClass;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.powermock.api.mockito.PowerMockito.when;

@PrepareForTest(UtilsClass.class)
public class UtilsClassTestTestNgWorking2 extends PowerMockTestCase {

  @Mock
  ServiceUsedByUtils serviceUsedByUtils;

  @BeforeMethod
  public void beforeEachMethod() throws Exception {
    PowerMockito.whenNew(ServiceUsedByUtils.class).withAnyArguments().thenReturn(this.serviceUsedByUtils);
  }

  @Test
  public void test() throws Exception {
    when(this.serviceUsedByUtils.invokeInstanceMethod()).thenReturn("Mocked result");

    String res = UtilsClass.someStaticMethod();
    Assert.assertEquals(res, "Mocked result");
  }

}