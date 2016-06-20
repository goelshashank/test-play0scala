package controllers;

import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Created by shashank on 7/6/16.
 */
@Named
public class TestBean {

    @Inject TestBean2 testBean2;

    public char printMethod() {
       return testBean2.printMethod();
    }
}
