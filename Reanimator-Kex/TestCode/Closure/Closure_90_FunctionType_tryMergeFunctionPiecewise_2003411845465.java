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

public class FunctionType_tryMergeFunctionPiecewise_2003411845465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388479;
     Object term388260;

    public FunctionType_tryMergeFunctionPiecewise_2003411845465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term388479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term388526 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term388389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term388424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term388581 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term388424, term388424.getClass(), "jsType", null);
        setField(term388424, term388424.getClass(), "next", null);
        setField(term388389, term388389.getClass(), "first", term388424);
        setField(term388526, term388526.getClass(), "parameters", term388389);
        setField(term388526, term388526.getClass(), "returnType", term388581);
        setField(term388479, term388479.getClass(), "call", term388526);
        term388260 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term388354 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term388354, term388354.getClass(), "parameters", term388389);
        setField(term388354, term388354.getClass(), "returnType", term388479);
        setField(term388260, term388260.getClass(), "call", term388354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term388260;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term388479, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


