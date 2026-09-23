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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416063;
     Object term416155;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term416063 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term416155 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term416245 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term416337 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term416337, term416337.getClass(), "type", 63);
        setField(term416245, term416245.getClass(), "next", term416337);
        setIntField(term416245, term416245.getClass(), "type", 0);
        setField(term416155, term416155.getClass(), "first", term416245);
        setIntField(term416155, term416155.getClass(), "type", 101);
        setField(term416155, term416155.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term416155;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term416063, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


