package com.springboot.web.library.commons;

import com.springboot.web.library.commons.utils.JsonUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    @lombok.SneakyThrows
    public static void main(String[] args) {
        JsonUtils jsonUtils = new JsonUtils();
        jsonUtils.serialize("test");
        System.out.println("Hello world!");
    }
}