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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207638;
     Object term207730;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207638 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term207730 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term207822 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term207730, term207730.getClass(), "first", term207730);
        setIntField(term207822, term207822.getClass(), "type", 40);
        setField(term207730, term207730.getClass(), "next", term207822);
        setIntField(term207730, term207730.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term207730;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term207638, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


