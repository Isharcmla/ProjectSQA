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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term541481;
     Object term541573;
     Object term542217;
     Object term542218;
     Object term542164;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term541481 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term541573 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term541643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term541735 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term541643, term541643.getClass(), "next", term541735);
        setIntField(term541643, term541643.getClass(), "type", 0);
        setField(term541573, term541573.getClass(), "first", term541643);
        setIntField(term541573, term541573.getClass(), "type", 101);
        setField(term541573, term541573.getClass(), "parent", null);
        term542217 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term542217, term542217.getClass(), "currentTraversal", null);
        term542218 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term542219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term542220 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term542218, term542218.getClass(), "str", null);
        setIntField(term542218, term542218.getClass(), "type", 101);
        setField(term542218, term542218.getClass(), "next", null);
        setIntField(term542219, term542219.getClass(), "type", 0);
        setField(term542220, term542220.getClass(), "str", null);
        setIntField(term542220, term542220.getClass(), "type", 0);
        setField(term542220, term542220.getClass(), "next", null);
        setField(term542220, term542220.getClass(), "first", null);
        setField(term542220, term542220.getClass(), "last", null);
        setField(term542220, term542220.getClass(), "propListHead", null);
        setIntField(term542220, term542220.getClass(), "sourcePosition", 0);
        setField(term542220, term542220.getClass(), "jsType", null);
        setField(term542220, term542220.getClass(), "parent", null);
        setField(term542219, term542219.getClass(), "next", term542220);
        setField(term542219, term542219.getClass(), "first", null);
        setField(term542219, term542219.getClass(), "last", null);
        setField(term542219, term542219.getClass(), "propListHead", null);
        setIntField(term542219, term542219.getClass(), "sourcePosition", 0);
        setField(term542219, term542219.getClass(), "jsType", null);
        setField(term542219, term542219.getClass(), "parent", null);
        setField(term542218, term542218.getClass(), "first", term542219);
        setField(term542218, term542218.getClass(), "last", null);
        setField(term542218, term542218.getClass(), "propListHead", null);
        setIntField(term542218, term542218.getClass(), "sourcePosition", 0);
        setField(term542218, term542218.getClass(), "jsType", null);
        setField(term542218, term542218.getClass(), "parent", null);
        term542164 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term542166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term542168 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term542164, term542164.getClass(), "str", null);
        setIntField(term542164, term542164.getClass(), "type", 101);
        setField(term542164, term542164.getClass(), "next", null);
        setIntField(term542166, term542166.getClass(), "type", 0);
        setField(term542168, term542168.getClass(), "str", null);
        setIntField(term542168, term542168.getClass(), "type", 0);
        setField(term542168, term542168.getClass(), "next", null);
        setField(term542168, term542168.getClass(), "first", null);
        setField(term542168, term542168.getClass(), "last", null);
        setField(term542168, term542168.getClass(), "propListHead", null);
        setIntField(term542168, term542168.getClass(), "sourcePosition", 0);
        setField(term542168, term542168.getClass(), "jsType", null);
        setField(term542168, term542168.getClass(), "parent", null);
        setField(term542166, term542166.getClass(), "next", term542168);
        setField(term542166, term542166.getClass(), "first", null);
        setField(term542166, term542166.getClass(), "last", null);
        setField(term542166, term542166.getClass(), "propListHead", null);
        setIntField(term542166, term542166.getClass(), "sourcePosition", 0);
        setField(term542166, term542166.getClass(), "jsType", null);
        setField(term542166, term542166.getClass(), "parent", null);
        setField(term542164, term542164.getClass(), "first", term542166);
        setField(term542164, term542164.getClass(), "last", null);
        setField(term542164, term542164.getClass(), "propListHead", null);
        setIntField(term542164, term542164.getClass(), "sourcePosition", 0);
        setField(term542164, term542164.getClass(), "jsType", null);
        setField(term542164, term542164.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term541573;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term541481, args);
        assertTrue(recursiveEquals(term541481, term542217));
        assertTrue(recursiveEquals(term541573, term542218));
        assertTrue(recursiveEquals(retValue, term542164));
    }

};


