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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266615;
     Object term266707;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266615 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term266707 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term266799 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term266891 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term266891, term266891.getClass(), "type", 39);
        setField(term266799, term266799.getClass(), "next", term266891);
        setIntField(term266799, term266799.getClass(), "type", 39);
        setField(term266707, term266707.getClass(), "first", term266799);
        setIntField(term266707, term266707.getClass(), "type", 24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term266707;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term266615, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


