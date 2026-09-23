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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_28498637475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20523;
     Object term20615;
     Object term20834;
     Object term20835;
     Object term20818;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_28498637475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20523 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term20615 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term20834 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term20834, term20834.getClass(), "currentTraversal", null);
        term20835 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term20835, term20835.getClass(), "number", 0.0);
        setIntField(term20835, term20835.getClass(), "type", 0);
        setField(term20835, term20835.getClass(), "next", null);
        setField(term20835, term20835.getClass(), "first", null);
        setField(term20835, term20835.getClass(), "last", null);
        setField(term20835, term20835.getClass(), "propListHead", null);
        setIntField(term20835, term20835.getClass(), "sourcePosition", 0);
        setField(term20835, term20835.getClass(), "jsType", null);
        setField(term20835, term20835.getClass(), "parent", null);
        term20818 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term20818, term20818.getClass(), "number", 0.0);
        setIntField(term20818, term20818.getClass(), "type", 0);
        setField(term20818, term20818.getClass(), "next", null);
        setField(term20818, term20818.getClass(), "first", null);
        setField(term20818, term20818.getClass(), "last", null);
        setField(term20818, term20818.getClass(), "propListHead", null);
        setIntField(term20818, term20818.getClass(), "sourcePosition", 0);
        setField(term20818, term20818.getClass(), "jsType", null);
        setField(term20818, term20818.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20615;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term20523, args);
        assertTrue(recursiveEquals(term20523, term20834));
        assertTrue(recursiveEquals(term20615, term20835));
        assertTrue(recursiveEquals(retValue, term20818));
    }

};


