package pl.arapso.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BasicController {

    @RequestMapping(value = "/")
    public BasicModel get() {
        BasicModel basicModel = new BasicModel();

        basicModel.setValue("simple");
        basicModel.setDescription("some description");

        List<String> list = new ArrayList<>();

        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element4");

        basicModel.setSampleList(list);

        return basicModel;
    }

    @RequestMapping(value = "/empty")
    public EmptyModel getEmptyModel() {
        return new EmptyModel();
    }

}
