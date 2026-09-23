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

public class FunctionType_tryMergeFunctionPiecewise_2003411845663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term678494;
     Object term679074;

    public FunctionType_tryMergeFunctionPiecewise_2003411845663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term680086 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term680085 = ((Class) term680086).getDeclaredField((String) "INTERFACE");
        ((Field) term680085).setAccessible(true);
        Object enum1035 = ((Field) term680085).get((Object) null);
        term678494 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term678588 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term678658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678838 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term678728, term678728.getClass(), "jsType", null);
        setField(term678728, term678728.getClass(), "next", null);
        setField(term678658, term678658.getClass(), "first", term678728);
        setField(term678588, term678588.getClass(), "parameters", term678658);
        setField(term678838, term678838.getClass(), "kind", enum1035);
        setField(term678588, term678588.getClass(), "returnType", term678838);
        setField(term678494, term678494.getClass(), "call", term678588);
        term679074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term679168 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term679238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679418 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term679308, term679308.getClass(), "jsType", null);
        setField(term679308, term679308.getClass(), "next", null);
        setField(term679238, term679238.getClass(), "first", term679308);
        setField(term679168, term679168.getClass(), "parameters", term679238);
        setField(term679168, term679168.getClass(), "returnType", term679418);
        setField(term679074, term679074.getClass(), "call", term679168);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term679074;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term678494, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


