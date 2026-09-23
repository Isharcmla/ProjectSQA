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

public class PeepholeFoldConstants_tryFoldComparison_848443179908 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210855;
     Object term210947;
     Object term211039;
     Object term211131;
     Object term211217;
     Object term211218;
     Object term211219;
     Object term211220;
     Object term211198;

    public PeepholeFoldConstants_tryFoldComparison_848443179908() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210855 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term210947 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term210947, term210947.getClass(), "type", 16);
        term211039 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term211039, term211039.getClass(), "type", 16);
        term211131 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term211217 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term211217, term211217.getClass(), "currentTraversal", null);
        term211218 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term211218, term211218.getClass(), "str", null);
        setIntField(term211218, term211218.getClass(), "type", 16);
        setField(term211218, term211218.getClass(), "next", null);
        setField(term211218, term211218.getClass(), "first", null);
        setField(term211218, term211218.getClass(), "last", null);
        setField(term211218, term211218.getClass(), "propListHead", null);
        setIntField(term211218, term211218.getClass(), "sourcePosition", 0);
        setField(term211218, term211218.getClass(), "jsType", null);
        setField(term211218, term211218.getClass(), "parent", null);
        term211219 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term211219, term211219.getClass(), "str", null);
        setIntField(term211219, term211219.getClass(), "type", 16);
        setField(term211219, term211219.getClass(), "next", null);
        setField(term211219, term211219.getClass(), "first", null);
        setField(term211219, term211219.getClass(), "last", null);
        setField(term211219, term211219.getClass(), "propListHead", null);
        setIntField(term211219, term211219.getClass(), "sourcePosition", 0);
        setField(term211219, term211219.getClass(), "jsType", null);
        setField(term211219, term211219.getClass(), "parent", null);
        term211220 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term211220, term211220.getClass(), "number", 0.0);
        setIntField(term211220, term211220.getClass(), "type", 0);
        setField(term211220, term211220.getClass(), "next", null);
        setField(term211220, term211220.getClass(), "first", null);
        setField(term211220, term211220.getClass(), "last", null);
        setField(term211220, term211220.getClass(), "propListHead", null);
        setIntField(term211220, term211220.getClass(), "sourcePosition", 0);
        setField(term211220, term211220.getClass(), "jsType", null);
        setField(term211220, term211220.getClass(), "parent", null);
        term211198 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term211198, term211198.getClass(), "str", null);
        setIntField(term211198, term211198.getClass(), "type", 16);
        setField(term211198, term211198.getClass(), "next", null);
        setField(term211198, term211198.getClass(), "first", null);
        setField(term211198, term211198.getClass(), "last", null);
        setField(term211198, term211198.getClass(), "propListHead", null);
        setIntField(term211198, term211198.getClass(), "sourcePosition", 0);
        setField(term211198, term211198.getClass(), "jsType", null);
        setField(term211198, term211198.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term210947;
        args[1] = term211039;
        args[2] = term211131;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term210855, args);
        assertTrue(recursiveEquals(term210855, term211217));
        assertTrue(recursiveEquals(term210947, term211218));
        assertTrue(recursiveEquals(term211039, term211219));
        assertTrue(recursiveEquals(term211131, term211220));
        assertTrue(recursiveEquals(retValue, term211198));
    }

};


