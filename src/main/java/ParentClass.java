public class ParentClass {
  private HttpRequestClient serviceToBeMocked = new HttpRequestClient();


  String proxyHttpGetRequest(){
    return serviceToBeMocked.invokeHttpGet();
  }
}
