package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ArrowType_hasEqualParameters_207327133166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15147;
     Object term15425;

    public ArrowType_hasEqualParameters_207327133166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15147 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term15239 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term15563 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term15239, term15239.getClass(), "first", term15563);
        setField(term15147, term15147.getClass(), "parameters", term15239);
        term15425 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term15517 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term15517, term15517.getClass(), "first", term15563);
        setField(term15425, term15425.getClass(), "parameters", term15517);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term15425;
        args[1] = false;
        callMethod(klass, "hasEqualParameters", argTypes, term15147, args);
    }

};


