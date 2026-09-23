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

public class PeepholeFoldConstants_tryFoldTypeof_1036786877167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32245;
     Object term32315;
     Object term32629;
     Object term32630;
     Object term32621;

    public PeepholeFoldConstants_tryFoldTypeof_1036786877167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32245 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term32315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32315, term32315.getClass(), "type", 32);
        term32629 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term32629, term32629.getClass(), "currentTraversal", null);
        term32630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32630, term32630.getClass(), "type", 32);
        setField(term32630, term32630.getClass(), "next", null);
        setField(term32630, term32630.getClass(), "first", null);
        setField(term32630, term32630.getClass(), "last", null);
        setField(term32630, term32630.getClass(), "propListHead", null);
        setIntField(term32630, term32630.getClass(), "sourcePosition", 0);
        setField(term32630, term32630.getClass(), "jsType", null);
        setField(term32630, term32630.getClass(), "parent", null);
        term32621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32621, term32621.getClass(), "type", 32);
        setField(term32621, term32621.getClass(), "next", null);
        setField(term32621, term32621.getClass(), "first", null);
        setField(term32621, term32621.getClass(), "last", null);
        setField(term32621, term32621.getClass(), "propListHead", null);
        setIntField(term32621, term32621.getClass(), "sourcePosition", 0);
        setField(term32621, term32621.getClass(), "jsType", null);
        setField(term32621, term32621.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term32315;
        Object retValue = callMethod(klass, "tryFoldTypeof", argTypes, term32245, args);
        assertTrue(recursiveEquals(term32245, term32629));
        assertTrue(recursiveEquals(term32315, term32630));
        assertTrue(recursiveEquals(retValue, term32621));
    }

};


