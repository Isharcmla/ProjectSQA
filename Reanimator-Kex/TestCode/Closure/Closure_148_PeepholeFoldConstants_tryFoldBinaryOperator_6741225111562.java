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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393648;
     Object term393740;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term393648 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term393740 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term393826 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term393826, term393826.getClass(), "next", term393826);
        setIntField(term393826, term393826.getClass(), "type", 63);
        setField(term393740, term393740.getClass(), "first", term393826);
        setIntField(term393740, term393740.getClass(), "type", 101);
        setField(term393740, term393740.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term393740;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term393648, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


