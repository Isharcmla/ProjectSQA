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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term695393;
     Object term695485;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term695393 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term695485 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term695577 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term695667 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term695667, term695667.getClass(), "type", 39);
        setField(term695577, term695577.getClass(), "next", term695667);
        setIntField(term695577, term695577.getClass(), "type", 39);
        setField(term695485, term695485.getClass(), "first", term695577);
        setIntField(term695485, term695485.getClass(), "type", 11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term695485;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term695393, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


