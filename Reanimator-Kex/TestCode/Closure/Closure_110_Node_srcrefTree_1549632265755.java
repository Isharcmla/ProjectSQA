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

public class Node_srcrefTree_1549632265755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79356;

    public Node_srcrefTree_1549632265755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79480 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term79356, term79356.getClass(), "propListHead", null);
        setIntField(term79356, term79356.getClass(), "sourcePosition", 0);
        setField(term79391, term79391.getClass(), "propListHead", null);
        setIntField(term79391, term79391.getClass(), "sourcePosition", 0);
        setField(term79426, term79426.getClass(), "propListHead", term79480);
        setField(term79391, term79391.getClass(), "first", term79426);
        setField(term79356, term79356.getClass(), "first", term79391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term79356;
        callMethod(klass, "srcrefTree", argTypes, term79356, args);
    }

};


