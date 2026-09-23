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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164972;
     Object term165064;
     Object term165479;
     Object term165480;
     Object term165445;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164972 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term165064 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term165156 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term165248 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term165156, term165156.getClass(), "next", term165248);
        setField(term165064, term165064.getClass(), "first", term165156);
        setIntField(term165064, term165064.getClass(), "type", 22);
        term165479 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term165479, term165479.getClass(), "currentTraversal", null);
        term165480 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term165481 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term165482 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term165480, term165480.getClass(), "number", 0.0);
        setIntField(term165480, term165480.getClass(), "type", 22);
        setField(term165480, term165480.getClass(), "next", null);
        setDoubleField(term165481, term165481.getClass(), "number", 0.0);
        setIntField(term165481, term165481.getClass(), "type", 0);
        setDoubleField(term165482, term165482.getClass(), "number", 0.0);
        setIntField(term165482, term165482.getClass(), "type", 0);
        setField(term165482, term165482.getClass(), "next", null);
        setField(term165482, term165482.getClass(), "first", null);
        setField(term165482, term165482.getClass(), "last", null);
        setField(term165482, term165482.getClass(), "propListHead", null);
        setIntField(term165482, term165482.getClass(), "sourcePosition", 0);
        setField(term165482, term165482.getClass(), "jsType", null);
        setField(term165482, term165482.getClass(), "parent", null);
        setField(term165481, term165481.getClass(), "next", term165482);
        setField(term165481, term165481.getClass(), "first", null);
        setField(term165481, term165481.getClass(), "last", null);
        setField(term165481, term165481.getClass(), "propListHead", null);
        setIntField(term165481, term165481.getClass(), "sourcePosition", 0);
        setField(term165481, term165481.getClass(), "jsType", null);
        setField(term165481, term165481.getClass(), "parent", null);
        setField(term165480, term165480.getClass(), "first", term165481);
        setField(term165480, term165480.getClass(), "last", null);
        setField(term165480, term165480.getClass(), "propListHead", null);
        setIntField(term165480, term165480.getClass(), "sourcePosition", 0);
        setField(term165480, term165480.getClass(), "jsType", null);
        setField(term165480, term165480.getClass(), "parent", null);
        term165445 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term165448 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term165451 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term165445, term165445.getClass(), "number", 0.0);
        setIntField(term165445, term165445.getClass(), "type", 22);
        setField(term165445, term165445.getClass(), "next", null);
        setDoubleField(term165448, term165448.getClass(), "number", 0.0);
        setIntField(term165448, term165448.getClass(), "type", 0);
        setDoubleField(term165451, term165451.getClass(), "number", 0.0);
        setIntField(term165451, term165451.getClass(), "type", 0);
        setField(term165451, term165451.getClass(), "next", null);
        setField(term165451, term165451.getClass(), "first", null);
        setField(term165451, term165451.getClass(), "last", null);
        setField(term165451, term165451.getClass(), "propListHead", null);
        setIntField(term165451, term165451.getClass(), "sourcePosition", 0);
        setField(term165451, term165451.getClass(), "jsType", null);
        setField(term165451, term165451.getClass(), "parent", null);
        setField(term165448, term165448.getClass(), "next", term165451);
        setField(term165448, term165448.getClass(), "first", null);
        setField(term165448, term165448.getClass(), "last", null);
        setField(term165448, term165448.getClass(), "propListHead", null);
        setIntField(term165448, term165448.getClass(), "sourcePosition", 0);
        setField(term165448, term165448.getClass(), "jsType", null);
        setField(term165448, term165448.getClass(), "parent", null);
        setField(term165445, term165445.getClass(), "first", term165448);
        setField(term165445, term165445.getClass(), "last", null);
        setField(term165445, term165445.getClass(), "propListHead", null);
        setIntField(term165445, term165445.getClass(), "sourcePosition", 0);
        setField(term165445, term165445.getClass(), "jsType", null);
        setField(term165445, term165445.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term165064;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term164972, args);
        assertTrue(recursiveEquals(term164972, term165479));
        assertTrue(recursiveEquals(term165064, term165480));
        assertTrue(recursiveEquals(retValue, term165445));
    }

};


