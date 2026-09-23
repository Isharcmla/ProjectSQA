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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term935432;
     Object term935524;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term935432 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term935524 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term935594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term935686 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term935778 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term935686, term935686.getClass(), "type", 64);
        setField(term935594, term935594.getClass(), "next", term935686);
        setIntField(term935594, term935594.getClass(), "type", 0);
        setField(term935524, term935524.getClass(), "first", term935594);
        setIntField(term935524, term935524.getClass(), "type", 101);
        setIntField(term935778, term935778.getClass(), "type", 98);
        setField(term935778, term935778.getClass(), "first", term935524);
        setField(term935524, term935524.getClass(), "parent", term935778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term935524;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term935432, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


