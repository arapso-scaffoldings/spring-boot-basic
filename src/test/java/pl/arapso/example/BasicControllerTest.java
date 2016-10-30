package pl.arapso.example;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BasicControllerTest {

    private MediaType contentType = new MediaType("application", "json", Charset.forName("UTF-8"));

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void shouldGetReturnBasicModel() {
        // when
        ResponseEntity<BasicModel> result = testRestTemplate.getForEntity("/", BasicModel.class);

        // then
        assertThat(result.getStatusCode()).isEqualTo(HttpStatus.OK);
        BasicModel expected = getBasicModel();
        assertThat(result.getBody()).isEqualTo(expected);
    }

    @Test
    public void shouldExchangeReturnBasicModel() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(contentType);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Void> entity = new HttpEntity<>(headers);
        // when
        ResponseEntity<BasicModel> result = testRestTemplate.exchange("/", HttpMethod.GET, entity, BasicModel.class);

        // then
        assertThat(result.getStatusCode()).isEqualTo(HttpStatus.OK);
        BasicModel expected = getBasicModel();
        assertThat(result.getBody()).isEqualTo(expected);
    }

    private BasicModel getBasicModel() {
        BasicModel expected = new BasicModel();
        expected.setValue("simple");
        expected.setDescription("some description");

        List<String> list = new ArrayList<>();

        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element4");

        expected.setSampleList(list);
        return expected;
    }

}