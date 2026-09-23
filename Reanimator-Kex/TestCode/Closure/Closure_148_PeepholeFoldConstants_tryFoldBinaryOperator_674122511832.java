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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189246;
     Object term189316;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189246 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term189316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term189386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term189456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term189456, term189456.getClass(), "type", 39);
        setField(term189386, term189386.getClass(), "next", term189456);
        setIntField(term189386, term189386.getClass(), "type", 39);
        setField(term189316, term189316.getClass(), "first", term189386);
        setIntField(term189316, term189316.getClass(), "type", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term189316;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term189246, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


