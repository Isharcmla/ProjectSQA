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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term722048;
     Object term722140;
     Object term722232;
     Object term722324;
     Object term722785;
     Object term722786;
     Object term722787;
     Object term722788;
     Object term722746;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term722048 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term722140 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term722140, term722140.getClass(), "parent", null);
        setIntField(term722140, term722140.getClass(), "type", 0);
        term722232 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term722232, term722232.getClass(), "type", 0);
        term722324 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term722785 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term722785, term722785.getClass(), "currentTraversal", null);
        term722786 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term722786, term722786.getClass(), "number", 0.0);
        setIntField(term722786, term722786.getClass(), "type", 0);
        setField(term722786, term722786.getClass(), "next", null);
        setField(term722786, term722786.getClass(), "first", null);
        setField(term722786, term722786.getClass(), "last", null);
        setField(term722786, term722786.getClass(), "propListHead", null);
        setIntField(term722786, term722786.getClass(), "sourcePosition", 0);
        setField(term722786, term722786.getClass(), "jsType", null);
        setField(term722786, term722786.getClass(), "parent", null);
        term722787 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term722787, term722787.getClass(), "str", null);
        setIntField(term722787, term722787.getClass(), "type", 0);
        setField(term722787, term722787.getClass(), "next", null);
        setField(term722787, term722787.getClass(), "first", null);
        setField(term722787, term722787.getClass(), "last", null);
        setField(term722787, term722787.getClass(), "propListHead", null);
        setIntField(term722787, term722787.getClass(), "sourcePosition", 0);
        setField(term722787, term722787.getClass(), "jsType", null);
        setField(term722787, term722787.getClass(), "parent", null);
        term722788 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term722788, term722788.getClass(), "str", null);
        setIntField(term722788, term722788.getClass(), "type", 0);
        setField(term722788, term722788.getClass(), "next", null);
        setField(term722788, term722788.getClass(), "first", null);
        setField(term722788, term722788.getClass(), "last", null);
        setField(term722788, term722788.getClass(), "propListHead", null);
        setIntField(term722788, term722788.getClass(), "sourcePosition", 0);
        setField(term722788, term722788.getClass(), "jsType", null);
        setField(term722788, term722788.getClass(), "parent", null);
        term722746 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term722746, term722746.getClass(), "number", 0.0);
        setIntField(term722746, term722746.getClass(), "type", 0);
        setField(term722746, term722746.getClass(), "next", null);
        setField(term722746, term722746.getClass(), "first", null);
        setField(term722746, term722746.getClass(), "last", null);
        setField(term722746, term722746.getClass(), "propListHead", null);
        setIntField(term722746, term722746.getClass(), "sourcePosition", 0);
        setField(term722746, term722746.getClass(), "jsType", null);
        setField(term722746, term722746.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term722140;
        args[1] = term722232;
        args[2] = term722324;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term722048, args);
        assertTrue(recursiveEquals(term722048, term722785));
        assertTrue(recursiveEquals(term722140, term722786));
        assertTrue(recursiveEquals(term722232, term722787));
        assertTrue(recursiveEquals(term722324, term722788));
        assertTrue(recursiveEquals(retValue, term722746));
    }

};


