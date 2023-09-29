package ec.ezamora.designpattern.creational.challenge2;




public class RestHttpAdapterFactory implements HttpAdapterFactory {

  @Override
  public HttpAdapter makeAdapter() {
    return new RestHttAdapter();
  }
}
