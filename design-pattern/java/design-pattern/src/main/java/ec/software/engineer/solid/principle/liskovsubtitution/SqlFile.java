package ec.software.engineer.solid.principle.liskovsubtitution;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SqlFile {

	private String filePath;
	private String fileText;

	public String loadText() {
		return "";
	}

	public String saveText() {
		return "";
	}
}
