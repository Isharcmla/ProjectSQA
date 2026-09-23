package com.google.javascript.rhino;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Node_hasChild_441042997832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95734;
     Object term96014;

    public Node_hasChild_441042997832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term95874, term95874.getClass(), "next", term95944);
        setField(term95804, term95804.getClass(), "next", term95874);
        setField(term95734, term95734.getClass(), "first", term95804);
        term96014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term96014;
        callMethod(klass, "hasChild", argTypes, term95734, args);
    }

};


