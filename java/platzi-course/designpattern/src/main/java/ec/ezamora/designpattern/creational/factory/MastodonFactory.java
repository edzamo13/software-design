package ec.ezamora.designpattern.creational.factory;

public class MastodonFactory implements CarFactory{

  @Override
  public BaseCar makeCar() {
    return new MastodonCar();
  }
}
