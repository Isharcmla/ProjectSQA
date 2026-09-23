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

public class PeepholeFoldConstants_tryFoldInstanceof_1830686408596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129910;
     Object term130002;
     Object term130094;
     Object term130112;
     Object term130113;
     Object term130114;
     Object term130096;

    public PeepholeFoldConstants_tryFoldInstanceof_1830686408596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129910 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term130002 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term130002, term130002.getClass(), "type", 52);
        term130094 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term130112 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term130112, term130112.getClass(), "currentTraversal", null);
        term130113 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term130113, term130113.getClass(), "number", 0.0);
        setIntField(term130113, term130113.getClass(), "type", 52);
        setField(term130113, term130113.getClass(), "next", null);
        setField(term130113, term130113.getClass(), "first", null);
        setField(term130113, term130113.getClass(), "last", null);
        setField(term130113, term130113.getClass(), "propListHead", null);
        setIntField(term130113, term130113.getClass(), "sourcePosition", 0);
        setField(term130113, term130113.getClass(), "jsType", null);
        setField(term130113, term130113.getClass(), "parent", null);
        term130114 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term130114, term130114.getClass(), "str", null);
        setIntField(term130114, term130114.getClass(), "type", 0);
        setField(term130114, term130114.getClass(), "next", null);
        setField(term130114, term130114.getClass(), "first", null);
        setField(term130114, term130114.getClass(), "last", null);
        setField(term130114, term130114.getClass(), "propListHead", null);
        setIntField(term130114, term130114.getClass(), "sourcePosition", 0);
        setField(term130114, term130114.getClass(), "jsType", null);
        setField(term130114, term130114.getClass(), "parent", null);
        term130096 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term130096, term130096.getClass(), "number", 0.0);
        setIntField(term130096, term130096.getClass(), "type", 52);
        setField(term130096, term130096.getClass(), "next", null);
        setField(term130096, term130096.getClass(), "first", null);
        setField(term130096, term130096.getClass(), "last", null);
        setField(term130096, term130096.getClass(), "propListHead", null);
        setIntField(term130096, term130096.getClass(), "sourcePosition", 0);
        setField(term130096, term130096.getClass(), "jsType", null);
        setField(term130096, term130096.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term130002;
        args[1] = term130094;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldInstanceof", argTypes, term129910, args);
        assertTrue(recursiveEquals(term129910, term130112));
        assertTrue(recursiveEquals(term130002, term130113));
        assertTrue(recursiveEquals(term130094, term130114));
        assertTrue(recursiveEquals(retValue, term130096));
    }

};


