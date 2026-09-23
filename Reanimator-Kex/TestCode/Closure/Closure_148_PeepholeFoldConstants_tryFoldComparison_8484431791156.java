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

public class PeepholeFoldConstants_tryFoldComparison_8484431791156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272938;
     Object term273030;
     Object term273122;
     Object term273214;
     Object term273245;
     Object term273246;
     Object term273247;
     Object term273248;
     Object term273225;

    public PeepholeFoldConstants_tryFoldComparison_8484431791156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term272938 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term273030 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term273030, term273030.getClass(), "type", 16);
        term273122 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term273122, term273122.getClass(), "type", 16);
        term273214 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term273245 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term273245, term273245.getClass(), "currentTraversal", null);
        term273246 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term273246, term273246.getClass(), "number", 0.0);
        setIntField(term273246, term273246.getClass(), "type", 16);
        setField(term273246, term273246.getClass(), "next", null);
        setField(term273246, term273246.getClass(), "first", null);
        setField(term273246, term273246.getClass(), "last", null);
        setField(term273246, term273246.getClass(), "propListHead", null);
        setIntField(term273246, term273246.getClass(), "sourcePosition", 0);
        setField(term273246, term273246.getClass(), "jsType", null);
        setField(term273246, term273246.getClass(), "parent", null);
        term273247 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term273247, term273247.getClass(), "number", 0.0);
        setIntField(term273247, term273247.getClass(), "type", 16);
        setField(term273247, term273247.getClass(), "next", null);
        setField(term273247, term273247.getClass(), "first", null);
        setField(term273247, term273247.getClass(), "last", null);
        setField(term273247, term273247.getClass(), "propListHead", null);
        setIntField(term273247, term273247.getClass(), "sourcePosition", 0);
        setField(term273247, term273247.getClass(), "jsType", null);
        setField(term273247, term273247.getClass(), "parent", null);
        term273248 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term273248, term273248.getClass(), "number", 0.0);
        setIntField(term273248, term273248.getClass(), "type", 0);
        setField(term273248, term273248.getClass(), "next", null);
        setField(term273248, term273248.getClass(), "first", null);
        setField(term273248, term273248.getClass(), "last", null);
        setField(term273248, term273248.getClass(), "propListHead", null);
        setIntField(term273248, term273248.getClass(), "sourcePosition", 0);
        setField(term273248, term273248.getClass(), "jsType", null);
        setField(term273248, term273248.getClass(), "parent", null);
        term273225 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term273225, term273225.getClass(), "number", 0.0);
        setIntField(term273225, term273225.getClass(), "type", 16);
        setField(term273225, term273225.getClass(), "next", null);
        setField(term273225, term273225.getClass(), "first", null);
        setField(term273225, term273225.getClass(), "last", null);
        setField(term273225, term273225.getClass(), "propListHead", null);
        setIntField(term273225, term273225.getClass(), "sourcePosition", 0);
        setField(term273225, term273225.getClass(), "jsType", null);
        setField(term273225, term273225.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term273030;
        args[1] = term273122;
        args[2] = term273214;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term272938, args);
        assertTrue(recursiveEquals(term272938, term273245));
        assertTrue(recursiveEquals(term273030, term273246));
        assertTrue(recursiveEquals(term273122, term273247));
        assertTrue(recursiveEquals(term273214, term273248));
        assertTrue(recursiveEquals(retValue, term273225));
    }

};


