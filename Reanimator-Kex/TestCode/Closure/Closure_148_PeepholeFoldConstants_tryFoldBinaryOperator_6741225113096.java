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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term915293;
     Object term915385;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term915293 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term915385 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term915477 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term915569 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term915661 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term915477, term915477.getClass(), "next", term915569);
        setIntField(term915477, term915477.getClass(), "type", 64);
        setField(term915385, term915385.getClass(), "first", term915477);
        setIntField(term915385, term915385.getClass(), "type", 101);
        setField(term915385, term915385.getClass(), "parent", term915661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term915385;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term915293, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


