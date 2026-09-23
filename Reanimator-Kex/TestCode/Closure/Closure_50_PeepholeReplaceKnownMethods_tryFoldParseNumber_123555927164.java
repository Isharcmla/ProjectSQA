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

public class PeepholeReplaceKnownMethods_tryFoldParseNumber_123555927164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42743;
     Object term42813;
     Object term42921;
     Object term43073;
     Object term43074;
     Object term43075;
     Object term43039;

    public PeepholeReplaceKnownMethods_tryFoldParseNumber_123555927164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42743 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term42813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42813, term42813.getClass(), "type", 37);
        term42921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term42921, term42921.getClass(), "next", term42991);
        term43073 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term43073, term43073.getClass(), "currentTraversal", null);
        term43074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43074, term43074.getClass(), "type", 37);
        setField(term43074, term43074.getClass(), "next", null);
        setField(term43074, term43074.getClass(), "first", null);
        setField(term43074, term43074.getClass(), "last", null);
        setField(term43074, term43074.getClass(), "propListHead", null);
        setIntField(term43074, term43074.getClass(), "sourcePosition", 0);
        setField(term43074, term43074.getClass(), "jsType", null);
        setField(term43074, term43074.getClass(), "parent", null);
        term43075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43075, term43075.getClass(), "type", 0);
        setIntField(term43076, term43076.getClass(), "type", 0);
        setField(term43076, term43076.getClass(), "next", null);
        setField(term43076, term43076.getClass(), "first", null);
        setField(term43076, term43076.getClass(), "last", null);
        setField(term43076, term43076.getClass(), "propListHead", null);
        setIntField(term43076, term43076.getClass(), "sourcePosition", 0);
        setField(term43076, term43076.getClass(), "jsType", null);
        setField(term43076, term43076.getClass(), "parent", null);
        setField(term43075, term43075.getClass(), "next", term43076);
        setField(term43075, term43075.getClass(), "first", null);
        setField(term43075, term43075.getClass(), "last", null);
        setField(term43075, term43075.getClass(), "propListHead", null);
        setIntField(term43075, term43075.getClass(), "sourcePosition", 0);
        setField(term43075, term43075.getClass(), "jsType", null);
        setField(term43075, term43075.getClass(), "parent", null);
        term43039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43039, term43039.getClass(), "type", 37);
        setField(term43039, term43039.getClass(), "next", null);
        setField(term43039, term43039.getClass(), "first", null);
        setField(term43039, term43039.getClass(), "last", null);
        setField(term43039, term43039.getClass(), "propListHead", null);
        setIntField(term43039, term43039.getClass(), "sourcePosition", 0);
        setField(term43039, term43039.getClass(), "jsType", null);
        setField(term43039, term43039.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term42813;
        args[1] = "parseInt";
        args[2] = term42921;
        Object retValue = callMethod(klass, "tryFoldParseNumber", argTypes, term42743, args);
        assertTrue(recursiveEquals(term42743, term43073));
        assertTrue(recursiveEquals(term42813, term43074));
        assertTrue(recursiveEquals(term42921, "parseInt"));
        assertTrue(recursiveEquals(retValue, term43039));
    }

};


