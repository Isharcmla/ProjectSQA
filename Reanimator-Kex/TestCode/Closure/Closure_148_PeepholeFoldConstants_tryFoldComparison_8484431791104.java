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

public class PeepholeFoldConstants_tryFoldComparison_8484431791104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259514;
     Object term259606;
     Object term259698;
     Object term259790;
     Object term259936;
     Object term259937;
     Object term259938;
     Object term259939;
     Object term259915;

    public PeepholeFoldConstants_tryFoldComparison_8484431791104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259514 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term259606 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term259606, term259606.getClass(), "type", 14);
        term259698 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term259698, term259698.getClass(), "type", 14);
        term259790 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term259936 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term259936, term259936.getClass(), "currentTraversal", null);
        term259937 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term259937, term259937.getClass(), "str", null);
        setIntField(term259937, term259937.getClass(), "type", 14);
        setField(term259937, term259937.getClass(), "next", null);
        setField(term259937, term259937.getClass(), "first", null);
        setField(term259937, term259937.getClass(), "last", null);
        setField(term259937, term259937.getClass(), "propListHead", null);
        setIntField(term259937, term259937.getClass(), "sourcePosition", 0);
        setField(term259937, term259937.getClass(), "jsType", null);
        setField(term259937, term259937.getClass(), "parent", null);
        term259938 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term259938, term259938.getClass(), "str", null);
        setIntField(term259938, term259938.getClass(), "type", 14);
        setField(term259938, term259938.getClass(), "next", null);
        setField(term259938, term259938.getClass(), "first", null);
        setField(term259938, term259938.getClass(), "last", null);
        setField(term259938, term259938.getClass(), "propListHead", null);
        setIntField(term259938, term259938.getClass(), "sourcePosition", 0);
        setField(term259938, term259938.getClass(), "jsType", null);
        setField(term259938, term259938.getClass(), "parent", null);
        term259939 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term259939, term259939.getClass(), "number", 0.0);
        setIntField(term259939, term259939.getClass(), "type", 0);
        setField(term259939, term259939.getClass(), "next", null);
        setField(term259939, term259939.getClass(), "first", null);
        setField(term259939, term259939.getClass(), "last", null);
        setField(term259939, term259939.getClass(), "propListHead", null);
        setIntField(term259939, term259939.getClass(), "sourcePosition", 0);
        setField(term259939, term259939.getClass(), "jsType", null);
        setField(term259939, term259939.getClass(), "parent", null);
        term259915 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term259915, term259915.getClass(), "str", null);
        setIntField(term259915, term259915.getClass(), "type", 14);
        setField(term259915, term259915.getClass(), "next", null);
        setField(term259915, term259915.getClass(), "first", null);
        setField(term259915, term259915.getClass(), "last", null);
        setField(term259915, term259915.getClass(), "propListHead", null);
        setIntField(term259915, term259915.getClass(), "sourcePosition", 0);
        setField(term259915, term259915.getClass(), "jsType", null);
        setField(term259915, term259915.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term259606;
        args[1] = term259698;
        args[2] = term259790;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term259514, args);
        assertTrue(recursiveEquals(term259514, term259936));
        assertTrue(recursiveEquals(term259606, term259937));
        assertTrue(recursiveEquals(term259698, term259938));
        assertTrue(recursiveEquals(term259790, term259939));
        assertTrue(recursiveEquals(retValue, term259915));
    }

};


