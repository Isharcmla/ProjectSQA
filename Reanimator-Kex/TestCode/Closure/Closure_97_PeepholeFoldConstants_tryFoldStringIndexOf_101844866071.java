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

public class PeepholeFoldConstants_tryFoldStringIndexOf_101844866071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12025;
     Object term12095;
     Object term12553;
     Object term12554;
     Object term12545;

    public PeepholeFoldConstants_tryFoldStringIndexOf_101844866071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12025 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term12095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12095, term12095.getClass(), "type", 37);
        term12553 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term12553, term12553.getClass(), "currentTraversal", null);
        term12554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12554, term12554.getClass(), "type", 37);
        setField(term12554, term12554.getClass(), "next", null);
        setField(term12554, term12554.getClass(), "first", null);
        setField(term12554, term12554.getClass(), "last", null);
        setField(term12554, term12554.getClass(), "propListHead", null);
        setIntField(term12554, term12554.getClass(), "sourcePosition", 0);
        setField(term12554, term12554.getClass(), "jsType", null);
        setField(term12554, term12554.getClass(), "parent", null);
        term12545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12545, term12545.getClass(), "type", 37);
        setField(term12545, term12545.getClass(), "next", null);
        setField(term12545, term12545.getClass(), "first", null);
        setField(term12545, term12545.getClass(), "last", null);
        setField(term12545, term12545.getClass(), "propListHead", null);
        setIntField(term12545, term12545.getClass(), "sourcePosition", 0);
        setField(term12545, term12545.getClass(), "jsType", null);
        setField(term12545, term12545.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12095;
        Object retValue = callMethod(klass, "tryFoldStringIndexOf", argTypes, term12025, args);
        assertTrue(recursiveEquals(term12025, term12553));
        assertTrue(recursiveEquals(term12095, term12554));
        assertTrue(recursiveEquals(retValue, term12545));
    }

};


