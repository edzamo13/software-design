package ec.ezamora.designpattern.creational.abstractfactory.challenge;

public class DisplayPhone implements Display {

  @Override
  public void resolution(String serie) {
    System.out.println("[DisplayPhone] resolution");
  }
}
