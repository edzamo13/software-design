package ec.ezamora.designpattern.creational.abstractfactory.challenge;

public class MemoryLaptop implements Memory{

  @Override
  public void capacityGb(int number) {
    System.out.println("[MemoryLaptop] capacityGb");
  }
}
