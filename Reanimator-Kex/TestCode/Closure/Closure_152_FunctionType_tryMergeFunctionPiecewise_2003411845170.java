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

public class FunctionType_tryMergeFunctionPiecewise_2003411845170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86010;
     Object term86344;

    public FunctionType_tryMergeFunctionPiecewise_2003411845170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86010 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term86104 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term86473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term86508, term86508.getClass(), "jsType", null);
        setField(term86508, term86508.getClass(), "next", null);
        setField(term86473, term86473.getClass(), "first", term86508);
        setField(term86104, term86104.getClass(), "parameters", term86473);
        setField(term86010, term86010.getClass(), "call", term86104);
        term86344 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term86438 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term86438, term86438.getClass(), "parameters", term86473);
        setField(term86344, term86344.getClass(), "call", term86438);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term86344;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term86010, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


