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

public class PeepholeFoldConstants_tryFoldComparison_8484431791099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258092;
     Object term258184;
     Object term258276;
     Object term258368;
     Object term258876;
     Object term258877;
     Object term258878;
     Object term258879;
     Object term258856;

    public PeepholeFoldConstants_tryFoldComparison_8484431791099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258092 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term258184 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term258184, term258184.getClass(), "type", 14);
        term258276 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term258276, term258276.getClass(), "type", 14);
        term258368 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term258876 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term258876, term258876.getClass(), "currentTraversal", null);
        term258877 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term258877, term258877.getClass(), "str", null);
        setIntField(term258877, term258877.getClass(), "type", 14);
        setField(term258877, term258877.getClass(), "next", null);
        setField(term258877, term258877.getClass(), "first", null);
        setField(term258877, term258877.getClass(), "last", null);
        setField(term258877, term258877.getClass(), "propListHead", null);
        setIntField(term258877, term258877.getClass(), "sourcePosition", 0);
        setField(term258877, term258877.getClass(), "jsType", null);
        setField(term258877, term258877.getClass(), "parent", null);
        term258878 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term258878, term258878.getClass(), "str", null);
        setIntField(term258878, term258878.getClass(), "type", 14);
        setField(term258878, term258878.getClass(), "next", null);
        setField(term258878, term258878.getClass(), "first", null);
        setField(term258878, term258878.getClass(), "last", null);
        setField(term258878, term258878.getClass(), "propListHead", null);
        setIntField(term258878, term258878.getClass(), "sourcePosition", 0);
        setField(term258878, term258878.getClass(), "jsType", null);
        setField(term258878, term258878.getClass(), "parent", null);
        term258879 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term258879, term258879.getClass(), "str", null);
        setIntField(term258879, term258879.getClass(), "type", 0);
        setField(term258879, term258879.getClass(), "next", null);
        setField(term258879, term258879.getClass(), "first", null);
        setField(term258879, term258879.getClass(), "last", null);
        setField(term258879, term258879.getClass(), "propListHead", null);
        setIntField(term258879, term258879.getClass(), "sourcePosition", 0);
        setField(term258879, term258879.getClass(), "jsType", null);
        setField(term258879, term258879.getClass(), "parent", null);
        term258856 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term258856, term258856.getClass(), "str", null);
        setIntField(term258856, term258856.getClass(), "type", 14);
        setField(term258856, term258856.getClass(), "next", null);
        setField(term258856, term258856.getClass(), "first", null);
        setField(term258856, term258856.getClass(), "last", null);
        setField(term258856, term258856.getClass(), "propListHead", null);
        setIntField(term258856, term258856.getClass(), "sourcePosition", 0);
        setField(term258856, term258856.getClass(), "jsType", null);
        setField(term258856, term258856.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term258184;
        args[1] = term258276;
        args[2] = term258368;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term258092, args);
        assertTrue(recursiveEquals(term258092, term258876));
        assertTrue(recursiveEquals(term258184, term258877));
        assertTrue(recursiveEquals(term258276, term258878));
        assertTrue(recursiveEquals(term258368, term258879));
        assertTrue(recursiveEquals(retValue, term258856));
    }

};


