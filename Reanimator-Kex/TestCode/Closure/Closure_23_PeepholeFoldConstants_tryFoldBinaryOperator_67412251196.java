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

public class PeepholeFoldConstants_tryFoldBinaryOperator_67412251196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12663;
     Object term12733;
     Object term12954;
     Object term12955;
     Object term12929;

    public PeepholeFoldConstants_tryFoldBinaryOperator_67412251196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12663 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term12733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term12733, term12733.getClass(), "first", term12733);
        setField(term12733, term12733.getClass(), "next", term12733);
        setIntField(term12733, term12733.getClass(), "type", 95);
        term12954 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term12954, term12954.getClass(), "late", false);
        setField(term12954, term12954.getClass(), "compiler", null);
        term12955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12955, term12955.getClass(), "type", 95);
        setField(term12955, term12955.getClass(), "next", term12955);
        setField(term12955, term12955.getClass(), "first", term12955);
        setField(term12955, term12955.getClass(), "last", null);
        setField(term12955, term12955.getClass(), "propListHead", null);
        setIntField(term12955, term12955.getClass(), "sourcePosition", 0);
        setField(term12955, term12955.getClass(), "jsType", null);
        setField(term12955, term12955.getClass(), "parent", null);
        term12929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12929, term12929.getClass(), "type", 95);
        setField(term12929, term12929.getClass(), "next", term12929);
        setField(term12929, term12929.getClass(), "first", term12929);
        setField(term12929, term12929.getClass(), "last", null);
        setField(term12929, term12929.getClass(), "propListHead", null);
        setIntField(term12929, term12929.getClass(), "sourcePosition", 0);
        setField(term12929, term12929.getClass(), "jsType", null);
        setField(term12929, term12929.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12733;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term12663, args);
        assertTrue(recursiveEquals(term12663, term12954));
        assertTrue(recursiveEquals(term12733, term12955));
        assertTrue(recursiveEquals(retValue, term12929));
    }

};


