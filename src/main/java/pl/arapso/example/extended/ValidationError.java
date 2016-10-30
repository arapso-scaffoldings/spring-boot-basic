package pl.arapso.example.extended;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ValidationError {
	
	private String errorMessageKey;
	
	private List<String> errorMessageParams = new ArrayList<>();
	
	private List<String> invalidFields = new LinkedList<>();

	
}
