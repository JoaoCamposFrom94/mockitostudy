import com.learn.powermock.ServiceUsedByUtils;
import com.learn.powermock.UtilsClass;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.powermock.api.mockito.PowerMockito.when;

@PrepareForTest(UtilsClass.class)
public class UtilsClassTestTestNgWorking extends PowerMockTestCase {

  @Mock
  ServiceUsedByUtils serviceUsedByUtils;

  @Test
  public void test() throws Exception {
    PowerMockito.whenNew(ServiceUsedByUtils.class).withAnyArguments().thenReturn(this.serviceUsedByUtils);

    when(this.serviceUsedByUtils.invokeInstanceMethod()).thenReturn("Mocked result");

    String res = UtilsClass.someStaticMethod();
    Assert.assertEquals(res, "Mocked result");
  }

}