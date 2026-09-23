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

public class PeepholeFoldConstants_tryFoldBinaryOperator_67412251184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9805;
     Object term9875;
     Object term11387;
     Object term11388;
     Object term11346;

    public PeepholeFoldConstants_tryFoldBinaryOperator_67412251184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9805 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term9875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term9875, term9875.getClass(), "first", term9875);
        setField(term9875, term9875.getClass(), "next", term9875);
        setIntField(term9875, term9875.getClass(), "type", 14);
        term11387 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term11387, term11387.getClass(), "late", false);
        setField(term11387, term11387.getClass(), "compiler", null);
        term11388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11388, term11388.getClass(), "type", 14);
        setField(term11388, term11388.getClass(), "next", term11388);
        setField(term11388, term11388.getClass(), "first", term11388);
        setField(term11388, term11388.getClass(), "last", null);
        setField(term11388, term11388.getClass(), "propListHead", null);
        setIntField(term11388, term11388.getClass(), "sourcePosition", 0);
        setField(term11388, term11388.getClass(), "jsType", null);
        setField(term11388, term11388.getClass(), "parent", null);
        term11346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11346, term11346.getClass(), "type", 14);
        setField(term11346, term11346.getClass(), "next", term11346);
        setField(term11346, term11346.getClass(), "first", term11346);
        setField(term11346, term11346.getClass(), "last", null);
        setField(term11346, term11346.getClass(), "propListHead", null);
        setIntField(term11346, term11346.getClass(), "sourcePosition", 0);
        setField(term11346, term11346.getClass(), "jsType", null);
        setField(term11346, term11346.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term9875;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term9805, args);
        assertTrue(recursiveEquals(term9805, term11387));
        assertTrue(recursiveEquals(term9875, term11388));
        assertTrue(recursiveEquals(retValue, term11346));
    }

};


