package ec.ezamora.designpattern.creational.factory.challenge;

public class RestHttAdapterFactory implements HttpAdapterFactory{


  @Override
  public HttpAdapter makeAdapter() {
    return new RestHttpAdapter();
  }
}
