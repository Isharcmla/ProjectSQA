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

public class FunctionType_tryMergeFunctionPiecewise_2003411845273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162934;
     Object term163338;

    public FunctionType_tryMergeFunctionPiecewise_2003411845273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162934 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term163028 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term163098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term163168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term163607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term163168, term163168.getClass(), "jsType", null);
        setField(term163607, term163607.getClass(), "jsType", null);
        setField(term163607, term163607.getClass(), "next", null);
        setField(term163168, term163168.getClass(), "next", term163607);
        setField(term163098, term163098.getClass(), "first", term163168);
        setField(term163028, term163028.getClass(), "parameters", term163098);
        setField(term162934, term162934.getClass(), "call", term163028);
        term163338 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term163432 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term163502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term163572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term163572, term163572.getClass(), "jsType", null);
        setField(term163572, term163572.getClass(), "next", term163607);
        setField(term163502, term163502.getClass(), "first", term163572);
        setField(term163432, term163432.getClass(), "parameters", term163502);
        setField(term163338, term163338.getClass(), "call", term163432);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term163338;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term162934, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


