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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87313;
     Object term87399;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87313 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term87399 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term87485 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term87571 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term87571, term87571.getClass(), "type", 39);
        setField(term87485, term87485.getClass(), "next", term87571);
        setIntField(term87485, term87485.getClass(), "type", 63);
        setField(term87399, term87399.getClass(), "first", term87485);
        setIntField(term87399, term87399.getClass(), "type", 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term87399;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term87313, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


