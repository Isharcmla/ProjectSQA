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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term865413;
     Object term865505;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term865413 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term865505 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term865597 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term865689 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term865689, term865689.getClass(), "type", 63);
        setField(term865597, term865597.getClass(), "next", term865689);
        setIntField(term865597, term865597.getClass(), "type", 0);
        setField(term865505, term865505.getClass(), "first", term865597);
        setIntField(term865505, term865505.getClass(), "type", 100);
        setField(term865505, term865505.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term865505;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term865413, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


