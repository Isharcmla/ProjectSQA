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

public class PeepholeFoldConstants_tryFoldAdd_17496499311768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691924;
     Object term692016;
     Object term692108;
     Object term692200;
     Object term692231;
     Object term692232;
     Object term692233;
     Object term692234;
     Object term692202;

    public PeepholeFoldConstants_tryFoldAdd_17496499311768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term691924 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term692016 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term692016, term692016.getClass(), "type", 21);
        term692108 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term692108, term692108.getClass(), "type", 21);
        term692200 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term692231 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term692231, term692231.getClass(), "currentTraversal", null);
        term692232 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term692232, term692232.getClass(), "number", 0.0);
        setIntField(term692232, term692232.getClass(), "type", 21);
        setField(term692232, term692232.getClass(), "next", null);
        setField(term692232, term692232.getClass(), "first", null);
        setField(term692232, term692232.getClass(), "last", null);
        setField(term692232, term692232.getClass(), "propListHead", null);
        setIntField(term692232, term692232.getClass(), "sourcePosition", 0);
        setField(term692232, term692232.getClass(), "jsType", null);
        setField(term692232, term692232.getClass(), "parent", null);
        term692233 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term692233, term692233.getClass(), "str", null);
        setIntField(term692233, term692233.getClass(), "type", 21);
        setField(term692233, term692233.getClass(), "next", null);
        setField(term692233, term692233.getClass(), "first", null);
        setField(term692233, term692233.getClass(), "last", null);
        setField(term692233, term692233.getClass(), "propListHead", null);
        setIntField(term692233, term692233.getClass(), "sourcePosition", 0);
        setField(term692233, term692233.getClass(), "jsType", null);
        setField(term692233, term692233.getClass(), "parent", null);
        term692234 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term692234, term692234.getClass(), "number", 0.0);
        setIntField(term692234, term692234.getClass(), "type", 0);
        setField(term692234, term692234.getClass(), "next", null);
        setField(term692234, term692234.getClass(), "first", null);
        setField(term692234, term692234.getClass(), "last", null);
        setField(term692234, term692234.getClass(), "propListHead", null);
        setIntField(term692234, term692234.getClass(), "sourcePosition", 0);
        setField(term692234, term692234.getClass(), "jsType", null);
        setField(term692234, term692234.getClass(), "parent", null);
        term692202 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term692202, term692202.getClass(), "number", 0.0);
        setIntField(term692202, term692202.getClass(), "type", 21);
        setField(term692202, term692202.getClass(), "next", null);
        setField(term692202, term692202.getClass(), "first", null);
        setField(term692202, term692202.getClass(), "last", null);
        setField(term692202, term692202.getClass(), "propListHead", null);
        setIntField(term692202, term692202.getClass(), "sourcePosition", 0);
        setField(term692202, term692202.getClass(), "jsType", null);
        setField(term692202, term692202.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term692016;
        args[1] = term692108;
        args[2] = term692200;
        Object retValue = callMethod(klass, "tryFoldAdd", argTypes, term691924, args);
        assertTrue(recursiveEquals(term691924, term692231));
        assertTrue(recursiveEquals(term692016, term692232));
        assertTrue(recursiveEquals(term692108, term692233));
        assertTrue(recursiveEquals(term692200, term692234));
        assertTrue(recursiveEquals(retValue, term692202));
    }

};


