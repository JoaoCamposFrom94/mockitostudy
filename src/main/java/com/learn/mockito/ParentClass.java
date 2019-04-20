package com.learn.mockito;

public class ParentClass {
  private HttpRequestClient serviceToBeMocked = new HttpRequestClient();


  public String proxyHttpGetRequest() {
    return this.serviceToBeMocked.invokeHttpGet();
  }
}
