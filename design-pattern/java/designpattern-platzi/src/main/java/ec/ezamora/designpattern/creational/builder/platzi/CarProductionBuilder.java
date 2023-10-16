package ec.ezamora.designpattern.creational.builder.platzi;

import ec.ezamora.designpattern.creational.builder.platzi.enums.AvailableColors;
import ec.ezamora.designpattern.creational.builder.platzi.enums.CarCatalogs;
import ec.ezamora.designpattern.creational.builder.platzi.enums.EditionsTypes;

public interface CarProductionBuilder {

  void setAirBags(int howMany);
  void setColor(AvailableColors color);
  void setEdition(EditionsTypes edition);
  void setModel(CarCatalogs catalog);
  void resetProductionLine ();

}
