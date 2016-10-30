package pl.arapso.example.extended;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FieldUpdate {

	private String fragmentId;
	private String fieldId;
	private Value newValue;
}
