package ec.ezamora.designpattern.creational.abstractfactory;

public class RhinoHatchbackCar implements RhinoCar{

  @Override
  public void useGps() {
    System.out.println("[Sedan] RhinoHatchbackCar ");
  }
}
