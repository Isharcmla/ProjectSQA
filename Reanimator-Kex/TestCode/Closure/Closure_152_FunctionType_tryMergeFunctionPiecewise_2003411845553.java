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

public class FunctionType_tryMergeFunctionPiecewise_2003411845553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516638;
     Object term517158;

    public FunctionType_tryMergeFunctionPiecewise_2003411845553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term516638 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term516732 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term516802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517050 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term517357, term517357.getClass(), "jsType", null);
        setField(term517392, term517392.getClass(), "jsType", null);
        setField(term517392, term517392.getClass(), "next", null);
        setField(term517357, term517357.getClass(), "next", term517392);
        setField(term516802, term516802.getClass(), "first", term517357);
        setField(term516732, term516732.getClass(), "parameters", term516802);
        setField(term516732, term516732.getClass(), "returnType", term517050);
        setField(term516638, term516638.getClass(), "call", term516732);
        term517158 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term517252 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term517322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517500 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term517322, term517322.getClass(), "first", term517357);
        setField(term517252, term517252.getClass(), "parameters", term517322);
        setField(term517252, term517252.getClass(), "returnType", term517500);
        setField(term517158, term517158.getClass(), "call", term517252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term517158;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term516638, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


