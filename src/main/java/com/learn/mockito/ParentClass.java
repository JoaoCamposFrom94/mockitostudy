package com.learn.mockito;

public class ParentClass {
  public ParentClass() {
    System.out.println("ParentClass constructor");
  }

  private HttpRequestClient serviceToBeMocked = new HttpRequestClient();


  public String proxyHttpGetRequest() {
    return this.serviceToBeMocked.invokeHttpGet();
  }

  public String invokePublicHttpMethod() {
    HttpRequestClient serviceToBeMockedInsideMethod = new HttpRequestClient();

    return serviceToBeMockedInsideMethod.publicMethodOnHttpClient();
  }
}
