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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560558;
     Object term560650;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term560558 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term560650 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term560736 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term560806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term560806, term560806.getClass(), "type", 39);
        setField(term560736, term560736.getClass(), "next", term560806);
        setIntField(term560736, term560736.getClass(), "type", 39);
        setField(term560650, term560650.getClass(), "first", term560736);
        setIntField(term560650, term560650.getClass(), "type", 20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term560650;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term560558, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


