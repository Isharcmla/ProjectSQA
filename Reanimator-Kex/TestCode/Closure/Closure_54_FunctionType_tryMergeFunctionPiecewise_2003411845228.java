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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionType_tryMergeFunctionPiecewise_2003411845228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117692;
     Object term118026;

    public FunctionType_tryMergeFunctionPiecewise_2003411845228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117692 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term117786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term118155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term118190, term118190.getClass(), "jsType", null);
        setField(term118190, term118190.getClass(), "next", null);
        setField(term118155, term118155.getClass(), "first", term118190);
        setField(term117786, term117786.getClass(), "parameters", term118155);
        setField(term117692, term117692.getClass(), "call", term117786);
        term118026 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term118120 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term118120, term118120.getClass(), "parameters", term118155);
        setField(term118026, term118026.getClass(), "call", term118120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term118026;
        args[1] = false;
        callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term117692, args);
    }

};


