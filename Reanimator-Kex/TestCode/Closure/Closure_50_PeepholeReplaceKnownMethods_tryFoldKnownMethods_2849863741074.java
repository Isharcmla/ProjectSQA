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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4506261;
     Object term4506353;
     Object term4507110;
     Object term4507111;
     Object term4506817;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4506261 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4506353 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4506445 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4506537 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4506629 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4506759 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term4506445, term4506445.getClass(), "type", 35);
        setIntField(term4506629, term4506629.getClass(), "type", 40);
        setField(term4506629, term4506629.getClass(), "str", "substring");
        setField(term4506537, term4506537.getClass(), "next", term4506629);
        setIntField(term4506537, term4506537.getClass(), "type", 40);
        setField(term4506445, term4506445.getClass(), "first", term4506537);
        setIntField(term4506759, term4506759.getClass(), "type", 43);
        setField(term4506445, term4506445.getClass(), "next", term4506759);
        setField(term4506353, term4506353.getClass(), "first", term4506445);
        setIntField(term4506353, term4506353.getClass(), "type", 37);
        term4507110 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4507110, term4507110.getClass(), "currentTraversal", null);
        term4507111 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4507112 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4507113 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4507114 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4507115 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4507111, term4507111.getClass(), "str", null);
        setIntField(term4507111, term4507111.getClass(), "type", 37);
        setField(term4507111, term4507111.getClass(), "next", null);
        setField(term4507112, term4507112.getClass(), "str", null);
        setIntField(term4507112, term4507112.getClass(), "type", 35);
        setDoubleField(term4507113, term4507113.getClass(), "number", 0.0);
        setIntField(term4507113, term4507113.getClass(), "type", 43);
        setField(term4507113, term4507113.getClass(), "next", null);
        setField(term4507113, term4507113.getClass(), "first", null);
        setField(term4507113, term4507113.getClass(), "last", null);
        setField(term4507113, term4507113.getClass(), "propListHead", null);
        setIntField(term4507113, term4507113.getClass(), "sourcePosition", 0);
        setField(term4507113, term4507113.getClass(), "jsType", null);
        setField(term4507113, term4507113.getClass(), "parent", null);
        setField(term4507112, term4507112.getClass(), "next", term4507113);
        setField(term4507114, term4507114.getClass(), "str", null);
        setIntField(term4507114, term4507114.getClass(), "type", 40);
        setField(term4507115, term4507115.getClass(), "str", "");
        setIntField(term4507115, term4507115.getClass(), "type", 40);
        setField(term4507115, term4507115.getClass(), "next", null);
        setField(term4507115, term4507115.getClass(), "first", null);
        setField(term4507115, term4507115.getClass(), "last", null);
        setField(term4507115, term4507115.getClass(), "propListHead", null);
        setIntField(term4507115, term4507115.getClass(), "sourcePosition", 0);
        setField(term4507115, term4507115.getClass(), "jsType", null);
        setField(term4507115, term4507115.getClass(), "parent", null);
        setField(term4507114, term4507114.getClass(), "next", term4507115);
        setField(term4507114, term4507114.getClass(), "first", null);
        setField(term4507114, term4507114.getClass(), "last", null);
        setField(term4507114, term4507114.getClass(), "propListHead", null);
        setIntField(term4507114, term4507114.getClass(), "sourcePosition", 0);
        setField(term4507114, term4507114.getClass(), "jsType", null);
        setField(term4507114, term4507114.getClass(), "parent", null);
        setField(term4507112, term4507112.getClass(), "first", term4507114);
        setField(term4507112, term4507112.getClass(), "last", null);
        setField(term4507112, term4507112.getClass(), "propListHead", null);
        setIntField(term4507112, term4507112.getClass(), "sourcePosition", 0);
        setField(term4507112, term4507112.getClass(), "jsType", null);
        setField(term4507112, term4507112.getClass(), "parent", null);
        setField(term4507111, term4507111.getClass(), "first", term4507112);
        setField(term4507111, term4507111.getClass(), "last", null);
        setField(term4507111, term4507111.getClass(), "propListHead", null);
        setIntField(term4507111, term4507111.getClass(), "sourcePosition", 0);
        setField(term4507111, term4507111.getClass(), "jsType", null);
        setField(term4507111, term4507111.getClass(), "parent", null);
        term4506817 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4506819 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4506821 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4506825 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4506827 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4506817, term4506817.getClass(), "str", null);
        setIntField(term4506817, term4506817.getClass(), "type", 37);
        setField(term4506817, term4506817.getClass(), "next", null);
        setField(term4506819, term4506819.getClass(), "str", null);
        setIntField(term4506819, term4506819.getClass(), "type", 35);
        setDoubleField(term4506821, term4506821.getClass(), "number", 0.0);
        setIntField(term4506821, term4506821.getClass(), "type", 43);
        setField(term4506821, term4506821.getClass(), "next", null);
        setField(term4506821, term4506821.getClass(), "first", null);
        setField(term4506821, term4506821.getClass(), "last", null);
        setField(term4506821, term4506821.getClass(), "propListHead", null);
        setIntField(term4506821, term4506821.getClass(), "sourcePosition", 0);
        setField(term4506821, term4506821.getClass(), "jsType", null);
        setField(term4506821, term4506821.getClass(), "parent", null);
        setField(term4506819, term4506819.getClass(), "next", term4506821);
        setField(term4506825, term4506825.getClass(), "str", null);
        setIntField(term4506825, term4506825.getClass(), "type", 40);
        setField(term4506827, term4506827.getClass(), "str", "");
        setIntField(term4506827, term4506827.getClass(), "type", 40);
        setField(term4506827, term4506827.getClass(), "next", null);
        setField(term4506827, term4506827.getClass(), "first", null);
        setField(term4506827, term4506827.getClass(), "last", null);
        setField(term4506827, term4506827.getClass(), "propListHead", null);
        setIntField(term4506827, term4506827.getClass(), "sourcePosition", 0);
        setField(term4506827, term4506827.getClass(), "jsType", null);
        setField(term4506827, term4506827.getClass(), "parent", null);
        setField(term4506825, term4506825.getClass(), "next", term4506827);
        setField(term4506825, term4506825.getClass(), "first", null);
        setField(term4506825, term4506825.getClass(), "last", null);
        setField(term4506825, term4506825.getClass(), "propListHead", null);
        setIntField(term4506825, term4506825.getClass(), "sourcePosition", 0);
        setField(term4506825, term4506825.getClass(), "jsType", null);
        setField(term4506825, term4506825.getClass(), "parent", null);
        setField(term4506819, term4506819.getClass(), "first", term4506825);
        setField(term4506819, term4506819.getClass(), "last", null);
        setField(term4506819, term4506819.getClass(), "propListHead", null);
        setIntField(term4506819, term4506819.getClass(), "sourcePosition", 0);
        setField(term4506819, term4506819.getClass(), "jsType", null);
        setField(term4506819, term4506819.getClass(), "parent", null);
        setField(term4506817, term4506817.getClass(), "first", term4506819);
        setField(term4506817, term4506817.getClass(), "last", null);
        setField(term4506817, term4506817.getClass(), "propListHead", null);
        setIntField(term4506817, term4506817.getClass(), "sourcePosition", 0);
        setField(term4506817, term4506817.getClass(), "jsType", null);
        setField(term4506817, term4506817.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4506353;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term4506261, args);
        assertTrue(recursiveEquals(term4506261, term4507110));
        assertTrue(recursiveEquals(term4506353, term4507111));
        assertTrue(recursiveEquals(retValue, term4506817));
    }

};


