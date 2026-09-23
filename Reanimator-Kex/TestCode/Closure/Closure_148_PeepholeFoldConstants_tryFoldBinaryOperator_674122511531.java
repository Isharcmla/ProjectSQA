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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113255;
     Object term113341;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113255 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term113341 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term113427 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term113519 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term113519, term113519.getClass(), "type", 39);
        setField(term113427, term113427.getClass(), "next", term113519);
        setIntField(term113427, term113427.getClass(), "type", 39);
        setField(term113341, term113341.getClass(), "first", term113427);
        setIntField(term113341, term113341.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term113341;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term113255, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


