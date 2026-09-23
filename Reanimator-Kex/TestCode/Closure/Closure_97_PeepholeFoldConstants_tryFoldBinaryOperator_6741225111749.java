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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term686873;
     Object term686965;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term686873 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term686965 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term687051 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term687121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term687121, term687121.getClass(), "type", 39);
        setField(term687051, term687051.getClass(), "next", term687121);
        setIntField(term687051, term687051.getClass(), "type", 39);
        setField(term686965, term686965.getClass(), "first", term687051);
        setIntField(term686965, term686965.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term686965;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term686873, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


