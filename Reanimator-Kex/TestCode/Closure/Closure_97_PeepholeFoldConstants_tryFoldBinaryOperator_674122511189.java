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
import static com.google.javascript.jscomp.EqualityUtils.*;

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36208;
     Object term36278;
     Object term36515;
     Object term36516;
     Object term36496;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36208 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term36278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term36278, term36278.getClass(), "first", term36278);
        setField(term36278, term36278.getClass(), "next", term36278);
        setIntField(term36278, term36278.getClass(), "type", 33);
        term36515 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term36515, term36515.getClass(), "currentTraversal", null);
        term36516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36516, term36516.getClass(), "type", 33);
        setField(term36516, term36516.getClass(), "next", term36516);
        setField(term36516, term36516.getClass(), "first", term36516);
        setField(term36516, term36516.getClass(), "last", null);
        setField(term36516, term36516.getClass(), "propListHead", null);
        setIntField(term36516, term36516.getClass(), "sourcePosition", 0);
        setField(term36516, term36516.getClass(), "jsType", null);
        setField(term36516, term36516.getClass(), "parent", null);
        term36496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36496, term36496.getClass(), "type", 33);
        setField(term36496, term36496.getClass(), "next", term36496);
        setField(term36496, term36496.getClass(), "first", term36496);
        setField(term36496, term36496.getClass(), "last", null);
        setField(term36496, term36496.getClass(), "propListHead", null);
        setIntField(term36496, term36496.getClass(), "sourcePosition", 0);
        setField(term36496, term36496.getClass(), "jsType", null);
        setField(term36496, term36496.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term36278;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term36208, args);
        assertTrue(recursiveEquals(term36208, term36515));
        assertTrue(recursiveEquals(term36278, term36516));
        assertTrue(recursiveEquals(retValue, term36496));
    }

};


