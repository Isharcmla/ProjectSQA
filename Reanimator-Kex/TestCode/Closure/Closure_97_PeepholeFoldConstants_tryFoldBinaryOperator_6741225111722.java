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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term679392;
     Object term679484;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term679392 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term679484 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term679576 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term679666 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term679666, term679666.getClass(), "type", 39);
        setField(term679576, term679576.getClass(), "next", term679666);
        setIntField(term679576, term679576.getClass(), "type", 39);
        setField(term679484, term679484.getClass(), "first", term679576);
        setIntField(term679484, term679484.getClass(), "type", 24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term679484;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term679392, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


