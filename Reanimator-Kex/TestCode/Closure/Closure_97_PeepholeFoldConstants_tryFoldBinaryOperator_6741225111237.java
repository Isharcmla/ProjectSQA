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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399565;
     Object term399657;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term399565 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term399657 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term399749 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term399835 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term399835, term399835.getClass(), "type", 39);
        setField(term399749, term399749.getClass(), "next", term399835);
        setIntField(term399749, term399749.getClass(), "type", 39);
        setField(term399657, term399657.getClass(), "first", term399749);
        setIntField(term399657, term399657.getClass(), "type", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term399657;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term399565, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


