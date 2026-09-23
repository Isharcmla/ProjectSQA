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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101966;
     Object term102052;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101966 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term102052 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term102138 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term102052, term102052.getClass(), "first", term102052);
        setIntField(term102138, term102138.getClass(), "type", 40);
        setField(term102052, term102052.getClass(), "next", term102138);
        setIntField(term102052, term102052.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term102052;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term101966, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


