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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141669;
     Object term141755;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141669 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term141755 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term141841 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term141933 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term141933, term141933.getClass(), "type", 39);
        setField(term141841, term141841.getClass(), "next", term141933);
        setIntField(term141841, term141841.getClass(), "type", 39);
        setField(term141755, term141755.getClass(), "first", term141841);
        setIntField(term141755, term141755.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term141755;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term141669, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


