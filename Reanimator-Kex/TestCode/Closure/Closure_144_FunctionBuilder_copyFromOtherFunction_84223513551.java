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

public class FunctionBuilder_copyFromOtherFunction_84223513551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45211;
     Object term45369;

    public FunctionBuilder_copyFromOtherFunction_84223513551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term45404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term45211, term45211.getClass(), "name", null);
        setField(term45211, term45211.getClass(), "sourceNode", term45404);
        term45369 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term45498 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term45369, term45369.getClass(), "source", term45404);
        setField(term45369, term45369.getClass(), "call", term45498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term45369;
        try {
            callMethod(klass, "copyFromOtherFunction", argTypes, term45211, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


