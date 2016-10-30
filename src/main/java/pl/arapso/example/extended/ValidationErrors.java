package pl.arapso.example.extended;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.List;

import static java.util.Collections.EMPTY_LIST;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ValidationErrors {

	private List<ValidationError> validationErrors = new LinkedList<>();

}
