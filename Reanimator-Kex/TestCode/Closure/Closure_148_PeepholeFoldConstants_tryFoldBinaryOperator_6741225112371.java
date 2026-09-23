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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term657796;
     Object term657888;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term657796 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term657888 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term657980 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term658072 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term658164 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term658072, term658072.getClass(), "type", 63);
        setField(term657980, term657980.getClass(), "next", term658072);
        setIntField(term657980, term657980.getClass(), "type", 0);
        setField(term657888, term657888.getClass(), "first", term657980);
        setIntField(term657888, term657888.getClass(), "type", 101);
        setIntField(term658164, term658164.getClass(), "type", 113);
        setField(term657888, term657888.getClass(), "parent", term658164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term657888;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term657796, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


