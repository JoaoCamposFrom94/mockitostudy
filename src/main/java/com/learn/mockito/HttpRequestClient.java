package com.learn.mockito;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class HttpRequestClient {

  private Client client = ClientBuilder.newClient();

  String invokeHttpGet(){
    WebTarget webTarget = this.client.target("http://localhost:5000");
    Response response = webTarget.request().get();
    return response.readEntity(String.class);
  }

}
