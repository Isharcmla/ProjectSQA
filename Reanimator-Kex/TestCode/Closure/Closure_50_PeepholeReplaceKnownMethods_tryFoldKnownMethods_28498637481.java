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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_28498637481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21727;
     Object term21819;
     Object term22063;
     Object term22064;
     Object term22047;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_28498637481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21727 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term21819 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term21819, term21819.getClass(), "first", null);
        term22063 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term22063, term22063.getClass(), "currentTraversal", null);
        term22064 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term22064, term22064.getClass(), "number", 0.0);
        setIntField(term22064, term22064.getClass(), "type", 0);
        setField(term22064, term22064.getClass(), "next", null);
        setField(term22064, term22064.getClass(), "first", null);
        setField(term22064, term22064.getClass(), "last", null);
        setField(term22064, term22064.getClass(), "propListHead", null);
        setIntField(term22064, term22064.getClass(), "sourcePosition", 0);
        setField(term22064, term22064.getClass(), "jsType", null);
        setField(term22064, term22064.getClass(), "parent", null);
        term22047 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term22047, term22047.getClass(), "number", 0.0);
        setIntField(term22047, term22047.getClass(), "type", 0);
        setField(term22047, term22047.getClass(), "next", null);
        setField(term22047, term22047.getClass(), "first", null);
        setField(term22047, term22047.getClass(), "last", null);
        setField(term22047, term22047.getClass(), "propListHead", null);
        setIntField(term22047, term22047.getClass(), "sourcePosition", 0);
        setField(term22047, term22047.getClass(), "jsType", null);
        setField(term22047, term22047.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term21819;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term21727, args);
        assertTrue(recursiveEquals(term21727, term22063));
        assertTrue(recursiveEquals(term21819, term22064));
        assertTrue(recursiveEquals(retValue, term22047));
    }

};


