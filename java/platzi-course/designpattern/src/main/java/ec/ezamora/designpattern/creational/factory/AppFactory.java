package ec.ezamora.designpattern.creational.factory;

public class AppFactory {

  public static void main(String[] args) {
    createFactories("mastodon").showCost();
    createFactories("xxx").showCost();
  }

  private static BaseCar createFactories(String type) {
    if (type.equals("mastodon")) {
      return new MastodonCar();
    } else {
      return new RhinoCar();

    }
  }

}
