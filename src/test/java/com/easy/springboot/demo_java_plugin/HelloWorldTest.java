package com.easy.springboot.demo_java_plugin;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class HelloWorldTest {
    @Test
    public void testAdd() {
        HelloWorld helloWorld = new HelloWorld();
        int c = helloWorld.add(1, 1);
        System.out.println("c = " + c);
        Assert.assertEquals(2, c);
    }
}
