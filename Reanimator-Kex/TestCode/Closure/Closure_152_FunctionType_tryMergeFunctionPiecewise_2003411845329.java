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

public class FunctionType_tryMergeFunctionPiecewise_2003411845329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220498;
     Object term220279;

    public FunctionType_tryMergeFunctionPiecewise_2003411845329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220498 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term220545 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term220408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term220443, term220443.getClass(), "jsType", null);
        setField(term220443, term220443.getClass(), "next", null);
        setField(term220408, term220408.getClass(), "first", term220443);
        setField(term220545, term220545.getClass(), "parameters", term220408);
        setField(term220545, term220545.getClass(), "returnType", term220600);
        setField(term220498, term220498.getClass(), "call", term220545);
        term220279 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term220373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term220373, term220373.getClass(), "parameters", term220408);
        setField(term220373, term220373.getClass(), "returnType", term220498);
        setField(term220279, term220279.getClass(), "call", term220373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term220279;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term220498, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


