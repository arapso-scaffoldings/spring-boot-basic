package pl.arapso.example.extended;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FragmentSnapshot implements Cloneable {

	public enum Status {
		@JsonProperty
		MERGED,
		@JsonProperty
		CHANGED
	}
	
	private String formId = "empty-snapshot";

	private List<FieldSnapshot> fields = new ArrayList<>();

	@JsonUnwrapped
	private ValidationErrors errors = new ValidationErrors();

	private Status status;


}