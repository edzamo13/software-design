package ec.software.engineer.designpattern.behavioral.strategy.validation.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MessageTypeEnum {
	INF("INFORMATION"), ERR("ERROR"), ADV("WARNING");
	private String name;

}
