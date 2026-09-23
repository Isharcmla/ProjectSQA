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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term683125;
     Object term683217;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term683125 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term683217 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term683309 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term683401 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term683401, term683401.getClass(), "type", 39);
        setField(term683309, term683309.getClass(), "next", term683401);
        setIntField(term683309, term683309.getClass(), "type", 39);
        setField(term683217, term683217.getClass(), "first", term683309);
        setIntField(term683217, term683217.getClass(), "type", 19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term683217;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term683125, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


