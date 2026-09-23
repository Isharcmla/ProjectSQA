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
import java.lang.String;

public class FunctionType_tryMergeFunctionPiecewise_2003411845457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385782;
     Object term385498;

    public FunctionType_tryMergeFunctionPiecewise_2003411845457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term386737 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term386736 = ((Class) term386737).getDeclaredField((String) "INTERFACE");
        ((Field) term386736).setAccessible(true);
        Object enum649 = ((Field) term386736).get((Object) null);
        term385782 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term385829 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term385864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385949 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term385899, term385899.getClass(), "jsType", null);
        setField(term385899, term385899.getClass(), "next", null);
        setField(term385864, term385864.getClass(), "first", term385899);
        setField(term385829, term385829.getClass(), "parameters", term385864);
        setField(term385949, term385949.getClass(), "kind", enum649);
        setField(term385829, term385829.getClass(), "returnType", term385949);
        setField(term385782, term385782.getClass(), "call", term385829);
        term385498 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term385592 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term385662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term385732, term385732.getClass(), "jsType", null);
        setField(term385732, term385732.getClass(), "next", null);
        setField(term385662, term385662.getClass(), "first", term385732);
        setField(term385592, term385592.getClass(), "parameters", term385662);
        setField(term385592, term385592.getClass(), "returnType", term385782);
        setField(term385498, term385498.getClass(), "call", term385592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term385498;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term385782, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


