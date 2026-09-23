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

public class FunctionType_tryMergeFunctionPiecewise_2003411845221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112283;
     Object term112687;

    public FunctionType_tryMergeFunctionPiecewise_2003411845221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term112377 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term112447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term112517, term112517.getClass(), "jsType", null);
        setField(term112517, term112517.getClass(), "next", term112956);
        setField(term112447, term112447.getClass(), "first", term112517);
        setField(term112377, term112377.getClass(), "parameters", term112447);
        setField(term112283, term112283.getClass(), "call", term112377);
        term112687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term112781 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term112851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term112921, term112921.getClass(), "jsType", null);
        setField(term112921, term112921.getClass(), "next", term112956);
        setField(term112851, term112851.getClass(), "first", term112921);
        setField(term112781, term112781.getClass(), "parameters", term112851);
        setField(term112687, term112687.getClass(), "call", term112781);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term112687;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term112283, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


