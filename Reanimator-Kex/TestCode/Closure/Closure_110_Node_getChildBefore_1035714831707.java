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

public class Node_getChildBefore_1035714831707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67836;
     Object term68011;

    public Node_getChildBefore_1035714831707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term68011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term67906, term67906.getClass(), "next", term68011);
        setField(term67836, term67836.getClass(), "first", term67906);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term68011;
        callMethod(klass, "getChildBefore", argTypes, term67836, args);
    }

};


