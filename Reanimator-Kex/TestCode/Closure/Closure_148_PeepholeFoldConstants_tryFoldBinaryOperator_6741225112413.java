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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term671807;
     Object term671899;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term671807 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term671899 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term671991 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term672081 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term672081, term672081.getClass(), "type", 39);
        setField(term671991, term671991.getClass(), "next", term672081);
        setIntField(term671991, term671991.getClass(), "type", 63);
        setField(term671899, term671899.getClass(), "first", term671991);
        setIntField(term671899, term671899.getClass(), "type", 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term671899;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term671807, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


