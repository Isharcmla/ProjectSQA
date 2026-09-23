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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357451;
     Object term357521;
     Object term357547;
     Object term357548;
     Object term357525;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357451 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term357521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term357521, term357521.getClass(), "first", term357521);
        setField(term357521, term357521.getClass(), "next", term357521);
        setIntField(term357521, term357521.getClass(), "type", 45);
        term357547 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term357547, term357547.getClass(), "currentTraversal", null);
        term357548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term357548, term357548.getClass(), "type", 45);
        setField(term357548, term357548.getClass(), "next", term357548);
        setField(term357548, term357548.getClass(), "first", term357548);
        setField(term357548, term357548.getClass(), "last", null);
        setField(term357548, term357548.getClass(), "propListHead", null);
        setIntField(term357548, term357548.getClass(), "sourcePosition", 0);
        setField(term357548, term357548.getClass(), "jsType", null);
        setField(term357548, term357548.getClass(), "parent", null);
        term357525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term357525, term357525.getClass(), "type", 45);
        setField(term357525, term357525.getClass(), "next", term357525);
        setField(term357525, term357525.getClass(), "first", term357525);
        setField(term357525, term357525.getClass(), "last", null);
        setField(term357525, term357525.getClass(), "propListHead", null);
        setIntField(term357525, term357525.getClass(), "sourcePosition", 0);
        setField(term357525, term357525.getClass(), "jsType", null);
        setField(term357525, term357525.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term357521;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term357451, args);
        assertTrue(recursiveEquals(term357451, term357547));
        assertTrue(recursiveEquals(term357521, term357548));
        assertTrue(recursiveEquals(retValue, term357525));
    }

};


