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

public class PeepholeFoldConstants_tryFoldAndOr_4258702903082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term909616;
     Object term909708;
     Object term909892;
     Object term909984;
     Object term911166;
     Object term911167;
     Object term911169;
     Object term911170;
     Object term911115;

    public PeepholeFoldConstants_tryFoldAndOr_4258702903082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term909616 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term909708 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term909800 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term909708, term909708.getClass(), "parent", term909800);
        setIntField(term909708, term909708.getClass(), "type", 0);
        term909892 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term909892, term909892.getClass(), "type", 0);
        term909984 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term909984, term909984.getClass(), "type", 44);
        term911166 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term911166, term911166.getClass(), "currentTraversal", null);
        term911167 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term911168 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term911167, term911167.getClass(), "number", 0.0);
        setIntField(term911167, term911167.getClass(), "type", 0);
        setField(term911167, term911167.getClass(), "next", null);
        setField(term911167, term911167.getClass(), "first", null);
        setField(term911167, term911167.getClass(), "last", null);
        setField(term911167, term911167.getClass(), "propListHead", null);
        setIntField(term911167, term911167.getClass(), "sourcePosition", 0);
        setField(term911167, term911167.getClass(), "jsType", null);
        setDoubleField(term911168, term911168.getClass(), "number", 0.0);
        setIntField(term911168, term911168.getClass(), "type", 0);
        setField(term911168, term911168.getClass(), "next", null);
        setField(term911168, term911168.getClass(), "first", null);
        setField(term911168, term911168.getClass(), "last", null);
        setField(term911168, term911168.getClass(), "propListHead", null);
        setIntField(term911168, term911168.getClass(), "sourcePosition", 0);
        setField(term911168, term911168.getClass(), "jsType", null);
        setField(term911168, term911168.getClass(), "parent", null);
        setField(term911167, term911167.getClass(), "parent", term911168);
        term911169 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term911169, term911169.getClass(), "number", 0.0);
        setIntField(term911169, term911169.getClass(), "type", 0);
        setField(term911169, term911169.getClass(), "next", null);
        setField(term911169, term911169.getClass(), "first", null);
        setField(term911169, term911169.getClass(), "last", null);
        setField(term911169, term911169.getClass(), "propListHead", null);
        setIntField(term911169, term911169.getClass(), "sourcePosition", 0);
        setField(term911169, term911169.getClass(), "jsType", null);
        setField(term911169, term911169.getClass(), "parent", null);
        term911170 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term911170, term911170.getClass(), "str", null);
        setIntField(term911170, term911170.getClass(), "type", 44);
        setField(term911170, term911170.getClass(), "next", null);
        setField(term911170, term911170.getClass(), "first", null);
        setField(term911170, term911170.getClass(), "last", null);
        setField(term911170, term911170.getClass(), "propListHead", null);
        setIntField(term911170, term911170.getClass(), "sourcePosition", 0);
        setField(term911170, term911170.getClass(), "jsType", null);
        setField(term911170, term911170.getClass(), "parent", null);
        term911115 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term911119 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term911115, term911115.getClass(), "number", 0.0);
        setIntField(term911115, term911115.getClass(), "type", 0);
        setField(term911115, term911115.getClass(), "next", null);
        setField(term911115, term911115.getClass(), "first", null);
        setField(term911115, term911115.getClass(), "last", null);
        setField(term911115, term911115.getClass(), "propListHead", null);
        setIntField(term911115, term911115.getClass(), "sourcePosition", 0);
        setField(term911115, term911115.getClass(), "jsType", null);
        setDoubleField(term911119, term911119.getClass(), "number", 0.0);
        setIntField(term911119, term911119.getClass(), "type", 0);
        setField(term911119, term911119.getClass(), "next", null);
        setField(term911119, term911119.getClass(), "first", null);
        setField(term911119, term911119.getClass(), "last", null);
        setField(term911119, term911119.getClass(), "propListHead", null);
        setIntField(term911119, term911119.getClass(), "sourcePosition", 0);
        setField(term911119, term911119.getClass(), "jsType", null);
        setField(term911119, term911119.getClass(), "parent", null);
        setField(term911115, term911115.getClass(), "parent", term911119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term909708;
        args[1] = term909892;
        args[2] = term909984;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term909616, args);
        assertTrue(recursiveEquals(term909616, term911166));
        assertTrue(recursiveEquals(term909708, term911167));
        assertTrue(recursiveEquals(term909892, term911169));
        assertTrue(recursiveEquals(term909984, term911170));
        assertTrue(recursiveEquals(retValue, term911115));
    }

};


