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

public class PeepholeFoldConstants_tryFoldKnownMethods_889469083163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31653;
     Object term31723;
     Object term32091;
     Object term32092;
     Object term32078;

    public PeepholeFoldConstants_tryFoldKnownMethods_889469083163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31653 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term31723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term31723, term31723.getClass(), "first", null);
        term32091 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term32091, term32091.getClass(), "currentTraversal", null);
        term32092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32092, term32092.getClass(), "type", 0);
        setField(term32092, term32092.getClass(), "next", null);
        setField(term32092, term32092.getClass(), "first", null);
        setField(term32092, term32092.getClass(), "last", null);
        setField(term32092, term32092.getClass(), "propListHead", null);
        setIntField(term32092, term32092.getClass(), "sourcePosition", 0);
        setField(term32092, term32092.getClass(), "jsType", null);
        setField(term32092, term32092.getClass(), "parent", null);
        term32078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32078, term32078.getClass(), "type", 0);
        setField(term32078, term32078.getClass(), "next", null);
        setField(term32078, term32078.getClass(), "first", null);
        setField(term32078, term32078.getClass(), "last", null);
        setField(term32078, term32078.getClass(), "propListHead", null);
        setIntField(term32078, term32078.getClass(), "sourcePosition", 0);
        setField(term32078, term32078.getClass(), "jsType", null);
        setField(term32078, term32078.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term31723;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term31653, args);
        assertTrue(recursiveEquals(term31653, term32091));
        assertTrue(recursiveEquals(term31723, term32092));
        assertTrue(recursiveEquals(retValue, term32078));
    }

};


