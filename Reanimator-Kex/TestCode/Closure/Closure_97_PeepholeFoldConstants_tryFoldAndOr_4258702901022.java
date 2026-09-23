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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319504;
     Object term319596;
     Object term319688;
     Object term319780;
     Object term319898;
     Object term319899;
     Object term319900;
     Object term319901;
     Object term319858;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319504 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term319596 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term319596, term319596.getClass(), "parent", null);
        setIntField(term319596, term319596.getClass(), "type", 0);
        term319688 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term319688, term319688.getClass(), "type", 0);
        term319780 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term319898 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term319898, term319898.getClass(), "currentTraversal", null);
        term319899 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term319899, term319899.getClass(), "number", 0.0);
        setIntField(term319899, term319899.getClass(), "type", 0);
        setField(term319899, term319899.getClass(), "next", null);
        setField(term319899, term319899.getClass(), "first", null);
        setField(term319899, term319899.getClass(), "last", null);
        setField(term319899, term319899.getClass(), "propListHead", null);
        setIntField(term319899, term319899.getClass(), "sourcePosition", 0);
        setField(term319899, term319899.getClass(), "jsType", null);
        setField(term319899, term319899.getClass(), "parent", null);
        term319900 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term319900, term319900.getClass(), "number", 0.0);
        setIntField(term319900, term319900.getClass(), "type", 0);
        setField(term319900, term319900.getClass(), "next", null);
        setField(term319900, term319900.getClass(), "first", null);
        setField(term319900, term319900.getClass(), "last", null);
        setField(term319900, term319900.getClass(), "propListHead", null);
        setIntField(term319900, term319900.getClass(), "sourcePosition", 0);
        setField(term319900, term319900.getClass(), "jsType", null);
        setField(term319900, term319900.getClass(), "parent", null);
        term319901 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term319901, term319901.getClass(), "str", null);
        setIntField(term319901, term319901.getClass(), "type", 0);
        setField(term319901, term319901.getClass(), "next", null);
        setField(term319901, term319901.getClass(), "first", null);
        setField(term319901, term319901.getClass(), "last", null);
        setField(term319901, term319901.getClass(), "propListHead", null);
        setIntField(term319901, term319901.getClass(), "sourcePosition", 0);
        setField(term319901, term319901.getClass(), "jsType", null);
        setField(term319901, term319901.getClass(), "parent", null);
        term319858 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term319858, term319858.getClass(), "number", 0.0);
        setIntField(term319858, term319858.getClass(), "type", 0);
        setField(term319858, term319858.getClass(), "next", null);
        setField(term319858, term319858.getClass(), "first", null);
        setField(term319858, term319858.getClass(), "last", null);
        setField(term319858, term319858.getClass(), "propListHead", null);
        setIntField(term319858, term319858.getClass(), "sourcePosition", 0);
        setField(term319858, term319858.getClass(), "jsType", null);
        setField(term319858, term319858.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term319596;
        args[1] = term319688;
        args[2] = term319780;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term319504, args);
        assertTrue(recursiveEquals(term319504, term319898));
        assertTrue(recursiveEquals(term319596, term319899));
        assertTrue(recursiveEquals(term319688, term319900));
        assertTrue(recursiveEquals(term319780, term319901));
        assertTrue(recursiveEquals(retValue, term319858));
    }

};


