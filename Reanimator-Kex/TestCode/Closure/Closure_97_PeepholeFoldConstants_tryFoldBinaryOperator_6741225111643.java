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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term657430;
     Object term657516;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term657430 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term657516 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term657602 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term657694 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term657694, term657694.getClass(), "type", 39);
        setField(term657602, term657602.getClass(), "next", term657694);
        setIntField(term657602, term657602.getClass(), "type", 39);
        setField(term657516, term657516.getClass(), "first", term657602);
        setIntField(term657516, term657516.getClass(), "type", 24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term657516;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term657430, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


