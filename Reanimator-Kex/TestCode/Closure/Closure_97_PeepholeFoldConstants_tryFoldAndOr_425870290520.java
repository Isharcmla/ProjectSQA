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

public class PeepholeFoldConstants_tryFoldAndOr_425870290520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138867;
     Object term138959;
     Object term139051;
     Object term139121;
     Object term139162;
     Object term139163;
     Object term139164;
     Object term139165;
     Object term139122;

    public PeepholeFoldConstants_tryFoldAndOr_425870290520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138867 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term138959 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term138959, term138959.getClass(), "parent", null);
        setIntField(term138959, term138959.getClass(), "type", 0);
        term139051 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term139051, term139051.getClass(), "type", 0);
        term139121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term139162 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term139162, term139162.getClass(), "currentTraversal", null);
        term139163 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term139163, term139163.getClass(), "number", 0.0);
        setIntField(term139163, term139163.getClass(), "type", 0);
        setField(term139163, term139163.getClass(), "next", null);
        setField(term139163, term139163.getClass(), "first", null);
        setField(term139163, term139163.getClass(), "last", null);
        setField(term139163, term139163.getClass(), "propListHead", null);
        setIntField(term139163, term139163.getClass(), "sourcePosition", 0);
        setField(term139163, term139163.getClass(), "jsType", null);
        setField(term139163, term139163.getClass(), "parent", null);
        term139164 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term139164, term139164.getClass(), "number", 0.0);
        setIntField(term139164, term139164.getClass(), "type", 0);
        setField(term139164, term139164.getClass(), "next", null);
        setField(term139164, term139164.getClass(), "first", null);
        setField(term139164, term139164.getClass(), "last", null);
        setField(term139164, term139164.getClass(), "propListHead", null);
        setIntField(term139164, term139164.getClass(), "sourcePosition", 0);
        setField(term139164, term139164.getClass(), "jsType", null);
        setField(term139164, term139164.getClass(), "parent", null);
        term139165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term139165, term139165.getClass(), "type", 0);
        setField(term139165, term139165.getClass(), "next", null);
        setField(term139165, term139165.getClass(), "first", null);
        setField(term139165, term139165.getClass(), "last", null);
        setField(term139165, term139165.getClass(), "propListHead", null);
        setIntField(term139165, term139165.getClass(), "sourcePosition", 0);
        setField(term139165, term139165.getClass(), "jsType", null);
        setField(term139165, term139165.getClass(), "parent", null);
        term139122 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term139122, term139122.getClass(), "number", 0.0);
        setIntField(term139122, term139122.getClass(), "type", 0);
        setField(term139122, term139122.getClass(), "next", null);
        setField(term139122, term139122.getClass(), "first", null);
        setField(term139122, term139122.getClass(), "last", null);
        setField(term139122, term139122.getClass(), "propListHead", null);
        setIntField(term139122, term139122.getClass(), "sourcePosition", 0);
        setField(term139122, term139122.getClass(), "jsType", null);
        setField(term139122, term139122.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term138959;
        args[1] = term139051;
        args[2] = term139121;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term138867, args);
        assertTrue(recursiveEquals(term138867, term139162));
        assertTrue(recursiveEquals(term138959, term139163));
        assertTrue(recursiveEquals(term139051, term139164));
        assertTrue(recursiveEquals(term139121, term139165));
        assertTrue(recursiveEquals(retValue, term139122));
    }

};


