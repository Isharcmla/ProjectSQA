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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99086;
     Object term99178;
     Object term100142;
     Object term100143;
     Object term100089;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99086 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term99178 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term99248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99340 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term99248, term99248.getClass(), "next", term99340);
        setIntField(term99248, term99248.getClass(), "type", 0);
        setField(term99178, term99178.getClass(), "first", term99248);
        setIntField(term99178, term99178.getClass(), "type", 101);
        setField(term99178, term99178.getClass(), "parent", null);
        term100142 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term100142, term100142.getClass(), "currentTraversal", null);
        term100143 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term100144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100145 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term100143, term100143.getClass(), "str", null);
        setIntField(term100143, term100143.getClass(), "type", 101);
        setField(term100143, term100143.getClass(), "next", null);
        setIntField(term100144, term100144.getClass(), "type", 0);
        setField(term100145, term100145.getClass(), "str", null);
        setIntField(term100145, term100145.getClass(), "type", 0);
        setField(term100145, term100145.getClass(), "next", null);
        setField(term100145, term100145.getClass(), "first", null);
        setField(term100145, term100145.getClass(), "last", null);
        setField(term100145, term100145.getClass(), "propListHead", null);
        setIntField(term100145, term100145.getClass(), "sourcePosition", 0);
        setField(term100145, term100145.getClass(), "jsType", null);
        setField(term100145, term100145.getClass(), "parent", null);
        setField(term100144, term100144.getClass(), "next", term100145);
        setField(term100144, term100144.getClass(), "first", null);
        setField(term100144, term100144.getClass(), "last", null);
        setField(term100144, term100144.getClass(), "propListHead", null);
        setIntField(term100144, term100144.getClass(), "sourcePosition", 0);
        setField(term100144, term100144.getClass(), "jsType", null);
        setField(term100144, term100144.getClass(), "parent", null);
        setField(term100143, term100143.getClass(), "first", term100144);
        setField(term100143, term100143.getClass(), "last", null);
        setField(term100143, term100143.getClass(), "propListHead", null);
        setIntField(term100143, term100143.getClass(), "sourcePosition", 0);
        setField(term100143, term100143.getClass(), "jsType", null);
        setField(term100143, term100143.getClass(), "parent", null);
        term100089 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term100091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100093 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term100089, term100089.getClass(), "str", null);
        setIntField(term100089, term100089.getClass(), "type", 101);
        setField(term100089, term100089.getClass(), "next", null);
        setIntField(term100091, term100091.getClass(), "type", 0);
        setField(term100093, term100093.getClass(), "str", null);
        setIntField(term100093, term100093.getClass(), "type", 0);
        setField(term100093, term100093.getClass(), "next", null);
        setField(term100093, term100093.getClass(), "first", null);
        setField(term100093, term100093.getClass(), "last", null);
        setField(term100093, term100093.getClass(), "propListHead", null);
        setIntField(term100093, term100093.getClass(), "sourcePosition", 0);
        setField(term100093, term100093.getClass(), "jsType", null);
        setField(term100093, term100093.getClass(), "parent", null);
        setField(term100091, term100091.getClass(), "next", term100093);
        setField(term100091, term100091.getClass(), "first", null);
        setField(term100091, term100091.getClass(), "last", null);
        setField(term100091, term100091.getClass(), "propListHead", null);
        setIntField(term100091, term100091.getClass(), "sourcePosition", 0);
        setField(term100091, term100091.getClass(), "jsType", null);
        setField(term100091, term100091.getClass(), "parent", null);
        setField(term100089, term100089.getClass(), "first", term100091);
        setField(term100089, term100089.getClass(), "last", null);
        setField(term100089, term100089.getClass(), "propListHead", null);
        setIntField(term100089, term100089.getClass(), "sourcePosition", 0);
        setField(term100089, term100089.getClass(), "jsType", null);
        setField(term100089, term100089.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term99178;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term99086, args);
        assertTrue(recursiveEquals(term99086, term100142));
        assertTrue(recursiveEquals(term99178, term100143));
        assertTrue(recursiveEquals(retValue, term100089));
    }

};


