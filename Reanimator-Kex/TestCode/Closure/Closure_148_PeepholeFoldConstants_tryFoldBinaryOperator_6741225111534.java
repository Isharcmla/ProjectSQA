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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384219;
     Object term384311;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term384219 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term384311 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term384397 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term384467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term384553 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term384397, term384397.getClass(), "next", term384467);
        setIntField(term384397, term384397.getClass(), "type", 47);
        setField(term384311, term384311.getClass(), "first", term384397);
        setIntField(term384311, term384311.getClass(), "type", 101);
        setField(term384311, term384311.getClass(), "parent", term384553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term384311;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term384219, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


