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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336859;
     Object term336951;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term336859 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term336951 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term337043 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term337133 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term337133, term337133.getClass(), "type", 39);
        setField(term337043, term337043.getClass(), "next", term337133);
        setIntField(term337043, term337043.getClass(), "type", 39);
        setField(term336951, term336951.getClass(), "first", term337043);
        setIntField(term336951, term336951.getClass(), "type", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term336951;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term336859, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


