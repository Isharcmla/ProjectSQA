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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25557;
     Object term25627;
     Object term25879;
     Object term25880;
     Object term25857;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25557 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term25627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term25627, term25627.getClass(), "first", term25627);
        setField(term25627, term25627.getClass(), "next", term25627);
        setIntField(term25627, term25627.getClass(), "type", 17);
        term25879 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term25879, term25879.getClass(), "currentTraversal", null);
        term25880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25880, term25880.getClass(), "type", 17);
        setField(term25880, term25880.getClass(), "next", term25880);
        setField(term25880, term25880.getClass(), "first", term25880);
        setField(term25880, term25880.getClass(), "last", null);
        setField(term25880, term25880.getClass(), "propListHead", null);
        setIntField(term25880, term25880.getClass(), "sourcePosition", 0);
        setField(term25880, term25880.getClass(), "jsType", null);
        setField(term25880, term25880.getClass(), "parent", null);
        term25857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25857, term25857.getClass(), "type", 17);
        setField(term25857, term25857.getClass(), "next", term25857);
        setField(term25857, term25857.getClass(), "first", term25857);
        setField(term25857, term25857.getClass(), "last", null);
        setField(term25857, term25857.getClass(), "propListHead", null);
        setIntField(term25857, term25857.getClass(), "sourcePosition", 0);
        setField(term25857, term25857.getClass(), "jsType", null);
        setField(term25857, term25857.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term25627;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term25557, args);
        assertTrue(recursiveEquals(term25557, term25879));
        assertTrue(recursiveEquals(term25627, term25880));
        assertTrue(recursiveEquals(retValue, term25857));
    }

};


