package pl.arapso.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by damian on 30.10.16.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LombokModel {

    private String firstProperty;
    private String additionalProperty;
    private String listProperty;

}
