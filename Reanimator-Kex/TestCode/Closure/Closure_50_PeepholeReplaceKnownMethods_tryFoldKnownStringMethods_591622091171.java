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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45971;
     Object term46063;
     Object term46503;
     Object term46504;
     Object term46476;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45971 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term46063 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46155 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term46063, term46063.getClass(), "type", 37);
        setField(term46063, term46063.getClass(), "first", term46155);
        term46503 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term46503, term46503.getClass(), "currentTraversal", null);
        term46504 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46505 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term46504, term46504.getClass(), "number", 0.0);
        setIntField(term46504, term46504.getClass(), "type", 37);
        setField(term46504, term46504.getClass(), "next", null);
        setDoubleField(term46505, term46505.getClass(), "number", 0.0);
        setIntField(term46505, term46505.getClass(), "type", 0);
        setField(term46505, term46505.getClass(), "next", null);
        setField(term46505, term46505.getClass(), "first", null);
        setField(term46505, term46505.getClass(), "last", null);
        setField(term46505, term46505.getClass(), "propListHead", null);
        setIntField(term46505, term46505.getClass(), "sourcePosition", 0);
        setField(term46505, term46505.getClass(), "jsType", null);
        setField(term46505, term46505.getClass(), "parent", null);
        setField(term46504, term46504.getClass(), "first", term46505);
        setField(term46504, term46504.getClass(), "last", null);
        setField(term46504, term46504.getClass(), "propListHead", null);
        setIntField(term46504, term46504.getClass(), "sourcePosition", 0);
        setField(term46504, term46504.getClass(), "jsType", null);
        setField(term46504, term46504.getClass(), "parent", null);
        term46476 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46479 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term46476, term46476.getClass(), "number", 0.0);
        setIntField(term46476, term46476.getClass(), "type", 37);
        setField(term46476, term46476.getClass(), "next", null);
        setDoubleField(term46479, term46479.getClass(), "number", 0.0);
        setIntField(term46479, term46479.getClass(), "type", 0);
        setField(term46479, term46479.getClass(), "next", null);
        setField(term46479, term46479.getClass(), "first", null);
        setField(term46479, term46479.getClass(), "last", null);
        setField(term46479, term46479.getClass(), "propListHead", null);
        setIntField(term46479, term46479.getClass(), "sourcePosition", 0);
        setField(term46479, term46479.getClass(), "jsType", null);
        setField(term46479, term46479.getClass(), "parent", null);
        setField(term46476, term46476.getClass(), "first", term46479);
        setField(term46476, term46476.getClass(), "last", null);
        setField(term46476, term46476.getClass(), "propListHead", null);
        setIntField(term46476, term46476.getClass(), "sourcePosition", 0);
        setField(term46476, term46476.getClass(), "jsType", null);
        setField(term46476, term46476.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term46063;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term45971, args);
        assertTrue(recursiveEquals(term45971, term46503));
        assertTrue(recursiveEquals(term46063, term46504));
        assertTrue(recursiveEquals(retValue, term46476));
    }

};


