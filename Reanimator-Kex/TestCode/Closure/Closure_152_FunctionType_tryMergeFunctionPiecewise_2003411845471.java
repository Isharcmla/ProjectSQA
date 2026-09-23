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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionType_tryMergeFunctionPiecewise_2003411845471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402098;
     Object term402596;

    public FunctionType_tryMergeFunctionPiecewise_2003411845471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term402098 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term402192 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term402262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402496 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term402795, term402795.getClass(), "jsType", null);
        setField(term402830, term402830.getClass(), "jsType", null);
        setField(term402830, term402830.getClass(), "next", null);
        setField(term402795, term402795.getClass(), "next", term402830);
        setField(term402262, term402262.getClass(), "first", term402795);
        setField(term402192, term402192.getClass(), "parameters", term402262);
        setField(term402192, term402192.getClass(), "returnType", term402496);
        setField(term402098, term402098.getClass(), "call", term402192);
        term402596 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term402690 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term402760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402922 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setField(term402760, term402760.getClass(), "first", term402795);
        setField(term402690, term402690.getClass(), "parameters", term402760);
        setField(term402690, term402690.getClass(), "returnType", term402922);
        setField(term402596, term402596.getClass(), "call", term402690);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term402596;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term402098, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


