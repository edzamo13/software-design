package ec.ezamora.designpattern.creational.challenge;

public class RestHttAdapterFactory implements HttpAdapterFactory{


  @Override
  public HttpAdapter makeAdapter() {
    return new RestHttpAdapter();
  }
}
