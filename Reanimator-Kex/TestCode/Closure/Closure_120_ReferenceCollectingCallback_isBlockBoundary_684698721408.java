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

public class ReferenceCollectingCallback_isBlockBoundary_684698721408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96776;
     Object term96868;
     Object term97274;
     Object term97276;

    public ReferenceCollectingCallback_isBlockBoundary_684698721408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96776 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term96868 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term96960 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term96868, term96868.getClass(), "type", 98);
        setField(term96868, term96868.getClass(), "first", term96960);
        term97274 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term97275 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term97274, term97274.getClass(), "number", 0.0);
        setIntField(term97274, term97274.getClass(), "type", 98);
        setField(term97274, term97274.getClass(), "next", null);
        setDoubleField(term97275, term97275.getClass(), "number", 0.0);
        setIntField(term97275, term97275.getClass(), "type", 0);
        setField(term97275, term97275.getClass(), "next", null);
        setField(term97275, term97275.getClass(), "first", null);
        setField(term97275, term97275.getClass(), "last", null);
        setField(term97275, term97275.getClass(), "propListHead", null);
        setIntField(term97275, term97275.getClass(), "sourcePosition", 0);
        setField(term97275, term97275.getClass(), "jsType", null);
        setField(term97275, term97275.getClass(), "parent", null);
        setField(term97274, term97274.getClass(), "first", term97275);
        setField(term97274, term97274.getClass(), "last", null);
        setField(term97274, term97274.getClass(), "propListHead", null);
        setIntField(term97274, term97274.getClass(), "sourcePosition", 0);
        setField(term97274, term97274.getClass(), "jsType", null);
        setField(term97274, term97274.getClass(), "parent", null);
        term97276 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term97276, term97276.getClass(), "number", 0.0);
        setIntField(term97276, term97276.getClass(), "type", 0);
        setField(term97276, term97276.getClass(), "next", null);
        setField(term97276, term97276.getClass(), "first", null);
        setField(term97276, term97276.getClass(), "last", null);
        setField(term97276, term97276.getClass(), "propListHead", null);
        setIntField(term97276, term97276.getClass(), "sourcePosition", 0);
        setField(term97276, term97276.getClass(), "jsType", null);
        setField(term97276, term97276.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term96776;
        args[1] = term96868;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term96776, term97274));
        assertTrue(recursiveEquals(term96868, term97276));
        assertTrue(recursiveEquals(retValue, true));
    }

};


