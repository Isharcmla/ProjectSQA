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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321456;
     Object term321542;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term321456 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term321542 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term321628 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term321720 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term321720, term321720.getClass(), "type", 39);
        setField(term321628, term321628.getClass(), "next", term321720);
        setIntField(term321628, term321628.getClass(), "type", 39);
        setField(term321542, term321542.getClass(), "first", term321628);
        setIntField(term321542, term321542.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term321542;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term321456, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


