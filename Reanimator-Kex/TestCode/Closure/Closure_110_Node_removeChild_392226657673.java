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

public class Node_removeChild_392226657673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61779;
     Object term62024;

    public Node_removeChild_392226657673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term62024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term61919, term61919.getClass(), "next", term62024);
        setField(term61849, term61849.getClass(), "next", term61919);
        setField(term61779, term61779.getClass(), "first", term61849);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term62024;
        callMethod(klass, "removeChild", argTypes, term61779, args);
    }

};


