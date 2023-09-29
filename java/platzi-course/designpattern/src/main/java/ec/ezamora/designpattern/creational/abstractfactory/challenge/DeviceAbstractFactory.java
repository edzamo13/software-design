package ec.ezamora.designpattern.creational.abstractfactory.challenge;

public interface DeviceAbstractFactory {

  public Cpu createCpu();
  public Memory createMemory();
  public Display createDisplay();

}
