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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term540503;
     Object term540595;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term540503 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term540595 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term540687 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term540777 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term540777, term540777.getClass(), "type", 39);
        setField(term540687, term540687.getClass(), "next", term540777);
        setIntField(term540687, term540687.getClass(), "type", 39);
        setField(term540595, term540595.getClass(), "first", term540687);
        setIntField(term540595, term540595.getClass(), "type", 19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term540595;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term540503, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


