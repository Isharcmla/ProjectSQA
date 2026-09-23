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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term804608;
     Object term804700;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term804608 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term804700 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term804792 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term804884 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term804976 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term804884, term804884.getClass(), "type", 64);
        setField(term804792, term804792.getClass(), "next", term804884);
        setIntField(term804792, term804792.getClass(), "type", 94);
        setField(term804700, term804700.getClass(), "first", term804792);
        setIntField(term804700, term804700.getClass(), "type", 100);
        setIntField(term804976, term804976.getClass(), "type", 114);
        setField(term804700, term804700.getClass(), "parent", term804976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term804700;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term804608, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


