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

public class PeepholeFoldConstants_tryFoldAndOr_4258702903077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term908117;
     Object term908209;
     Object term908393;
     Object term908485;
     Object term909077;
     Object term909078;
     Object term909080;
     Object term909081;
     Object term909004;

    public PeepholeFoldConstants_tryFoldAndOr_4258702903077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term908117 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term908209 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term908301 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term908301, term908301.getClass(), "type", 114);
        setField(term908209, term908209.getClass(), "parent", term908301);
        setIntField(term908209, term908209.getClass(), "type", 47);
        term908393 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term908393, term908393.getClass(), "type", 0);
        term908485 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term908485, term908485.getClass(), "type", 47);
        term909077 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term909077, term909077.getClass(), "currentTraversal", null);
        term909078 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term909079 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term909078, term909078.getClass(), "number", 0.0);
        setIntField(term909078, term909078.getClass(), "type", 47);
        setField(term909078, term909078.getClass(), "next", null);
        setField(term909078, term909078.getClass(), "first", null);
        setField(term909078, term909078.getClass(), "last", null);
        setField(term909078, term909078.getClass(), "propListHead", null);
        setIntField(term909078, term909078.getClass(), "sourcePosition", 0);
        setField(term909078, term909078.getClass(), "jsType", null);
        setDoubleField(term909079, term909079.getClass(), "number", 0.0);
        setIntField(term909079, term909079.getClass(), "type", 114);
        setField(term909079, term909079.getClass(), "next", null);
        setField(term909079, term909079.getClass(), "first", null);
        setField(term909079, term909079.getClass(), "last", null);
        setField(term909079, term909079.getClass(), "propListHead", null);
        setIntField(term909079, term909079.getClass(), "sourcePosition", 0);
        setField(term909079, term909079.getClass(), "jsType", null);
        setField(term909079, term909079.getClass(), "parent", null);
        setField(term909078, term909078.getClass(), "parent", term909079);
        term909080 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term909080, term909080.getClass(), "str", null);
        setIntField(term909080, term909080.getClass(), "type", 0);
        setField(term909080, term909080.getClass(), "next", null);
        setField(term909080, term909080.getClass(), "first", null);
        setField(term909080, term909080.getClass(), "last", null);
        setField(term909080, term909080.getClass(), "propListHead", null);
        setIntField(term909080, term909080.getClass(), "sourcePosition", 0);
        setField(term909080, term909080.getClass(), "jsType", null);
        setField(term909080, term909080.getClass(), "parent", null);
        term909081 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term909081, term909081.getClass(), "number", 0.0);
        setIntField(term909081, term909081.getClass(), "type", 47);
        setField(term909081, term909081.getClass(), "next", null);
        setField(term909081, term909081.getClass(), "first", null);
        setField(term909081, term909081.getClass(), "last", null);
        setField(term909081, term909081.getClass(), "propListHead", null);
        setIntField(term909081, term909081.getClass(), "sourcePosition", 0);
        setField(term909081, term909081.getClass(), "jsType", null);
        setField(term909081, term909081.getClass(), "parent", null);
        term909004 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term909008 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term909004, term909004.getClass(), "number", 0.0);
        setIntField(term909004, term909004.getClass(), "type", 47);
        setField(term909004, term909004.getClass(), "next", null);
        setField(term909004, term909004.getClass(), "first", null);
        setField(term909004, term909004.getClass(), "last", null);
        setField(term909004, term909004.getClass(), "propListHead", null);
        setIntField(term909004, term909004.getClass(), "sourcePosition", 0);
        setField(term909004, term909004.getClass(), "jsType", null);
        setDoubleField(term909008, term909008.getClass(), "number", 0.0);
        setIntField(term909008, term909008.getClass(), "type", 114);
        setField(term909008, term909008.getClass(), "next", null);
        setField(term909008, term909008.getClass(), "first", null);
        setField(term909008, term909008.getClass(), "last", null);
        setField(term909008, term909008.getClass(), "propListHead", null);
        setIntField(term909008, term909008.getClass(), "sourcePosition", 0);
        setField(term909008, term909008.getClass(), "jsType", null);
        setField(term909008, term909008.getClass(), "parent", null);
        setField(term909004, term909004.getClass(), "parent", term909008);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term908209;
        args[1] = term908393;
        args[2] = term908485;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term908117, args);
        assertTrue(recursiveEquals(term908117, term909077));
        assertTrue(recursiveEquals(term908209, term909078));
        assertTrue(recursiveEquals(term908393, term909080));
        assertTrue(recursiveEquals(term908485, term909081));
        assertTrue(recursiveEquals(retValue, term909004));
    }

};


