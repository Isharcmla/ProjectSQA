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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term498281;
     Object term498367;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term498281 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term498367 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term498453 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term498545 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term498545, term498545.getClass(), "type", 39);
        setField(term498453, term498453.getClass(), "next", term498545);
        setIntField(term498453, term498453.getClass(), "type", 39);
        setField(term498367, term498367.getClass(), "first", term498453);
        setIntField(term498367, term498367.getClass(), "type", 19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term498367;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term498281, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


