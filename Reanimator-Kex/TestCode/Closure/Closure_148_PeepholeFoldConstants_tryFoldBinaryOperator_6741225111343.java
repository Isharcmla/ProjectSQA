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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325602;
     Object term325694;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term325602 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term325694 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term325780 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term325850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term325850, term325850.getClass(), "type", 47);
        setField(term325780, term325780.getClass(), "next", term325850);
        setIntField(term325780, term325780.getClass(), "type", 0);
        setField(term325694, term325694.getClass(), "first", term325780);
        setIntField(term325694, term325694.getClass(), "type", 101);
        setField(term325694, term325694.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term325694;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term325602, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


