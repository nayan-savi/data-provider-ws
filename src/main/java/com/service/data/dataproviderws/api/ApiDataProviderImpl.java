package com.service.data.dataproviderws.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api")
public class ApiDataProviderImpl implements ApiDataProvider {

    @GetMapping(value = "/gender")
    public String[] getGender() {
        return new String[]{"Male", "Female", "Others"};
    }

    @GetMapping(value = "/technologies")
    public String[] getTechnology() {
        return new String[]{"Java", "JavaScript", "NodeJs", "Spring", "Golang"};
    }

    @GetMapping(value = "/currencies")
    public String[] getCurrency() {
        return new String[]{"EUR", "USD", "CAD", "FUN", "URS"};
    }

}
