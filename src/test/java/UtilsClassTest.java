import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(UtilsClass.class)
public class UtilsClassTest{

  @Mock
  ServiceUsedByUtils serviceUsedByUtils;

  @Before
  public void before() throws Exception {
    PowerMockito.whenNew(ServiceUsedByUtils.class).withAnyArguments().thenReturn(serviceUsedByUtils);
  }

  @Test
  public void test(){
    when(serviceUsedByUtils.invokeInstanceMethod()).thenReturn("Mocked result");

    String res = UtilsClass.someStaticMethod();
    System.out.println(res);

    assertEquals(res, "Mocked result");
  }

}