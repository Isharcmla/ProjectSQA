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

public class PeepholeFoldConstants_optimizeSubtree_160650699385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9995;
     Object term10065;
     Object term11400;
     Object term11401;
     Object term11390;

    public PeepholeFoldConstants_optimizeSubtree_160650699385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9995 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term10065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10065, term10065.getClass(), "type", 51);
        term11400 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term11400, term11400.getClass(), "late", false);
        setField(term11400, term11400.getClass(), "compiler", null);
        term11401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11401, term11401.getClass(), "type", 51);
        setField(term11401, term11401.getClass(), "next", null);
        setField(term11401, term11401.getClass(), "first", null);
        setField(term11401, term11401.getClass(), "last", null);
        setField(term11401, term11401.getClass(), "propListHead", null);
        setIntField(term11401, term11401.getClass(), "sourcePosition", 0);
        setField(term11401, term11401.getClass(), "jsType", null);
        setField(term11401, term11401.getClass(), "parent", null);
        term11390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11390, term11390.getClass(), "type", 51);
        setField(term11390, term11390.getClass(), "next", null);
        setField(term11390, term11390.getClass(), "first", null);
        setField(term11390, term11390.getClass(), "last", null);
        setField(term11390, term11390.getClass(), "propListHead", null);
        setIntField(term11390, term11390.getClass(), "sourcePosition", 0);
        setField(term11390, term11390.getClass(), "jsType", null);
        setField(term11390, term11390.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term10065;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term9995, args);
        assertTrue(recursiveEquals(term9995, term11400));
        assertTrue(recursiveEquals(term10065, term11401));
        assertTrue(recursiveEquals(retValue, term11390));
    }

};


