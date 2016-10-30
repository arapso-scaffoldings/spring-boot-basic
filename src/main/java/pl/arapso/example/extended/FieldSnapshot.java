package pl.arapso.example.extended;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FieldSnapshot {

	private String id;
	private Value value;
	private SnapshotStatus status;

}
