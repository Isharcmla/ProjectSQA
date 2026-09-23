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

public class PeepholeFoldConstants_tryFoldAndOr_425870290522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110938;
     Object term111030;
     Object term111122;
     Object term111214;
     Object term111296;
     Object term111297;
     Object term111298;
     Object term111299;
     Object term111256;

    public PeepholeFoldConstants_tryFoldAndOr_425870290522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110938 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term111030 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term111030, term111030.getClass(), "parent", null);
        setIntField(term111030, term111030.getClass(), "type", 0);
        term111122 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term111122, term111122.getClass(), "type", 0);
        term111214 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term111296 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term111296, term111296.getClass(), "currentTraversal", null);
        term111297 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term111297, term111297.getClass(), "number", 0.0);
        setIntField(term111297, term111297.getClass(), "type", 0);
        setField(term111297, term111297.getClass(), "next", null);
        setField(term111297, term111297.getClass(), "first", null);
        setField(term111297, term111297.getClass(), "last", null);
        setField(term111297, term111297.getClass(), "propListHead", null);
        setIntField(term111297, term111297.getClass(), "sourcePosition", 0);
        setField(term111297, term111297.getClass(), "jsType", null);
        setField(term111297, term111297.getClass(), "parent", null);
        term111298 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term111298, term111298.getClass(), "number", 0.0);
        setIntField(term111298, term111298.getClass(), "type", 0);
        setField(term111298, term111298.getClass(), "next", null);
        setField(term111298, term111298.getClass(), "first", null);
        setField(term111298, term111298.getClass(), "last", null);
        setField(term111298, term111298.getClass(), "propListHead", null);
        setIntField(term111298, term111298.getClass(), "sourcePosition", 0);
        setField(term111298, term111298.getClass(), "jsType", null);
        setField(term111298, term111298.getClass(), "parent", null);
        term111299 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term111299, term111299.getClass(), "str", null);
        setIntField(term111299, term111299.getClass(), "type", 0);
        setField(term111299, term111299.getClass(), "next", null);
        setField(term111299, term111299.getClass(), "first", null);
        setField(term111299, term111299.getClass(), "last", null);
        setField(term111299, term111299.getClass(), "propListHead", null);
        setIntField(term111299, term111299.getClass(), "sourcePosition", 0);
        setField(term111299, term111299.getClass(), "jsType", null);
        setField(term111299, term111299.getClass(), "parent", null);
        term111256 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term111256, term111256.getClass(), "number", 0.0);
        setIntField(term111256, term111256.getClass(), "type", 0);
        setField(term111256, term111256.getClass(), "next", null);
        setField(term111256, term111256.getClass(), "first", null);
        setField(term111256, term111256.getClass(), "last", null);
        setField(term111256, term111256.getClass(), "propListHead", null);
        setIntField(term111256, term111256.getClass(), "sourcePosition", 0);
        setField(term111256, term111256.getClass(), "jsType", null);
        setField(term111256, term111256.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term111030;
        args[1] = term111122;
        args[2] = term111214;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term110938, args);
        assertTrue(recursiveEquals(term110938, term111296));
        assertTrue(recursiveEquals(term111030, term111297));
        assertTrue(recursiveEquals(term111122, term111298));
        assertTrue(recursiveEquals(term111214, term111299));
        assertTrue(recursiveEquals(retValue, term111256));
    }

};


