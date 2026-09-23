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

public class PeepholeFoldConstants_tryFoldComparison_848443179790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228252;
     Object term228344;
     Object term228436;
     Object term228528;
     Object term228558;
     Object term228559;
     Object term228560;
     Object term228561;
     Object term228538;

    public PeepholeFoldConstants_tryFoldComparison_848443179790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228252 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term228344 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term228344, term228344.getClass(), "type", 14);
        term228436 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term228436, term228436.getClass(), "type", 14);
        term228528 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term228558 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term228558, term228558.getClass(), "currentTraversal", null);
        term228559 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term228559, term228559.getClass(), "str", null);
        setIntField(term228559, term228559.getClass(), "type", 14);
        setField(term228559, term228559.getClass(), "next", null);
        setField(term228559, term228559.getClass(), "first", null);
        setField(term228559, term228559.getClass(), "last", null);
        setField(term228559, term228559.getClass(), "propListHead", null);
        setIntField(term228559, term228559.getClass(), "sourcePosition", 0);
        setField(term228559, term228559.getClass(), "jsType", null);
        setField(term228559, term228559.getClass(), "parent", null);
        term228560 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term228560, term228560.getClass(), "str", null);
        setIntField(term228560, term228560.getClass(), "type", 14);
        setField(term228560, term228560.getClass(), "next", null);
        setField(term228560, term228560.getClass(), "first", null);
        setField(term228560, term228560.getClass(), "last", null);
        setField(term228560, term228560.getClass(), "propListHead", null);
        setIntField(term228560, term228560.getClass(), "sourcePosition", 0);
        setField(term228560, term228560.getClass(), "jsType", null);
        setField(term228560, term228560.getClass(), "parent", null);
        term228561 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term228561, term228561.getClass(), "str", null);
        setIntField(term228561, term228561.getClass(), "type", 0);
        setField(term228561, term228561.getClass(), "next", null);
        setField(term228561, term228561.getClass(), "first", null);
        setField(term228561, term228561.getClass(), "last", null);
        setField(term228561, term228561.getClass(), "propListHead", null);
        setIntField(term228561, term228561.getClass(), "sourcePosition", 0);
        setField(term228561, term228561.getClass(), "jsType", null);
        setField(term228561, term228561.getClass(), "parent", null);
        term228538 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term228538, term228538.getClass(), "str", null);
        setIntField(term228538, term228538.getClass(), "type", 14);
        setField(term228538, term228538.getClass(), "next", null);
        setField(term228538, term228538.getClass(), "first", null);
        setField(term228538, term228538.getClass(), "last", null);
        setField(term228538, term228538.getClass(), "propListHead", null);
        setIntField(term228538, term228538.getClass(), "sourcePosition", 0);
        setField(term228538, term228538.getClass(), "jsType", null);
        setField(term228538, term228538.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term228344;
        args[1] = term228436;
        args[2] = term228528;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term228252, args);
        assertTrue(recursiveEquals(term228252, term228558));
        assertTrue(recursiveEquals(term228344, term228559));
        assertTrue(recursiveEquals(term228436, term228560));
        assertTrue(recursiveEquals(term228528, term228561));
        assertTrue(recursiveEquals(retValue, term228538));
    }

};


