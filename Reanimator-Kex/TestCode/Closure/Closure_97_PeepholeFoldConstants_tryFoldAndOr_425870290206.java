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

public class PeepholeFoldConstants_tryFoldAndOr_425870290206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39801;
     Object term39893;
     Object term40077;
     Object term40147;
     Object term40449;
     Object term40450;
     Object term40452;
     Object term40453;
     Object term40407;

    public PeepholeFoldConstants_tryFoldAndOr_425870290206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39801 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term39893 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term39985 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term39893, term39893.getClass(), "parent", term39985);
        setIntField(term39893, term39893.getClass(), "type", 0);
        term40077 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term40077, term40077.getClass(), "type", 0);
        term40147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term40449 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term40449, term40449.getClass(), "currentTraversal", null);
        term40450 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term40451 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term40450, term40450.getClass(), "str", null);
        setIntField(term40450, term40450.getClass(), "type", 0);
        setField(term40450, term40450.getClass(), "next", null);
        setField(term40450, term40450.getClass(), "first", null);
        setField(term40450, term40450.getClass(), "last", null);
        setField(term40450, term40450.getClass(), "propListHead", null);
        setIntField(term40450, term40450.getClass(), "sourcePosition", 0);
        setField(term40450, term40450.getClass(), "jsType", null);
        setField(term40451, term40451.getClass(), "str", null);
        setIntField(term40451, term40451.getClass(), "type", 0);
        setField(term40451, term40451.getClass(), "next", null);
        setField(term40451, term40451.getClass(), "first", null);
        setField(term40451, term40451.getClass(), "last", null);
        setField(term40451, term40451.getClass(), "propListHead", null);
        setIntField(term40451, term40451.getClass(), "sourcePosition", 0);
        setField(term40451, term40451.getClass(), "jsType", null);
        setField(term40451, term40451.getClass(), "parent", null);
        setField(term40450, term40450.getClass(), "parent", term40451);
        term40452 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term40452, term40452.getClass(), "number", 0.0);
        setIntField(term40452, term40452.getClass(), "type", 0);
        setField(term40452, term40452.getClass(), "next", null);
        setField(term40452, term40452.getClass(), "first", null);
        setField(term40452, term40452.getClass(), "last", null);
        setField(term40452, term40452.getClass(), "propListHead", null);
        setIntField(term40452, term40452.getClass(), "sourcePosition", 0);
        setField(term40452, term40452.getClass(), "jsType", null);
        setField(term40452, term40452.getClass(), "parent", null);
        term40453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40453, term40453.getClass(), "type", 0);
        setField(term40453, term40453.getClass(), "next", null);
        setField(term40453, term40453.getClass(), "first", null);
        setField(term40453, term40453.getClass(), "last", null);
        setField(term40453, term40453.getClass(), "propListHead", null);
        setIntField(term40453, term40453.getClass(), "sourcePosition", 0);
        setField(term40453, term40453.getClass(), "jsType", null);
        setField(term40453, term40453.getClass(), "parent", null);
        term40407 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term40410 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term40407, term40407.getClass(), "str", null);
        setIntField(term40407, term40407.getClass(), "type", 0);
        setField(term40407, term40407.getClass(), "next", null);
        setField(term40407, term40407.getClass(), "first", null);
        setField(term40407, term40407.getClass(), "last", null);
        setField(term40407, term40407.getClass(), "propListHead", null);
        setIntField(term40407, term40407.getClass(), "sourcePosition", 0);
        setField(term40407, term40407.getClass(), "jsType", null);
        setField(term40410, term40410.getClass(), "str", null);
        setIntField(term40410, term40410.getClass(), "type", 0);
        setField(term40410, term40410.getClass(), "next", null);
        setField(term40410, term40410.getClass(), "first", null);
        setField(term40410, term40410.getClass(), "last", null);
        setField(term40410, term40410.getClass(), "propListHead", null);
        setIntField(term40410, term40410.getClass(), "sourcePosition", 0);
        setField(term40410, term40410.getClass(), "jsType", null);
        setField(term40410, term40410.getClass(), "parent", null);
        setField(term40407, term40407.getClass(), "parent", term40410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term39893;
        args[1] = term40077;
        args[2] = term40147;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term39801, args);
        assertTrue(recursiveEquals(term39801, term40449));
        assertTrue(recursiveEquals(term39893, term40450));
        assertTrue(recursiveEquals(term40077, term40452));
        assertTrue(recursiveEquals(term40147, term40453));
        assertTrue(recursiveEquals(retValue, term40407));
    }

};


