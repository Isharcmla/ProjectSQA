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

public class PeepholeFoldConstants_tryFoldKnownMethods_889469083118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20389;
     Object term20459;
     Object term20540;
     Object term20541;
     Object term20516;

    public PeepholeFoldConstants_tryFoldKnownMethods_889469083118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20389 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term20459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term20459, term20459.getClass(), "first", term20459);
        setField(term20459, term20459.getClass(), "next", term20459);
        term20540 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term20540, term20540.getClass(), "currentTraversal", null);
        term20541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20541, term20541.getClass(), "type", 0);
        setField(term20541, term20541.getClass(), "next", term20541);
        setField(term20541, term20541.getClass(), "first", term20541);
        setField(term20541, term20541.getClass(), "last", null);
        setField(term20541, term20541.getClass(), "propListHead", null);
        setIntField(term20541, term20541.getClass(), "sourcePosition", 0);
        setField(term20541, term20541.getClass(), "jsType", null);
        setField(term20541, term20541.getClass(), "parent", null);
        term20516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20516, term20516.getClass(), "type", 0);
        setField(term20516, term20516.getClass(), "next", term20516);
        setField(term20516, term20516.getClass(), "first", term20516);
        setField(term20516, term20516.getClass(), "last", null);
        setField(term20516, term20516.getClass(), "propListHead", null);
        setIntField(term20516, term20516.getClass(), "sourcePosition", 0);
        setField(term20516, term20516.getClass(), "jsType", null);
        setField(term20516, term20516.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20459;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term20389, args);
        assertTrue(recursiveEquals(term20389, term20540));
        assertTrue(recursiveEquals(term20459, term20541));
        assertTrue(recursiveEquals(retValue, term20516));
    }

};


