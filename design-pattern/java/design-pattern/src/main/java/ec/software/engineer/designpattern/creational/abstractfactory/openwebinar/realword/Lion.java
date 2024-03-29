package ec.software.engineer.designpattern.creational.abstractfactory.openwebinar.realword;

/**
 * 
 * Product (Wildebeest, Lion, Bison, Wolf) define un objeto producto a ser
 * creado por la fábrica de concreto correspondiente implementa la interfaz de
 * producto abstracto
 */

public class Lion implements CarnivoreAbstractProduct {

	@Override
	public void eat(HerbivoreAbstractProduct herbivore) {
		System.out.println(this.getClass().getSimpleName() + " eat " + herbivore.getClass().getSimpleName());

	}

}
