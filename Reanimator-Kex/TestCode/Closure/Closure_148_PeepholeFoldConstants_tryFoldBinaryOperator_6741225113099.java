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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term916363;
     Object term916455;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term916363 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term916455 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term916541 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term916633 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term916633, term916633.getClass(), "type", 63);
        setField(term916541, term916541.getClass(), "next", term916633);
        setIntField(term916541, term916541.getClass(), "type", 0);
        setField(term916455, term916455.getClass(), "first", term916541);
        setIntField(term916455, term916455.getClass(), "type", 101);
        setField(term916455, term916455.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term916455;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term916363, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


