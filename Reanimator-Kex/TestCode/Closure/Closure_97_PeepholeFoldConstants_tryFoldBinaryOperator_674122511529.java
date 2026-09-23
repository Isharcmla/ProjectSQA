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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140793;
     Object term140879;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140793 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term140879 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term140965 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term141051 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term141051, term141051.getClass(), "type", 39);
        setField(term140965, term140965.getClass(), "next", term141051);
        setIntField(term140965, term140965.getClass(), "type", 39);
        setField(term140879, term140879.getClass(), "first", term140965);
        setIntField(term140879, term140879.getClass(), "type", 23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term140879;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term140793, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


