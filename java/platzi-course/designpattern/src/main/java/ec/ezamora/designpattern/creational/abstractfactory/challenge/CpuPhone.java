package ec.ezamora.designpattern.creational.abstractfactory.challenge;

public class CpuPhone implements Cpu{

  @Override
  public void series(String serie) {
    System.out.println("[CpuPhone] series");
  }
}
