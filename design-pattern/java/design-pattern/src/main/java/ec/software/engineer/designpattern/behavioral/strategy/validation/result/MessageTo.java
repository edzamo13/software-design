package ec.software.engineer.designpattern.behavioral.strategy.validation.result;

import ec.software.engineer.designpattern.behavioral.strategy.validation.enums.MessageTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;


@Data
@AllArgsConstructor
@Generated
public class MessageTo   {
	private MessageTypeEnum messageType;
	private String path;
	private String detail;
	private String codeError;

}