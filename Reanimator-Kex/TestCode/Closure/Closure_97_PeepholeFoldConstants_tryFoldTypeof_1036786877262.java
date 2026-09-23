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

public class PeepholeFoldConstants_tryFoldTypeof_1036786877262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51695;
     Object term51765;
     Object term52095;
     Object term52096;
     Object term52076;

    public PeepholeFoldConstants_tryFoldTypeof_1036786877262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51695 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term51765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51765, term51765.getClass(), "type", 32);
        setField(term51765, term51765.getClass(), "first", term51765);
        term52095 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term52095, term52095.getClass(), "currentTraversal", null);
        term52096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52096, term52096.getClass(), "type", 32);
        setField(term52096, term52096.getClass(), "next", null);
        setField(term52096, term52096.getClass(), "first", term52096);
        setField(term52096, term52096.getClass(), "last", null);
        setField(term52096, term52096.getClass(), "propListHead", null);
        setIntField(term52096, term52096.getClass(), "sourcePosition", 0);
        setField(term52096, term52096.getClass(), "jsType", null);
        setField(term52096, term52096.getClass(), "parent", null);
        term52076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52076, term52076.getClass(), "type", 32);
        setField(term52076, term52076.getClass(), "next", null);
        setField(term52076, term52076.getClass(), "first", term52076);
        setField(term52076, term52076.getClass(), "last", null);
        setField(term52076, term52076.getClass(), "propListHead", null);
        setIntField(term52076, term52076.getClass(), "sourcePosition", 0);
        setField(term52076, term52076.getClass(), "jsType", null);
        setField(term52076, term52076.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term51765;
        Object retValue = callMethod(klass, "tryFoldTypeof", argTypes, term51695, args);
        assertTrue(recursiveEquals(term51695, term52095));
        assertTrue(recursiveEquals(term51765, term52096));
        assertTrue(recursiveEquals(retValue, term52076));
    }

};


