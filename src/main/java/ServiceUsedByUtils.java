public class ServiceUsedByUtils {
  private String attribute;

  public ServiceUsedByUtils(String string){
    this.attribute = string;
  }

  public String invokeInstanceMethod(){
    return attribute;
  }

}
