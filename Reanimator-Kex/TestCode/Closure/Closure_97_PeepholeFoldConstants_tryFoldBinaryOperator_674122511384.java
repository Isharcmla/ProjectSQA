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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89342;
     Object term89428;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89342 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term89428 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term89514 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term89428, term89428.getClass(), "first", term89428);
        setIntField(term89514, term89514.getClass(), "type", 40);
        setField(term89428, term89428.getClass(), "next", term89514);
        setIntField(term89428, term89428.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term89428;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term89342, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


