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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term870285;
     Object term870377;
     Object term870561;
     Object term870631;
     Object term870925;
     Object term870926;
     Object term870928;
     Object term870929;
     Object term870875;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term870285 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term870377 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term870469 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term870377, term870377.getClass(), "parent", term870469);
        setIntField(term870377, term870377.getClass(), "type", 0);
        term870561 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term870561, term870561.getClass(), "type", 0);
        term870631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term870631, term870631.getClass(), "type", 44);
        term870925 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term870925, term870925.getClass(), "currentTraversal", null);
        term870926 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term870927 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term870926, term870926.getClass(), "number", 0.0);
        setIntField(term870926, term870926.getClass(), "type", 0);
        setField(term870926, term870926.getClass(), "next", null);
        setField(term870926, term870926.getClass(), "first", null);
        setField(term870926, term870926.getClass(), "last", null);
        setField(term870926, term870926.getClass(), "propListHead", null);
        setIntField(term870926, term870926.getClass(), "sourcePosition", 0);
        setField(term870926, term870926.getClass(), "jsType", null);
        setDoubleField(term870927, term870927.getClass(), "number", 0.0);
        setIntField(term870927, term870927.getClass(), "type", 0);
        setField(term870927, term870927.getClass(), "next", null);
        setField(term870927, term870927.getClass(), "first", null);
        setField(term870927, term870927.getClass(), "last", null);
        setField(term870927, term870927.getClass(), "propListHead", null);
        setIntField(term870927, term870927.getClass(), "sourcePosition", 0);
        setField(term870927, term870927.getClass(), "jsType", null);
        setField(term870927, term870927.getClass(), "parent", null);
        setField(term870926, term870926.getClass(), "parent", term870927);
        term870928 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term870928, term870928.getClass(), "str", null);
        setIntField(term870928, term870928.getClass(), "type", 0);
        setField(term870928, term870928.getClass(), "next", null);
        setField(term870928, term870928.getClass(), "first", null);
        setField(term870928, term870928.getClass(), "last", null);
        setField(term870928, term870928.getClass(), "propListHead", null);
        setIntField(term870928, term870928.getClass(), "sourcePosition", 0);
        setField(term870928, term870928.getClass(), "jsType", null);
        setField(term870928, term870928.getClass(), "parent", null);
        term870929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term870929, term870929.getClass(), "type", 44);
        setField(term870929, term870929.getClass(), "next", null);
        setField(term870929, term870929.getClass(), "first", null);
        setField(term870929, term870929.getClass(), "last", null);
        setField(term870929, term870929.getClass(), "propListHead", null);
        setIntField(term870929, term870929.getClass(), "sourcePosition", 0);
        setField(term870929, term870929.getClass(), "jsType", null);
        setField(term870929, term870929.getClass(), "parent", null);
        term870875 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term870879 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term870875, term870875.getClass(), "number", 0.0);
        setIntField(term870875, term870875.getClass(), "type", 0);
        setField(term870875, term870875.getClass(), "next", null);
        setField(term870875, term870875.getClass(), "first", null);
        setField(term870875, term870875.getClass(), "last", null);
        setField(term870875, term870875.getClass(), "propListHead", null);
        setIntField(term870875, term870875.getClass(), "sourcePosition", 0);
        setField(term870875, term870875.getClass(), "jsType", null);
        setDoubleField(term870879, term870879.getClass(), "number", 0.0);
        setIntField(term870879, term870879.getClass(), "type", 0);
        setField(term870879, term870879.getClass(), "next", null);
        setField(term870879, term870879.getClass(), "first", null);
        setField(term870879, term870879.getClass(), "last", null);
        setField(term870879, term870879.getClass(), "propListHead", null);
        setIntField(term870879, term870879.getClass(), "sourcePosition", 0);
        setField(term870879, term870879.getClass(), "jsType", null);
        setField(term870879, term870879.getClass(), "parent", null);
        setField(term870875, term870875.getClass(), "parent", term870879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term870377;
        args[1] = term870561;
        args[2] = term870631;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term870285, args);
        assertTrue(recursiveEquals(term870285, term870925));
        assertTrue(recursiveEquals(term870377, term870926));
        assertTrue(recursiveEquals(term870561, term870928));
        assertTrue(recursiveEquals(term870631, term870929));
        assertTrue(recursiveEquals(retValue, term870875));
    }

};


