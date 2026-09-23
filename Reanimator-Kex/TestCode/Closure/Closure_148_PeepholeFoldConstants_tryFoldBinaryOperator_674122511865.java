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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200246;
     Object term200332;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200246 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term200332 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term200418 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term200504 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term200504, term200504.getClass(), "type", 39);
        setField(term200418, term200418.getClass(), "next", term200504);
        setIntField(term200418, term200418.getClass(), "type", 39);
        setField(term200332, term200332.getClass(), "first", term200418);
        setIntField(term200332, term200332.getClass(), "type", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term200332;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term200246, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


