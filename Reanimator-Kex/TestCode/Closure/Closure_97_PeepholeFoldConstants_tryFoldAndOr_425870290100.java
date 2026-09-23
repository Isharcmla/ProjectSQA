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

public class PeepholeFoldConstants_tryFoldAndOr_425870290100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18563;
     Object term18655;
     Object term18747;
     Object term18839;
     Object term19158;
     Object term19159;
     Object term19160;
     Object term19161;
     Object term19120;

    public PeepholeFoldConstants_tryFoldAndOr_425870290100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18563 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term18655 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term18655, term18655.getClass(), "parent", null);
        setIntField(term18655, term18655.getClass(), "type", 0);
        term18747 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term18747, term18747.getClass(), "type", 0);
        term18839 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term19158 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term19158, term19158.getClass(), "currentTraversal", null);
        term19159 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term19159, term19159.getClass(), "str", null);
        setIntField(term19159, term19159.getClass(), "type", 0);
        setField(term19159, term19159.getClass(), "next", null);
        setField(term19159, term19159.getClass(), "first", null);
        setField(term19159, term19159.getClass(), "last", null);
        setField(term19159, term19159.getClass(), "propListHead", null);
        setIntField(term19159, term19159.getClass(), "sourcePosition", 0);
        setField(term19159, term19159.getClass(), "jsType", null);
        setField(term19159, term19159.getClass(), "parent", null);
        term19160 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term19160, term19160.getClass(), "str", null);
        setIntField(term19160, term19160.getClass(), "type", 0);
        setField(term19160, term19160.getClass(), "next", null);
        setField(term19160, term19160.getClass(), "first", null);
        setField(term19160, term19160.getClass(), "last", null);
        setField(term19160, term19160.getClass(), "propListHead", null);
        setIntField(term19160, term19160.getClass(), "sourcePosition", 0);
        setField(term19160, term19160.getClass(), "jsType", null);
        setField(term19160, term19160.getClass(), "parent", null);
        term19161 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term19161, term19161.getClass(), "str", null);
        setIntField(term19161, term19161.getClass(), "type", 0);
        setField(term19161, term19161.getClass(), "next", null);
        setField(term19161, term19161.getClass(), "first", null);
        setField(term19161, term19161.getClass(), "last", null);
        setField(term19161, term19161.getClass(), "propListHead", null);
        setIntField(term19161, term19161.getClass(), "sourcePosition", 0);
        setField(term19161, term19161.getClass(), "jsType", null);
        setField(term19161, term19161.getClass(), "parent", null);
        term19120 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term19120, term19120.getClass(), "str", null);
        setIntField(term19120, term19120.getClass(), "type", 0);
        setField(term19120, term19120.getClass(), "next", null);
        setField(term19120, term19120.getClass(), "first", null);
        setField(term19120, term19120.getClass(), "last", null);
        setField(term19120, term19120.getClass(), "propListHead", null);
        setIntField(term19120, term19120.getClass(), "sourcePosition", 0);
        setField(term19120, term19120.getClass(), "jsType", null);
        setField(term19120, term19120.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term18655;
        args[1] = term18747;
        args[2] = term18839;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term18563, args);
        assertTrue(recursiveEquals(term18563, term19158));
        assertTrue(recursiveEquals(term18655, term19159));
        assertTrue(recursiveEquals(term18747, term19160));
        assertTrue(recursiveEquals(term18839, term19161));
        assertTrue(recursiveEquals(retValue, term19120));
    }

};


