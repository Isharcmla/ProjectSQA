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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213834;
     Object term213926;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213834 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term213926 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term214018 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term214108 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term214108, term214108.getClass(), "type", 39);
        setField(term214018, term214018.getClass(), "next", term214108);
        setIntField(term214018, term214018.getClass(), "type", 39);
        setField(term213926, term213926.getClass(), "first", term214018);
        setIntField(term213926, term213926.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term213926;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term213834, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


