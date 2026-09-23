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

public class PeepholeFoldConstants_tryFoldComparison_848443179143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27632;
     Object term27724;
     Object term27816;
     Object term27908;
     Object term28246;
     Object term28247;
     Object term28248;
     Object term28249;
     Object term28226;

    public PeepholeFoldConstants_tryFoldComparison_848443179143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27632 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term27724 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term27724, term27724.getClass(), "type", 16);
        term27816 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term27816, term27816.getClass(), "type", 16);
        term27908 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term28246 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term28246, term28246.getClass(), "currentTraversal", null);
        term28247 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term28247, term28247.getClass(), "number", 0.0);
        setIntField(term28247, term28247.getClass(), "type", 16);
        setField(term28247, term28247.getClass(), "next", null);
        setField(term28247, term28247.getClass(), "first", null);
        setField(term28247, term28247.getClass(), "last", null);
        setField(term28247, term28247.getClass(), "propListHead", null);
        setIntField(term28247, term28247.getClass(), "sourcePosition", 0);
        setField(term28247, term28247.getClass(), "jsType", null);
        setField(term28247, term28247.getClass(), "parent", null);
        term28248 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term28248, term28248.getClass(), "number", 0.0);
        setIntField(term28248, term28248.getClass(), "type", 16);
        setField(term28248, term28248.getClass(), "next", null);
        setField(term28248, term28248.getClass(), "first", null);
        setField(term28248, term28248.getClass(), "last", null);
        setField(term28248, term28248.getClass(), "propListHead", null);
        setIntField(term28248, term28248.getClass(), "sourcePosition", 0);
        setField(term28248, term28248.getClass(), "jsType", null);
        setField(term28248, term28248.getClass(), "parent", null);
        term28249 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term28249, term28249.getClass(), "number", 0.0);
        setIntField(term28249, term28249.getClass(), "type", 0);
        setField(term28249, term28249.getClass(), "next", null);
        setField(term28249, term28249.getClass(), "first", null);
        setField(term28249, term28249.getClass(), "last", null);
        setField(term28249, term28249.getClass(), "propListHead", null);
        setIntField(term28249, term28249.getClass(), "sourcePosition", 0);
        setField(term28249, term28249.getClass(), "jsType", null);
        setField(term28249, term28249.getClass(), "parent", null);
        term28226 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term28226, term28226.getClass(), "number", 0.0);
        setIntField(term28226, term28226.getClass(), "type", 16);
        setField(term28226, term28226.getClass(), "next", null);
        setField(term28226, term28226.getClass(), "first", null);
        setField(term28226, term28226.getClass(), "last", null);
        setField(term28226, term28226.getClass(), "propListHead", null);
        setIntField(term28226, term28226.getClass(), "sourcePosition", 0);
        setField(term28226, term28226.getClass(), "jsType", null);
        setField(term28226, term28226.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term27724;
        args[1] = term27816;
        args[2] = term27908;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term27632, args);
        assertTrue(recursiveEquals(term27632, term28246));
        assertTrue(recursiveEquals(term27724, term28247));
        assertTrue(recursiveEquals(term27816, term28248));
        assertTrue(recursiveEquals(term27908, term28249));
        assertTrue(recursiveEquals(retValue, term28226));
    }

};


