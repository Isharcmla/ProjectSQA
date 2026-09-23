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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2633794;
     Object term2633886;
     Object term2634333;
     Object term2634334;
     Object term2634269;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2633794 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2633886 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2633978 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2634048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2634140 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term2633886, term2633886.getClass(), "type", 37);
        setIntField(term2633978, term2633978.getClass(), "type", 33);
        setField(term2634048, term2634048.getClass(), "next", term2634140);
        setIntField(term2634048, term2634048.getClass(), "type", 40);
        setField(term2633978, term2633978.getClass(), "first", term2634048);
        setField(term2633886, term2633886.getClass(), "first", term2633978);
        term2634333 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2634333, term2634333.getClass(), "currentTraversal", null);
        term2634334 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2634335 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2634336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2634337 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term2634334, term2634334.getClass(), "str", null);
        setIntField(term2634334, term2634334.getClass(), "type", 37);
        setField(term2634334, term2634334.getClass(), "next", null);
        setDoubleField(term2634335, term2634335.getClass(), "number", 0.0);
        setIntField(term2634335, term2634335.getClass(), "type", 33);
        setField(term2634335, term2634335.getClass(), "next", null);
        setIntField(term2634336, term2634336.getClass(), "type", 40);
        setDoubleField(term2634337, term2634337.getClass(), "number", 0.0);
        setIntField(term2634337, term2634337.getClass(), "type", 0);
        setField(term2634337, term2634337.getClass(), "next", null);
        setField(term2634337, term2634337.getClass(), "first", null);
        setField(term2634337, term2634337.getClass(), "last", null);
        setField(term2634337, term2634337.getClass(), "propListHead", null);
        setIntField(term2634337, term2634337.getClass(), "sourcePosition", 0);
        setField(term2634337, term2634337.getClass(), "jsType", null);
        setField(term2634337, term2634337.getClass(), "parent", null);
        setField(term2634336, term2634336.getClass(), "next", term2634337);
        setField(term2634336, term2634336.getClass(), "first", null);
        setField(term2634336, term2634336.getClass(), "last", null);
        setField(term2634336, term2634336.getClass(), "propListHead", null);
        setIntField(term2634336, term2634336.getClass(), "sourcePosition", 0);
        setField(term2634336, term2634336.getClass(), "jsType", null);
        setField(term2634336, term2634336.getClass(), "parent", null);
        setField(term2634335, term2634335.getClass(), "first", term2634336);
        setField(term2634335, term2634335.getClass(), "last", null);
        setField(term2634335, term2634335.getClass(), "propListHead", null);
        setIntField(term2634335, term2634335.getClass(), "sourcePosition", 0);
        setField(term2634335, term2634335.getClass(), "jsType", null);
        setField(term2634335, term2634335.getClass(), "parent", null);
        setField(term2634334, term2634334.getClass(), "first", term2634335);
        setField(term2634334, term2634334.getClass(), "last", null);
        setField(term2634334, term2634334.getClass(), "propListHead", null);
        setIntField(term2634334, term2634334.getClass(), "sourcePosition", 0);
        setField(term2634334, term2634334.getClass(), "jsType", null);
        setField(term2634334, term2634334.getClass(), "parent", null);
        term2634269 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2634271 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2634274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2634276 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term2634269, term2634269.getClass(), "str", null);
        setIntField(term2634269, term2634269.getClass(), "type", 37);
        setField(term2634269, term2634269.getClass(), "next", null);
        setDoubleField(term2634271, term2634271.getClass(), "number", 0.0);
        setIntField(term2634271, term2634271.getClass(), "type", 33);
        setField(term2634271, term2634271.getClass(), "next", null);
        setIntField(term2634274, term2634274.getClass(), "type", 40);
        setDoubleField(term2634276, term2634276.getClass(), "number", 0.0);
        setIntField(term2634276, term2634276.getClass(), "type", 0);
        setField(term2634276, term2634276.getClass(), "next", null);
        setField(term2634276, term2634276.getClass(), "first", null);
        setField(term2634276, term2634276.getClass(), "last", null);
        setField(term2634276, term2634276.getClass(), "propListHead", null);
        setIntField(term2634276, term2634276.getClass(), "sourcePosition", 0);
        setField(term2634276, term2634276.getClass(), "jsType", null);
        setField(term2634276, term2634276.getClass(), "parent", null);
        setField(term2634274, term2634274.getClass(), "next", term2634276);
        setField(term2634274, term2634274.getClass(), "first", null);
        setField(term2634274, term2634274.getClass(), "last", null);
        setField(term2634274, term2634274.getClass(), "propListHead", null);
        setIntField(term2634274, term2634274.getClass(), "sourcePosition", 0);
        setField(term2634274, term2634274.getClass(), "jsType", null);
        setField(term2634274, term2634274.getClass(), "parent", null);
        setField(term2634271, term2634271.getClass(), "first", term2634274);
        setField(term2634271, term2634271.getClass(), "last", null);
        setField(term2634271, term2634271.getClass(), "propListHead", null);
        setIntField(term2634271, term2634271.getClass(), "sourcePosition", 0);
        setField(term2634271, term2634271.getClass(), "jsType", null);
        setField(term2634271, term2634271.getClass(), "parent", null);
        setField(term2634269, term2634269.getClass(), "first", term2634271);
        setField(term2634269, term2634269.getClass(), "last", null);
        setField(term2634269, term2634269.getClass(), "propListHead", null);
        setIntField(term2634269, term2634269.getClass(), "sourcePosition", 0);
        setField(term2634269, term2634269.getClass(), "jsType", null);
        setField(term2634269, term2634269.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2633886;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2633794, args);
        assertTrue(recursiveEquals(term2633794, term2634333));
        assertTrue(recursiveEquals(term2633886, term2634334));
        assertTrue(recursiveEquals(retValue, term2634269));
    }

};


