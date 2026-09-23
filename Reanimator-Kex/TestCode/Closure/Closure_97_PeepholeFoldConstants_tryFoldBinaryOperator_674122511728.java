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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186247;
     Object term186317;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186247 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term186317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term186387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term186457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term186457, term186457.getClass(), "type", 39);
        setField(term186387, term186387.getClass(), "next", term186457);
        setIntField(term186387, term186387.getClass(), "type", 39);
        setField(term186317, term186317.getClass(), "first", term186387);
        setIntField(term186317, term186317.getClass(), "type", 23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term186317;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term186247, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


