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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511800 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180938;
     Object term181024;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511800() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180938 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term181024 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term181110 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term181202 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term181202, term181202.getClass(), "type", 39);
        setField(term181110, term181110.getClass(), "next", term181202);
        setIntField(term181110, term181110.getClass(), "type", 39);
        setField(term181024, term181024.getClass(), "first", term181110);
        setIntField(term181024, term181024.getClass(), "type", 20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term181024;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term180938, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


