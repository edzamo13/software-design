package ec.software.engineer.designpattern.behavioral.strategy.validation;


import ec.software.engineer.designpattern.behavioral.strategy.validation.exception.ValidationFileException;

public interface ValidationFile<T, R> {

  R validate(T objectToValidate) throws ValidationFileException;


}
