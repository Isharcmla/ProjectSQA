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

public class FunctionType_tryMergeFunctionPiecewise_2003411845705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746215;
     Object term747003;

    public FunctionType_tryMergeFunctionPiecewise_2003411845705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term748025 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term748024 = ((Class) term748025).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term748024).setAccessible(true);
        Object enum1128 = ((Field) term748024).get((Object) null);
        term746215 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term746309 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term746379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term746449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term747132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term747167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term747202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term746767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term746449, term746449.getClass(), "jsType", null);
        setField(term747167, term747167.getClass(), "jsType", null);
        setField(term747202, term747202.getClass(), "jsType", null);
        setField(term747202, term747202.getClass(), "next", null);
        setField(term747167, term747167.getClass(), "next", term747202);
        setField(term747132, term747132.getClass(), "first", term747167);
        setField(term747132, term747132.getClass(), "jsType", null);
        setField(term747132, term747132.getClass(), "next", null);
        setField(term746449, term746449.getClass(), "next", term747132);
        setField(term746379, term746379.getClass(), "first", term746449);
        setField(term746309, term746309.getClass(), "parameters", term746379);
        setField(term746767, term746767.getClass(), "kind", enum1128);
        setField(term746309, term746309.getClass(), "returnType", term746767);
        setField(term746215, term746215.getClass(), "call", term746309);
        term747003 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term747097 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term747310 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term747097, term747097.getClass(), "parameters", term747132);
        setField(term747097, term747097.getClass(), "returnType", term747310);
        setField(term747003, term747003.getClass(), "call", term747097);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term747003;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term746215, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


