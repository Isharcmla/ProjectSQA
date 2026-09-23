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

public class FunctionType_tryMergeFunctionPiecewise_2003411845385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286015;
     Object term286419;

    public FunctionType_tryMergeFunctionPiecewise_2003411845385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286015 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term286109 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term286179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term286249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term286688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term286249, term286249.getClass(), "jsType", null);
        setField(term286688, term286688.getClass(), "jsType", null);
        setField(term286688, term286688.getClass(), "next", null);
        setField(term286249, term286249.getClass(), "next", term286688);
        setField(term286179, term286179.getClass(), "first", term286249);
        setField(term286109, term286109.getClass(), "parameters", term286179);
        setField(term286015, term286015.getClass(), "call", term286109);
        term286419 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term286513 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term286583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term286653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term286653, term286653.getClass(), "jsType", null);
        setField(term286653, term286653.getClass(), "next", term286688);
        setField(term286583, term286583.getClass(), "first", term286653);
        setField(term286513, term286513.getClass(), "parameters", term286583);
        setField(term286419, term286419.getClass(), "call", term286513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term286419;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term286015, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


