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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39143;
     Object term39213;
     Object term39478;
     Object term39479;
     Object term39441;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39143 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term39213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term39213, term39213.getClass(), "first", term39213);
        setField(term39213, term39213.getClass(), "next", term39213);
        setIntField(term39213, term39213.getClass(), "type", 23);
        term39478 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term39478, term39478.getClass(), "currentTraversal", null);
        term39479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39479, term39479.getClass(), "type", 23);
        setField(term39479, term39479.getClass(), "next", term39479);
        setField(term39479, term39479.getClass(), "first", term39479);
        setField(term39479, term39479.getClass(), "last", null);
        setField(term39479, term39479.getClass(), "propListHead", null);
        setIntField(term39479, term39479.getClass(), "sourcePosition", 0);
        setField(term39479, term39479.getClass(), "jsType", null);
        setField(term39479, term39479.getClass(), "parent", null);
        term39441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39441, term39441.getClass(), "type", 23);
        setField(term39441, term39441.getClass(), "next", term39441);
        setField(term39441, term39441.getClass(), "first", term39441);
        setField(term39441, term39441.getClass(), "last", null);
        setField(term39441, term39441.getClass(), "propListHead", null);
        setIntField(term39441, term39441.getClass(), "sourcePosition", 0);
        setField(term39441, term39441.getClass(), "jsType", null);
        setField(term39441, term39441.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term39213;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term39143, args);
        assertTrue(recursiveEquals(term39143, term39478));
        assertTrue(recursiveEquals(term39213, term39479));
        assertTrue(recursiveEquals(retValue, term39441));
    }

};


