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
import java.lang.Object;

public class ReferenceCollectingCallback_isBlockBoundary_6846987211050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267840;
     Object term267932;
     Object term268588;
     Object term268590;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267840 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term267932 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term268024 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term267932, term267932.getClass(), "type", 101);
        setField(term267932, term267932.getClass(), "first", term268024);
        term268588 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term268589 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term268588, term268588.getClass(), "number", 0.0);
        setIntField(term268588, term268588.getClass(), "type", 101);
        setField(term268588, term268588.getClass(), "next", null);
        setDoubleField(term268589, term268589.getClass(), "number", 0.0);
        setIntField(term268589, term268589.getClass(), "type", 0);
        setField(term268589, term268589.getClass(), "next", null);
        setField(term268589, term268589.getClass(), "first", null);
        setField(term268589, term268589.getClass(), "last", null);
        setField(term268589, term268589.getClass(), "propListHead", null);
        setIntField(term268589, term268589.getClass(), "sourcePosition", 0);
        setField(term268589, term268589.getClass(), "jsType", null);
        setField(term268589, term268589.getClass(), "parent", null);
        setField(term268588, term268588.getClass(), "first", term268589);
        setField(term268588, term268588.getClass(), "last", null);
        setField(term268588, term268588.getClass(), "propListHead", null);
        setIntField(term268588, term268588.getClass(), "sourcePosition", 0);
        setField(term268588, term268588.getClass(), "jsType", null);
        setField(term268588, term268588.getClass(), "parent", null);
        term268590 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term268590, term268590.getClass(), "number", 0.0);
        setIntField(term268590, term268590.getClass(), "type", 0);
        setField(term268590, term268590.getClass(), "next", null);
        setField(term268590, term268590.getClass(), "first", null);
        setField(term268590, term268590.getClass(), "last", null);
        setField(term268590, term268590.getClass(), "propListHead", null);
        setIntField(term268590, term268590.getClass(), "sourcePosition", 0);
        setField(term268590, term268590.getClass(), "jsType", null);
        setField(term268590, term268590.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term267840;
        args[1] = term267932;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term267840, term268588));
        assertTrue(recursiveEquals(term267932, term268590));
        assertTrue(recursiveEquals(retValue, true));
    }

};


