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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term899751;
     Object term899843;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term899751 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term899843 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term899935 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term900027 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term900027, term900027.getClass(), "type", 63);
        setField(term899935, term899935.getClass(), "next", term900027);
        setIntField(term899935, term899935.getClass(), "type", 0);
        setField(term899843, term899843.getClass(), "first", term899935);
        setIntField(term899843, term899843.getClass(), "type", 100);
        setField(term899843, term899843.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term899843;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term899751, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


