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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term752658;
     Object term752750;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term752658 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term752750 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term752840 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term752932 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term753024 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term752932, term752932.getClass(), "type", 47);
        setField(term752840, term752840.getClass(), "next", term752932);
        setIntField(term752840, term752840.getClass(), "type", 0);
        setField(term752750, term752750.getClass(), "first", term752840);
        setIntField(term752750, term752750.getClass(), "type", 101);
        setIntField(term753024, term753024.getClass(), "type", 108);
        setField(term752750, term752750.getClass(), "parent", term753024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term752750;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term752658, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


