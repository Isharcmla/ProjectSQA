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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3221895;
     Object term3221987;
     Object term3462480;
     Object term3462481;
     Object term3462170;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3221895 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3221987 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3222079 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3222171 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3222079, term3222079.getClass(), "type", 35);
        setField(term3222171, term3222171.getClass(), "next", term3222171);
        setIntField(term3222171, term3222171.getClass(), "type", 40);
        setField(term3222171, term3222171.getClass(), "str", "indexOf");
        setField(term3222079, term3222079.getClass(), "first", term3222171);
        setField(term3222079, term3222079.getClass(), "next", term3222171);
        setField(term3221987, term3221987.getClass(), "first", term3222079);
        setIntField(term3221987, term3221987.getClass(), "type", 37);
        term3462480 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3462480, term3462480.getClass(), "currentTraversal", null);
        term3462481 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3462482 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3462483 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3462481, term3462481.getClass(), "str", null);
        setIntField(term3462481, term3462481.getClass(), "type", 37);
        setField(term3462481, term3462481.getClass(), "next", null);
        setField(term3462482, term3462482.getClass(), "str", null);
        setIntField(term3462482, term3462482.getClass(), "type", 35);
        setField(term3462483, term3462483.getClass(), "str", "indexOf");
        setIntField(term3462483, term3462483.getClass(), "type", 40);
        setField(term3462483, term3462483.getClass(), "next", term3462483);
        setField(term3462483, term3462483.getClass(), "first", null);
        setField(term3462483, term3462483.getClass(), "last", null);
        setField(term3462483, term3462483.getClass(), "propListHead", null);
        setIntField(term3462483, term3462483.getClass(), "sourcePosition", 0);
        setField(term3462483, term3462483.getClass(), "jsType", null);
        setField(term3462483, term3462483.getClass(), "parent", null);
        setField(term3462482, term3462482.getClass(), "next", term3462483);
        setField(term3462482, term3462482.getClass(), "first", term3462483);
        setField(term3462482, term3462482.getClass(), "last", null);
        setField(term3462482, term3462482.getClass(), "propListHead", null);
        setIntField(term3462482, term3462482.getClass(), "sourcePosition", 0);
        setField(term3462482, term3462482.getClass(), "jsType", null);
        setField(term3462482, term3462482.getClass(), "parent", null);
        setField(term3462481, term3462481.getClass(), "first", term3462482);
        setField(term3462481, term3462481.getClass(), "last", null);
        setField(term3462481, term3462481.getClass(), "propListHead", null);
        setIntField(term3462481, term3462481.getClass(), "sourcePosition", 0);
        setField(term3462481, term3462481.getClass(), "jsType", null);
        setField(term3462481, term3462481.getClass(), "parent", null);
        term3462170 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3462172 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3462174 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3462170, term3462170.getClass(), "str", null);
        setIntField(term3462170, term3462170.getClass(), "type", 37);
        setField(term3462170, term3462170.getClass(), "next", null);
        setField(term3462172, term3462172.getClass(), "str", null);
        setIntField(term3462172, term3462172.getClass(), "type", 35);
        setField(term3462174, term3462174.getClass(), "str", "indexOf");
        setIntField(term3462174, term3462174.getClass(), "type", 40);
        setField(term3462174, term3462174.getClass(), "next", term3462174);
        setField(term3462174, term3462174.getClass(), "first", null);
        setField(term3462174, term3462174.getClass(), "last", null);
        setField(term3462174, term3462174.getClass(), "propListHead", null);
        setIntField(term3462174, term3462174.getClass(), "sourcePosition", 0);
        setField(term3462174, term3462174.getClass(), "jsType", null);
        setField(term3462174, term3462174.getClass(), "parent", null);
        setField(term3462172, term3462172.getClass(), "next", term3462174);
        setField(term3462172, term3462172.getClass(), "first", term3462174);
        setField(term3462172, term3462172.getClass(), "last", null);
        setField(term3462172, term3462172.getClass(), "propListHead", null);
        setIntField(term3462172, term3462172.getClass(), "sourcePosition", 0);
        setField(term3462172, term3462172.getClass(), "jsType", null);
        setField(term3462172, term3462172.getClass(), "parent", null);
        setField(term3462170, term3462170.getClass(), "first", term3462172);
        setField(term3462170, term3462170.getClass(), "last", null);
        setField(term3462170, term3462170.getClass(), "propListHead", null);
        setIntField(term3462170, term3462170.getClass(), "sourcePosition", 0);
        setField(term3462170, term3462170.getClass(), "jsType", null);
        setField(term3462170, term3462170.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3221987;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3221895, args);
        assertTrue(recursiveEquals(term3221895, term3462480));
        assertTrue(recursiveEquals(term3221987, term3462481));
        assertTrue(recursiveEquals(retValue, term3462170));
    }

};


