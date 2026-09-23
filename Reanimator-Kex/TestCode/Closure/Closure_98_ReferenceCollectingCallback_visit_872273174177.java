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

public class ReferenceCollectingCallback_visit_872273174177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42842;
     Object term43072;
     Object term43026;
     Object term43477;
     Object term43478;
     Object term43479;

    public ReferenceCollectingCallback_visit_872273174177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42842 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term43072 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term43072, term43072.getClass(), "type", 0);
        term43026 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term43026, term43026.getClass(), "type", 100);
        setField(term43026, term43026.getClass(), "first", term43072);
        term43477 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term43477, term43477.getClass(), "referenceMap", null);
        setField(term43477, term43477.getClass(), "blockStack", null);
        setField(term43477, term43477.getClass(), "behavior", null);
        setField(term43477, term43477.getClass(), "compiler", null);
        setField(term43477, term43477.getClass(), "varFilter", null);
        term43478 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term43478, term43478.getClass(), "str", null);
        setIntField(term43478, term43478.getClass(), "type", 0);
        setField(term43478, term43478.getClass(), "next", null);
        setField(term43478, term43478.getClass(), "first", null);
        setField(term43478, term43478.getClass(), "last", null);
        setField(term43478, term43478.getClass(), "propListHead", null);
        setIntField(term43478, term43478.getClass(), "sourcePosition", 0);
        setField(term43478, term43478.getClass(), "jsType", null);
        setField(term43478, term43478.getClass(), "parent", null);
        term43479 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term43480 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term43479, term43479.getClass(), "number", 0.0);
        setIntField(term43479, term43479.getClass(), "type", 100);
        setField(term43479, term43479.getClass(), "next", null);
        setField(term43480, term43480.getClass(), "str", null);
        setIntField(term43480, term43480.getClass(), "type", 0);
        setField(term43480, term43480.getClass(), "next", null);
        setField(term43480, term43480.getClass(), "first", null);
        setField(term43480, term43480.getClass(), "last", null);
        setField(term43480, term43480.getClass(), "propListHead", null);
        setIntField(term43480, term43480.getClass(), "sourcePosition", 0);
        setField(term43480, term43480.getClass(), "jsType", null);
        setField(term43480, term43480.getClass(), "parent", null);
        setField(term43479, term43479.getClass(), "first", term43480);
        setField(term43479, term43479.getClass(), "last", null);
        setField(term43479, term43479.getClass(), "propListHead", null);
        setIntField(term43479, term43479.getClass(), "sourcePosition", 0);
        setField(term43479, term43479.getClass(), "jsType", null);
        setField(term43479, term43479.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term43072;
        args[2] = term43026;
        callMethod(klass, "visit", argTypes, term42842, args);
        assertTrue(recursiveEquals(term42842, term43477));
        assertTrue(recursiveEquals(term43072, term43479));
        assertTrue(recursiveEquals(term43026, null));
    }

};


