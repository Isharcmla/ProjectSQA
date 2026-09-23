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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215969;
     Object term216061;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215969 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term216061 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term216147 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term216061, term216061.getClass(), "first", term216061);
        setIntField(term216147, term216147.getClass(), "type", 40);
        setField(term216061, term216061.getClass(), "next", term216147);
        setIntField(term216061, term216061.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term216061;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term215969, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


