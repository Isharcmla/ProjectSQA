package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481274;
     Object term481366;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term481274 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term481366 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term481458 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term481458, term481458.getClass(), "next", term481458);
        setIntField(term481458, term481458.getClass(), "type", 44);
        setField(term481366, term481366.getClass(), "first", term481458);
        setIntField(term481366, term481366.getClass(), "type", 101);
        setField(term481366, term481366.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term481366;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term481274, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


