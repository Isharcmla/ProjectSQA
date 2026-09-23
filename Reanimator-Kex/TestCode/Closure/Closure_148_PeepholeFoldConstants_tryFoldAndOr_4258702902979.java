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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term874590;
     Object term874682;
     Object term874844;
     Object term874936;
     Object term875474;
     Object term875475;
     Object term875477;
     Object term875478;
     Object term875399;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term874590 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term874682 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term874752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term874752, term874752.getClass(), "type", 98);
        setField(term874752, term874752.getClass(), "first", term874682);
        setField(term874682, term874682.getClass(), "parent", term874752);
        setIntField(term874682, term874682.getClass(), "type", 47);
        term874844 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term874844, term874844.getClass(), "type", 0);
        term874936 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term874936, term874936.getClass(), "type", 47);
        term875474 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term875474, term875474.getClass(), "currentTraversal", null);
        term875475 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term875476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term875475, term875475.getClass(), "str", null);
        setIntField(term875475, term875475.getClass(), "type", 47);
        setField(term875475, term875475.getClass(), "next", null);
        setField(term875475, term875475.getClass(), "first", null);
        setField(term875475, term875475.getClass(), "last", null);
        setField(term875475, term875475.getClass(), "propListHead", null);
        setIntField(term875475, term875475.getClass(), "sourcePosition", 0);
        setField(term875475, term875475.getClass(), "jsType", null);
        setIntField(term875476, term875476.getClass(), "type", 98);
        setField(term875476, term875476.getClass(), "next", null);
        setField(term875476, term875476.getClass(), "first", term875475);
        setField(term875476, term875476.getClass(), "last", null);
        setField(term875476, term875476.getClass(), "propListHead", null);
        setIntField(term875476, term875476.getClass(), "sourcePosition", 0);
        setField(term875476, term875476.getClass(), "jsType", null);
        setField(term875476, term875476.getClass(), "parent", null);
        setField(term875475, term875475.getClass(), "parent", term875476);
        term875477 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term875477, term875477.getClass(), "str", null);
        setIntField(term875477, term875477.getClass(), "type", 0);
        setField(term875477, term875477.getClass(), "next", null);
        setField(term875477, term875477.getClass(), "first", null);
        setField(term875477, term875477.getClass(), "last", null);
        setField(term875477, term875477.getClass(), "propListHead", null);
        setIntField(term875477, term875477.getClass(), "sourcePosition", 0);
        setField(term875477, term875477.getClass(), "jsType", null);
        setField(term875477, term875477.getClass(), "parent", null);
        term875478 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term875478, term875478.getClass(), "str", null);
        setIntField(term875478, term875478.getClass(), "type", 47);
        setField(term875478, term875478.getClass(), "next", null);
        setField(term875478, term875478.getClass(), "first", null);
        setField(term875478, term875478.getClass(), "last", null);
        setField(term875478, term875478.getClass(), "propListHead", null);
        setIntField(term875478, term875478.getClass(), "sourcePosition", 0);
        setField(term875478, term875478.getClass(), "jsType", null);
        setField(term875478, term875478.getClass(), "parent", null);
        term875399 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term875402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term875399, term875399.getClass(), "str", null);
        setIntField(term875399, term875399.getClass(), "type", 47);
        setField(term875399, term875399.getClass(), "next", null);
        setField(term875399, term875399.getClass(), "first", null);
        setField(term875399, term875399.getClass(), "last", null);
        setField(term875399, term875399.getClass(), "propListHead", null);
        setIntField(term875399, term875399.getClass(), "sourcePosition", 0);
        setField(term875399, term875399.getClass(), "jsType", null);
        setIntField(term875402, term875402.getClass(), "type", 98);
        setField(term875402, term875402.getClass(), "next", null);
        setField(term875402, term875402.getClass(), "first", term875399);
        setField(term875402, term875402.getClass(), "last", null);
        setField(term875402, term875402.getClass(), "propListHead", null);
        setIntField(term875402, term875402.getClass(), "sourcePosition", 0);
        setField(term875402, term875402.getClass(), "jsType", null);
        setField(term875402, term875402.getClass(), "parent", null);
        setField(term875399, term875399.getClass(), "parent", term875402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term874682;
        args[1] = term874844;
        args[2] = term874936;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term874590, args);
        assertTrue(recursiveEquals(term874590, term875474));
        assertTrue(recursiveEquals(term874682, term875475));
        assertTrue(recursiveEquals(term874844, term875477));
        assertTrue(recursiveEquals(term874936, term875478));
        assertTrue(recursiveEquals(retValue, term875399));
    }

};


