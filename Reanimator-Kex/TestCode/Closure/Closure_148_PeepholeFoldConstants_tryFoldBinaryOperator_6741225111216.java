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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288739;
     Object term288831;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288739 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term288831 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term288923 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term289015 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term289015, term289015.getClass(), "type", 39);
        setField(term288923, term288923.getClass(), "next", term289015);
        setIntField(term288923, term288923.getClass(), "type", 39);
        setField(term288831, term288831.getClass(), "first", term288923);
        setIntField(term288831, term288831.getClass(), "type", 19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term288831;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term288739, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


