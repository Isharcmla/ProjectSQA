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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326656;
     Object term326748;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326656 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term326748 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term326840 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term326932 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term326932, term326932.getClass(), "type", 39);
        setField(term326840, term326840.getClass(), "next", term326932);
        setIntField(term326840, term326840.getClass(), "type", 39);
        setField(term326748, term326748.getClass(), "first", term326840);
        setIntField(term326748, term326748.getClass(), "type", 24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term326748;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term326656, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


