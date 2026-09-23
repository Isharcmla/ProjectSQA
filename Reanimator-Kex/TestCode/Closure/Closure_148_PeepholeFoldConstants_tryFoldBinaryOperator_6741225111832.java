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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term479897;
     Object term479989;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term479897 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term479989 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term480081 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term480167 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term480167, term480167.getClass(), "type", 64);
        setField(term480081, term480081.getClass(), "next", term480167);
        setIntField(term480081, term480081.getClass(), "type", 0);
        setField(term479989, term479989.getClass(), "first", term480081);
        setIntField(term479989, term479989.getClass(), "type", 101);
        setField(term479989, term479989.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term479989;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term479897, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


