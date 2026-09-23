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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionBuilder_copyFromOtherFunction_84223513595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71630;
     Object term71838;

    public FunctionBuilder_copyFromOtherFunction_84223513595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71630 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term71738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term71630, term71630.getClass(), "name", "");
        setField(term71630, term71630.getClass(), "sourceNode", term71738);
        term71838 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term71908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term71838, term71838.getClass(), "className", null);
        setField(term71838, term71838.getClass(), "source", term71908);
        setField(term71838, term71838.getClass(), "call", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term71838;
        try {
            callMethod(klass, "copyFromOtherFunction", argTypes, term71630, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


